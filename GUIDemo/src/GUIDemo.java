import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo {
    JFrame frame;
    JLabel label;
    JTextField input;
    JTextArea ta;
    JButton button1;
    JButton button2;
    JButton button3;
    int width;
    int height;

    public GUIDemo(int w,int h){
        frame = new JFrame();
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        button3 = new JButton("Button3");
        label = new JLabel("Hello");
        input = new JTextField(10);
        ta =new JTextArea("Hello.\nThis is JTextArea");
        this.height = h;
        this.width = w;
    }

    public void setUpGUI(){
        Container cp = frame.getContentPane();
        GridLayout grid = new GridLayout(2,3);
        cp.setLayout(grid);
        frame.setSize(width,height);
        frame.setTitle("GUI Demo");
        cp.add(input);
        cp.add(label);
        cp.add(ta);
        cp.add(button1);
        cp.add(button2);
        cp.add(button3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setUpButtonListeners(){
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource() == button1){
                    String s = input.getText();
                    label.setText(s);
                } else if(e.getSource() == button2){
                    String addition = input.getText();
                    double additiontoDouble = Double.parseDouble(addition);
                    additiontoDouble *= 2;
                    label.setText(Double.toString(additiontoDouble));
                }
            }
        };
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
    }
}
