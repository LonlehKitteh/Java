import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        /* JLabel */
        JLabel label = new JLabel();
        label.setText("hi");
        ImageIcon icon = new ImageIcon("foty/logo.png");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,150,100);
        /* redPanel */
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);
        /* bluePanel */
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);
        /* greenPanel */
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);

        new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Java - 3 JPanel");
        this.setSize(750,750);
        this.setVisible(true);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
        greenPanel.add(label);

    }
}
