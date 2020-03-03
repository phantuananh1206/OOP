/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationborder;




import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 *
 * @author Gemini
 */
public class JavaApplicationBorder extends JFrame {
     
  
    
    public JavaApplicationBorder(){
        myJFrame();
    }
    
    
    private void myJFrame(){
    
        JFrame f = new JFrame("Border Layout");
       
        
        JPanel pnlHealer = new JPanel();
        pnlHealer.setBorder(BorderFactory.createLineBorder(Color.BLUE,5));
        JLabel lbtittle = new JLabel("My Border Headler");
        lbtittle.setFont(new Font("",Font.BOLD,25));
        pnlHealer.add(lbtittle);
        f.add(pnlHealer);
       
        JPanel pnlCenter = new JPanel();
        pnlCenter.setBorder(BorderFactory.createLineBorder(Color.yellow,5));
        pnlCenter.setLayout(new GridBagLayout());
        JLabel lbcenter = new JLabel("My Border Center");
        lbcenter.setFont(new Font("",Font.ITALIC, 25));
        pnlCenter.add(lbcenter);
        f.add(pnlCenter);
        
        
        
       
       
        
        
        
        f.setSize(500,500);
        f.setLayout(new GridLayout(2,1));
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
    }
   
    public static void main(String[] args) {
       new JavaApplicationBorder();
    }
    
}
