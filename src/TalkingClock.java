import javax.swing.*;
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

    /**
     * Constructs a talking clock.
     * @param interval the interval between messages(in milliseconds)
     * @param beep true if the clock should beep
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Strats the clock.
     */
    public void start() {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

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

