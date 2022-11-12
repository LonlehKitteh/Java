import javax.swing.*;
import java.awt.*;

public class GUIDemo2 {
    JFrame frame;
    JPanel panel;
    JButton button1;
    JButton button2;
    int width;
    int height;

    public GUIDemo2(int w,int h){
        this.width = w;
        this.height = h;
        this.frame = new JFrame();
        //this.panel = new JPanel(new GridLayout(1,2));
        this.panel = new JPanel();
        this.button1 = new JButton("Button1");
        this.button2 = new JButton("Button2");
    }

    public void setUpGUI(){
     frame.setSize(width,height);
     frame.setTitle("GUI Demo JPanel");
     panel.setLayout(new GridLayout(1,2));
     panel.add(button1);
     panel.add(button2);
     frame.add(panel);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
    }
}
