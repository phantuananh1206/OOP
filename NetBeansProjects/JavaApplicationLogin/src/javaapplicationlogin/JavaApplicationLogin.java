/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationlogin;

import javax.swing.JFrame;

/**
 *
 * @author Gemini
 */
public class JavaApplicationLogin extends JFrame {

    public JavaApplicationLogin(){
       login();
    }
    
    private void login(){
        JFrame f = new JFrame("Login");
        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JavaApplicationLogin();
    }
    
}
