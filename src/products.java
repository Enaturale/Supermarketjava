import java.awt.*;
import javax.swing.*;

public class products {

    JFrame frame;
    JPanel panel1, panel2;
    JLabel nameOfSupermarket, iconLabel, manageLabel, productId, name, quantity, price, category;
    JTextField productidTf, nameTf, quantityTf, priceTf;
    JComboBox categoryCombo;
    JButton add, edit, delete;

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

        productidTf = new JTextField();
        productidTf.setBounds( 120, 80, 150, 30);

        name = new JLabel("NAME");
        name.setForeground(Color.RED);
        name.setBounds(40, 120, 100, 30);

        nameTf = new JTextField();
        nameTf.setBounds( 120, 120, 150, 30);


        quantity = new JLabel("QUANTITY");
        quantity.setForeground(Color.RED);
        quantity.setBounds(40, 160, 100, 30);

        quantityTf = new JTextField();
        quantityTf.setBounds( 120, 160, 150, 30);

        price = new JLabel("PRICE");
        price.setForeground(Color.RED);
        price.setBounds(40, 200, 100, 30);

        priceTf = new JTextField();
        priceTf.setBounds( 120, 200, 150, 30);

        category = new JLabel("CATEGORY");
        category.setForeground(Color.RED);
        category.setBounds(40, 240, 100, 30);

        categoryCombo = new JComboBox<>(new Object[]{"FoodStuff", "Beverage", "Clothing", "Oil", "Perfumes"});
        categoryCombo.setBounds( 120, 240, 150, 30);
        categoryCombo.setForeground(Color.RED);

        add = new JButton("ADD");
        add.setForeground(Color.RED);
        add.setBounds( 40, 280, 80, 30);


        edit = new JButton("EDIT");
        edit.setForeground(Color.RED);
        edit.setBounds( 130, 280, 80, 30);


        delete = new JButton("DELETE");
        delete.setForeground(Color.RED);
        delete.setBounds( 220, 280, 100, 30);


        

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


        
    
        frame.add(panel1);


        frame.setVisible(true);

    }
    
}
