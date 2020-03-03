/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyxe;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Bus extends Car{
    protected String tuyenDuong;
    public Bus() {
    }

    public Bus(String tuyenDuong, String bienSo, String nhaSX, int soChoNgoi, Date namSX, double giaGoc) {
        super(bienSo, nhaSX, soChoNgoi, namSX, giaGoc);
        this.tuyenDuong = tuyenDuong;
    }

    public String getTuyenDuong() {
        return tuyenDuong;
    }

    public void setTuyenDuong(String tuyenDuong) {
        this.tuyenDuong = tuyenDuong;
    }
    
    @Override
    public double tinhGiaXe() {
        double thue = 0 ;
        if (soChoNgoi < 7 ){
            thue = giaGoc * 0.6;
        }else {
            thue = giaGoc * 0.7;
        }
        return giaGoc + thue;
    }
    
}
