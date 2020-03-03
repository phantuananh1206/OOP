
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
public class HangThuCong extends HangHoa{
    protected String nhaSanXuat;
    public HangThuCong() {
    }

    public HangThuCong(String nhaSanXuat, String maHang, Date ngayNhap, double donGia, double soLuong) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public double tinhTienLuuKho() {
        double tienLuuKho = 0;
        tienLuuKho = (soLuong * donGia) * 0.1 * ((new Date().getTime() - ngayNhap.getTime())/(24*60*60*1000));
        return tienLuuKho;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien = 0 ;
        thanhTien = soLuong * donGia;
        return thanhTien;
    }
    
}
