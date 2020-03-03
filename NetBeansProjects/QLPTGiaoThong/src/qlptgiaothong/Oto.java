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
public class Oto extends PTGT {
    String kieuDongCo;
    int soChoNgoi;
    private QLPTGT ql = new QLPTGT();
    public Oto(){
        
    }

    public Oto(String kieuDongCo, int soChoNgoi, String hangSX, String mau, int namSX, double giaBan) {
        super(hangSX, mau, namSX, giaBan);
        this.kieuDongCo = kieuDongCo;
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNguoi) {
        this.soChoNgoi = soChoNguoi;
    }

  
    @Override
    public void hienThiThongTin(){
        System.out.println("Kieu dong co : "+getKieuDongCo());
        System.out.println("So cho ngoi : "+getSoChoNgoi());
        System.out.println("Hang SX  :" + getHangSX());
        System.out.println("Mau : " +getMau());
        System.out.println("Nam : " +getNamSX());
        System.out.println("Gia ban : " + ql.xuLiDoubleSangChuoi(getGiaBan()));   
    }
    
    
}
