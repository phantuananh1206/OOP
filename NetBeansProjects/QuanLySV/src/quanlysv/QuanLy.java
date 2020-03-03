/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gemini
 */
public class QuanLy {
    private DanhSach danhSach;
    private Scanner reader;
    
    public QuanLy(){
        danhSach = new DanhSach();
        reader = new Scanner(System.in);
        
        
    }
    
    
    private void them(){
        if(danhSach.them(taoSinhVien())){
            System.out.println("Them thanh cong !");
        }
        else{
            System.out.println("them that bai");
        }
   
    }
    
    
    private SinhVien taoSinhVien(){
        SinhVien sinhVien = new SinhVien();
        System.out.print("Nhap ma sinh vien : ");
        sinhVien.setMaSV(reader.nextLine());
        System.out.print("Ten sinh vien : ");
        sinhVien.setHoTen(reader.nextLine());
        System.out.print("Lop :");
        sinhVien.setLop(reader.nextLine());
        System.out.print("Gioi tinh :");
        sinhVien.setGioiTinh(chuyenChuoiThanhGioiTinh(reader.nextLine()));
        System.out.print("Ngay Sinh :");
        sinhVien.setNgSinh(chuyenChuoiThanhNgay(reader.nextLine()));
        System.out.print("Dia chi :");
        sinhVien.setQueQuan(reader.nextLine());
        return sinhVien;
    }
    
   private boolean chuyenChuoiThanhGioiTinh(String strGioiTinh){
    if(strGioiTinh.equalsIgnoreCase("nam")){   
        return true;
    }else{
        return false;
    }
   }
    
    private Date chuyenChuoiThanhNgay (String strDate){
       try{
             return new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
         }catch(ParseException ex){
             Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE,null,ex);
         }
        return null;
    }
    
    private String chuyenGioiTinhThanhChuoi(boolean gioiTinh){
      if(gioiTinh){
          return "nam";
      } else{ 
      return "nu";
      }
    }
    private String chuyenNgayThanhChuoi(Date date){
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
    
    private void xuatThongTinSinhVien(SinhVien sinhVien){
        System.out.println("Ma sv :"+ sinhVien.getMaSV());
        System.out.println("Ten :"+ sinhVien.getHoTen());
        System.out.println("Lop :" +sinhVien.getLop());
        System.out.println("Que quan :"+ sinhVien.getQueQuan());
        System.out.println("Gioi tinh :"+ chuyenGioiTinhThanhChuoi(sinhVien.isGioiTinh()));
        System.out.println("Ngay Sinh :"+ chuyenNgayThanhChuoi(sinhVien.getNgSinh()));
    }
    public void xuatDanhSachSinhVien(){
        for(SinhVien sv: danhSach.LayDanhSachToanBoSinhVien()){
            xuatThongTinSinhVien(sv);
        }
    }
    
    private void xoa(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private void danhSachNoiSinh(){
        System.out.print("Nhap noi sinh :");
        for (SinhVien sv: danhSach.LayDanhSachSinhVienTheoNoiSinh(reader.nextLine())){
                xuatThongTinSinhVien(sv);
        }
    }
    
    
    private  void danhSachGioiTinh(){
        System.out.print("Nhap gioi tinh :");
        for (SinhVien sv: danhSach.LayDanhSachSinhVienTheoGioiTinh(chuyenChuoiThanhGioiTinh(reader.nextLine()))){
        xuatThongTinSinhVien(sv);
        }
        
    }    
    
    private void danhSachLop(){
        System.out.print("Nhap lop :");
        for(SinhVien sv: danhSach.layDanhSachSinhVienTheoLop(reader.nextLine())){
            xuatThongTinSinhVien(sv);
        }
    }
    
    public void mainMenu(){
        System.out.println("1 . Them sinh vien ");
        System.out.println("2 . Xoa sinh vien theo ma");
        System.out.println("3 . Hien thi toan bo danh sach sinh vien");
        System.out.println("4 . Hien thi danh sach theo noi sinh");
        System.out.println("5 . Hien thi danh sach theo gioi tinh");
        System.out.println("6 . Hien thi danh sach theo lop");
        System.out.println("0 . Ket thuc");
        int chon;
        do{
            System.out.println("Ban chon chuc nang : ");
            chon = Integer.parseInt(reader.nextLine());
            switch (chon){
                case 1:
                    them();
                    break;
                case 2:
                    xoa();
                    break;
                case 3:
                   xuatDanhSachSinhVien();
                   break;
                case 4:
                    danhSachNoiSinh();
                    break;
                case 5:
                    danhSachGioiTinh();
                    break;
                case 6:
                    danhSachLop();
                    break;
                default:
                    System.out.println("123");
            }
        }while (chon != 0);
       
        
        
    }
    
    
    
    
}
