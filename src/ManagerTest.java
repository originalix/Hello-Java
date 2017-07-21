/**
 * Created by Lix on 2017/7/21.
 */
import corejava.*;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Lix", 120000, 1993, 1, 27);
        boss.setBonus(8888);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Wsx", 80000, 1992, 12, 01);
        staff[2] = new Employee("Leon", 99999, 1993, 07, 24);

        for(Employee e : staff) {
            System.out.println("name : " + e.getName() + " , Salary: " + e.getSalary());
        }
    }
}
