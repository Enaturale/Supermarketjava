import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
public class login {
    JFrame frame;
    JPanel rightpanel;
    JPanel leftpanel;
    JLabel nameofSupermarket;
    JTextField user;
    JPasswordField password;
    JComboBox role;
    JLabel selectrole;
    JLabel passwordText;
    JLabel userId;
    JButton login, reset;



    login(){
        frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocation(400, 180); 
        frame.setSize(500, 350);

        rightpanel = new JPanel();
        rightpanel.setLayout(null);
        rightpanel.setBackground(Color.ORANGE);
        rightpanel.setBounds(0, 0, 150, 350);

        leftpanel = new JPanel();
        leftpanel.setLayout(null);
        leftpanel.setBackground(Color.WHITE);
        leftpanel.setBounds(150, 0, 350, 350);

        nameofSupermarket = new JLabel("Bee's Supermarket");
        nameofSupermarket.setBounds(80, 10, 200, 50);
        nameofSupermarket.setFont(new Font(null, Font.BOLD, 20));


        //select role
        selectrole = new JLabel("Select Role");
        selectrole.setBounds(30, 70, 150, 30);
        role = new JComboBox<>(new Object[] {"Admin", "Cashier"});
        role.setBounds(150,70 , 150, 30);


        //user id row
        userId = new JLabel("ID");
        userId.setBounds(30, 120, 150, 30);
        user = new JTextField("");
        user.setBounds(150, 120, 150, 30);

        //password row        
        passwordText = new JLabel("Password");
        passwordText.setBounds(30, 180, 150, 30);       
        password = new JPasswordField("");        
        password.setBounds(150, 180 , 150, 30);

        //buttons to login and reset
        login = new JButton("Login");
        login.setBounds(30, 250, 130, 30);
        reset = new JButton("Reset");
        reset.setBounds(170, 250, 130, 30);



        leftpanel.add(nameofSupermarket);
        leftpanel.add(user);
        leftpanel.add(password);
        leftpanel.add(role);
        leftpanel.add(selectrole);
        leftpanel.add(userId);
        leftpanel.add(passwordText);
        leftpanel.add(login);
        leftpanel.add(reset);



        frame.add(rightpanel);
        frame.add(leftpanel);
        frame.setVisible(true);

    }
    
}
