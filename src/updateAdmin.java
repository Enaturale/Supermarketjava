import java.awt.*;
import javax.swing.*;
public class updateAdmin {

    JFrame frame;

    JPanel main;

    updateAdmin(){

        frame = new JFrame(" Update Admin");
        frame.setSize(500, 500);
        frame.setLocation(320, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        main = new JPanel();
        main.setBounds(0, 0, 500, 500);
        main.setLayout(null);
        main.setBackground(Color.RED);
        

        frame.add(main);

        frame.setVisible(true);

    }
    
}
