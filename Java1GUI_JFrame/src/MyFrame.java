import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        new JFrame(); // creates a frame
        ImageIcon icon = new ImageIcon("foty/logo.png"); // creates a icon

        this.setSize(820,820); // makes a size for frame 420 x 420
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // it exits when aplication is closed
        this.setTitle("First Aplication"); // this is title
        this.setResizable(false); // you cant resize frame
        this.setIconImage(icon.getImage()); // add a icon to the frame
        this.getContentPane().setBackground(new Color(0x323641));

        this.setVisible(true); // makes frame visible
    }
}
