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
public abstract class KhachHang implements ITienDien{
    
    public String maKhString, hoTen;
    Date ngayRaHoaDon;
    double soLuong, donGia;

    public KhachHang(String maKhString, String hoTen, Date ngayRaHoaDon, double soLuong, Double donGia) {
        this.maKhString = maKhString;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKhString() {
        return maKhString;
    }

    public void setMaKhString(String maKhString) {
        this.maKhString = maKhString;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(Date ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    
}
