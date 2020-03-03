
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gemini
 */
public abstract class  NhanVien {
    String hoTen,CMT,phongBan;
    Date ngayVaoLam;
    
    public NhanVien(){
        
    }

    public NhanVien(String hoTen, String CMT, String phongBan, Date ngayVaoLam) {
        this.hoTen = hoTen;
        this.CMT = CMT;
        this.phongBan = phongBan;
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    
   abstract double tinhLuong();

   
   abstract double tinhPhuCap();
    
  
   abstract void capNhatNV();
    
    
    
        
    
    
}
