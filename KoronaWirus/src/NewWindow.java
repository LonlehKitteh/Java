import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NewWindow {

    JFrame frame = new JFrame();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) dimension.getWidth();
    int y = (int) dimension.getHeight();
    Random random = new Random();

    NewWindow(){
     frame.setResizable(false);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     frame.setSize(420,420);
     frame.setLocation(random.nextInt(x) - 240,random.nextInt(y) - 240);
     frame.setVisible(true);
    }
}
