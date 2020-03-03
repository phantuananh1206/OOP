/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author SONY 13 PRO
 */
public class TapChi extends TaiLieu{
    private String soPhatHanh, thangNamPhatHanh;

    public TapChi() {
    }

    public TapChi(String soPhatHanh, String thangNamPhatHanh, String maTaiLieu, String tieuDe, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tieuDe, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangNamPhatHanh = thangNamPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangNamPhatHanh() {
        return thangNamPhatHanh;
    }

    public void setThangNamPhatHanh(String thangNamPhatHanh) {
        this.thangNamPhatHanh = thangNamPhatHanh;
    }
    
}
