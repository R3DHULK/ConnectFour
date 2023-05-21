import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class connectFour {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    ActionListener listener = new ButtonListener();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button10 = new JButton();
    JButton button11 = new JButton();
    JButton button12 = new JButton();
    JButton button13 = new JButton();
    JButton button14 = new JButton();
    JButton button15 = new JButton();
    JButton button16 = new JButton();
    JButton[] buttons = {button1,button2,button3,button4,
            button5,button6,button7,button8,button9,button10,button11,
            button12,button13,button14,button15,button16
    };
    int playerCounter = 0;
    public static void main(String[] args) {
        connectFour t = new connectFour();
    }
    public connectFour() {
        panel.setLayout(new GridLayout(4,4));
        for(int i = 0;i < buttons.length;i++) {
            buttons[i].addActionListener(listener);
        }
        for(int i = 0;i < buttons.length;i++) {
            panel.add(buttons[i]);
        }
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i = 0;i < buttons.length;i++) {
            if(playerCounter % 2 == 0) {
                frame.setTitle("Player 1 Go");
            }else{
                frame.setTitle("Player 2 Go");
            }
            Color buttonColor1 = button1.getBackground();
            Color buttonColor2 = button2.getBackground();
            Color buttonColor3 = button3.getBackground();
            Color buttonColor4 = button4.getBackground();
            Color buttonColor5 = button5.getBackground();
            Color buttonColor6 = button6.getBackground();
            Color buttonColor7 = button7.getBackground();
            Color buttonColor8 = button8.getBackground();
            Color buttonColor9 = button9.getBackground();
            Color buttonColor10 = button10.getBackground();
            Color buttonColor11 = button11.getBackground();
            Color buttonColor12 = button12.getBackground();
            Color buttonColor13 = button13.getBackground();
            Color buttonColor14 = button14.getBackground();
            Color buttonColor15 = button15.getBackground();
            Color buttonColor16 = button16.getBackground();
            Color[] buttonColors = {buttonColor1,buttonColor2,buttonColor3,
                    buttonColor4,buttonColor5,buttonColor6,buttonColor7,buttonColor8,
                    buttonColor9,buttonColor10,buttonColor11,buttonColor12,
                    buttonColor13,buttonColor14,buttonColor15,buttonColor16
            };
            boolean colorStill = true;
            while(colorStill) {
                for(int j=0;j < buttons.length;j++) {
                    if(buttons[j].getBackground() != buttonColors[j]) {
                        colorStill = false;
                    }
                }
            }
            playerCounter++;
        }
        //Top horizontal victory.
        if(button1.getBackground()==button2.getBackground() && button2.getBackground() == button3.getBackground() && button3.getBackground()==button4.getBackground()) {
            if(button1.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button1.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Second top horizontal victory.
        else if(button5.getBackground()==button6.getBackground() && button6.getBackground() == button7.getBackground() && button7.getBackground()==button8.getBackground()) {
            if(button5.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button5.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Third horizontal victory.
        else if(button9.getBackground()==button10.getBackground() && button10.getBackground() == button11.getBackground() && button11.getBackground()==button12.getBackground()) {
            if(button9.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button9.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Bottom horizontal victory.
        else if(button13.getBackground()==button14.getBackground() && button14.getBackground() == button15.getBackground() && button15.getBackground()==button16.getBackground()) {
            if(button13.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button13.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Left vertical victory.
        else if(button1.getBackground()==button5.getBackground() && button5.getBackground() == button9.getBackground() && button9.getBackground()==button14.getBackground()) {
            if(button1.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button1.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Second left vertical victory.
        else if(button2.getBackground()==button6.getBackground() && button6.getBackground() == button10.getBackground() && button10.getBackground()==button14.getBackground()) {
            if(button2.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button2.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Second right vertical victory.
        else if(button3.getBackground()==button7.getBackground() && button7.getBackground() == button11.getBackground() && button11.getBackground()==button15.getBackground()) {
            if(button3.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button3.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Right vertical victory.
        else if(button4.getBackground()==button8.getBackground() && button8.getBackground() == button12.getBackground() && button12.getBackground()==button16.getBackground()) {
            if(button4.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button14.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Top-left to bottom-right diagonal victory.
        else if(button1.getBackground()==button6.getBackground() && button6.getBackground() == button11.getBackground() && button11.getBackground()==button16.getBackground()) {
            if(button1.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button1.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Top-right to bottom-left diagonal victory.
        else if(button4.getBackground() == button7.getBackground() && button7.getBackground() == button10.getBackground() && button10.getBackground() == button13.getBackground()) {
            if(button4.getBackground()==Color.red) {
                frame.setTitle("Player1 has won!");
            }else if(button4.getBackground()==Color.green) {
                frame.setTitle("Player2 has won!");
            }
        }
        //Game is tied if none of the previous victory instances occur.
        else {
            frame.setTitle("The game is tied.");
        }
    }
    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource()==button1) {
                if(playerCounter%2==0) {
                    button1.setBackground(Color.red);
                }else {
                    button1.setBackground(Color.green);
                }
            }else if(e.getSource()==button2) {
                if(playerCounter%2==0) {
                    button2.setBackground(Color.red);
                }else {
                    button2.setBackground(Color.green);
                }
            }else if(e.getSource()==button3) {
                if(playerCounter%2==0) {
                    button3.setBackground(Color.red);
                }else {
                    button3.setBackground(Color.green);
                }
            }else if(e.getSource()==button4) {
                if(playerCounter%2==0) {
                    button4.setBackground(Color.red);
                }else {
                    button4.setBackground(Color.green);
                }
            }else if(e.getSource()==button5) {
                if(playerCounter%2==0) {
                    button5.setBackground(Color.red);
                }else {
                    button5.setBackground(Color.green);
                }
            }else if(e.getSource()==button6) {
                if(playerCounter%2==0) {
                    button6.setBackground(Color.red);
                }else {
                    button6.setBackground(Color.green);
                }
            }else if(e.getSource()==button7) {
                if(playerCounter%2==0) {
                    button7.setBackground(Color.red);
                }else {
                    button7.setBackground(Color.green);
                }
            }else if(e.getSource()==button8) {
                if(playerCounter%2==0) {
                    button8.setBackground(Color.red);
                }else {
                    button8.setBackground(Color.green);
                }
            }else if(e.getSource()==button9) {
                if(playerCounter%2==0) {
                    button9.setBackground(Color.red);
                }else {
                    button9.setBackground(Color.green);
                }
            }else if(e.getSource()==button10) {
                if(playerCounter%2==0) {
                    button10.setBackground(Color.red);
                }else {
                    button10.setBackground(Color.green);
                }
            }else if(e.getSource()==button11) {
                if(playerCounter%2==0) {
                    button11.setBackground(Color.red);
                }else {
                    button11.setBackground(Color.green);
                }
            }else if(e.getSource()==button12) {
                if(playerCounter%2==0) {
                    button12.setBackground(Color.red);
                }else {
                    button12.setBackground(Color.green);
                }
            }else if(e.getSource()==button13) {
                if(playerCounter%2==0) {
                    button13.setBackground(Color.red);
                }else {
                    button13.setBackground(Color.green);
                }
            }else if(e.getSource()==button14) {
                if(playerCounter%2==0) {
                    button14.setBackground(Color.red);
                }else {
                    button14.setBackground(Color.green);
                }
            }else if(e.getSource()==button15) {
                if(playerCounter%2==0) {
                    button15.setBackground(Color.red);
                }else {
                    button15.setBackground(Color.green);
                }
            }else if(e.getSource()==button16) {
                if(playerCounter%2==0) {
                    button16.setBackground(Color.red);
                }else {
                    button16.setBackground(Color.green);
                }
            }
        }
    }
}