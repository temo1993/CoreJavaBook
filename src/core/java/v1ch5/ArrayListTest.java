package core.java.v1ch5;

/**
 @version 1.00 2000-04-30
 @author Cay Horstmann
 */

import java.util.*;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        // fill the staff array list with three Employee objects
        ArrayList staff = new ArrayList();

        staff.add(new Employee2("Carl Cracker", 75000,
                1987, 12, 15));
        staff.add(new Employee2("Harry Hacker", 50000,
                1989, 10, 1));
        staff.add(new Employee2("Tony Tester", 40000,
                1990, 3, 15));

        // raise everyone's salary by 5%
        for (int i = 0; i < staff.size(); i++)
        {
            Employee2 e = (Employee2)staff.get(i);
            e.raiseSalary(5);
        }

        // print out information about all Employee objects
        for (int i = 0; i < staff.size(); i++)
        {
            Employee2 e = (Employee2)staff.get(i);
            System.out.println("name=" + e.getName()
                    + ",salary=" + e.getSalary()
                    + ",hireDay=" + e.getHireDay());
        }
    }
}

class Employee2
{
    public Employee2(String n, double s,
                    int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar
                = new GregorianCalendar(year, month - 1, day);
        // GregorianCalendar uses 0 for January
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

    private String name;
    private double salary;
    private Date hireDay;
}
