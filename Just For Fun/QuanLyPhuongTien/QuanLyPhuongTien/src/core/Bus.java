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
public class Bus extends Car{
    String tuyenDuong;

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
        double giaXe, thue;
        if(soChoNgoi<7){
            thue = giaGoc*60/100;
        }else{
            thue = giaGoc*70/100;
        }
        return giaXe = giaGoc+thue;
    }
    
}
