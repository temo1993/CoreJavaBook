package core.java.v1ch4;

/**
 @version 1.00 2000-01-27
 @author Cay Horstmann
 */

public class StaticTest
{
    public static void main(String[] args)
    {
        // fill the staff array with three Employee objects
        Employeee[] staff = new Employeee[3];

        staff[0] = new Employeee("Tom", 40000);
        staff[1] = new Employeee("Dick", 60000);
        staff[2] = new Employeee("Harry", 65000);

        // print out information about all Employee objects
        for (Employeee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName()
                    + ",id=" + e.getId()
                    + ",salary=" + e.getSalary());
        }

        int n = Employeee.getNextId(); // calls static method
        System.out.println("Next available id=" + n);
    }
}

class Employeee
{
    public Employeee(String n, double s)
    {
        name = n;
        salary = s;
        id = 0;
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

    public void setId()
    {
        id = nextId; // set id to next available id
        nextId++;
    }

    public static int getNextId()
    {
        return nextId; // returns static field
    }

    public static void main(String[] args) // unit test
    {
        Employeee e = new Employeee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

    private String name;
    private double salary;
    private int id;
    private static int nextId = 1;
}

