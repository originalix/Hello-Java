import corejava.Employee;

import java.util.Arrays;

/**
 * Created by Lix on 2017/7/25.
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 95000, 1993, 1, 27);
        staff[1] = new Employee("Carl Cracker", 75000, 1992, 12, 1);
        staff[2] = new Employee("Tony Tester", 38000, 1991, 7, 24);

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }
}
