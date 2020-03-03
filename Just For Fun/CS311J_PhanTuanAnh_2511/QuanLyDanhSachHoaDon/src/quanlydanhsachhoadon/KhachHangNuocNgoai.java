/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydanhsachhoadon;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class KhachHangNuocNgoai extends KhachHang{
    protected String quocTich;
    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String quocTich, String maKhachHang, String hoTen, Date ngayRaHoaDon, double soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
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
        double thanhTien = 0;
        thanhTien = soLuong * donGia;
        return thanhTien;
    }
    
}
