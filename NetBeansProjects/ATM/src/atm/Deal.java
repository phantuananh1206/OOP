/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package atm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gemini
 */
public class Deal extends DataBank {
   
    
    
    
    private Scanner reader ;
   
    public Deal(){
        reader = new Scanner(System.in);
    }
    
    
    
    private void  xuLiInfoAccount(Card card){
        System.out.println("------  Thong tin cua ban ------");
        System.out.println("    Ma the        :" + card.getMaThe());
        System.out.println("    Ma PIN        :" + card.getMaPIN());
        System.out.println("    So du         :"+ card.getSoDu());
        System.out.println("    Tai Khoan     :" + card.getTaiKhoan());
        System.out.println("    Ho ten        :"+ card.getHoTen());
        System.out.println("    Ngay Sinh     :"+ card.getNgSinh());
        System.out.println("    Que quan      :"+ card.getQueQuan());
        System.out.println("    So dien thoai :"+ card.getsDT());
        System.out.println("--------------------------------");
   }
   
    
    
    public ArrayList <Card> layThongTinTheoTaiKhoan (String taiKhoan){
        ArrayList <Card> thongTinTaiKhoan = new ArrayList <>();
        for(Card card : cards){
            if(taiKhoan.equals(card.getTaiKhoan())){
                thongTinTaiKhoan.add(card);
            }
        }
        return thongTinTaiKhoan;
    }
    
    
    
    public void xuLiHienThongTinTaiKhoan(String taiKhoan){
       for(Card card : layThongTinTheoTaiKhoan(taiKhoan)){
          xuLiInfoAccount(card);      
       }
   }
    
    
    
    public boolean kiemTraTaiKhoan(String taiKhoan){
        for(Card card : cards){
            if(taiKhoan.equals(card.getTaiKhoan())){
                return true;
            }       
        }
        return false;
    }
    
    
    
    public boolean kiemTraMaThe(String maThe){
        for(Card card : cards){
            if(maThe.equals(card.getMaThe())){
                return true;
            }
        }
        return false;
    }
    
    
    
    public boolean kiemTraMatKhau(String matKhau){
        for(Card card : cards){
            if(matKhau.equals(card.getMatKhau())){
                return true;
            }
        }
        return false;
    }
    
    
    
    public boolean kiemTraMaPIN(String maPIN){
       for(Card card : cards){
           if(maPIN.equals(card.getMaPIN())){
               return true;
           }
       }
       return false;
    }
    
    
    
    public void xuLiRutTien(String taiKhoan,int tienRut){     
        for(Card card : cards){
            if(taiKhoan.equals(card.getTaiKhoan())){
                if(tienRut < card.getSoDu()){
                    card.soDu = card.soDu - tienRut;
                    System.out.println("Rut thanh cong !");
                    System.out.println("So tien hien tai " + card.getSoDu());
                    System.out.println("--------------------------------");
                }
                else{
                     System.out.println("So du khong du !");
                }         
            }     
        }
        
    }
 
    public boolean kiemTraAccountPoint(String accountPoint){
        for(Card card : cards){
            if(accountPoint.equals(card.getTaiKhoan())){
                return true;
            }
        }
        return false;
    }
    
    
    public void chuyenTienAccountPoint(String accountPoint,int tienChuyen){
        for(Card card : cards){
            if(accountPoint.equals(card.getTaiKhoan())){
                card.soDu = card.soDu + tienChuyen;
                System.out.println("Chuyen tien thanh cong");
                
            }
            
            }
        }
    
    
    
    public void xuLiChuyenTien(String taiKhoan,String accountPoint){
        int tienChuyen;
        for(Card card : cards){
            if(taiKhoan.equals(card.taiKhoan)){
                System.out.print("Nhap so tien can chuyen :");
                tienChuyen = reader.nextInt();
                if(tienChuyen < card.getSoDu()){
                    card.soDu = card.soDu - tienChuyen;
                    chuyenTienAccountPoint(accountPoint,tienChuyen);
                     System.out.println("So tien hien tai " + card.getSoDu());
                     System.out.println("--------------------------------");
                }else{
                    System.out.println("So du khong du !");
                }
                
            }  
        }
    }
    
    
    public boolean  kiemTraMaTheMaPIN(String taiKhoan,String maThe, String maPIN){
        for(Card card : cards){
            if(maThe.equals(card.getMaThe()) && maPIN.equals(card.getMaPIN())){
                return true;
            }
        
                }
        return false;
    }
    
    public void xuLiNapTien(String taiKhoan){
        int tiennap;
        String maThe,maPIN;
        for(Card card : cards){
            if(taiKhoan.equals(card.taiKhoan)){
                System.out.println("Nhap ma the : ");
                maThe = reader.nextLine();
                System.out.println("Nhap ma Pin : ");
                maPIN = reader.nextLine();
                if(kiemTraMaTheMaPIN(taiKhoan, maThe, maPIN) == true){
                    System.out.print("Nhap tien nap :");
                    tiennap = reader.nextInt();
                    if (tiennap > 0){
                          card.soDu = card.soDu + tiennap;
                          System.out.println("So tien cua ban : " + card.getSoDu());
                    }else{
                        System.out.println("vui long nhap chinh xac");
                    }
                }
                else{
                    System.out.println("Ma the hoac ma PIN khong dung ");
                }
            }
        }
    }
    public boolean xuLiChoNewPass(String matKhau,String newPass){
        for(Card card : cards){
           if(matKhau.equals(card.getMatKhau())){
               if(newPass.equals(card.getMatKhau())){
                   return false;
               }
           }
        }
        return true;
    }
    
    
    public void changePass(String matKhau){
       String newPass,reNewPass; 
        for(Card card : cards){
            if(matKhau.equals(card.getMatKhau())){
              do{
            System.out.println("Mat khau moi phai khac mat khau cu !");
            System.out.print("nhap mat khau moi :");
            newPass = reader.nextLine();
                }while(xuLiChoNewPass(matKhau, newPass) != true);
                System.out.print("xac nhap mat khau moi : ");
                reNewPass = reader.nextLine();
                    if(reNewPass.equals(reNewPass)){
                        card.matKhau = reNewPass;
                        System.out.println("Doi mat khau thanh cong !");
                    }else{
                        System.out.println("xac nhap khong chinh xac");
                        
                    }
                
            } 
        }
       
    }
    
    
  
    
    
    
    public void xuLiDoiPass(String taiKhoan){
        String matKhau;
        for(Card card : cards){
            if(taiKhoan.equals(card.taiKhoan)){
                System.out.println("nhap mat khau cu :");
                matKhau = reader.nextLine();
                if(kiemTraMatKhau(matKhau) == true){
                  changePass(matKhau);    
                }
                else{
                    System.out.println("Sai mat khau , hay thu lai !");
                }
        }
        }
        
    }
    
    
    
    
    
    
    
    
    
}