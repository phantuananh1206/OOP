/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixtopostfix;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Gemini
 */
public class NewMain2 {
       
     
  public static float postfixEvaluate(String exp) {
	 	Stack<Float> s = new Stack<Float> ();
		Scanner tokens = new Scanner(exp);
		while (tokens.hasNext()) {
			if (tokens.hasNextFloat()) {
				s.push(tokens.nextFloat());
			} else {
				Float num2 = s.pop();
				Float num1 = s.pop();
				String op = tokens.next();	
				if (op.equals("+")) {
					s.push(num1 + num2);
				} else if (op.equals("-")) {
					s.push(num1 - num2);
				} else if (op.equals("*")) {
					s.push(num1 * num2);
				} else {
					s.push(num1 / num2);
				}
				
			}
		}
		return s.pop();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       
        System.out.println("nhap");
        System.out.println(postfixEvaluate(reader.nextLine()));
    }
    
    
}

