/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnvcs311g;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public abstract class NhanVien implements INhanVien {

    protected  String maNhanVien,tenNhanVien;
    protected   Date ngayVaoLam;
    protected   double heSoLuong;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, Date ngayVaoLam, double heSoLuong) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.ngayVaoLam = ngayVaoLam;
        this.heSoLuong = heSoLuong;
    }
    
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    @Override
    public abstract double tinhLuongThucNhan();
    
}
