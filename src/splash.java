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
        panel.setBackground(Color.RED);
        panel.addMouseListener(this);
        panel.setLayout(null);

        label = new JLabel("Bee's SuperMarket");
        label.setBounds(100, 50, 300, 50);
        label.setFont(new Font(null, Font.BOLD, 25));
        label.setForeground(Color.WHITE);

        shoppingcart = new JLabel();
        shoppingcart.setIcon(new ImageIcon("src/shopcart.png"));
        shoppingcart.setBounds(160, 130, 100, 100);

        
        

        progressstatus = new JLabel("%");
        progressstatus.setBounds(200, 280, 80, 70);
        progressstatus.setFont(new Font(null, Font.ITALIC, 20));
        progressstatus.setForeground(Color.WHITE);


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
        // for(int i = 0; i<=100; i++){
        //     try {
        //         Thread.sleep(40);
        //         progress.setValue(i);
        //         progressstatus.setText(Integer.toString(i) + "%");

        //     } catch (InterruptedException e1) {
        //         // TODO Auto-generated catch block
        //         //e1.printStackTrace();
        //     }           


        // }
        // login loginscreen = new login();
        // frame.dispose();
        
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
