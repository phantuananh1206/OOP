/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhanghoa;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HangDienMay extends HangHoa {
    protected String noiSanXuat;
    public HangDienMay() {
    }

    public HangDienMay(String noiSanXuat, String maHang, Date ngayNhap, double donGia, double soLuong) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.noiSanXuat = noiSanXuat;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }
    
    @Override
    public double tinhThanhTien() {
        double thanhTien = 0;
        if (noiSanXuat.equalsIgnoreCase("trong nuoc")){
            thanhTien = soLuong * donGia;
        }else{
            thanhTien = soLuong * donGia * 1.2;
        }
        return thanhTien;
    }

    @Override
    public double tinhTienLuuKho() {
        double tienLuuKho = 0;
        tienLuuKho = (soLuong * donGia) * 0.2 * ((new Date().getTime() - ngayNhap.getTime())/(24*60*60*1000));
        return tienLuuKho;
    }
    
}
