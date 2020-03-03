/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CORE;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class KHACHHANGVIETNAM extends KHACHHANG{
    String doiTuongKH;
    double dinhMuc;

    public KHACHHANGVIETNAM(String doiTuongKH, double dinhMuc, String maKH, String hoTen, Date ngayRaHoaDon, double soLuong, double donGia) {
        super(maKH, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
    }

   

    public String getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien;
        if(soLuong < dinhMuc){
            return thanhTien = soLuong*donGia;
        }else{
            return thanhTien = soLuong*donGia*dinhMuc + (soLuong-dinhMuc)*donGia*2.5;
        }
    }
    
}
