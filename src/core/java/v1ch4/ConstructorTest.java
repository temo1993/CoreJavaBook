package core.java.v1ch4;

/**
 @version 1.00 2000-01-27
 @author Cay Horstmann
 */

import java.util.*;

public class ConstructorTest
{
    public static void main(String[] args)
    {
        // fill the staff array with three Employee2 objects
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("Harry", 40000);
        staff[1] = new Employee2(60000);
        staff[2] = new Employee2();

        // print out information about all Employee2 objects
        for (Employee2 e : staff) {
            System.out.println("name=" + e.getName()
                    + ",id=" + e.getId()
                    + ",salary=" + e.getSalary());
        }
    }
}

class Employee2
{
    // three overloaded constructors
    public Employee2(String n, double s)
    {
        name = n;
        salary = s;
    }

    public Employee2(double s)
    {
        // calls the Employee2(String, double) constructor
        this("Employee #" + nextId, s);
    }

    // the default constructor
    public Employee2()
    {
        // name initialized to ""--see below
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    private int id;
    private static int nextId;

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // static initialization block
    static
    {
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    private String name = ""; // instance variable initialization
    private double salary;
}

