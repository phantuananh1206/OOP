/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Date;

/**
 *
 * @author Hlunn
 */
public class GVCoHuu extends GiangVien {

    protected Date ngayVao;
    protected double luongCB;

    public GVCoHuu() {
    }

    public GVCoHuu(Date ngayVao, double luongCB, String ma, String hoTen, int soGio, boolean phai) {
        super(ma, hoTen, soGio, phai);
        this.ngayVao = ngayVao;
        this.luongCB = luongCB;
    }

    public Date getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(Date ngayVao) {
        this.ngayVao = ngayVao;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
    
    
    @Override
    public double luong() {
        return (luongCB + soGio * donGia);
    }
    @Override
    public double phuCap(){
        return (((new Date().getTime() - ngayVao.getTime())/(365*24*60*60*1000)))*mucPhuCap;
    }

}
