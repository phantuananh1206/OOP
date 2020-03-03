/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixtopostfix;

import java.io.*;
import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Scanner;

public class NewMain1 {

  private boolean value;
  private Vector postfix = new Vector();


  public NewMain1 (String infix){
    //Creates postfix representation of a regular expression
    Stack st = new Stack();
    int ind;
    String rest = infix;
    String token = new String("");
    
    while (rest.length() > 0) 
    {  
       ind = getIndex(rest);

       if (ind != -1) 
       {
          if (ind == 0) 
          {
             token = (rest.substring(0,ind+1)).trim();
             rest = (rest.substring(ind+1)).trim();

          }
          else 
          { 
             token = (rest.substring(0,ind)).trim();
             rest = (rest.substring(ind)).trim();
          }
       }
       else
       {
          token = rest;
          rest = "";
       }

       try 
       {
         if (isOperand(token))
            postfix.addElement(token);
         else
           if ((token.equals(")")))  //unstack untill '('
           {  
              String top; 
              while (!(top=(String)st.pop()).equals("("))
                  postfix.addElement(top); 
           }
           else
           {
              while (!st.empty() && !((String)st.peek()).equals("(") && 
                    (priority((String)st.peek()) >= priority(token)))
              {
                 postfix.addElement(st.pop());
              }
              st.push(token);
           }
       } //try
       catch (EmptyStackException e)
       {
          System.out.println("Irregular expression");
          System.out.println("Exception:" + e);
          throw e; //rethrow the exception
       }
     
    }

    while (!st.empty())
      postfix.addElement(st.pop());


 
  } //Postfix 
    


  private int getIndex(String str) {
    // gets first occurance of operator

    int pos;
   
    pos = str.indexOf("&");
    
    if (pos != -1)
    {
       if (pos > str.indexOf("|") && (str.indexOf("|") != -1))
           pos =  str.indexOf("|");
    }
    else
       pos =  str.indexOf("|");

    if (pos != -1)
    {
       if (pos > str.indexOf("~") && (str.indexOf("~") != -1))
           pos =  str.indexOf("~"); 
    }
    else
       pos =  str.indexOf("~");


    if (pos != -1)
    {
       if (pos > str.indexOf("(") && (str.indexOf("(") != -1))
           pos =  str.indexOf("(");
    }
    else
       pos =  str.indexOf("(");

    if (pos != -1)
    {
       if (pos > str.indexOf(")") && (str.indexOf(")") != -1))
           pos =  str.indexOf(")"); 
    }
    else
       pos =  str.indexOf(")");

 
    return (pos);
  }


 
  public boolean isOperand(String str) {
  // Checks if string is operand
    boolean result = true;

    if ((str.equals("|")) || (str.equals("&")) || (str.equals("~"))
       || (str.equals("(")) || (str.equals(")")))
       result = false;

    return result;   

  } //isOperand



  public int priority(String str) {
    // Priority of operator

    int prt = 0;    

    if (str.equals("&"))
       prt = 2;
    if (str.equals("~")) 
       prt = 3;
    if (str.equals("|"))
       prt = 1;
    if (str.equals("(") || str.equals(")"))
       prt = 4;
 
    return prt;

  }  //priority



  public boolean getPostfixValue(String str) {
    // Evaluates postfix representation

    Stack st = new Stack();
    int ind;

    Enumeration vEnum = postfix.elements();
 
    
    while (vEnum.hasMoreElements())
    {
      String token = (String) vEnum.nextElement();

      boolean flag1 = false;
      boolean flag2 = false;

      try
      {
        if (token.equals("~"))
        {
           flag1 = ((Boolean)st.pop()).booleanValue();
           Boolean bf = new Boolean(!flag1);
           st.push(bf);
        }
        else
        if  (token.equals("&"))
        {
           flag1 = ((Boolean)st.pop()).booleanValue();
           flag2 = ((Boolean)st.pop()).booleanValue();

           Boolean bf = new Boolean(flag1 && flag2);
           st.push(bf);
        }
        else
        if (token.equals("|"))
        {
           flag1 = ((Boolean)st.pop()).booleanValue();
           flag2 = ((Boolean)st.pop()).booleanValue();
           Boolean bf = new Boolean(flag1 || flag2);
           st.push(bf);
        }
        else
        {
           Boolean bf = new Boolean(false);
           bf = isInString(token,str);
           st.push(bf);
        }
     } //try
     catch (EmptyStackException e)
     {
        System.out.println("Irregular postfix expression");
        System.out.println("Exception:" + e);
        throw e; //rethrow the exception
     }


    } //while


    if (!st.empty())
    {
       value = ((Boolean)st.pop()).booleanValue();
    }
    else
       System.out.println("Stack is empty");

    return value;

  } //getPostfixValue 



  public Boolean  isInString(String str1, String str2 ) {
    //check if str1 is in str2
     if (str2.toUpperCase().indexOf(str1.toUpperCase()) != -1)
        return new Boolean("true");
     else
        return new Boolean ("false");
  } // isInString


  public String getPostfix()
  {
     // Creates string from postfix representation 
     String str = new String();
     Enumeration vEnum = postfix.elements();
     while (vEnum.hasMoreElements())
     {
       str = str + " " + (String)vEnum.nextElement(); 
     }  
     return str;
  }


  public static void main(String args[]) throws Exception {

      Scanner reader = new Scanner(System.in);

    System.out.println("Enter Infix String:");
    String infix = reader.nextLine();

    System.out.println("Enter line to check:");
    String line = reader.nextLine();

    NewMain1 rep = new NewMain1(infix);

    System.out.println("postfix string = " + rep.getPostfix());

    System.out.println("value = " + rep.getPostfixValue(line));  

  }
}