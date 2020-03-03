/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fr;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sun
 */
public class Fr {
    public void JF ()
    {
       JFrame frame = new JFrame();
       frame.setTitle("login");
     //  frame.setSize(400, 400);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       JLabel lb1 = new JLabel("     User");
       JLabel lb2 = new JLabel("     Password");
       JLabel lb3 = new JLabel("");
       JButton bt= new JButton("Login");
       JPanel panel = new JPanel() ;
       JTextField tf1 = new JTextField("");
       JTextField tf2 = new JTextField("");
       
       panel.setLayout( new GridLayout(3,2,1,1) );

       panel.add(lb1);
       panel.add(tf1);
       panel.add(lb2);
       panel.add(tf2);
       panel.add(lb3);
       panel.add(bt);
       frame.add(panel);
       
       
       
       
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
    }
    
    
    
    
    public static void main(String[] args) {
       Fr gd = new Fr();
       gd.JF();
    }
    
}
