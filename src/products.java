import java.awt.*;
import javax.swing.*;

public class products {

    JFrame frame;
    JPanel panel1, panel2;
    JLabel nameOfSupermarket, iconLabel, manageLabel;

    products(){
        frame = new JFrame("Products Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 700);
        frame.setLocation(20, 20);
        frame.setLayout(null);

        panel1 = new JPanel();
        //panel1.setSize(1000, 600);
        panel1.setBounds(0, 0, 1300, 700);
        panel1.setBackground(Color.RED);
        panel1.setLayout(null);

        panel2 = new JPanel();
        panel2.setBounds(130, 70, 1130, 570);

        nameOfSupermarket = new JLabel("Bee's Supermarket");
        nameOfSupermarket.setForeground(Color.WHITE);
        nameOfSupermarket.setBounds(125, 20, 400, 50);
        nameOfSupermarket.setFont(new Font(null, Font.BOLD, 30));

        iconLabel = new JLabel();
        iconLabel.setIcon(new ImageIcon("src/shopcart.png"));
        iconLabel.setBounds(20, 150, 100, 100);

        manageLabel = new JLabel("Manage Products");
        manageLabel.setForeground(Color.RED);
        manageLabel.setBounds(40, 40, 200, 50);
        manageLabel.setFont(new Font(null, Font.BOLD, 30));

        panel1.add(nameOfSupermarket);   
        panel1.add(iconLabel);  
        
        panel2.add(manageLabel);

        panel1.add(panel2);
    
        frame.add(panel1);


        frame.setVisible(true);

    }
    
}
