/**
 * Created by Lix on 2017/7/24.
 */

import corejava.*;

public class EqualsTest {
    public static void main(String[] args) {
        Employee wsx1 = new Employee("Wsx", 80000, 1992, 12, 1);
        Employee wsx2 = wsx1;
        Employee wsx3 = new Employee("Wsx", 80000, 1992, 12, 1);
        Employee lix = new Employee("lix", 120000, 1993, 1, 27);

        System.out.println("wsx1 == wsx2: " + (wsx1 == wsx2));
        System.out.println("wsx1 == wsx3: " + (wsx1 == wsx3));
        System.out.println("wsx1.equals(wsx3): " + wsx1.equals(wsx3));
        System.out.println("wsx1.equals(lix): " + wsx1.equals(lix));
        System.out.println("lix.toString(): " + lix);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println("boss toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("wsx1.hashCode(): " + wsx1.hashCode());
        System.out.println("wsx3.hashCode()" + wsx3.hashCode());
        System.out.println("lix.hashCode(): " + lix.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}
