import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) dimension.getWidth() - 420;
        int y = (int) dimension.getHeight() - 420;
        ImageIcon icon = new ImageIcon("foty/logp.jpg");

        JFrame frame = new JFrame("Question");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420,420);
        String[] responses = {"Tak nie wyobrażam sobie życia bez Ciebie","Muszę się jeszcze zastanowić","To skomplikowane"};
        JOptionPane.showOptionDialog(frame,"Do you love me?","The moment of truth...",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, icon,responses,1);

        //JOptionPane.showMessageDialog(null, "This is some useless info", "Title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is MORE useless info", "Title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Do you want to EXIT?", "Title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Warning you are smelling really bad...", "Title",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Error page not found", "Title",JOptionPane.ERROR_MESSAGE);
    /*while(true) {
        frame.setLocation(random.nextInt(x),random.nextInt(y));
        int r = JOptionPane.showConfirmDialog(frame, "Do you love me ?", "This is my love", JOptionPane.YES_NO_OPTION);
        if(r == 0){
            JFrame frame1 = new JFrame("Answer");
            JLabel label = new JLabel("I LOVE YOU TOO <3");
            label.setBounds(70,0,420,420);
            label.setFont(new Font(null,Font.PLAIN,30));
            label.setForeground(Color.red);
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setVisible(true);
            frame1.setLayout(null);
            frame1.setSize(420,420);
            frame1.setLocation(random.nextInt(x),random.nextInt(y));
            frame1.add(label);
            } else{
            System.out.println("Really? </3");
                System.exit(0);
            }
        }*/
    }
}
