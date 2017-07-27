import corejava.Employee;

/**
 * Created by Lix on 2017/7/27.
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("Jhon Q. Public", 5000, 1993, 1, 27);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original = " + original);
            System.out.println("copy = " + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
