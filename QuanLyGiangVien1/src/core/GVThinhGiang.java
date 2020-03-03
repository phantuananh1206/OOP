/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Hlunn
 */
public class GVThinhGiang extends GiangVien {

    protected String maHopDong;

    public GVThinhGiang() {
    }

    public GVThinhGiang(String maHopDong, String ma, String hoTen, int soGio, boolean phai) {
        super(ma, hoTen, soGio, phai);
        this.maHopDong = maHopDong;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    @Override
    public double luong() {
        return (soGio * donGia);

    }

    @Override
    public double phuCap() {
    return mucPhuCap;
    }
    

}
