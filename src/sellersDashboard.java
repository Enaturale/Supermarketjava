import java.awt.*;
import javax.swing.*;

public class sellersDashboard {
    JFrame frame;
    JPanel main, seller;
    JLabel name, icon, title, sellerId, sellerName, password, gender, sellerList;
    JTextField sellerTf, sellerNameTf, genderTf;
    JPasswordField passwordTf;
    JComboBox genderCombo;
    JButton addSeller, editSeller, deleteSeller, clearSeller;

    //headers for table
    String [] columns = {"ID", "NAME", "PASSWORD", "GENDER"};
    //ACTUAL DATA
    Object[][] data = new Object[][]{ 
        {1, "Ade", "1244","Male"}, 
        {2, "Ade", "1244","Male"},
        {3, "Ade", "1244","Female"},
        {4, "Ade", "1244","Male"},
        {5, "Ade", "1244","Female"}, 

    };
  
    JTable sellerListTable;


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
        //seller's id
        sellerId = new JLabel("SELLER ID");
        sellerId.setForeground(Color.RED);
        sellerId.setBounds(40, 80, 100, 30);
        sellerId.setFont(new Font(null, Font.BOLD, 15));


        sellerTf = new JTextField();
        sellerTf.setBounds( 170, 80, 200, 30);

        //seller's name
        sellerName = new JLabel("NAME");
        sellerName.setForeground(Color.RED);
        // sellerName.setBounds(40, 120, 100, 30);
        sellerName.setFont(new Font(null, Font.BOLD, 15));
        sellerName.setBounds(710, 80, 200, 30);
        // sellerName.setBounds(40, 120, 100, 30);
        // sellerName.setFont(new Font(null, Font.BOLD, 15));


         sellerNameTf = new JTextField();
         sellerNameTf.setBounds( 800, 80, 200, 30);
        //sellerNameTf.setBounds( 170, 120, 200, 30);

        //seller's password
        password = new JLabel("PASSWORD");
        password.setForeground(Color.RED);
        password.setBounds(40, 120, 100, 30);
        // password.setBounds(550, 80, 200, 30);
        password.setFont(new Font(null, Font.BOLD, 15));


        passwordTf = new JPasswordField();
        passwordTf.setBounds( 170, 120, 200, 30);
        // passwordTf.setBounds( 660, 80, 200, 30);

        //gender        
        gender = new JLabel("GENDER");
        gender.setForeground(Color.RED);
        gender.setBounds(710, 120, 200, 30);
        gender.setFont(new Font(null, Font.BOLD, 15));


        genderCombo = new JComboBox<>(new Object[]{"  Male", "  Female"});
        genderCombo.setBounds( 800, 120, 200, 30);
        genderCombo.setForeground(Color.RED);


        //buttons
        addSeller = new JButton("ADD");
        addSeller.setForeground(Color.WHITE);
        addSeller.setBackground(Color.RED);
        addSeller.setBounds( 290, 250, 80, 30);
        addSeller.setFont(new Font(null, Font.BOLD, 15));
        //addSeller.addActionListener(this);


        editSeller = new JButton("EDIT");
        editSeller.setForeground(Color.WHITE);
        editSeller.setBackground(Color.RED);
        editSeller.setBounds( 400, 250, 80, 30);
        editSeller.setFont(new Font(null, Font.BOLD, 15));


        deleteSeller = new JButton("DELETE");
        deleteSeller.setForeground(Color.WHITE);
        deleteSeller.setBackground(Color.RED);
        deleteSeller.setBounds( 500, 250, 100, 30);
        deleteSeller.setFont(new Font(null, Font.BOLD, 15));


        clearSeller = new JButton("CLEAR");
        clearSeller.setForeground(Color.WHITE);
        clearSeller.setBackground(Color.RED);
        clearSeller.setBounds( 630, 250, 100, 30);
        clearSeller.setFont(new Font(null, Font.BOLD, 15));

        //sellers's list in a table
        sellerList = new JLabel("SELLER'S LIST");
        sellerList.setBounds(450, 290, 400, 50);
        sellerList.setFont(new Font(null, Font.BOLD, 25));
        sellerList.setForeground(Color.RED);

        sellerListTable = new JTable(data, columns);  
        sellerListTable.setFillsViewportHeight(true);
        //productsListTable.setBounds(100, 370, 300, 200);  
        JScrollPane scrollTable = new JScrollPane(sellerListTable);   
        scrollTable.setBounds(40,360, 900, 80); 
        scrollTable.setFont(new Font(null, Font.BOLD, 20));

        

        seller.add(title);
        seller.add(sellerId);
        seller.add(sellerTf);
        seller.add(sellerName);
        seller.add(sellerNameTf);
        seller.add(password);
        seller.add(passwordTf);
        seller.add(gender);
        seller.add(genderCombo);
        seller.add(addSeller);
        seller.add(clearSeller);
        seller.add(deleteSeller);
        seller.add(editSeller);
        seller.add(sellerList);
        seller.add(scrollTable);

        main.add(name);
        main.add(icon);
        main.add(seller);

        frame.add(main);
        //frame.add(seller);
        
        frame.setVisible(true);
        
    }
    
}
