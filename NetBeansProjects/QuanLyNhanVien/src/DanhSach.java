
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gemini
 */
public class DanhSach {
    protected ArrayList<NhanVien> nhanViens = new ArrayList<>();
    
    public DanhSach(){
        
    }
    
    
    
    public boolean them(NhanVien nhanVien){
        return nhanViens.add(nhanVien);
    }
    
    
    public boolean kiemtraCMT(String cmt){
        for(NhanVien nv : nhanViens){
            if(cmt.equals(nv.getCMT())){
                return true;
            }
        }
        return false;
    }
    
    public int vitri(String cmt){
        for(NhanVien nv : nhanViens){
            if(cmt.equals(nv.getCMT())){
                return nhanViens.indexOf(nv);
            }
        }
        return -1;
    }
    public NhanVien tim(String cmt){
        int index = vitri(cmt);
        if(index == -1){
            return null;
        }
        else{
            return nhanViens.get(index);
        }
    }
    
    public boolean xoa(String cmt){
        NhanVien nv = tim(cmt);
        if(nv == null){
            return false;
        }
        return nhanViens.remove(nv);
    }
   
    
    protected ArrayList<NhanVien> LayThongTinNhanVienTheoCMT(String cmt){
            ArrayList<NhanVien> thongTinNhanVien = new ArrayList();
            for(NhanVien nv : nhanViens){
                if(cmt.equals(nv.getCMT())){
                    thongTinNhanVien.add(nv);
                }
            }
            return thongTinNhanVien;
    }
    protected ArrayList<NhanVien> LayDanhSachToanBoNV(){
        ArrayList<NhanVien> danhSachNV = new ArrayList();
        for(NhanVien nv :nhanViens){
            danhSachNV.add(nv);
        }
        return danhSachNV;
    }
    
    
    protected double tinhTongTienLuongNVTrongCTY(){
        double tongLuong = 0;
        for(NhanVien nv:nhanViens){
        tongLuong = tongLuong + nv.tinhLuong();
        }
        return tongLuong;
    }
    
   
    
    
}
