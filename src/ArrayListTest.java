import java.lang.reflect.Array;
import java.util.ArrayList;
import corejava.*;
/**
 * Created by Lix on 2017/7/25.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Wsx", 75000, 1992, 12, 1));
        staff.add(new Employee("Lix", 120000, 1993, 1, 27));
        staff.add(new Employee("Leon", 500000, 1993, 12, 21));

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + " , salary = " + e.getSalary() + " , hireDay = " + e.getHireDay());
        }
    }
}
