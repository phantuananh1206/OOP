/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiDanhSach;

import java.util.Date;

/**
 *
 * @author STARTSUPER
 */
public class KhachHangVietNam extends KhachHang{
    private String doiTuongKH;
    private double dinhMuc;

    public KhachHangVietNam(String doiTuongKH, double dinhMuc, String maKhachHang, String hoTen, Date ngayHoaDon, int soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayHoaDon, soLuong, donGia);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" +super.toString() + "doiTuongKH=" + doiTuongKH + ", dinhMuc=" + dinhMuc + '}';
    }

    @Override
    public double tinhThanhTien() {
        double thanhtien;
        if(this.soLuong <= this.dinhMuc){
            thanhtien=this.soLuong*this.donGia;
        }
        else{
            thanhtien=this.soLuong*this.donGia*this.dinhMuc+(this.soLuong-this.dinhMuc)*this.donGia*2.5;
        }
        return thanhtien;
    }
    
    
            
}