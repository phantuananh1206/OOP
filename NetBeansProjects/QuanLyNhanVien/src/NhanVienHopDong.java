

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
public class NhanVienHopDong extends NhanVien {
     
    double tienMotGio,tongGioLam;
    protected Scanner reader = new Scanner(System.in);
    private QLNV qlnv = new QLNV();
    
    
    
    
    public NhanVienHopDong(){
        
    }

    public NhanVienHopDong(double tienMotGio,double tongGioLam, String hoTen, String CMT, String phongBan, Date ngayVaoLam) {
        super(hoTen, CMT, phongBan, ngayVaoLam);
        this.tienMotGio = tienMotGio;
        this.tongGioLam = tongGioLam;
        
    }


    public double getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(double tongGioLam) {
        this.tongGioLam = tongGioLam;
    }



    public double getTienMotGio() {
        return tienMotGio;
    }

    public void setTienMotGio(double tienMotGio) {
        this.tienMotGio = tienMotGio;
    }

    
    
   
    @Override
    public double tinhPhuCap(){
                if(getTongGioLam()>170){
                   return 200000;
                }else{
                    if(getTongGioLam()<80){
                    return 0;
                }else{
                   return 100000;
                    }
                    }
    }
    
    
        
    
    @Override
    public double tinhLuong(){
    return tinhPhuCap()+tongGioLam*tienMotGio;
    }

    
    @Override
    public void capNhatNV(){
        System.out.println("Nhap lai phong ban :");
        setPhongBan(reader.nextLine());
        System.out.println("Nhap lai ngay vao lam :");
        setNgayVaoLam(qlnv.xuLiChuoiSangNgay(reader.nextLine()));
        System.out.println("Nhap lai tong gio lam :");
        setTongGioLam(Double.parseDouble(reader.nextLine()));
        System.out.println("Nhap lai tien mot gio :");
        setTienMotGio(Double.parseDouble(reader.nextLine()));
    } 
    
    
    
    
    
    
    
}
