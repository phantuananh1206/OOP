/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlptgiaothong;

/**
 *
 * @author Gemini
 */
public abstract class PTGT implements IPTGT {
    String hangSX,mau;
    int namSX;
    double giaBan;
    
    public PTGT(){
        
    }

    public PTGT(String hangSX, String mau, int namSX, double giaBan) {
        this.hangSX = hangSX;
        this.mau = mau;
        this.namSX = namSX;
        this.giaBan = giaBan;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    
    
    
    
}
