import java.awt.*;
import javax.swing.*;

public class products {

    JFrame frame;
    JPanel panel1, panel2;
    JLabel nameOfSupermarket, iconLabel, manageLabel, productId, name, quantity, price, category, productsList;
    JTextField productidTf, nameTf, quantityTf, priceTf;
    JComboBox categoryCombo;
    JButton add, edit, delete, clear;

    //headers for table
    String [] columns = {"ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"};
    //ACTUAL DATA
    Object[][] data = new Object[][]{ 
        {1, "Ade", 4, 40.00, "Admin"}, 
        {2, "Ade", 4, 40.00, "Admin"}, 
        {3, "Ade", 4, 40.00, "Admin"},
        {4, "Ade", 4, 40.00, "Admin"},
        {5, "Ade", 4, 40.00, "Admin"},

    };
  
    JTable productsListTable;

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
        panel2.setLayout(null);
        panel2.setBounds(130, 70, 1130, 570);

        nameOfSupermarket = new JLabel("Bee's Supermarket");
        nameOfSupermarket.setForeground(Color.WHITE);
        nameOfSupermarket.setBounds(125, 20, 400, 50);
        nameOfSupermarket.setFont(new Font(null, Font.BOLD, 30));

        iconLabel = new JLabel();
        iconLabel.setIcon(new ImageIcon("src/shopcart.png"));
        iconLabel.setBounds(20, 150, 100, 100);

        manageLabel = new JLabel("INVENTORY");
        manageLabel.setForeground(Color.RED);
        manageLabel.setBounds(380, 20, 400, 50);
        manageLabel.setFont(new Font(null, Font.BOLD, 30));
 
        productId = new JLabel("PRODUCT ID");
        productId.setForeground(Color.RED);
        productId.setBounds(40, 80, 100, 30);
        productId.setFont(new Font(null, Font.BOLD, 15));


        productidTf = new JTextField();
        productidTf.setBounds( 170, 80, 200, 30);

        name = new JLabel("NAME");
        name.setForeground(Color.RED);
        name.setBounds(40, 120, 100, 30);
        name.setFont(new Font(null, Font.BOLD, 15));


        nameTf = new JTextField();
        nameTf.setBounds( 170, 120, 200, 30);

        //quantity

        quantity = new JLabel("QUANTITY");
        quantity.setForeground(Color.RED);
        quantity.setBounds(550, 80, 200, 30);
        quantity.setFont(new Font(null, Font.BOLD, 15));


        quantityTf = new JTextField();
        quantityTf.setBounds( 660, 80, 200, 30);

        //price
        price = new JLabel("PRICE");
        price.setForeground(Color.RED);
        price.setBounds(550, 120, 200, 30);
        price.setFont(new Font(null, Font.BOLD, 15));


        priceTf = new JTextField();
        priceTf.setBounds( 660, 120, 200, 30);

        //category

        category = new JLabel("CATEGORY");
        category.setForeground(Color.RED);
        category.setBounds(40, 160, 200, 30);
        category.setFont(new Font(null, Font.BOLD, 15));


        categoryCombo = new JComboBox<>(new Object[]{"  FoodStuff", "  Beverage", "  Clothing", "  Oil", "  Perfumes"});
        categoryCombo.setBounds( 170, 160, 200, 30);
        categoryCombo.setForeground(Color.RED);

        add = new JButton("ADD");
        add.setForeground(Color.RED);
        add.setBounds( 290, 250, 80, 30);


        edit = new JButton("EDIT");
        edit.setForeground(Color.RED);
        edit.setBounds( 400, 250, 80, 30);


        delete = new JButton("DELETE");
        delete.setForeground(Color.RED);
        delete.setBounds( 500, 250, 100, 30);

        clear = new JButton("CLEAR");
        clear.setForeground(Color.RED);
        clear.setBounds( 630, 250, 100, 30);

        //products Lists
        productsList = new JLabel("PRODUCTS LIST");
        productsList.setBounds(380, 290, 400, 50);
        productsList.setFont(new Font(null, Font.BOLD, 25));
        productsList.setForeground(Color.RED);


        productsListTable = new JTable(data, columns);  
        productsListTable.setFillsViewportHeight(true);
        //productsListTable.setBounds(100, 370, 300, 200);  
        JScrollPane scrollTable = new JScrollPane(productsListTable);   
        scrollTable.setBounds(40,360, 900, 80); 

        panel1.add(nameOfSupermarket);   
        panel1.add(iconLabel);  
        panel1.add(panel2);
        
        panel2.add(manageLabel);
        panel2.add(productId);
        panel2.add(name);
        panel2.add(quantity);
        panel2.add(productidTf);
        panel2.add(nameTf);
        panel2.add(quantityTf);
        panel2.add(price);
        panel2.add(priceTf);
        panel2.add(categoryCombo);
        panel2.add(category);
        panel2.add(add);
        panel2.add(edit);
        panel2.add(delete);
        panel2.add(clear);
        panel2.add(productsList);
        panel2.add(scrollTable);
       //panel2.add(productsListTable);
        
    
        frame.add(panel1);


        frame.setVisible(true);

    }
    
}
