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
public class NhanVienHopDong extends NhanVien {
    private int TongGio;
    private double TienCong;

    public NhanVienHopDong() {
    }

    public NhanVienHopDong(int TongGio, double TienCong, String HoTen, String CMT, String Phongban, Date NgayVaoLam) {
        super(HoTen, CMT, Phongban, NgayVaoLam);
        this.TongGio = TongGio;
        this.TienCong = TienCong;
    }

    public int getTongGio() {
        return TongGio;
    }

    public void setTongGio(int TongGio) {
        this.TongGio = TongGio;
    }

    public double getTienCong() {
        return TienCong;
    }

    public void setTienCong(double TienCong) {
        this.TienCong = TienCong;
    }
    
    @Override
    public double TinhPhuCap()
    {
         if(TongGio > 170 )
         {
             return 200000;
         }
         else if (TongGio <80)
                 {
                     return 0;
                 
                 }else {
         
           return 100000;
         }
    }
    
    @Override
    public double TinhLuong()
    {
    
      return TinhPhuCap() + TongGio*TienCong;
    
    
    }
    
    
}
