/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlidanhsachhdtd;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class KHACHHANGNUOCNGOAI extends KHACHHANG{
    protected String quocTich;
    public KHACHHANGNUOCNGOAI(){
        
    }

    public KHACHHANGNUOCNGOAI(String quocTich, String maKH, String hoTen,double soLuong, Date ngayHD, double dongia) {
        super(maKH, hoTen, soLuong, ngayHD, dongia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
   public double tinhThanhTien(){
       return soLuong*dongia;
   }
    
    
}
