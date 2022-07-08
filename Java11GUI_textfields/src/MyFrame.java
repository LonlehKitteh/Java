import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton btn;
    JTextField textField;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(Color.green);
        textField.setBackground(new Color(0x000000));
        textField.setCaretColor(Color.white);
        textField.setText("username");
        //textField.setEditable(false);

        btn = new JButton("Submit");
        btn.addActionListener(this);
        this.add(btn);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            System.out.println(textField.getText());
            textField.setEditable(false);
            btn.setEnabled(false);
        }
    }
}
