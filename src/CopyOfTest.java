import static java.lang.System.*;

/**
 * Created by Lix on 2017/7/25.
 */
public class CopyOfTest {
    public static Object[] badCopyOf(Object[] a, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    
}
