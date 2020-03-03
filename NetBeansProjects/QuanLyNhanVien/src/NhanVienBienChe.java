
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gemini
 */
public class NhanVienBienChe extends NhanVien {
    double hSL;
    private Date dateNow = new Date();
    private Scanner reader = new Scanner(System.in);
    private QLNV qlnv = new QLNV();
    
    
    public NhanVienBienChe() {
  
    }

    public NhanVienBienChe(double hSL, String hoTen, String CMT, String phongBan, Date ngayVaoLam) {
        super(hoTen, CMT, phongBan, ngayVaoLam);
        this.hSL = hSL;
    }

    
    public double gethSL() {
        return hSL;
    }

    public void sethSL(double hSL) {
        this.hSL = hSL;
    }

   

    
    
     @Override
     public double tinhPhuCap(){
        double thamNien =(dateNow.getYear()-ngayVaoLam.getYear());
        return thamNien*200000;
     }
     
     
    
    @Override
     public double tinhLuong(){
         return tinhPhuCap()+hSL*1150000;
     }

   
   
     @Override
     public void capNhatNV(){
        System.out.println("Nhap lai phong ban :");
        setPhongBan(reader.nextLine());
        System.out.println("Nhap lai ngay vao lam :");
        setNgayVaoLam(qlnv.xuLiChuoiSangNgay(reader.nextLine()));
        System.out.println("Nhap lai he so luong :");
        sethSL(Double.parseDouble(reader.nextLine()));
     }
   
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
