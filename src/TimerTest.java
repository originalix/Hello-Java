import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Lix on 2017/7/27.
 */
public class TimerTest {
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        Date now = new Date();
        System.out.println("At the tone, the time is" + now);
        Toolkit.getDefaultToolkit().beep();
    }
}