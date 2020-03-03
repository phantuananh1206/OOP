/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvien;

/**
 *
 * @author Gemini
 */
public abstract class TaiLieu {
    String maTL,tieuDe,tenNXB;
    Integer soBanPhatHanh;

    public TaiLieu(){
        
    }   

    public TaiLieu(String maTL, String tieuDe, String tenNXB, Integer soBanPhatHanh) {
        this.maTL = maTL;
        this.tieuDe = tieuDe;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public Integer getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(Integer soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
    
    abstract void hienThi(TaiLieu taiLieu);
    
    
    
}
