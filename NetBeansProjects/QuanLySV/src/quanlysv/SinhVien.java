/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysv;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gemini
 */
public class SinhVien {
    
    Scanner sc = new Scanner(System.in);
    
    protected String maSV,hoTen,queQuan,lop;
    protected float DTB;
    protected boolean gioiTinh;
    protected Date ngSinh;
    
    public SinhVien(){
        
    }

    
        
    
    public SinhVien(String maSV, String hoTen, String queQuan, String lop, float DTB, boolean gioiTinh,Date ngSinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.lop = lop;
        this.DTB= DTB;
        this.gioiTinh = gioiTinh;
        this.ngSinh = ngSinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(Date ngSinh) {
        this.ngSinh = ngSinh;
    }

    

    

    public float getDTB() {
        return DTB;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }
    
    
    
    
    
    
    
    
    
    
}
