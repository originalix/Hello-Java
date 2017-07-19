import java.util.Scanner;

/**
 * Created by Lix on 2017/7/17.
 */
public class FirstSample {
    public static void main(String[] args)
    {
        System.out.println("We will not use 'Hello, world'");
    }
}

class Constants
{
    public static final double CM_PER_INCH = 2.54;
    public static strictfp void main(String[] args)
    {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: "
        + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

        Scanner in = new Scanner(System.in);
        System.out.println("What's u name");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
}
