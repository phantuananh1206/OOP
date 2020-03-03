/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiDanhSach;

import java.util.ArrayList;

/**
 *
 * @author STARTSUPER
 */
public class DSKH {
    private ArrayList<KhachHang> m = new ArrayList<KhachHang>();

    public ArrayList<KhachHang> getM() {
        return m;
    }
    
    
    public void them(KhachHang v){
        m.add(v);
    }
    public void xoaMa(String ma){
        for(KhachHang v:m)
            if(ma.equals(v.getMaKhachHang())){
                m.remove(v);
                break;
          }
    }
    public void capNhat(int i,KhachHang v){
        m.set(i, v);
    }
    public KhachHang timMa(String ma){
        for(KhachHang v:m)
            if(ma.equals(v.getMaKhachHang()))
                return v;
        return null;
    }
    public double tinhTongSoLuongKhachVietNam(){
        int s=0;
        for(KhachHang v:m)
            if(v instanceof KhachHangVietNam){
                s+=((KhachHangVietNam) v).tinhThanhTien();
                return s;
              }
            else{
                return s+=((KhachHangNuocNgoai)v).tinhThanhTien();
            }
        return 0;
    }
    
    
    
    
}
