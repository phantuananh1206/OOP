
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Game extends javax.swing.JFrame implements ActionListener{

    public Game() {
        JFrame frm = new JFrame();
        frm.setLocationRelativeTo(null);
        
        frm.setSize(400, 400);
        JToggleButton[] arrBTN = new JToggleButton[9];
        
    }
    
    private void setRanDom(){
        Random rd = new Random();
        
    }
    
    
    public static void main(String[] args) {
        new Game().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}

