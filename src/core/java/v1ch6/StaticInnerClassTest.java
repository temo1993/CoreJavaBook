package core.java.v1ch6;

/**
 @version 1.00 1998-04-07
 @author Cay Horstmann
 */

public class StaticInnerClassTest
{
    public static void main(String[] args)
    {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());
    }
}

class ArrayAlg
{
    /**
     A pair of floating point numbers
     */
    public static class Pair
    {
        /**
         Constructs a pair from two floating point numbers
         @param f the first number
         @param s the second number
         */
        public Pair(double f, double s)
        {
            first = f;
            second = s;
        }

        /**
         Returns the first number of the pair
         @return the first number
         */
        public double getFirst()
        {
            return first;
        }

        /**
         Returns the second number of the pair
         @return the second number
         */
        public double getSecond()
        {
            return second;
        }

        private double first;
        private double second;
    }

    /**
     Computes both the minimum and the maximum of an array
     @param a an array of floating point numbers
     @return a pair whose first element is the minimum and whose
     second element is the maximum
     */
    public static Pair minmax(double[] d)
    {
        if (d.length == 0) return new Pair(0, 0);
        double min = d[0];
        double max = d[0];
        for (int i = 1; i < d.length; i++)
        {
            if (min > d[i]) min = d[i];
            if (max < d[i]) max = d[i];
        }
        return new Pair(min, max);
    }
}
