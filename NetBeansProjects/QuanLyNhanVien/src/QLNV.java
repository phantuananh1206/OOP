

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gemini
 */
public class QLNV extends DanhSach {
    private Scanner reader = new Scanner(System.in);
    public QLNV(){
        
    }
    
    
    
    
    protected void MainMenu(){
        int chon;
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.Them moi nhan vien .");
            System.out.println("2.Cap nhat nhan vien theo CMT .");
            System.out.println("3.Xoa nhan vien theo CMT .");
            System.out.println("4.Tong tien luong can tra cho nhan vien trong CTY .");
            System.out.println("5.Xuat danh sach nhan vien co luong cao nhat .");
            System.out.println("6.Tim nhan vien theo CMT .");
            System.out.println("7.Hien thi nhan vien theo loai nhan vien .");
            System.out.println("0.Thoat chuong trinh .");
            System.out.println("----------------------------------------------------------");
            System.out.print("Moi ban chon :");
            chon = Integer.parseInt(reader.nextLine());
            switch(chon){
                case 1 :{
                    themNV();
                    break;
                }
                case 2 :{
                    capNhatNV();
                    break;
                }
                case 3:{
                    xoaNV();
                    break;
                }
                case 4:{
                    tinhTongLuong();
                    break;
                }
                case 5:{
                    topLuong();
                    break;
                }
                case 6:{
                    timNV();
                    break;
                }
                case 7:{
                    hienThiNhanVienTheoLoai();
                    break;
                }
            }
        } while (chon !=0);
    }
    
    
    
    private NhanVien themNVBC(){
        boolean temp;
        NhanVien nhanVien = new NhanVienBienChe();
        System.out.println("Nhap ho ten :");
        nhanVien.setHoTen(reader.nextLine());
        System.out.println("Nhap CMT :");
        nhanVien.setCMT(reader.nextLine());
        do {            
            if(kiemtraCMT(nhanVien.getCMT())){
                System.out.println("CMT da ton tai, vui long nhap chinh lai !");
                System.out.println("Nhap CMT : ");
                nhanVien.setCMT(reader.nextLine());
                temp = true;
            }
            else{
                temp = false;
            }
        } while (temp);
        System.out.println("Nhap phong ban :");
        nhanVien.setPhongBan(reader.nextLine());
        System.out.println("Nhap ngay vao Lam :");
        nhanVien.setNgayVaoLam(xuLiChuoiSangNgay(reader.nextLine()));
        System.out.println("Nhap he so luong :");
//        ((NhanVienBienChe)nhanVien).sethSL(Double.parseDouble(reader.nextLine()));
        return nhanVien;
    }
    
    
    private NhanVien themNVHD(){
        boolean temp;
        NhanVien nhanVien = new NhanVienHopDong();
        System.out.println("Nhap ho ten :");
        nhanVien.setHoTen(reader.nextLine());
        System.out.println("Nhap CMT :");
        nhanVien.setCMT(reader.nextLine());
        do {            
            if(kiemtraCMT(nhanVien.getCMT())){
                System.out.println("CMT da ton tai, vui long nhap chinh lai !");
                System.out.println("Nhap CMT : ");
                nhanVien.setCMT(reader.nextLine());
                temp = true;
            }
            else{
                temp = false;
            }
        } while (temp);
        System.out.println("Nhap phong ban :");
        nhanVien.setPhongBan(reader.nextLine());
        System.out.println("Nhap ngay vao Lam :");
        nhanVien.setNgayVaoLam(xuLiChuoiSangNgay(reader.nextLine()));
        System.out.println("Tien mot gio :");
        ((NhanVienHopDong)nhanVien).setTienMotGio(Double.parseDouble(reader.nextLine()));
        System.out.println("Tong gio lam :");
        ((NhanVienHopDong)nhanVien).setTongGioLam(Double.parseDouble(reader.nextLine()));
       return nhanVien;
    }
    
    private void themNV(){
        int chon;
        do {            
            System.out.println("1. Nhan vien bien che");
            System.out.println("2. Nhan vien hop dong");
            System.out.println("0. Quay lai");
            System.out.print("Chon : ");
            chon = Integer.parseInt(reader.nextLine());
            switch(chon){
                case 1:{
                    if(them(themNVBC())){
                        System.out.println("Them thanh cong :) ");
                       System.out.println("--------------------------------------------------");
                    }
                    else{
                        System.out.println("Them that bai :) ");
                     System.out.println("--------------------------------------------------");
                    }
                    break;
                }
                case 2:{
                    if(them(themNVHD())){
                        System.out.println("Them thanh cong :) ");
                      System.out.println("--------------------------------------------------");  
                    }
                    else{
                        System.out.println("Them that bai :) ");
                      System.out.println("--------------------------------------------------");  
                    }
                    break;
                }    
            }
        } while (chon !=0);
    }
    
    
    private void xoaNV(){
        System.out.println("Nhap nhan vien co CMT can xoa : ");
        if(xoa(reader.nextLine())){
            System.out.println("Xoa thanh cong :)");
        }else{
            System.out.println("Xoa that bai :)");
        }
    }
    
    
    private void timNV(){
        System.out.println("Nhap CMT cua nhan vien can tim :");
        for(NhanVien nv: LayThongTinNhanVienTheoCMT(reader.nextLine())){
            hienTTNV(nv);
        }
        }
    
    private void tinhTongLuong(){
        System.out.println("Tong luong can phai tra : "+ xuLiDoubleSangChuoi(tinhTongTienLuongNVTrongCTY()));
    }
    
    
    
    protected void hienTTNV(NhanVien nhanViens){
        System.out.printf("%2s%-12s%-20s%-13s%-14s%-14s\n"," ","CMT","Ho ten","Phong ban","Ngay vao lam","Luong");
        System.out.printf("%2s%-12.12s%-20.18s%-13.13s%-14.12s%-14s\n"," ",nhanViens.getCMT(),nhanViens.getHoTen(),nhanViens.getPhongBan(),xuLiNgaySangChuoi(nhanViens.getNgayVaoLam()),xuLiDoubleSangChuoi(nhanViens.tinhLuong()));
    }
    protected void hien1TTNVHD(NhanVien nhanViens){
        System.out.printf("%2s%-12s%-20s%-13s%-14s%-14s%-13s%-14s\n"," ","CMT","Ho ten","Phong ban","Ngay vao lam","Tien mot gio","Tong gio lam","Luong");
        System.out.printf("%2s%-12.12s%-20.18s%-13.13s%-12.12s%-13s%-13s%-14s\n"," ",nhanViens.getCMT(),nhanViens.getHoTen(),nhanViens.getPhongBan(),xuLiNgaySangChuoi(nhanViens.getNgayVaoLam()),((NhanVienHopDong)nhanViens).getTienMotGio(),((NhanVienHopDong)nhanViens).getTongGioLam(),xuLiDoubleSangChuoi(nhanViens.tinhLuong()));
    }
    protected void hien1TTNVBC(NhanVien nhanViens){
        System.out.printf("%2s%-12s%-20s%-13s%-13s%-13s%-14s\n"," ","CMT","Ho ten","Phong ban","Ngay vao lam","He so luong","Luong");
        System.out.printf("%2s%-12.12s%-20.18s%-13.13s%-13.12s%-13.13s%-14s\n"," ",nhanViens.getCMT(),nhanViens.getHoTen(),nhanViens.getPhongBan(),xuLiNgaySangChuoi(nhanViens.getNgayVaoLam()),((NhanVienBienChe)nhanViens).gethSL(),xuLiDoubleSangChuoi(nhanViens.tinhLuong()));
    }
    
    
    
    private void capNhatNV(){
        String tempCMT;
        int chon;
        do{
            System.out.println("Chon loai nhan vien : ");
            System.out.println("1.Nhan vien bien che");
            System.out.println("2.Nhan vien hop dong");
            System.out.println("0.Quay lai");
            System.out.println("-----------------------");
            System.out.println("Moi chon :");
            chon = Integer.parseInt(reader.nextLine());
            switch(chon){
                    case 1: {
                      System.out.println("Nhap CMT cua nhan vien can cap nhat :");
                      tempCMT = reader.nextLine();
                      for(NhanVien nv: nhanViens){
                      if(tempCMT.equals(nv.getCMT())){
                        try{
                      hien1TTNVBC(nv);
                      System.out.println("--------------------------------------------------");
                      ((NhanVienBienChe)nv).capNhatNV();
                     }catch(ClassCastException e){
                            System.out.println("");
                            System.out.println("ERROR : Chung minh thu khong hop le, hay thu lai !");
                     }
                      }
                     }
                    break;
                    }
                    case 2:{
                      System.out.println("Nhap CMT cua nhan vien can cap nhat :");
                      tempCMT = reader.nextLine();
                      for(NhanVien nv: nhanViens){
                      if(tempCMT.equals(nv.getCMT())){
                      try{
                      hien1TTNVHD(nv);
                      System.out.println("--------------------------------------------------");
                      ((NhanVienHopDong)nv).capNhatNV();  
                       } catch(ClassCastException e){
                         System.out.println("");
                         System.out.println("ERROR : Chung minh thu khong hop le, hay thu lai !");
                       }
                    }
                    }
                    }
            }
        }
                    while(chon !=0);
        }
    
    private void tTNVBC(){
        System.out.printf("%2s%-12s%-20s%-13s%-13s%-13s%-14s\n"," ","CMT","Ho ten","Phong ban","Ngay vao lam","He so luong","Luong");
        for(NhanVien nhanViens : nhanViens){
         try{
            System.out.printf("%2s%-12.12s%-20.18s%-13.13s%-13.12s%-13.13s%-14s\n"," ",nhanViens.getCMT(),nhanViens.getHoTen(),nhanViens.getPhongBan(),xuLiNgaySangChuoi(nhanViens.getNgayVaoLam()),((NhanVienBienChe)nhanViens).gethSL(),xuLiDoubleSangChuoi(nhanViens.tinhLuong()));   
            }catch (ClassCastException e){
              
            }
        }
    }
    private void tTNVHD(){
       System.out.printf("%2s%-12s%-20s%-14s%-14s%-14s%-13s%-14s\n"," ","CMT","Ho ten","Phong ban","Ngay vao lam","Tien mot gio","Tong gio lam","Luong");
       for(NhanVien nhanViens : nhanViens){
           try{
           System.out.printf("%2s%-12.12s%-20.18s%-13.13s%-12.12s%-13s%-13s%-14s\n"," ",nhanViens.getCMT(),nhanViens.getHoTen(),nhanViens.getPhongBan(),xuLiNgaySangChuoi(nhanViens.getNgayVaoLam()),((NhanVienHopDong)nhanViens).getTienMotGio(),((NhanVienHopDong)nhanViens).getTongGioLam(),xuLiDoubleSangChuoi(nhanViens.tinhLuong()));  
           }catch (ClassCastException e){
           }
       }
    }
    
    
    private void  hienThiNhanVienTheoLoai(){
        int chon;
        do {
            System.out.println("1.Nhan vien bien che");
            System.out.println("2.Nhan vien hop dong");
            System.out.println("0.Quay Lai");
            System.out.println("---------------------");
            System.out.print("Moi chon :");
            chon = Integer.parseInt(reader.nextLine());
           switch(chon){
               case 1:{
                   tTNVBC();
                   break;
               }
               case 2:{
                   tTNVHD();
                   break;
               }
           } 
        } while (chon !=0);
        
    }
    
    private void topLuong(){
       Collections.sort(LayDanhSachToanBoNV(),new Comparator<NhanVien>() {
           @Override
           public int compare(NhanVien nv1, NhanVien nv2) {
            if(nv1.tinhLuong()<nv2.tinhLuong()){
                return 1;
            }else{
               if(nv1.tinhLuong() == nv2.tinhLuong()){
                   return 0;
               }
               else{
                   return -1;
               }
            }
           }
       }
       );
       for(int i=0;i<3;i++){
        int j=i+1;
        System.out.println("---------------------------------------------------------");
        System.out.println("Top "+ j);
        System.out.println("-----");
        try{
        hienTTNV(LayDanhSachToanBoNV().get(i));
        }catch (IndexOutOfBoundsException e){
            
        }
       }
    }
    
    
    
    
     protected  Date xuLiChuoiSangNgay(String ngayVaoLam){ 
       try{
           return new SimpleDateFormat("dd/MM/yyyy").parse(ngayVaoLam);
         }catch(ParseException ex){
             Logger.getLogger(NhanVienBienChe.class.getName()).log(Level.SEVERE,null,ex);
         }
        return null;
    }
    
    
     protected  String xuLiNgaySangChuoi(Date ngayVaoLam){
         return new SimpleDateFormat("dd/MM/yyyy").format(ngayVaoLam);
    }
     
     protected String xuLiDoubleSangChuoi(Double so){
         NumberFormat fm = new DecimalFormat();
         return fm.format(so);
     }
    
    
}
