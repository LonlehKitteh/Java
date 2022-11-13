import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JButton[] buttons = new JButton[25];
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    Color colorBgBtn = new Color(0xFFFFFF);
    Color colorBgBtn1 = new Color(0xDDDDDD);
    Color color = new Color(0xD41C7D);
    Color colorBlack = new Color(0x000000);
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel  result = new JPanel();
    JLabel label = new JLabel("0",null, SwingConstants.LEADING);
    GridLayout grid = new GridLayout(2,4,6,6);
    int spaced = 12; // button padding
    int x = (int) dimension.getWidth() / 2 - 230;
    int y = (int) dimension.getHeight() / 2 - 264;
    public void Buttons(){
        for(int i = 1; i < 25; i ++){
            // Visual outputs
            switch (i){
                case 1: buttons[i] = new JButton("!");panel1.add(buttons[i]);break;
                case 2: buttons[i] = new JButton("%");panel1.add(buttons[i]);break;
                case 3: buttons[i] = new JButton("C");panel1.add(buttons[i]);break;
                case 4: buttons[i] = new JButton("|<-");panel1.add(buttons[i]);break;
                case 5: buttons[i] = new JButton("1/x");panel1.add(buttons[i]);break;
                case 6: buttons[i] = new JButton("x^2");panel1.add(buttons[i]);break;
                case 7: buttons[i] = new JButton("sqr()");panel1.add(buttons[i]);break;
                case 8: buttons[i] = new JButton("/");panel1.add(buttons[i]);break;
                case 9: buttons[i] = new JButton("7");panel2.add(buttons[i]);break;
                case 10: buttons[i] = new JButton("8");panel2.add(buttons[i]);break;
                case 11: buttons[i] = new JButton("9");panel2.add(buttons[i]);break;
                case 12: buttons[i] = new JButton("*");panel2.add(buttons[i]);break;
                case 13: buttons[i] = new JButton("4");panel2.add(buttons[i]);break;
                case 14: buttons[i] = new JButton("5");panel2.add(buttons[i]);break;
                case 15: buttons[i] = new JButton("6");panel2.add(buttons[i]);break;
                case 16: buttons[i] = new JButton("-");panel2.add(buttons[i]);break;
                case 17: buttons[i] = new JButton("1");panel3.add(buttons[i]);break;
                case 18: buttons[i] = new JButton("2");panel3.add(buttons[i]);break;
                case 19: buttons[i] = new JButton("3");panel3.add(buttons[i]);break;
                case 20: buttons[i] = new JButton("+");panel3.add(buttons[i]);break;
                case 21: buttons[i] = new JButton("+/-");panel3.add(buttons[i]);break;
                case 22: buttons[i] = new JButton("0");panel3.add(buttons[i]);break;
                case 23: buttons[i] = new JButton(",");panel3.add(buttons[i]);break;
                case 24: buttons[i] = new JButton("=");panel3.add(buttons[i]);break;
            }
            buttons[i].addMouseListener(this);
            buttons[i].setFocusable(false);
            buttons[i].setFont(new Font("monospaced",Font.BOLD,20));
            buttons[i].setForeground(colorBlack);
            buttons[i].setMargin(new Insets(spaced,spaced + 5,spaced,spaced + 5));
            buttons[i].setBackground(colorBgBtn1);
            buttons[i].setPreferredSize(new Dimension(100,55));
            buttons[i].setBorder(BorderFactory.createLineBorder(colorBlack,1));
            int I = i;
            buttons[i].getModel().addChangeListener  (e -> {
                if(buttons[I].getModel().isRollover()){
                    buttons[I].setBorder(BorderFactory.createLineBorder(color,1));
                    buttons[I].setBackground(color);
                    buttons[I].setForeground(colorBgBtn);
                } else if(!buttons[I].getModel().isRollover()){
                    buttons[I].setBorder(BorderFactory.createLineBorder(colorBlack,1));
                    buttons[I].setBackground(colorBgBtn1);
                    buttons[I].setForeground(colorBlack);
                }
            });
        }
    }
    public void Add(){
        //String regEx = "^[0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+$";
        int counter = 0, counter1 = 0;
        double eval = 0;
        String text2 = label.getText();
        String regEx1 = "(?=[-*+/])|[*+/]";
        String regExM2 = "\\*";
        String regExM3 = "/";
        String[] arr = text2.split(regEx1);
        String[] arr1, arr2;
        if(label.getText().equals("0")){
            label.setText("0");
        } else {
            for (String s : arr) {
                if (s.contains("*") || s.contains("/")) {
                    if (s.contains("*")) {
                        arr1 = s.split(regExM2);
                        if (arr[counter - 1].contains("*")) {
                            arr2 = arr[counter - 1].split(regExM2);
                            eval *= Double.parseDouble(arr2[1]);
                        } else if (arr[counter - 1].contains("/")) {
                            eval *= Double.parseDouble(arr1[1]);
                        } else {
                            eval += Double.parseDouble(arr[counter - 1]) * Double.parseDouble(arr1[1]);
                        }
                    } else if (s.contains("/")) {
                        arr1 = s.split(regExM3);
                        if (arr[counter - 1].contains("/")) {
                            arr2 = arr[counter - 1].split(regExM3);
                            System.out.println(eval);
                            eval /= Double.parseDouble(arr2[1]);
                            System.out.println(eval);
                        } else if (arr[counter - 1].contains("*")) {
                            arr2 = arr[counter - 1].split(regExM2);
                            eval /= Double.parseDouble(arr2[1]);
                        } else {
                            eval += Double.parseDouble(arr[counter - 1]) / Double.parseDouble(arr1[1]);
                        }
                    }
                }
                counter++;
            }
            counter = 0;
            for (String s : arr) {
                if (counter == 0) {
                    if (!arr[1].contains("*")) {
                        if (!arr[1].contains("/")) {
                            if (s.contains("-")) {
                                System.out.print("");
                            } else {
                                eval += Double.parseDouble(arr[0]);
                            }
                        }
                    }
                }
                if (counter1 == arr.length - 1 && !arr[counter].contains("*")) {
                    if (!arr[counter].contains("/")) {
                        eval += Double.parseDouble(arr[counter]);
                        break;
                    }
                }
                if (s.contains("+") || s.contains("-")) {
                    if (!arr[counter + 1].contains("*")) {
                        if (!arr[counter + 1].contains("/")) {
                            eval += Double.parseDouble(arr[counter]);
                        }
                    }
                }
                counter1++;
                counter++;
            }
            if (String.valueOf(eval).equals("Infinity") || String.valueOf(eval).equals("NaN")) {
                label.setText("You divided by zero!");
            } else {
                label.setText(String.valueOf(eval));
            }
        }
    }

    public void Factorial(){
        int factorial = Integer.parseInt(label.getText());
        if(factorial > 31){
            label.setText("to big!");
        }
        if(factorial == 0){
            label.setText("1");
        }
        else {
            for (int i = 1; i < Integer.parseInt(label.getText()); i++) {
                factorial *= (Integer.parseInt(label.getText()) - i);
            }
            label.setText(String.valueOf(factorial));
        }
    }
    public void Exponentiation(){
        double text = Double.parseDouble(label.getText());
        text *= text;
        label.setText(String.valueOf(text));
    }
    public void Backspace(){
        label.setText(label.getText().substring(0,label.getText().length() - 1));
    }
    public void Reciprocal(){
        double i = Double.parseDouble(label.getText());
        if(i == 0){
            label.setText("You divided by zero!");
        } else{
            i = 1/i;
            label.setText(String.valueOf(i));
        }
    }
    public void Percent(){
        double i = Double.parseDouble(label.getText());
        i /= 100;
        label.setText(String.valueOf(i));
    }
    public void SquareRoot(){
        double i = Double.parseDouble(label.getText());
        label.setText(String.valueOf(Math.sqrt(i)));
    }
    public void Absolute(){
        double i = Double.parseDouble(label.getText());
        if(i > 0){
            label.setText("-"+label.getText());
        } else if(i < 0){
            label.setText(label.getText().substring(1));
        }else{
            label.setText(label.getText());
        }
    }
    public void EnabledF(boolean b){
        buttons[1].setEnabled(b);
        buttons[2].setEnabled(b);
        buttons[5].setEnabled(b);
        buttons[6].setEnabled(b);
        buttons[7].setEnabled(b);
        buttons[8].setEnabled(b);
        buttons[12].setEnabled(b);
        buttons[16].setEnabled(b);
        buttons[20].setEnabled(b);
        buttons[21].setEnabled(b);
        buttons[23].setEnabled(b);
        buttons[24].setEnabled(b);
    }
    MyFrame(){
        Buttons();

     // panel1
     panel1.setLayout(grid);
     panel1.setBackground(Color.white);
     panel1.setOpaque(true);
     panel1.setBorder(BorderFactory.createMatteBorder(6,12, 3,12,Color.white));

     // panel2
     panel2.setLayout(grid);
     panel2.setBackground(Color.white);
     panel2.setOpaque(true);
     panel2.setBorder(BorderFactory.createMatteBorder(3,12,3,12,Color.white));

     // panel3
     panel3.setLayout(grid);
     panel3.setBackground(Color.white);
     panel3.setOpaque(true);
     panel3.setBorder(BorderFactory.createMatteBorder(3,12,12,12,Color.white));

     // result
     result.setBorder(BorderFactory.createMatteBorder(12,12,12,12,Color.white));
     result.setBackground(Color.white);
     result.setLayout(new GridLayout(1,1));
     result.setOpaque(true);
     result.add(label);

     // label
     label.setBounds(0,0,10,10);
     label.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
     label.setFont(new Font("monospaced",Font.BOLD,30));
     label.setBackground(Color.white);
     label.setOpaque(true);

     // JFrame
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setTitle("Calculator");
     this.setLayout(new GridLayout(4,1));
     this.add(result);
     this.add(panel1);
     this.add(panel2);
     this.add(panel3);
     this.setLocation(x,y);
     this.pack();
     this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == buttons[1]) {
            Factorial();
        } else if (e.getSource() == buttons[2]) {
            Percent();
        } else if (e.getSource() == buttons[3]) {
            label.setText("0");
            EnabledF(true);
        } else if (e.getSource() == buttons[4]) {
            Backspace();
            EnabledF(true);
        } else if (e.getSource() == buttons[5]) {
            Reciprocal();
        } else if (e.getSource() == buttons[6]) {
            Exponentiation();
        } else if (e.getSource() == buttons[7]) {
            SquareRoot();
        } else if (e.getSource() == buttons[8]) {
            if(label.getText().endsWith("*") || label.getText().endsWith("+") || label.getText().endsWith("-") || label.getText().endsWith("/")){
                label.setText(label.getText());
            } else {
                label.setText(label.getText() + "/");
            }
            EnabledF(false);
        } else if (e.getSource() == buttons[9]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "7");
            EnabledF(true);
        } else if (e.getSource() == buttons[10]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "8");
            EnabledF(true);
        } else if (e.getSource() == buttons[11]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "9");
            EnabledF(true);
        } else if (e.getSource() == buttons[12]) {
            if(label.getText().endsWith("*") || label.getText().endsWith("+") || label.getText().endsWith("-") || label.getText().endsWith("/")){
                label.setText(label.getText());
            } else {
                label.setText(label.getText() + "*");
            }
            EnabledF(false);
        } else if (e.getSource() == buttons[13]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "4");
            EnabledF(true);
        } else if (e.getSource() == buttons[14]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "5");
            EnabledF(true);
        } else if (e.getSource() == buttons[15]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "6");
            EnabledF(true);
        } else if (e.getSource() == buttons[16]) {
            if(label.getText().endsWith("*") || label.getText().endsWith("+") || label.getText().endsWith("-") || label.getText().endsWith("/")){
                label.setText(label.getText());
            } else {
                label.setText(label.getText() + "-");
            }
            EnabledF(false);
        } else if (e.getSource() == buttons[17]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "1");
            EnabledF(true);
        } else if (e.getSource() == buttons[18]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "2");
            EnabledF(true);
        } else if (e.getSource() == buttons[19]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "3");
            EnabledF(true);
        } else if (e.getSource() == buttons[20]) {
            if(label.getText().endsWith("*") || label.getText().endsWith("+") || label.getText().endsWith("-") || label.getText().endsWith("/")){
                label.setText(label.getText());
            } else {
                label.setText(label.getText() + "+");
            }
            EnabledF(false);
        } else if (e.getSource() == buttons[21]) {
            Absolute();
        } else if (e.getSource() == buttons[22]) {
            if(label.getText().equals("0")) {
                label.setText("");
            }
            label.setText(label.getText() + "0");
            EnabledF(true);
        } else if (e.getSource() == buttons[23]) {
            label.setText(label.getText() + ".");
        } else if (e.getSource() == buttons[24]) {
            Add();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
