import java.awt.*;
import javax.swing.*;
public class updateAdmin {

    JFrame frame;

    JPanel main;


    JLabel productId, name, title;
    JTextField productTf, nameTf;

    JButton update, clear;

    updateAdmin(){

        frame = new JFrame(" Update Admin");
        frame.setSize(500, 400);
        frame.setLocation(320, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        main = new JPanel();
        main.setBounds(0, 0, 500, 400);
        main.setLayout(null);
        main.setBackground(Color.RED);

        title = new JLabel("Update Admin");
        title.setBounds(170, 30, 200, 40);
        title.setForeground(Color.WHITE);
        title.setFont(new Font(null, Font.BOLD, 20));


        productId = new JLabel("Product ID");
        productId.setBounds(100, 100, 100, 30);
        productId.setForeground(Color.WHITE);
        productId.setFont(new Font(null, Font.BOLD, 15));


        name = new JLabel("Name");
        name.setBounds(100, 150, 100, 30);
        name.setForeground(Color.WHITE);
        name.setFont(new Font(null, Font.BOLD, 15));


        productTf = new JTextField();
        productTf.setBounds(200, 100, 150, 30);

        nameTf = new JTextField();
        nameTf.setBounds(200, 150, 150, 30);

        update = new JButton("Update");
        update.setBounds(120, 220, 100, 30);
        update.setForeground(Color.red);
        update.setBackground(Color.white);



        clear = new JButton("Clear");
        clear.setBounds(240, 220, 100, 30);
        clear.setForeground(Color.red);
        clear.setBackground(Color.white);





        
        main.add(title);
        main.add(name);
        main.add(productId);
        main.add(productTf);
        main.add(nameTf);
        main.add(update);
        main.add(clear);

        frame.add(main);

        frame.setVisible(true);

    }
    
}
