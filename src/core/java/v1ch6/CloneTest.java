package core.java.v1ch6;

/**
 @version 1.10 2002-07-01
 @author Cay Horstmann
 */

import java.util.*;

public class CloneTest
{
    public static void main(String[] args)
    {
        Employee original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = (Employee)original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original=" + original);
        System.out.println("copy=" + copy);
    }
}

class Employee implements Cloneable
{
    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public Object clone()
    {
        try
        {
            // call Object.clone()
            Employee cloned = (Employee)super.clone();

            // clone mutable fields
            cloned.hireDay = (Date)hireDay.clone();

            return cloned;
        }
        catch (CloneNotSupportedException e) { return null; }
    }

    /**
     Set the pay day to a given date
     @param year the year of the pay day
     @param month the month of the pay day
     @param day the day of the pay day
     */
    public void setHireDay(int year, int month, int day)
    {
        hireDay = new GregorianCalendar(year,
                month - 1, day).getTime();
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString()
    {
        return "Employee[name=" + name
                + ",salary=" + salary
                + ",hireDay=" + hireDay
                + "]";
    }

    private String name;
    private double salary;
    private Date hireDay;
}
