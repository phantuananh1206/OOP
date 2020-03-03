/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnvcs311g;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class NVBanHang extends NhanVien{
    protected int soSanPhamBan;

    public NVBanHang() {
    }

    public NVBanHang(int soSanPhamBan, String maNhanVien, String tenNhanVien, Date ngayVaoLam, double heSoLuong) {
        super(maNhanVien, tenNhanVien, ngayVaoLam, heSoLuong);
        this.soSanPhamBan = soSanPhamBan;
    }

    public int getSoSanPhamBan() {
        return soSanPhamBan;
    }

    public void setSoSanPhamBan(int soSanPhamBan) {
        this.soSanPhamBan = soSanPhamBan;
    }
    
    @Override
    public double tinhLuongThucNhan() {
        double hoaHong = 0;
        if (soSanPhamBan> 100){
            hoaHong = 1000000;
        }else if (soSanPhamBan <50){
            hoaHong = 0;
        }else{
            hoaHong = 500000;
        }
        return super.heSoLuong*1150000 + hoaHong;
    }
    
}
