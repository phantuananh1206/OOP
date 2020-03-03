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
public  class NhanVienBienChe extends NhanVien {
    private double Hsl;

    public NhanVienBienChe() {
    }

    public NhanVienBienChe(double Hsl, String HoTen, String CMT, String Phongban, Date NgayVaoLam) {
        super(HoTen, CMT, Phongban, NgayVaoLam);
        this.Hsl = Hsl;
    }

    public double getHsl() {
        return Hsl;
    }

    public void setHsl(double Hsl) {
        this.Hsl = Hsl;
    }
   
   
   
   

    @Override
    public double TinhLuong() {
    return TinhPhuCap() + Hsl *11500000;
     
    }

    @Override
    public double TinhPhuCap() {
           
        Date ngayHienTai = new Date() ;
        
        double ThamNien = ( ngayHienTai.getTime() - NgayVaoLam.getTime()     )/(365*24*60*60*1000);
        return ThamNien * 200000;
        
    }
    
   
    
    
    
}
