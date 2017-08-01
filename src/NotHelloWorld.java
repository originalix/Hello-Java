import javax.swing.*;
import java.awt.*;

/**
 * Created by Lix on 2017/8/1.
 */
public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new NotHelloWorldFrame();
                frame.setTitle("Not Hello World Programe");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class NotHelloWorldFrame extends JFrame {
    public NotHelloWorldFrame() {
        add(new NotHelloWorldComponent());
        pack();
    }
}
