package corejava;

/**
 * Created by Lix on 2017/7/22.
 */
public class Student extends Person {
    private String major;

    public Student(String n, String m) {
        super(n);
        major = m;
    }

    public String getDescription() {
        return "A student majoring in " + major;
    }
}
