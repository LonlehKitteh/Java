import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Free skins!");
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

    LaunchPage(){

        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setBackground(new Color(0xE31288));
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        frame.setResizable(false);
        frame.setSize(420,420);
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.add(button);
        frame.setLocation(x,y);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            //frame.dispose();
            for(int i = 1; i < 50; i++){
                new NewWindow();
            }
        }
    }
}
