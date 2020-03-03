
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY 13 PRO
 */
public abstract class NhanVien {
    protected String CMND, hoTen, phongBan;
    protected Date ngayVaoLam;

    public NhanVien() {
    }

    public NhanVien(String CMND, String hoTen, String phongBan, Date ngayVaoLam) {
        this.CMND = CMND;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    public abstract float tinhLuong();
    public abstract float tinhPhuCap();
}
