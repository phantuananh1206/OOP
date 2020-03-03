/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Hlunn
 */
public class DSGV {
    public ArrayList<GiangVien> giangViens ;
    
    public DSGV() {
       giangViens = new ArrayList<>();
    }
    public boolean them(GiangVien gv){
        return giangViens.add(gv);
    }
    public boolean xoa(String ma){
        for (GiangVien gv : giangViens) {
            if(gv.getMa().equalsIgnoreCase(ma)){
                return giangViens.remove(gv);
            }
                
        }
        return false;
    }
    public double trungBinh(){
        double tb = 0;
        for (GiangVien gv : giangViens) {
            if (gv instanceof GVCoHuu) {
               GVCoHuu gvch = (GVCoHuu) gv;
               tb += (((GVCoHuu) gv).luong()+((GVCoHuu) gv).phuCap())/2;
            }
        }
        return tb;
    }
    public GiangVien tim(String ma){
        for (GiangVien gv : giangViens) {
            if(gv.getMa().equalsIgnoreCase(ma)){
                return gv;
            }
        }
        return null;
    }
    public ArrayList<GiangVien> hienThi(){
        ArrayList<GiangVien> danhSach = new ArrayList<>();
        for (GiangVien gv : giangViens) {
            if (gv instanceof GVCoHuu) {
                GVCoHuu gvch = (GVCoHuu) gv;
                danhSach.add(gvch);
            }
        }
        return danhSach;
    }
    
    public ArrayList<GiangVien> gvLuong1st(){
        double max = 0 ;
        ArrayList<GiangVien> dsmoi = new ArrayList<>();
        for (GiangVien gv : giangViens) {
            if (gv.luong() > max ){
                max = gv.luong();
            }
        }
        for (GiangVien gv : giangViens) {
            if (gv.luong() == max ){
                dsmoi.add(gv);
            }
        }
        return dsmoi;
    }
    
    
}
