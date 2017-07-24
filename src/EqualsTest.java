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
    }
}
