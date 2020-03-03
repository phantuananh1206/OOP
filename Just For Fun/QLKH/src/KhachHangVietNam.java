
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class KhachHangVietNam extends KhachHang{
    protected String doiTuongKhachHang;
    protected double dinhMuc;
    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String doiTuongKhachHang, double dinhMuc, String maKhachHang, String hoTen, Date ngayRaHoaDon, double soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien = 0;
        if (soLuong <= dinhMuc){
            thanhTien = soLuong * donGia;
        }else{
            thanhTien = soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia *2.5;
        }
        return thanhTien;
    }
    
}
