/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author SONY 13 PRO
 */
public class DanhSachTaiLieu {
    private ArrayList<TaiLieu> danhSachs=new ArrayList<>();
    //Thêm vào tài liệu
    public  boolean themVaoTaiLieu(TaiLieu tl){
        return danhSachs.add(tl);
    }
    //Trả về toàn bộ tài liệu có trong danh sách
    
    public ArrayList<TaiLieu> layDanhSachTaiLieu(){
        return this.danhSachs;
    }
    //Tìm kiếm tài liệu, nếu tìm thấy thì trả về vị trí index;
//    public  int timViTriTaiLieuTheoMaChiDinh(String maTaiLieu){
//        int index=-1;//giả sử chưa tìm thấy
//        //Duyệt danh sách tài liêu
//        for (TaiLieu taiLieu : danhSachs) {
//            index++;
//            if (taiLieu.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)) {
//                return index;
//            }           
//        }
//        return -1;
//    }
    //Tìm kiếm tài liệu theo nhà xuất bản
    public ArrayList<TaiLieu> timKiemTaiLieuTheoNhaXuatBan(String tenNXB){
        ArrayList<TaiLieu> danhSachTaiLieuTheoNhaXuatBan=new ArrayList<>();
        for (TaiLieu taiLieu : danhSachs) {
            if (taiLieu.getTenNXB().contains(tenNXB)) {
                danhSachTaiLieuTheoNhaXuatBan.add(taiLieu);
            }           
        }
        return danhSachTaiLieuTheoNhaXuatBan;
    }
    public ArrayList<TaiLieu> timKiemTaiLieuTheoTieuDe(String tieuDe){
        ArrayList<TaiLieu> danhSachTaiLieuTheoTieuDe=new ArrayList<>();
        for (TaiLieu taiLieu : danhSachs) {
            if (taiLieu.getTieuDe().contains(tieuDe)) {
                danhSachTaiLieuTheoTieuDe.add(taiLieu);               
            }
        }
        return danhSachTaiLieuTheoTieuDe;
    }
    public int timSoPhatHanhLonNhat(){
        int maxValue=-1;
        for (TaiLieu taiLieu : danhSachs) {
            int soPhatHanhLonNhat=taiLieu.getSoBanPhatHanh();
            if (maxValue<soPhatHanhLonNhat) {
                maxValue=soPhatHanhLonNhat;
            }
        }
        return maxValue;
    }
    public ArrayList<TaiLieu> timTaiLieuCoSoPhatHanhLonNhat(){
        ArrayList<TaiLieu> danhSachTaiLieuCoSoPhatHanhLonNhat=new ArrayList<>();
        //Duyệt danh sách
        for (TaiLieu taiLieu : danhSachs) {
            if (taiLieu.getSoBanPhatHanh()==timSoPhatHanhLonNhat()) {
                danhSachTaiLieuCoSoPhatHanhLonNhat.add(taiLieu);
            }
        }
        return danhSachTaiLieuCoSoPhatHanhLonNhat;   
    }
    
    //Dùng chung cho tìm kiếm và cập nhật
    public TaiLieu timKiemTaiLieuTheoMaChiDinh(String maTaiLieu){
       //Duyệt danh sách, nếu tìm thấy thì trả về thông tin tài liệu
        for (TaiLieu taiLieu : danhSachs) {
            if (taiLieu.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)) {
                return taiLieu;
            }
        }
        return null;//Không tìm thấy
    }
    
    public boolean xoaTaiLieuTheoMaChiDinh(String maTaiLieu){
        for (TaiLieu tl : danhSachs) {
            if (tl.getMaTaiLieu().equalsIgnoreCase(maTaiLieu.trim())) {
                danhSachs.remove(tl);
                return true;
            }
        }
        return  false;
    }
}
