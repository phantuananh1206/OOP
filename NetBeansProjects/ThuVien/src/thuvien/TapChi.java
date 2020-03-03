/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvien;

import java.util.Date;

/**
 *
 * @author Gemini
 */
public class TapChi extends TaiLieu {
    Integer soPH;
    Date thangNamPH;
    DanhSach ds = new DanhSach();
    
    public TapChi(){
        
    }

    public TapChi(Integer soPH, Date thangNamPH, String maTL, String tieuDe, String tenNXB, Integer soBanPhatHanh) {
        super(maTL, tieuDe, tenNXB, soBanPhatHanh);
        this.soPH = soPH;
        this.thangNamPH = thangNamPH;
    }

    public Integer getSoPH() {
        return soPH;
    }

    public void setSoPH(Integer soPH) {
        this.soPH = soPH;
    }

    public Date getThangNamPH() {
        return thangNamPH;
    }

    public void setThangNamPH(Date thangNamPH) {
        this.thangNamPH = thangNamPH;
    }
    
    @Override
    public void hienThi(TaiLieu taiLieu){
        System.out.println("Ma tai lieu : "+ taiLieu.getMaTL());      
        System.out.println("Tieu de : "+ taiLieu.getTieuDe());
        System.out.println("Ten nha xuat ban : "+taiLieu.getTenNXB());
        System.out.println("So ban phat hanh : "+taiLieu.getSoBanPhatHanh());
        System.out.println("So phat hanh : "+ ((TapChi)taiLieu).getSoPH() );
        System.out.println("Thang - nam phat hanh : "+ ds.xuLiDateSangString(((TapChi)taiLieu).getThangNamPH()));
        System.out.println("--------------------------------");
    }
    
    
    
}
