/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author BINHPA-PC
 */
public class DSTB {
    private ArrayList<ThueBao> list;

    public DSTB() {
        list = new ArrayList<>();
    }
    
    public void them(ThueBao tb){
        list.add(tb);
    }
    // trả về -1 khi không tồn tại thuê bao có mã chỉ định
    // trả về 1 nếu xóa thành công
    public int xoa(String maTB){
        for (ThueBao tb : list) {
            if (tb.getMa().equalsIgnoreCase(maTB)) {
                list.remove(tb);
                return 1;
            }
        }
        return -1;
    }
    
    public double tongTienTBTraSau(){
        double tongTien = 0;
        for (ThueBao tb : list) {
            if (tb instanceof TBTraSau) {
                TBTraSau tBTraSau = (TBTraSau) tb;
                tongTien += tBTraSau.tinhCuoc() - tBTraSau.tinhKhuyenMai();
            }
        }
        return tongTien;
    }
    
    public String tim(double khuyenMai){
        String danhSachMaThueBao = "";
        for (ThueBao tb : list) {
            if (tb.tinhKhuyenMai()>khuyenMai) {
                danhSachMaThueBao += tb.getMa() +",";
            }
        }
        int len = danhSachMaThueBao.length();
        if (len>0) {
            danhSachMaThueBao = danhSachMaThueBao.substring(0, len-1);
        }
        return danhSachMaThueBao;
    }
    
    public ArrayList<ThueBao> layDanhSach(){
        return list;
    }
}
