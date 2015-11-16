package core.java.v1ch7;

/**
 @version 1.10 2000-06-02
 @author Cay Horstmann
 */

import java.awt.*;

public class ListFonts
{
    public static void main(String[] args)
    {
        String[] fontNames = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();

        for (int i = 0; i < fontNames.length; i++)
            System.out.println(fontNames[i]);
    }
}
