/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DSKhachHang {
    ArrayList<KhachHang> khachHangs;
    
    public DSKhachHang() {
        khachHangs = new ArrayList<>();
    }
    
    public boolean themKhachHang(KhachHang e){
        return khachHangs.add(e);
    }
    
    public boolean xoaKhachHang(KhachHang e){
        return khachHangs.remove(e);
    }
    
    public KhachHang timKhachHangTheoMa(String ma){
        for (KhachHang khachHang : khachHangs) {
            if (ma.equalsIgnoreCase(ma)) return khachHang;
        }
        return null;
    }
    
    public boolean xoaKhachHangTheoMaKh(String ma){
        return xoaKhachHang(timKhachHangTheoMa(ma));
    }
    
    public ArrayList<KhachHang> getDanhSach(){
        return khachHangs;
    }
    
    public void capNhat(KhachHang khachHang){
        for (KhachHang khachHang1 : khachHangs) {
            if (khachHang.getMaKhString().equalsIgnoreCase(khachHang1.getMaKhString())){
                khachHang1 = khachHang;
            }
        }
    }
    
    
    
}
