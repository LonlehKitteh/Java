import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    int b = 1;
    MyFrame(){

        ImageIcon icon = new ImageIcon("foty/logo.png");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(200, 350, 150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200,100,400,200);
        // sets width and height for a btn nd place it 100 pixels from left and 100 pixels from the top
        button.addActionListener(this);
        // button.addActionListener(e -> System.out.println("poop"));
        button.setText("Click me!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setForeground(Color.cyan);
        button.setBackground(new Color(0x323641));
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800,800);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            // System.out.println("poop");
            // button.setEnabled(false);
            // label.setVisible(true);
            if(b == 1){
                button.setBackground(new Color(0x123456));
                b = 0;
            } else{
                button.setBackground(new Color(0x323641));
                b = 1;
            }
        }
    }
}
