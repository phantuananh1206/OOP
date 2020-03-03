
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class DSKhachHang {
    ArrayList<KhachHang> khachHangs;
    public DSKhachHang() {
        khachHangs = new ArrayList<>();
    }
    
    public boolean them(KhachHang kh){
        return khachHangs.add(kh);
    }
    
    public boolean xoa (String ma){
        for (KhachHang kh : khachHangs) {
            if (kh.getMaKhachHang().equalsIgnoreCase(ma)){
                return khachHangs.remove(kh);
            }
        }
        return false;
    }
    
    public KhachHang tim(String ma){
         for (KhachHang kh : khachHangs) {
            if (kh.getMaKhachHang().equalsIgnoreCase(ma)){
                return kh;
            }
        }
        return null;
    }
    
    public KhachHang capNhat(KhachHang kh){
        return khachHangs.set(khachHangs.indexOf(tim(kh.getMaKhachHang())), kh);
    }
    
    public void chen(int stt, KhachHang kh){
        khachHangs.add(stt, kh);
    }
    
    public ArrayList<KhachHang> inDanhSach(){
        return khachHangs;
    }
    
    public double tongSoLuong(String loaiKH){
        double tongSLKHVietNam = 0;
        double tongSLKHNuocNgoai = 0;
        for (KhachHang kh : khachHangs) {
            if (kh instanceof KhachHangVietNam){
                tongSLKHVietNam += ((KhachHangVietNam) kh).getSoLuong();
            }else{
                tongSLKHNuocNgoai += ((KhachHangNuocNgoai) kh).getSoLuong();
            }
        }
        if (loaiKH.equalsIgnoreCase("Khách hàng Việt Nam")){
            return tongSLKHVietNam;
        }
        if (loaiKH.equalsIgnoreCase("Khách hàng nước ngoài")){
            return tongSLKHNuocNgoai;
        }
        return 0;
    }
    
}

