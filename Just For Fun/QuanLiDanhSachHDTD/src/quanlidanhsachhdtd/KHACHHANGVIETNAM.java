/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlidanhsachhdtd;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class KHACHHANGVIETNAM extends KHACHHANG{
    protected String doiTuongKH;
    protected double dinhMuc;
    public KHACHHANGVIETNAM(){
        
    }

    public KHACHHANGVIETNAM(String doiTuongKH, double dinhMuc, String maKH, String hoTen,double soLuong, Date ngayHD, double dongia) {
        super(maKH, hoTen, soLuong, ngayHD, dongia);
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
    public double tinhThanhTien(){
        if(soLuong<= dinhMuc){
            return  soLuong*dongia;
        }else{
            return soLuong*dongia*dinhMuc+(soLuong-dinhMuc)*dongia*2.5;
        }
    }
    
    
}
