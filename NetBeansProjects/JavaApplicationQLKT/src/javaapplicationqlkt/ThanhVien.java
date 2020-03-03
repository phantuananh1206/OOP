/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationqlkt;

import java.util.Date;

/**
 *
 * @author Gemini
 */
public abstract class ThanhVien implements IThanhVien {
    String maThanhVien,ten,namHoc;
    Date ngaySinh;
    
    public ThanhVien(){
    }

    public ThanhVien(String maThanhVien, String ten, String namHoc, Date ngaySinh) {
        this.maThanhVien = maThanhVien;
        this.ten = ten;
        this.namHoc = namHoc;
        this.ngaySinh = ngaySinh;
    }

    public String getMaThanhVien() {
        return maThanhVien;
    }

    public void setMaThanhVien(String maThanhVien) {
        this.maThanhVien = maThanhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public abstract double tinhThuong();
    
    
}
