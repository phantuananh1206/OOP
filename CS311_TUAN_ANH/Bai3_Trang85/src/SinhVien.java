/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY 13 PRO
 */
public class SinhVien {
    private String soBD, hoTen, diaChi, monHoc;
    private double diemThiKH1, diemThiHK2;

    public SinhVien() {
    }

    public SinhVien(String soBD, String hoTen, String diaChi, String monHoc, double diemThiKH1, double diemThiHK2) {
        this.soBD = soBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.monHoc = monHoc;
        this.diemThiKH1 = diemThiKH1;
        this.diemThiHK2 = diemThiHK2;
    }

    public String getSoBD() {
        return soBD;
    }

    public void setSoBD(String soBD) {
        this.soBD = soBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public double getDiemThiKH1() {
        return diemThiKH1;
    }

    public void setDiemThiKH1(double diemThiKH1) {
        this.diemThiKH1 = diemThiKH1;
    }

    public double getDiemThiHK2() {
        return diemThiHK2;
    }

    public void setDiemThiHK2(double diemThiHK2) {
        this.diemThiHK2 = diemThiHK2;
    }
}
