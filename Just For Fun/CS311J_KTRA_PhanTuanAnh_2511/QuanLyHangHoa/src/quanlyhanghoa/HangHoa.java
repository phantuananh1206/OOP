/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhanghoa;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public abstract class HangHoa implements IHangHoa {
    protected String maHang;
    protected Date ngayNhap;
    protected double donGia, soLuong;
    public HangHoa() {
    }

    public HangHoa(String maHang, Date ngayNhap, double donGia, double soLuong) {
        this.maHang = maHang;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    
    public abstract double tinhTienLuuKho();
}
