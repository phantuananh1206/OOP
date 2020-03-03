import java.awt.Color; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.Random; 
import java.util.Vector; 
import javax.swing.ButtonGroup; 
import javax.swing.JOptionPane; 
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
public class NewClass extends javax.swing.JFrame implements ActionListener { 
                           
    private javax.swing.JButton butNewGame; 
    private javax.swing.JLabel jLabel1; 
    private javax.swing.JLabel jLabel2; 
    private javax.swing.JPanel jPanelNuberButtoms; 
                 
    public NewClass() { 
        initComponents(); 

        prepareBut(); 
        setRandomBut(); 

        setSize(337, 376); 
        setLocationRelativeTo(this); 
    } 
    JToggleButton[] arrNew = new JToggleButton[9];     
    Vector<String> vRandomButName = new Vector();       
    ButtonGroup butGroups = new ButtonGroup(); 

    private void prepareBut() { 
        for (int i = 0; i < 9; i++) { 
            arrNew[i] = new JToggleButton(""); 
            arrNew[i].addActionListener(this); 
            arrNew[i].setBackground(Color.white); 
            jPanelNuberButtoms.add(arrNew[i]); 
            butGroups.add(arrNew[i]); 
        } 
        arrNew[0].setSelected(true); 

        jPanelNuberButtoms.updateUI(); 
    } 
    Random theRandom = new Random(); 

    private void setRandomBut() { 
        vRandomButName.removeAllElements(); 
        int iTmp; 

        vRandomButName.add(""); 
        for (int i = 0; i < 8;) { 
            iTmp = theRandom.nextInt(9); 
            if (iTmp != 0 && vRandomButName.contains("" + iTmp) == false) { 
                vRandomButName.add("" + iTmp); 
                i++; 
            } 
        } 

        for (int i = 0; i < arrNew.length; i++) { 
            arrNew[i].setText(vRandomButName.get(i)); 
        } 
        arrNew[0].setSelected(true); 

        jPanelNuberButtoms.updateUI(); 
    } 
    String sSuccess = "123456789"; 

    public void actionPerformed(ActionEvent e) { 
        String sPlaying = ""; 

        String sSelected = ((JToggleButton) e.getSource()).getText(); 

        ((JToggleButton) e.getSource()).setText(""); 

        for (int i = 0; i < arrNew.length; i++) { 
            if (!arrNew[i].isSelected() && arrNew[i].getText().equals("")) { 
                arrNew[i].setText(sSelected); 
            } 

            if (i < arrNew.length - 1) { 
                sPlaying += arrNew[i].getText(); 
            } 
        } 

        if (sPlaying.equals(sSuccess)) { 
            JOptionPane.showMessageDialog(null, "Win");
        } 
    } 

    private void initComponents() { 

        jPanelNuberButtoms = new javax.swing.JPanel(); 
        butNewGame = new javax.swing.JButton(); 
        jLabel1 = new javax.swing.JLabel(); 
        jLabel2 = new javax.swing.JLabel(); 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
        setTitle("Four"); 
        setResizable(false); 
        getContentPane().setLayout(null); 

        jPanelNuberButtoms.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
        jPanelNuberButtoms.setLayout(new java.awt.GridLayout(3, 3)); 
        getContentPane().add(jPanelNuberButtoms); 
        jPanelNuberButtoms.setBounds(20, 70, 290, 230); 

        butNewGame.setText("New Game"); 
        butNewGame.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                butNewGameActionPerformed(evt); 
            } 
        }); 
        getContentPane().add(butNewGame); 
        butNewGame.setBounds(90, 310, 150, 23); 

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        jLabel1.setText("Sắp xếp chữ số"); 
        getContentPane().add(jLabel1); 
        jLabel1.setBounds(30, 4, 270, 30); 
        jLabel2.setBounds(20, 40, 290, 14); 

        pack(); 
    }                    

    private void butNewGameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        setRandomBut(); 
    }                                          

    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() { 

            public void run() { 
                new NewClass().setVisible(true); 
            } 
        }); 
    } 
 
}