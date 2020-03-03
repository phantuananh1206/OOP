/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydanhsachhoadon;

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
    
    public boolean themMoi(KhachHang kh){
        return khachHangs.add(kh);
    }
    
    public boolean xoa(String ma){
        for (KhachHang khachHang : khachHangs) {
            if (khachHang.getMaKhachHang().equalsIgnoreCase(ma)){
                return khachHangs.remove(khachHang);
            }
        }
        return false;
    }
    
    public KhachHang tim(String ma){
        for (KhachHang kh : khachHangs) {
            if (kh.getMaKhachHang().equalsIgnoreCase(ma)){
                return kh;
            }
        }
        return null;
    }
    public KhachHang capNhat(String ma){
        for (KhachHang kh : khachHangs) {
              if (kh.getMaKhachHang().equalsIgnoreCase(ma)){
                return kh;
            }
        }
        return null;
    }
    public double tinhTongSoLuong(){
        double tongSoLuong = 0;
        for (KhachHang kh : khachHangs) {
            if (kh instanceof KhachHangVietNam) {
                KhachHangVietNam khVN = (KhachHangVietNam) kh;
                tongSoLuong = tongSoLuong + khVN.getSoLuong();
            }else{
                tongSoLuong = tongSoLuong + ((KhachHangNuocNgoai)kh).getSoLuong();
            }
        }
        return tongSoLuong;
    }
}
