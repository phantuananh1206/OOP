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
public class LuxuryCar extends Car{
    protected double cuocVanChuyen,lePhiTTDB;

    public LuxuryCar() {
    }

    public LuxuryCar(double cuocVanChuyen, double lePhiTTDB, String bienSo, String nhaSX, int soChoNgoi, Date namSX, double giaGoc) {
        super(bienSo, nhaSX, soChoNgoi, namSX, giaGoc);
        this.cuocVanChuyen = cuocVanChuyen;
        this.lePhiTTDB = lePhiTTDB;
    }

    public double getCuocVanChuyen() {
        return cuocVanChuyen;
    }

    public void setCuocVanChuyen(double cuocVanChuyen) {
        this.cuocVanChuyen = cuocVanChuyen;
    }

    public double getLePhiTTDB() {
        return lePhiTTDB;
    }

    public void setLePhiTTDB(double lePhiTTDB) {
        this.lePhiTTDB = lePhiTTDB;
    }
        
    @Override
    public double tinhGiaXe() {
         double thue = 0 ;
        if (soChoNgoi < 7 ){
            thue = giaGoc * 0.6;
        }else {
            thue = giaGoc * 0.7;
        }
        return giaGoc + thue + giaGoc * lePhiTTDB + cuocVanChuyen;
    }
    
}
