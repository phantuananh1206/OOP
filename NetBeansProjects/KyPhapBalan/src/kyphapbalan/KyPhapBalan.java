/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyphapbalan;

import com.sun.javafx.css.CalculatedValue;
import java.util.Scanner;

/**
 *
 * @author Gemini
 */
public class KyPhapBalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       InfixToPostFix ifp = new InfixToPostFix();
        Scanner reader = new Scanner(System.in);
        System.out.println("Nhap bai toan");
        String sMath = reader.nextLine();
        String elementMath[];
        String showpostfix[];
        elementMath = ifp.processString(sMath);
        showpostfix = ifp.postfix(elementMath);
        for(int i=0;i<showpostfix.length;i++){
            System.out.println(showpostfix[i]);
        }
      
        
    }
    
}
