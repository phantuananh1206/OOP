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
public class KhachHangVietNam extends KhachHang{
    
    public String doiTuongKhachHang;
    double dinhMuc;

    public KhachHangVietNam(String doiTuongKhachHang, double dinhMuc, String maKhString, String hoTen, Date ngayRaHoaDon, double soLuong, Double donGia) {
        super(maKhString, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhThanhTien() {
        return soLuong <= dinhMuc ? soLuong * donGia : soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
    }
    
}
