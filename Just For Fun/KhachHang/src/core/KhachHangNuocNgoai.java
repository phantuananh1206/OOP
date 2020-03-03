/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class KhachHangNuocNgoai extends KhachHang{
    
    public String quocTich;

    public KhachHangNuocNgoai(String quocTich, String maKhString, String hoTen, Date ngayRaHoaDon, double soLuong, Double donGia) {
        super(maKhString, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public double tinhThanhTien() {
        return soLuong*donGia;
    }
    
}
