/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhanghoa;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DanhSachHangHoa {
    ArrayList<HangHoa> hangHoas;
    public DanhSachHangHoa() {
        hangHoas = new ArrayList<>();
    }
    
    public boolean themMoi(HangHoa hh){
        return hangHoas.add(hh);
    }
    public boolean xoa(String maHang){
        for (HangHoa hh : hangHoas) {
            if (hh.getMaHang().equalsIgnoreCase(maHang)){
                return hangHoas.remove(hh);
            }
        }
        return false;
    }
    public HangHoa timKiem(String maHang){
        for (HangHoa hangHoa : hangHoas) {
            if (hangHoa.getMaHang().equalsIgnoreCase(maHang)){
                return hangHoa;
            }
        }
        return null;
    }
    public ArrayList<HangHoa> inDanhSach(){
        return hangHoas;
    }
    public double tongThanhTien(String hH){
        double tongThanhTienHDM = 0;
        double tongThanhTienHTC = 0;
        for (HangHoa hangHoa : hangHoas) {
            if (hangHoa instanceof HangDienMay) {
                HangDienMay hdm = (HangDienMay) hangHoa;
                tongThanhTienHDM = tongThanhTienHDM + hdm.tinhThanhTien();
            }else{
                tongThanhTienHTC = tongThanhTienHTC + ((HangThuCong)hangHoa).tinhThanhTien();
            }
        }
        if (hH.equalsIgnoreCase("Hàng điện máy")){
            return tongThanhTienHDM;
        }
        if (hH.equalsIgnoreCase("Hàng thủ công")){
            return tongThanhTienHTC;
    }
        return 0;
    }
}    
