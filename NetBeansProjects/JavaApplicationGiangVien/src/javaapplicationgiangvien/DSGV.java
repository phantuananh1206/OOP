/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationgiangvien;

import java.util.ArrayList;
/**
 *
 * @author Gemini
 */
public class DSGV {
    public  ArrayList<GiangVien> giangViens = new ArrayList <GiangVien>();
    public DSGV(){
      
    }
    
    
    public boolean them(GiangVien gv){
        return giangViens.add(gv);
    }
    
    public boolean xoa(String ma){
        for(GiangVien gv : giangViens){
         if(gv.getMa().equals(ma)){
          return giangViens.remove(gv);
         }
        }
        return false;
    }
    public int vitri(String ma){
        for (GiangVien giangVien : giangViens) {
            if (ma.equals(giangVien.getMa())) {
                return giangViens.indexOf(giangVien);
            }
        }
        return -1;
    }
    
    public GiangVien tim(String ma){
        for (GiangVien gv : giangViens) {
            if(ma.equalsIgnoreCase(gv.getMa())){
                return gv;
            }
        }
        return null;
    }
    
    public double tinhTrungBinh(){
        for (GiangVien gv : giangViens) {
            if(gv instanceof GVCoHuu){
                return (((GVCoHuu) gv).getLuongCB()+ ((GVCoHuu) gv).phuCap())/2;
            }
        }
        return 0;
    }
    
    public ArrayList<GiangVien> hienThiGVCH(){
        ArrayList<GiangVien> danhSachGiangVienCH = new ArrayList<>();
        for (GiangVien giangVien : giangViens) {
            if (giangVien instanceof GVCoHuu) {
                GVCoHuu gvch = (GVCoHuu) giangVien;
                danhSachGiangVienCH.add(gvch);
            }
       }
        return danhSachGiangVienCH;
    }
    
    
    
    
}
