/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author BINHPA-PC
 */
public class TBTraTruoc extends ThueBao {
    private double tienNap;

    public TBTraTruoc() {
    }

    public TBTraTruoc(double tienNap, String ma, String ten, double khuyenMai) {
        super(ma, ten, khuyenMai);
        this.tienNap = tienNap;
    }

    public double getTienNap() {
        return tienNap;
    }

    public void setTienNap(double tienNap) {
        this.tienNap = tienNap;
    }
    
    @Override
    public double tinhKhuyenMai(){
        return super.getKhuyenMai();
    }

    @Override
    public double tinhCuoc() {
        return tienNap;
    }
    
}
