/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Date;

/**
 *
 * @author BINHPA-PC
 */
public class TBTraSau extends ThueBao{
    private int soTinNhan,soCuocGoi;
    private double phiTinNhan,phiCuocGoi;
    private Date ngayThueBao;

    public TBTraSau() {
    }

    public TBTraSau(int soTinNhan, int soCuocGoi, double phiTinNhan, double phiCuocGoi, Date ngayThueBao, String ma, String ten, double khuyenMai) {
        super(ma, ten, khuyenMai);
        this.soTinNhan = soTinNhan;
        this.soCuocGoi = soCuocGoi;
        this.phiTinNhan = phiTinNhan;
        this.phiCuocGoi = phiCuocGoi;
        this.ngayThueBao = ngayThueBao;
    }

    public int getSoTinNhan() {
        return soTinNhan;
    }

    public void setSoTinNhan(int soTinNhan) {
        this.soTinNhan = soTinNhan;
    }

    public int getSoCuocGoi() {
        return soCuocGoi;
    }

    public void setSoCuocGoi(int soCuocGoi) {
        this.soCuocGoi = soCuocGoi;
    }

    public double getPhiTinNhan() {
        return phiTinNhan;
    }

    public void setPhiTinNhan(double phiTinNhan) {
        this.phiTinNhan = phiTinNhan;
    }

    public double getPhiCuocGoi() {
        return phiCuocGoi;
    }

    public void setPhiCuocGoi(double phiCuocGoi) {
        this.phiCuocGoi = phiCuocGoi;
    }

    public Date getNgayThueBao() {
        return ngayThueBao;
    }

    public void setNgayThueBao(Date ngayThueBao) {
        this.ngayThueBao = ngayThueBao;
    }
    
    @Override
    public double tinhKhuyenMai(){
        double soNgaySuDung = (new Date().getTime()-ngayThueBao.getTime())/ (24 * 60 * 60 * 1000);
        return super.getKhuyenMai() * soNgaySuDung;
    }
    @Override
    public double tinhCuoc() {
        return soTinNhan * phiTinNhan + soCuocGoi * phiCuocGoi;
    }
    
}
