/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacktrongjava;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

 private boolean isOperator(char c){
  if(c == '+' || c == '-' || c == '*' || c =='/' || c == '^')
   return true;
  return false;
 }
 
 private boolean checkPrecedence(char c1, char c2){
  if((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
   return true;
  else if((c2 == '*' || c2 == '/') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
   return true;
  else if((c2 == '^') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
   return true;
  else
   return false;
 }
 
 
 public String convert(String infix){
  String postfix = "";  
  Stack<Character> s = new Stack<>();  
  s.push('#'); 

  for(int i = 0; i < infix.length(); i++){
   char inputSymbol = infix.charAt(i);  
   if(isOperator(inputSymbol)){  
    while(checkPrecedence(inputSymbol, s.peek()))
     postfix += s.pop() ;
    s.push(inputSymbol);
   }
   else if(inputSymbol == '(')
    s.push(inputSymbol); 
   else if(inputSymbol == ')'){
    while(s.peek() != '(') 
     postfix += s.pop();
    s.pop();
   }
   else
    postfix += inputSymbol;
  }

  while(s.peek() != '#'){
   postfix += s.pop();
  }
  
  return postfix;
 }
 
 
 
 public static void main(String[] args) {
  InfixToPostfix obj = new InfixToPostfix();
  Scanner sc = new Scanner(System.in);
  System.out.print("Infix : \t");
  String infix = sc.nextLine();
  System.out.print("Postfix : \t"+obj.convert(infix));
 }
}
