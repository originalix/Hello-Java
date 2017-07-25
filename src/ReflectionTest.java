import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by Lix on 2017/7/25.
 */
public class ReflectionTest {
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.println("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
        }
    }
}
