/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlptgiaothong;

/**
 *
 * @author Gemini
 */
public class XeTai extends PTGT {
    double taiTrong;
    private QLPTGT ql = new QLPTGT();
    public XeTai(){
        
    }

    public XeTai(double taiTrong, String hangSX, String mau, int namSX, double giaBan) {
        super(hangSX, mau, namSX, giaBan);
        this.taiTrong = taiTrong;
    }

    public double getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(double taiTrong) {
        this.taiTrong = taiTrong;
    }

    
    
    @Override
    public void hienThiThongTin(){
        System.out.println("Tai trong : "+getTaiTrong());
        System.out.println("Hang SX  :" + getHangSX());
        System.out.println("Mau : " +getMau());
        System.out.println("Nam : " +getNamSX());
        System.out.println("Gia ban : " + ql.xuLiDoubleSangChuoi(getGiaBan()));
    }
    
    
    
}
