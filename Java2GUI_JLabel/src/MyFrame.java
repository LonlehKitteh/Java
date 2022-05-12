import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        Border border = BorderFactory.createLineBorder(Color.green,3);
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        ImageIcon image = new ImageIcon("foty/logo.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM
        label.setForeground(new Color(0,255,0));
        label.setFont(new Font("Monospaced",Font.BOLD,20)); //set font
        label.setIconTextGap(20); //set gap of text to image
        label.setBackground(Color.black);
        label.setOpaque(true); // display backgroud color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,100,250,250); //set x,y position within frame as well as demensions

        new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(500,500);
        this.setTitle("Labels in Java");
        this.setVisible(true);
        //this.setLayout(null); // set deafult layout on null
        this.add(label);
        this.pack(); // first add components then pack them

    }
}
