import javax.swing.*;
import java.awt.Color;
public class login {
    JFrame frame;
    JPanel rightpanel;
    JPanel leftpanel;


    login(){
        frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocation(400, 180);
        frame.setSize(500, 300);

        rightpanel = new JPanel();
        rightpanel.setLayout(null);
        rightpanel.setBackground(Color.ORANGE);
        rightpanel.setBounds(0, 0, 150, 300);

        leftpanel = new JPanel();
        leftpanel.setLayout(null);
        leftpanel.setBackground(Color.WHITE);
        leftpanel.setBounds(150, 0, 350, 300);

        frame.add(rightpanel);
        frame.add(leftpanel);
        frame.setVisible(true);

    }
    
}
