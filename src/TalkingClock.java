import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Lix on 2017/7/27.
 */
public class TalkingClock {
    private int interval;
    private boolean beep;

    public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Date now = new Date();
            System.out.println("At the tone, the time is  " + now);
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}

