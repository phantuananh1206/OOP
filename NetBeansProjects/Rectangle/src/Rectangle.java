
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
public final class Rectangle {

    
     protected int x,y,weight,w,h;
     protected float xC,yC,angle;
     protected Color fillColor,lineColor;
     //khoi tao khong co tham so, nhung co gia tri truyen vao
     //su dung cac gia tri mac dinh
     
//     public Rectangle(){
//         this.x = 0;
//         this.y = 0;
//         this.w = 20;
//         this.h = 10;
//         this.weight = 1;
//         this.angle = 0;
//         this.lineColor = Color.BLACK;
//         this.fillColor = Color.RED;
//         this.xC = 10;
//         this.yC = 5;
//     }
     // ham khoi tao co tham so , dung de chuan bi -
     public Rectangle(int x,int y,float xC,float yC,int w,int h,int weight,float angle,Color fillColor,Color lineColor){
         this.x = x;
         this.y = y;
         this.w = w;
         this.h = h;
         this.weight = weight;
         this.angle = angle;
         this.lineColor = lineColor;
         this.fillColor = fillColor;
         calcCenterCoordinate();
     }
     
     public void calcCenterCoordinate(){
         this.xC = x + w/2;
         this.yC = y + h/2;
     }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public float getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
 
    public float getxC() {
        return xC;
    }

    public void setxC(float xC) {
        this.xC = xC;
    }

    public float getyC() {
        return yC;
    }

    public void setyC(float yC) {
        this.yC = yC;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
     //Di chuyển hình cữ nhật tới tọa độ góc trên bên trái mới
    public void moveTo(int x,int y){
        this.x =x;
        this.y= y;
    }
    // Định ngĩa lại kích thuớc của hcn
    public void resize (int w,int h){
    this.w =w;
    this.h=h;
    calcCenterCoordinate();
}
    // tạo phuowngg thức tính chu vi hình chữ nhật
    public  int calcPerimeter(){
        return 2*(this.w + this.h);
    }
    // Tạo phương thức tính diện tích hình chữ nhật
    
    public int calcArea(){
        return this.w + this.h;
    }
    public void drawRect (Graphics g){
        g.setColor (lineColor); //thiet lap mau duong vien
        g.drawRect (x, y ,w,h);// vẽ hình chữ nhật
        g.setColor(fillColor); // thiet lap mau to cho hcn
        g.fillRect(x, y,w,h); //to mau cho hcn
    }
    
    
    
 
    
    
    
    
    
 
     
    
}
