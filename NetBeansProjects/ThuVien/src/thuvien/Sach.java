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
public class Sach extends TaiLieu {
    String tenTG;
    Integer soTrang;
    
    public Sach(){
        
    } 

    public Sach(String tenTG, Integer soTrang, String maTL, String tieuDe, String tenNXB, Integer soBanPhatHanh) {
        super(maTL, tieuDe, tenNXB, soBanPhatHanh);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public Integer getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(Integer soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void hienThi(TaiLieu taiLieu){
        System.out.println("Ma tai lieu : "+ taiLieu.getMaTL());      
        System.out.println("Tieu de : "+ taiLieu.getTieuDe());
        System.out.println("Ten nha xuat ban : "+taiLieu.getTenNXB());
        System.out.println("So ban phat hanh : "+taiLieu.getSoBanPhatHanh());
        System.out.println("Ten tac gia : "+ ((Sach)taiLieu).getTenTG());
        System.out.println("So trang : "+((Sach)taiLieu).getSoTrang());
        System.out.println("--------------------------------");
    }

    
    
    
    
    
    
}
