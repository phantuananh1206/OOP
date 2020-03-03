/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnvcs311g;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DanhSachNhanVien {
    ArrayList<NhanVien> danhSach;
    public DanhSachNhanVien() {
        danhSach = new ArrayList<>();
    }
    public boolean themNhanVien(NhanVien nv){
        return danhSach.add(nv);
    }
    
    public NhanVien timNhanVien(String maNhanVien){
        for (NhanVien nhanVien : danhSach) {
            if (nhanVien.getMaNhanVien().equalsIgnoreCase(maNhanVien)){
                return nhanVien;
            }
        }
        return null;
    }
    
    public boolean xoaNhanVien(String maNhanVien){
        for (NhanVien nhanVien : danhSach) {
            if (nhanVien.getMaNhanVien().equalsIgnoreCase(maNhanVien)){
                return danhSach.remove(nhanVien);
            }
        }
        return false;
    }
    
    public ArrayList<NhanVien> getDanhSach(){
        return danhSach;
    }
    
    public NhanVien timNhanVienBanHangNhieuNhat(){
        double max = 0;
        for (NhanVien nhanVien : danhSach) {
            if (nhanVien instanceof NVBanHang) {
                NVBanHang nvbh = (NVBanHang) nhanVien;
                if (nvbh.getSoSanPhamBan() > max){
                    max = nvbh.getSoSanPhamBan();
                }
            }
        }
        for (NhanVien nhanVien : danhSach) {
           if (nhanVien instanceof NVBanHang) {
                NVBanHang nvbh = (NVBanHang) nhanVien;
                if (nvbh.getSoSanPhamBan() == max){
                    return nvbh;
                }
            }
        }
        return null;
    }
    
}
