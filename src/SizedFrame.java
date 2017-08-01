import javax.swing.*;
import java.awt.*;

/**
 * Created by Lix on 2017/8/1.
 */
public class SizedFrame extends JFrame {

    public SizedFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenHeight / 2, screenWidth / 2);
        setLocationByPlatform(true);

        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);
    }
}
