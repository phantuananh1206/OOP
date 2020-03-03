/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author BINHPA-PC
 */
public abstract class ThueBao implements IThueBao{
    private String ma,ten;
    private double khuyenMai;

    public ThueBao() {
    }

    public ThueBao(String ma, String ten, double khuyenMai) {
        this.ma = ma;
        this.ten = ten;
        this.khuyenMai = khuyenMai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(double khuyenMai) {
        this.khuyenMai = khuyenMai;
    }
    
    public abstract  double tinhKhuyenMai() ;
}
