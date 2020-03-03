/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Gemini
 */
public class ATM extends DataBank {
    
    private  Scanner reader;
    protected  Deal deal;
    protected Customer cus ;
    
    
   public ATM(){
       reader = new Scanner(System.in);
       deal = new Deal();
       cus = new Customer();
   }
   
   
   
   public void rutTien(String taiKhoan){
        int tienRut;
        System.out.print("Nhap tien rut : ");
        tienRut = Integer.parseInt(reader.nextLine());
        deal.xuLiRutTien(taiKhoan, tienRut);
    }
   
   
   public void chuyenTien(String taiKhoan){
        String accountPoint;
        System.out.println("nhap so tai khoan can chuyen : ");
        accountPoint = reader.nextLine();
        if(deal.kiemTraAccountPoint(accountPoint) == true){
                deal.xuLiChuyenTien(taiKhoan,accountPoint);
        }
        else{
            System.out.println("Khong tim thay tai khoan can chuyen, hay thu lai ");
        }
         
    }
   
   
   public void napTien(String taiKhoan){
      deal.xuLiNapTien(taiKhoan);
    }
   
   
   public void thongTinAccount(String taiKhoan){
       deal.xuLiHienThongTinTaiKhoan(taiKhoan);
   }
   
   
   public void doiPassword(String taiKhoan){
       deal.xuLiDoiPass(taiKhoan);
   }
   
   
  
   
   private void menuOfAccount(String taiKhoan){
       int chon;
       do{
        hienSoDu(taiKhoan);
       System.out.println("1. Rut tien");
       System.out.println("2. Chuyen tien");
       System.out.println("3. Thong tin tai khoan");
       System.out.println("4. Nap tien ");
       System.out.println("5. Doi password ");
       System.out.println("0. Thoat ra ");
       System.out.println("--------------------------------");     
       System.out.print("Chon chuc nang :");
       chon = Integer.parseInt(reader.nextLine());
       switch(chon){
           case 1:{
               displaySoDu(taiKhoan);
               rutTien(taiKhoan);
               break;
           }
           case 2:{
               chuyenTien(taiKhoan);
               break;
           }
           case 3:{
               thongTinAccount(taiKhoan);
               break;
           }
           case 4:{
               napTien(taiKhoan);
               break;
           }
           case 5:{
               doiPassword(taiKhoan);
               break;
           }
           default:{
               System.out.println("Vui long chon chinh xac ");
               break;
           }
           case 0:{
               menuOfATM();
               break;
           }
       }
       }while(chon!= 0);
    
   }
    
   public void displaySoDu(String taiKhoan){
       for(Card card : cards){
           if(taiKhoan.equals(card.getTaiKhoan())){
               System.out.println("So tien cua ban : " + card.getSoDu());
           }
       }
   }
   
   
   public boolean checkAcc(String taiKhoan,String matKhau){
       for(Card card : cards){
           if(taiKhoan.equals(card.getTaiKhoan()) && matKhau.equals(card.getMatKhau())){
               return true;
           }
       }
       return false;
   }
           
           
   public void menuOfATM(){
       int chon = -1 ;
       do{
           
       System.out.println("---- welcome to ATM ----");
       System.out.println("1. Dang Nhap ");
       System.out.println("0. Thoat ra");
       System.out.println("------------------------");
       System.out.print("Moi ban chon :");
       chon = Integer.parseInt(reader.nextLine());
       System.out.println("------------------------");
       switch(chon){
           case 1:{
            System.out.println(" Nhap tai khoan : ");
            cus.taiKhoan = reader.nextLine();
            System.out.println("Nhap mat khau : ");
            cus.matKhau = reader.nextLine();
            if(checkAcc(cus.taiKhoan,cus.matKhau)== true){
            System.out.println("------------- Menu -------------");
            menuOfAccount(cus.taiKhoan);
            }else{
            System.out.println("Tai khoan hoac mat khau khong dung ");
            }
             break;
            }
        
       }
       }while(chon != 0);
       
   }
   
   
    
   public void hienSoDu(String taiKhoan){
       for(Card card : cards){
           if (taiKhoan.equals(card.taiKhoan)){
               System.out.println("So tien hien tai :"+ card.getSoDu());
           }
       }
   }
   
    
   
   
}
