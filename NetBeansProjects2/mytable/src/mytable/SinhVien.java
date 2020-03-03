/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytable;

/**
 *
 * @author Sun
 */
public class SinhVien {
    
   protected  String tenSv ,gt , sdt ,maSv;

    public SinhVien() {
    }

    public SinhVien(String tenSv, String gt, String sdt, String maSv) {
        this.tenSv = tenSv;
        this.gt = gt;
        this.sdt = sdt;
        this.maSv = maSv;
    }


    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
   
   
    
    
    
    
}
