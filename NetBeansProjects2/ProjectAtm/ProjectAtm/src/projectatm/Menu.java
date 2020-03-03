/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatm;
import java.util.Scanner;
/**
 *
 * @author Sun
 */
public class Menu extends Process {
  
    protected int Key ;
    
    Scanner Nhap = new Scanner(System.in) ;
        // trở về menu chính
       public void  Menu () 
           {
           System.out.println("=========================== Menu ============================");
           System.out.println ("1) Xem thông tin cá nhân.");
           System.out.println ("2) Chuyển khoản. "  );
           System.out.println ("3) Nạp tiền vào tài khoản.");
           System.out.println ("4) Thây đổi mã PIN." );
           System.out.println ("5) Rút Tiền." );
           System.out.println ("6) Đăng xuất" );
           System.out.println ("===============[Press 0 để Đóng dịch vụ ]=============== ");   
           System.out.print ("Chọn Key : " );
        
           Key=in.nextInt();
          
               }  
                 
       public boolean Login()
        {
           InputAndCheck();
           return true;
        }
      
       public void Menu1()
       {
           XemThongTinCaNhan(TakeID());
       }    
       public void Menu2()
       {
            ChuyenKhoan(TakeID());
       }
       public void Menu3()
       {
           NapTienVaoTaiKhoan(TakeID());
       }
       public void Menu4()
       {
          DoiMaPin(TakeID());
       }
       public void Menu5()
       {
           RutTien(TakeID());
       }
       public boolean CaseOfMenu()
       {
        do {   
          Menu();
           switch (Key) {
            case 1:
              Menu1() ;
                break;
            case 2:
              Menu2();
                break;
            case 3:
              Menu3(); 
                break;
            case 4:
              Menu4();
                break;
            case 5 :
              Menu5();
                break;    
             case 6 :     
              ChoiceKeyOfMenu ();
                 break;
             case 0:  
                 return false;
               
                 
               } 
       }while( Key>= 0 && Key <= 7);
          return true;
        }
       public void ChoiceKeyOfMenu ()
       {   
           ShowAcc();
         if(Login() == true)
         {
         CaseOfMenu();
         
         }
          
       }
       
       
       
       
       
       
       
       
       
       
       
}
