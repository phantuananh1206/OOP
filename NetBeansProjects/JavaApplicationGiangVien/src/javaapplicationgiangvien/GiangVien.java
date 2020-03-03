/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationgiangvien;

/**
 *
 * @author Gemini
 */
public abstract class GiangVien implements IGiangVien{
    String ma,hoTen;
    int soGio;
    boolean  phai;
    public GiangVien(){
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
    
    
    
}
