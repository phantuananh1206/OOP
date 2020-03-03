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
public class NVQuanLy extends NhanVien{
    
    protected String chucVu;
    protected double phuCapChucVu;

    public NVQuanLy() {
    }

    public NVQuanLy(String chucVu, double phuCapChucVu, String maNhanVien, String tenNhanVien, Date ngayVaoLam, double heSoLuong) {
        super(maNhanVien, tenNhanVien, ngayVaoLam, heSoLuong);
        this.chucVu = chucVu;
        this.phuCapChucVu = phuCapChucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }
    
    @Override
    public double tinhLuongThucNhan() {
       return super.heSoLuong*1150000+ phuCapChucVu;
    }
    
}
