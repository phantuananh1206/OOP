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
public class Bao extends TaiLieu {
    Date ngayPH;
    DanhSach ds = new DanhSach();
    
    public Bao(){
        
    }

    public Bao(Date ngayPH, String maTL, String tieuDe, String tenNXB, Integer soBanPhatHanh) {
        super(maTL, tieuDe, tenNXB, soBanPhatHanh);
        this.ngayPH = ngayPH;
    }

    public Date getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(Date ngayPH) {
        this.ngayPH = ngayPH;
    }
    
    @Override
    public void hienThi(TaiLieu taiLieu){
        System.out.println("Ma tai lieu : "+ taiLieu.getMaTL());      
        System.out.println("Tieu de : "+ taiLieu.getTieuDe());
        System.out.println("Ten nha xuat ban : "+taiLieu.getTenNXB());
        System.out.println("So ban phat hanh : "+taiLieu.getSoBanPhatHanh());
        System.out.println("Ngay phat hanh : "+ ds.xuLiDateSangString(((Bao)taiLieu).getNgayPH()));
        System.out.println("--------------------------------");
    }
    
    
    
    
}
