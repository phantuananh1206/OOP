/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlptgiaothong;


/**
 *
 * @author Gemini
 */
public class QuanLy extends QLPTGT{
    
    
    public QuanLy(){
        
    }
    
    
    protected void themPTGT(){
        int selects;
        do {
            System.out.println("1.Xe may");
            System.out.println("2.Xe Tai");
            System.out.println("3.Xe Oto");
            System.out.println("0.Quay Lai");
            System.out.print("Moi Chon : ");
            selects = Integer.parseInt(reader.nextLine());
            switch(selects){
                case 1:{
                    themMoi(themXeMay());
                    break;
                }
                case 2:{
                    themMoi(themXeMay());
                    break;
                }
                case 3:{
                    themMoi(themOto());
                    break;
                }
            }
        } while (selects != 0);
        
    }
    
    protected PTGT themXeMay(){
       PTGT PTGTs = new XeMay();
        System.out.println("Cong suat :");
        ((XeMay)PTGTs).setCongSuat(reader.nextLine());
        System.out.println("Hang SX  :" );
        PTGTs.setHangSX(reader.nextLine());
        System.out.println("Mau : " );
        PTGTs.setMau(reader.nextLine());
        System.out.println("Nam : " );
        PTGTs.setNamSX(Integer.parseInt(reader.nextLine()));
        System.out.println("Gia ban : " );
        PTGTs.setGiaBan(Double.parseDouble(reader.nextLine()));
        return PTGTs;
    }
    protected PTGT themXeTai(){
        PTGT PTGTs = new XeTai();
        System.out.println("Tai trong : ");
        ((XeTai)PTGTs).setTaiTrong(Double.parseDouble(reader.nextLine()));
        System.out.println("Hang SX  :" );
        PTGTs.setHangSX(reader.nextLine());
        System.out.println("Mau : " );
        PTGTs.setMau(reader.nextLine());
        System.out.println("Nam : " );
        PTGTs.setNamSX(Integer.parseInt(reader.nextLine()));
        System.out.println("Gia ban : " );
        PTGTs.setGiaBan(Double.parseDouble(reader.nextLine()));
        return PTGTs;
    }
    protected PTGT themOto(){
        PTGT PTGTs = new Oto();
        System.out.println("Kieu dong co : ");
        ((Oto)PTGTs).setKieuDongCo(reader.nextLine());
        System.out.println("So cho ngoi : ");
        ((Oto)PTGTs).setSoChoNgoi(Integer.parseInt(reader.nextLine()));
        System.out.println("Hang SX  :" );
        PTGTs.setHangSX(reader.nextLine());
        System.out.println("Mau : " );
        PTGTs.setMau(reader.nextLine());
        System.out.println("Nam : " );
        PTGTs.setNamSX(Integer.parseInt(reader.nextLine()));
        System.out.println("Gia ban : " );
        PTGTs.setGiaBan(Double.parseDouble(reader.nextLine()));
        return PTGTs;
    }
    
    
    
    protected void mainMenu(){
        int chon;
        do{
        System.out.println("1. Them phuong tien ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("0. Thoat ");
        System.out.println("Chon : ");
        chon = Integer.parseInt(reader.nextLine());
        switch(chon){
            case 1:{
                themPTGT();
                break;
            }
            case 2:{
                
            }
            case 3:{
                
            }
        }
        }while(chon !=0);
    }
    
    
    
    
    
    
    
    
    
    
}
