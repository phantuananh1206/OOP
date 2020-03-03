/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Date;

/**
 *
 * @author Sun
 */
public abstract class NhanVien {
    protected String HoTen ,CMT,Phongban;
    protected Date NgayVaoLam;  

    public NhanVien() {
    }

    public NhanVien(String HoTen, String CMT, String Phongban, Date NgayVaoLam) {
        this.HoTen = HoTen;
        this.CMT = CMT;
        this.Phongban = Phongban;
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getPhongban() {
        return Phongban;
    }

    public void setPhongban(String Phongban) {
        this.Phongban = Phongban;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    
  
   public  abstract double TinhPhuCap();
   public abstract double TinhLuong();
    
   
    
    
    
    
}
