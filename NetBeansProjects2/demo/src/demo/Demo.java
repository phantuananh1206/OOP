/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.FlowLayout;
/**
 *
 * @author Sun
 */
public class Demo extends JFrame {
    
    private int width = 200;
    private int height = 250;
 
    // create array string color to show in list
    String[] colors= { "blue", "green", "red" };
    // create array color
    Color[] backGroundColor = { Color.blue, Color.green, Color.red };
    JList<String> myJList;
 
    // create JList width array color
    public Demo() {
        // set layout for contenPane
        getContentPane().setLayout(new FlowLayout());
       
        // add list color
        add(createJList());
 
        // set display
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    private JList createJList() {
        // create list
        myJList = new JList<>(colors);
        // add listen to get action when select item in JList
        myJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {    
                changeBackGround();
            }
        });
        return myJList;
    }
 
    // change background JFrame
    private void changeBackGround() {
        getContentPane().setBackground(
                backGroundColor[myJList.getSelectedIndex()]);
    }
  
    public static void main(String[] args) {
     
      new Demo();
  
    }
    
}
