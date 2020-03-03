/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlidanhsachhdtd;

import java.util.Date;
import sun.misc.Perf;

/**
 *
 * @author Administrator
 */
public abstract class KHACHHANG implements ITIENDIEN{
    protected String maKH,hoTen;
    protected double soLuong;
    protected Date ngayHD;
    protected double dongia;
    
    public KHACHHANG(){
    }

    public KHACHHANG(String maKH, String hoTen, double soLuong, Date ngayHD, double dongia) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.soLuong = soLuong;
        this.ngayHD = ngayHD;
        this.dongia = dongia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

  
    
}
