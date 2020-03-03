/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiDanhSach;

import java.util.Date;

/**
 *
 * @author STARTSUPER
 */
public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;

    public KhachHangNuocNgoai(String quocTich, String maKhachHang, String hoTen, Date ngayHoaDon, int soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" +super.toString()+ "quocTich=" + quocTich + '}';
    }

    @Override
    public double tinhThanhTien() {
        return this.soLuong*this.donGia;
    }
    
    
}
