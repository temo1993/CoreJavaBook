package core.java.v1ch5;

/**
 @version 1.10 2002-06-30
 @author Cay Horstmann
 */

import java.lang.reflect.*;
import java.util.*;
import java.text.*;

public class ObjectAnalyzerTest
{
    public static void main(String[] args)
    {
        Object obj = NumberFormat.getCurrencyInstance();
        System.out.println(new ObjectAnalyzer().toString(obj));
    }
}

class ObjectAnalyzer
{
    /**
     Converts an object to a string representation that lists
     all fields.
     @param obj an object
     @return a string with the object's class name and all
     field names and values
     */
    public String toString(Object obj)
    {
        if (obj == null) return "null";
        if (visited.contains(obj)) return "...";
        visited.add(obj);
        Class cl = obj.getClass();
        if (cl == String.class) return (String)obj;
        if (cl.isArray())
        {
            String r = cl.getComponentType() + "[]{";
            for (int i = 0; i < Array.getLength(obj); i++)
            {
                if (i > 0) r += ",";
                Object val = Array.get(obj, i);
                if (cl.getComponentType().isPrimitive()) r += val;
                else r += toString(val);
            }
            return r + "}";
        }

        String r = cl.getName();
        // inspect the fields of this class and all superclasses
        do
        {
            r += "[";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            // get the names and values of all fields
            for (int i = 0; i < fields.length; i++)
            {
                Field f = fields[i];
                if (!Modifier.isStatic(f.getModifiers()))
                {
                    if (!r.endsWith("[")) r += ",";
                    r += f.getName() + "=";
                    try
                    {
                        Class t = f.getType();
                        Object val = f.get(obj);
                        if (t.isPrimitive()) r += val;
                        else r += toString(val);
                    }
                    catch (Exception e) { e.printStackTrace(); }
                }
            }
            r += "]";
            cl = cl.getSuperclass();
        }
        while (cl != null);

        return r;
    }

    private ArrayList visited = new ArrayList();
}

