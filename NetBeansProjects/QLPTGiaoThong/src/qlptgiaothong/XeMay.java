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
public class XeMay extends PTGT {
    String congSuat;
    private QLPTGT ql = new QLPTGT();
    
    public XeMay(){
        
    }
    
    public XeMay(String congSuat, String hangSX, String mau, int namSX, double giaBan) {
        super(hangSX, mau, namSX, giaBan);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }
    
   
    
    @Override
    public void hienThiThongTin(){
        System.out.println("Cong suat :" + getCongSuat());
        System.out.println("Hang SX  :" + getHangSX());
        System.out.println("Mau : " +getMau());
        System.out.println("Nam : " +getNamSX());
        System.out.println("Gia ban : " + ql.xuLiDoubleSangChuoi(getGiaBan()));
    }
    
    
}
