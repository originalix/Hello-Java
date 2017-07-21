/**
 * Created by Lix on 2017/7/22.
 */

import corejava.*;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Wsx", 120000, 1992, 12, 1);
        people[1] = new Student("Lix", "Computer");

        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
