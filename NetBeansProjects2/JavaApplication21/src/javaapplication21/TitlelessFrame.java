/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author Sun
 */
import javax.swing.JFrame; 
import javax.swing.JLabel; 
/** 
* This program creates a JFrame without a Title bar 
*/ 
public class TitlelessFrame 
{ 
public static void main(String[] args) 
{ 
JFrame frame = new JFrame("TitleLessJFrame"); 
frame.getContentPane().add(new JLabel(" HEY!!! LOOK AT ME, I DON'T HAVE MY TITLE BAR...")); 
//This is the method that does the magic of removing title 


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setSize(400, 200); 
frame.setVisible(true); 
} 
}