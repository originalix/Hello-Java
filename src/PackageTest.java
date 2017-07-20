/**
 * Created by Lix on 2017/7/20.
 */

import corejava.Employee;

public class PackageTest {
    public static void main(String[] args) {
        Employee wsx = new Employee("Wsx", 50000, 1992, 12, 1);
        wsx.raiseSalary(5);
        System.out.println("name = " + wsx.getName() + ". Salary = " + wsx.getSalary());
    }
}
