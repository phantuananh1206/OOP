
package phuongtrinhbac2;


import java.util.Scanner;

public class PhuongTrinhBac2 {

   // a2x+bx+c=0
    public static void main(String[] args) {
      double a,b,c;
      double delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a :");
        a =sc.nextDouble();
        System.out.println("Nhap b :");
        b =sc.nextDouble();
        System.out.println("Nhap c :");
        c =sc.nextDouble();
        if (a==0){
               double x = -c/b;
            System.out.println("Phuong trinh co nghiem x="+x);
        }
        else{
            delta = b*b-4*a*c;
            if (delta ==0){
               double x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem x ="+ x);
            }
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            if (delta >0){
                double x1=(-b+Math.sqrt(delta))/(2*a);
                double x2=(-b-Math.sqrt(delta))/(2*a);
                System.out.println("Nghiem x1="+ x1);
                System.out.println("Nghiem x2="+ x2);
            }
            }
        }
    }
