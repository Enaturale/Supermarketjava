import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.*;

public class splash implements MouseListener {
    JFrame frame;
    JPanel panel;
    JLabel label, progressstatus;
    JProgressBar progress;
    JLabel shoppingcart;
    

    splash(){
        frame = new JFrame("");  
        panel = new JPanel();      
        //frame.setBackground(Color.darkGray);
        frame.setSize(450, 400);
        frame.setLocation(400, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        panel.setBounds(0, 0, 450, 400);
        panel.setBackground(Color.ORANGE);
        panel.addMouseListener(this);
        panel.setLayout(null);

        label = new JLabel("Bee's SuperMarket");
        label.setBounds(100, 50, 300, 50);
        label.setFont(new Font(null, Font.BOLD, 25));

        shoppingcart = new JLabel();
        shoppingcart.setIcon(new ImageIcon("src/shopping.png"));
        shoppingcart.setBounds(160, 130, 100, 100);
        

        progressstatus = new JLabel("%");
        progressstatus.setBounds(200, 300, 20, 20);
        progressstatus.setFont(new Font(null, Font.ITALIC, 20));

        progress = new JProgressBar();
        //progress.setSize(450, 30);
        progress.setBounds(0, 340, 450, 30);
        

        panel.add(label);
        panel.add(shoppingcart);
        panel.add(progress);
        panel.add(progressstatus);

        frame.add(panel);
        frame.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        login loginscreen = new login();
        frame.dispose();
        
    }


    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    
}