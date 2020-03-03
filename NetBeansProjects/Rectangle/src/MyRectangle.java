
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gemini
 */
public class MyRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(0,0,10,5,20,10,1,0,Color.RED,Color.BLACK);
        rectangle1.moveTo(20,50);
        rectangle1.resize(30,20);
        rectangle1.calcPerimeter();
        rectangle1.calcArea();
    }
    
}
