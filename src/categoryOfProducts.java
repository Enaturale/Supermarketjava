import java.awt.*;
import javax.swing.*;

public class categoryOfProducts {

    JFrame frame;
    JPanel main, category;
    JLabel nameofSupermarket, icon, categoriesDashboard, categoriesId, categoryName, categoriesList, description;
    JTextField categoriesTf, categoryNameTf, descriptionTf;
    JButton addCategory, editCategory, deleteCategory, clearCategory;

    String [] columns = {"ID", "NAME", "DESCRIPTION"};
    //ACTUAL DATA
    Object[][] data = new Object[][]{ 
        {1, "Ade","New"}, 
        {2, "Ade", "Old"},
        {3, "Ade","3-in-1"},
        {4, "Ade","okay"},
        {5, "Ade","costley"}, 
    };
  
    JTable categoriesListTable;

    categoryOfProducts(){

        frame = new JFrame("Product Category");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 700);
        frame.setLocation(20, 20);
        frame.setLayout(null);

        main = new JPanel();
        main.setLayout(null);
        main.setBounds(0, 0, 1300, 700);
        main.setBackground(Color.RED);

        category = new JPanel();
        category.setLayout(null);
        category.setBounds(130, 70, 1130, 570);

        nameofSupermarket = new JLabel("Bee's Supermarket");
        nameofSupermarket.setForeground(Color.WHITE);
        nameofSupermarket.setBounds(125, 20, 400, 50);
        nameofSupermarket.setFont(new Font(null, Font.BOLD, 30));

        icon = new JLabel();
        icon.setIcon(new ImageIcon("src/shopcart.png"));
        icon.setBounds(20, 150, 100, 100);

        categoriesDashboard= new JLabel("CATEGORIES DASHBOARD");
        categoriesDashboard.setForeground(Color.RED);
        categoriesDashboard.setBounds(380, 20, 500, 50);
        categoriesDashboard.setFont(new Font(null, Font.BOLD, 30));

        categoriesId = new JLabel("CATEGORY ID");
        categoriesId.setForeground(Color.RED);
        categoriesId.setBounds(40, 80, 150, 30);
        categoriesId.setFont(new Font(null, Font.BOLD, 15));

        categoriesTf = new JTextField();
        categoriesTf.setBounds( 190, 80, 200, 30);

        categoryName = new JLabel("NAME");
        categoryName.setForeground(Color.RED);
        //categoryName.setBounds(40, 120, 100, 30);
        categoryName.setBounds(750, 80, 200, 30);
        categoryName.setFont(new Font(null, Font.BOLD, 15));


        categoryNameTf = new JTextField();
        //categoryNameTf.setBounds( 170, 120, 200, 30);
        categoryNameTf.setBounds( 830, 80, 200, 30);

        description = new JLabel("DESCRIPTION");
        description.setForeground(Color.RED);
        description.setBounds(400, 120, 150, 30);
        description.setFont(new Font(null, Font.BOLD, 15));


        descriptionTf = new JTextField();
        descriptionTf.setBounds( 530, 120, 200, 30);

        addCategory = new JButton("ADD");
        addCategory.setForeground(Color.WHITE);
        addCategory.setBackground(Color.RED);
        addCategory.setBounds( 290, 230, 80, 30);
        addCategory.setFont(new Font(null, Font.BOLD, 15));
        //addCategory.addActionListener(this);


        editCategory = new JButton("EDIT");
        editCategory.setForeground(Color.WHITE);
        editCategory.setBackground(Color.RED);
        editCategory.setBounds( 400, 230, 80, 30);
        editCategory.setFont(new Font(null, Font.BOLD, 15));


        deleteCategory = new JButton("DELETE");
        deleteCategory.setForeground(Color.WHITE);
        deleteCategory.setBackground(Color.RED);
        deleteCategory.setBounds( 500, 230, 100, 30);
        deleteCategory.setFont(new Font(null, Font.BOLD, 15));


        clearCategory = new JButton("CLEAR");
        clearCategory.setForeground(Color.WHITE);
        clearCategory.setBackground(Color.RED);
        clearCategory.setBounds( 630, 230, 100, 30);
        clearCategory.setFont(new Font(null, Font.BOLD, 15));

        categoriesList = new JLabel("CATEGORIES LIST");
        categoriesList.setBounds(430, 290, 400, 50);
        categoriesList.setFont(new Font(null, Font.BOLD, 25));
        categoriesList.setForeground(Color.RED);


        categoriesListTable = new JTable(data, columns);  
        categoriesListTable.setFillsViewportHeight(true);
        //productsListTable.setBounds(100, 370, 300, 200);  
        JScrollPane scrollTable = new JScrollPane(categoriesListTable);   
        scrollTable.setBounds(40,360, 900, 80); 
        scrollTable.setFont(new Font(null, Font.BOLD, 20));

        main.add(nameofSupermarket);
        main.add(icon);

        category.add(categoriesDashboard);
        category.add(categoriesId);
        category.add(categoriesTf);
        category.add(categoryName);
        category.add(categoryNameTf);
        category.add(description);
        category.add(descriptionTf);
        category.add(addCategory);
        category.add(editCategory);
        category.add(deleteCategory);
        category.add(clearCategory);
        category.add(categoriesList);
        category.add(scrollTable);


        frame.add(category);
        frame.add(main);
       
        frame.setVisible(true);

    }
    
}
