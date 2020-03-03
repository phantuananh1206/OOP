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
public class KHACHHANGNUOCNGOAI extends KHACHHANG{
    String quocTich;

    public KHACHHANGNUOCNGOAI(String quocTich, String maKH, String hoTen, Date ngayRaHoaDon, double soLuong, double donGia) {
        super(maKH, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien;
        return thanhTien = soLuong*donGia;
        
    }
    
}
