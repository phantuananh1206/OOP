
package giaithua;

import java.util.Scanner;

public class GiaiThua {

    public static void main(String[] args) {
   int n;
   int s =1;
        Scanner sc= new Scanner(System.in);
        System.out.println("======Giai Thua======");
        do{
            System.out.println("Nhap n :");
            n = sc.nextInt();
        }while(n<=0);
        for (int i=1;i<=n;i++){
            s = s*i;
        }
        System.out.println("Giai thua cua "+n+" la :"+ s);
                
    }
}