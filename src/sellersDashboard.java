import java.awt.*;
import javax.swing.*;

public class sellersDashboard {
    JFrame frame;
    JPanel main, seller;
    JLabel name, icon, title, sellerId, sellerName, password;
    JTextField sellerTf, sellerNameTf;
    JPasswordField passwordTf;


    sellersDashboard(){

        frame = new JFrame("Seller's Dashboard");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 700);
        frame.setLocation(20, 20);
        //frame.setBackground(Color.red);
    
        main = new JPanel();
        main.setLayout(null);
        main.setBackground(Color.red);
        main.setBounds(0, 0, 1300, 700);

        seller = new JPanel();        
        seller.setBackground(Color.WHITE);
        seller.setBounds(130, 70, 1130, 570);
        seller.setLayout(null);

        
        name = new JLabel("Bee's Supermarket");
        name.setForeground(Color.WHITE);
        name.setBounds(125, 20, 400, 50);
        name.setFont(new Font(null, Font.BOLD, 30));

        icon = new JLabel();
        icon.setIcon(new ImageIcon("src/shopcart.png"));
        icon.setBounds(20, 150, 100, 100);

        //pagecontent
        //title
        title = new JLabel("SELLER'S DASHBAORD");
        title.setForeground(Color.RED);
        title.setBounds(380, 20, 400, 50);
        title.setFont(new Font(null, Font.BOLD, 30));

        //labels and entry dashboards
        sellerId = new JLabel("SELLER ID");
        sellerId.setForeground(Color.RED);
        sellerId.setBounds(40, 80, 100, 30);
        sellerId.setFont(new Font(null, Font.BOLD, 15));


        sellerTf = new JTextField();
        sellerTf.setBounds( 170, 80, 200, 30);

        
        sellerName = new JLabel("NAME");
        sellerName.setForeground(Color.RED);
        // sellerName.setBounds(40, 120, 100, 30);
        sellerName.setFont(new Font(null, Font.BOLD, 15));
        sellerName.setBounds(550, 80, 200, 30);

        // sellerName.setBounds(40, 120, 100, 30);
        // sellerName.setFont(new Font(null, Font.BOLD, 15));


         sellerNameTf = new JTextField();
         sellerNameTf.setBounds( 660, 80, 200, 30);
        //sellerNameTf.setBounds( 170, 120, 200, 30);

        password = new JLabel("PASSWORD");
        password.setForeground(Color.RED);
        password.setBounds(40, 120, 100, 30);
        // password.setBounds(550, 80, 200, 30);
        password.setFont(new Font(null, Font.BOLD, 15));


        passwordTf = new JPasswordField();
        passwordTf.setBounds( 170, 120, 200, 30);
        // passwordTf.setBounds( 660, 80, 200, 30);

        

        seller.add(title);
        seller.add(sellerId);
        seller.add(sellerTf);
        seller.add(sellerName);
        seller.add(sellerNameTf);
        seller.add(password);
        seller.add(passwordTf);

        main.add(name);
        main.add(icon);
        main.add(seller);

        frame.add(main);
        //frame.add(seller);
        
        frame.setVisible(true);
        
    }
    
}
