package core.java.v1ch6;

/**
 @version 1.20 1998-04-07
 @author Cay Horstmann
 */

import java.util.Arrays;

public class EmployeeSortTest
{
    public static void main(String[] args)
    {
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("Harry Hacker", 35000);
        staff[1] = new Employee2("Carl Cracker", 75000);
        staff[2] = new Employee2("Tony Tester", 38000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (int i = 0; i < staff.length; i++)
        {
            Employee2 e = staff[i];
            System.out.println("name=" + e.getName()
                    + ",salary=" + e.getSalary());
        }
    }
}

class Employee2 implements Comparable
{
    public Employee2(String n, double s)
    {
        name = n;
        salary = s;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     Compares employees by salary
     @param otherObject another Employee object
     @return a negative value if this employee has a lower
     salary than otherObject, 0 if the salaries are the same,
     a positive value otherwise
     */
    public int compareTo(Object otherObject)
    {
        Employee2 other = (Employee2)otherObject;
        if (salary < other.salary) return -1;
        if (salary > other.salary) return 1;
        return 0;
    }

    private String name;
    private double salary;
}




