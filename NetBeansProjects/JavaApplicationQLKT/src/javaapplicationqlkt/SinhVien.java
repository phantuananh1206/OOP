/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationqlkt;

import java.util.Date;

/**
 *
 * @author Gemini
 */
public class SinhVien extends ThanhVien {
    double diemTrungBinh;

    public SinhVien(){
    }

    public SinhVien(double diemTrungBinh, String maThanhVien, String ten, String namHoc, Date ngaySinh) {
        super(maThanhVien, ten, namHoc, ngaySinh);
        this.diemTrungBinh = diemTrungBinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    
    @Override
    public double tinhThuong() {
       double tienthuong =0;
        if(diemTrungBinh>=9){
            tienthuong = 2400000;
        }
        if(diemTrungBinh>=8 && diemTrungBinh <9){
            tienthuong = 1200000;
        }
        return tienthuong;
    }

    
   
    
}
