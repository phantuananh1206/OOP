/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationqlkt;

import java.util.ArrayList;

/**
 *
 * @author Gemini
 */
public class DanhSachThanhVien {
    ArrayList<ThanhVien> thanhViens ;
    
    public DanhSachThanhVien(){
    thanhViens = new ArrayList<ThanhVien>();
    }
    
    public boolean themThanhVien(ThanhVien tv){
        return thanhViens.add(tv);
    }
    
    public boolean xoaThanhVien(String maThanhVien){
        for (ThanhVien thanhVien : thanhViens) {
            if(maThanhVien.equalsIgnoreCase(thanhVien.getMaThanhVien())){
                return thanhViens.remove(thanhVien);
            }
        }
        return false;
    }
    public ArrayList<ThanhVien> danhSachThanhVien(){
        return thanhViens;
    }
    
    public ThanhVien timThanhVien(String maThanhVien){
       int vitri = -1;
        for (ThanhVien thanhVien : thanhViens){
            if(maThanhVien.equalsIgnoreCase(thanhVien.getMaThanhVien())){
               vitri = thanhViens.indexOf(thanhVien);
            }
        }
        if(vitri != -1){
            return thanhViens.get(vitri);
        }else{
        return null;
    }
    }
    
    public ArrayList<ThanhVien> giangVienThuongCaoNhat(){
       ArrayList<ThanhVien> giangVienThuongmax = new ArrayList<>();
       double max=0;
        for (ThanhVien thanhVien : thanhViens) {
           if(((GiangVien)thanhVien).tinhThuong() > max)
                max =((GiangVien)thanhVien).tinhThuong();
        }
        for (ThanhVien tv : thanhViens) {
            if(((GiangVien)tv).tinhThuong() >= max){
               giangVienThuongmax.add(tv);
            }
        }
        return giangVienThuongmax;
        }
        
    
    
    
    
}
