package core.java.v1ch5;

/**
 @version 1.10 1999-12-18
 @author Cay Horstmann
 */

import java.util.*;

public class EqualsTest
{
    public static void main(String[] args)
    {
        Employeeee alice1 = new Employeeee("Alice Adams", 75000,
                1987, 12, 15);
        Employeeee alice2 = alice1;
        Employeeee alice3 = new Employeeee("Alice Adams", 75000,
                1987, 12, 15);
        Employeeee bob = new Employeeee("Bob Brandson", 50000,
                1989, 10, 1);

        System.out.println("alice1 == alice2: "
                + (alice1 == alice2));

        System.out.println("alice1 == alice3: "
                + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): "
                + alice1.equals(alice3));

        System.out.println("alice1.equals(bob): "
                + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob);

        Manager carl = new Manager("Carl Cracker", 80000,
                1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000,
                1987, 12, 15);
        boss.setBonus(5000);
        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): "
                + carl.equals(boss));
    }
}

class Employeeee
{
    public Employeeee(String n, double s,
                    int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar
                = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject)
    {
        // a quick test to see if the objects are identical
        if (this == otherObject) return true;

        // must return false if the explicit parameter is null
        if (otherObject == null) return false;

        // if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass())
            return false;

        // now we know otherObject is a non-null Employee
        Employeeee other = (Employeeee)otherObject;

        // test whether the fields have identical values
        return name.equals(other.name)
                && salary == other.salary
                && hireDay.equals(other.hireDay);
    }

    public String toString()
    {
        return getClass().getName()
                + "[name=" + name
                + ",salary=" + salary
                + ",hireDay=" + hireDay
                + "]";
    }

    private String name;
    private double salary;
    private Date hireDay;
}

class Managers extends Employeeee
{
    public Managers(String n, double s,
                   int year, int month, int day)
    {
        super(n, s, year, month, day);
        bonus = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }

    public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject)) return false;
        Managers other = (Managers)otherObject;
        // super.equals checked that this and other belong to the
        // same class
        return bonus == other.bonus;
    }

    public String toString()
    {
        return super.toString()
                + "[bonus=" + bonus
                + "]";
    }

    private double bonus;
}
