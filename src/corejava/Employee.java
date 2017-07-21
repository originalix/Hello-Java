package corejava;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Lix on 2017/7/20.
 */
public class Employee extends Person {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

//    public String getName() {
//        return name;
//    }

    public double getSalary()
    {
        return salary;
    }

    public String getDescription() {
        return String.format("An employee with a salary of $%.2f", salary);
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
