import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("                 Dupaaaaaaaaaaaaaa");
    Random random = new Random();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) dimension.getWidth();
    int y = (int) dimension.getHeight();

    NewWindow(){

        label.setBounds(0,0,500,500);
        label.setFont(new Font(null,Font.PLAIN,25));
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setLocation(random.nextInt(x) - 250, random.nextInt(y) - 250);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);

        frame.setVisible(true);
    }
}
