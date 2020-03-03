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
public abstract class KhachHang implements ITienDien{
    protected String maKhachHang,hoTen;
    protected Date ngayHoaDon;
    protected int soLuong;
    protected double donGia;

    public KhachHang(String maKhachHang, String hoTen, Date ngayHoaDon, int soLuong, double donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", ngayHoaDon=" + ngayHoaDon + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
        
    
    
}
