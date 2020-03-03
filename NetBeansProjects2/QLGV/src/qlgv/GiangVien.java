/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgv;

/**
 *
 * @author Sun
 */
public class GiangVien implements IGiangVien{
   protected String ma,hoTen ;
   protected int soGio;
   protected boolean phai;
   protected double luongGV,donGia=100000,phucap;
    public GiangVien() {
    }

    public GiangVien(String ma, String hoTen, int soGio, boolean phai) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.soGio = soGio;
        this.phai = phai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }

    public boolean isPhai() {
        return phai;
    }

    public void setPhai(boolean phai) {
        this.phai = phai;
    }

    public double getLuongGV() {
        return luongGV;
    }

    public void setLuongGV(double luongGV) {
        this.luongGV = luongGV;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getPhucap() {
        return phucap;
    }

    public void setPhucap(double phucap) {
        this.phucap = phucap;
    }
    
    @Override
    public double luong() {
       return 0;
        
        
        
    }

    @Override
    public double phuCap() {
       return 0;
        
    }
   
   
   
   
   
    
}
