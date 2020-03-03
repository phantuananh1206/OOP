
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SONY 13 PRO
 */
public class DanhSachNhanVien {

    ArrayList<NhanVien> danhSachs = new ArrayList<>();

    public boolean themVaoDanhSach(NhanVien nv) {
        return danhSachs.add(nv);
    }

    public ArrayList<NhanVien> layDanhSachNhanVien() {
        return this.danhSachs;
    }
//    public int timViTriNhanVienTrongDanhSach(String CMND){
//        int index=-1;//gia su chua tim thay
//        for (NhanVien nv : danhSachs) {
//            index++;
//            if (nv.getCMND().equalsIgnoreCase(CMND)) {
//                return index;//tim thay
//            }           
//        }
//        return -1;//ko tim thay
//    }

    public boolean xoaTheoCMND(String CMND) {
        for (NhanVien nv : danhSachs) {
            if (nv.getCMND().equalsIgnoreCase(CMND.trim())) {
                danhSachs.remove(nv);
                return true;
            }
        }
        return false;
    }

    public float xuatTongLuongChiTra() {
        float tongLuong = 0;
        for (NhanVien nv : danhSachs) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }

    public float timLuongCaoNhat() {
        float maxLuong = -1;
        for (NhanVien nv : danhSachs) {
            float luongCaoNhat = nv.tinhLuong();
            if (maxLuong < luongCaoNhat) {
                maxLuong = luongCaoNhat;
            }
        }
        return maxLuong;
    }

    public ArrayList<NhanVien> layDanhSachLuongCaoNhat() {
        ArrayList<NhanVien> dsMoi = new ArrayList<>();
        for (NhanVien nv : danhSachs) {
            if (nv.tinhLuong() == timLuongCaoNhat()) {
                dsMoi.add(nv);
            }
        }
        return dsMoi;
    }

    public NhanVien timNhanVienTheoCMND(String CMND) {
        for (NhanVien nv : danhSachs) {
            if (nv.getCMND().equalsIgnoreCase(CMND.trim())) {
                return nv;
            }
        }
        return null;
    }

    public ArrayList<NhanVien> layDanhSachNhanVienTheoLoai(int loai) {
        ArrayList<NhanVien> dsTheoLoai = new ArrayList<>();
        //1: bien che; 2: hop dong
        if (loai == 1) {
            for (NhanVien nv : danhSachs) {
                if (nv instanceof NhanVienBienChe) {
                    NhanVienBienChe nvbc = (NhanVienBienChe) nv;
                    dsTheoLoai.add(nvbc);
                }
            }
        } else {
            for (NhanVien nv : danhSachs) {
                if (nv instanceof NhanVienHopDong) {
                    NhanVienHopDong nvhd = (NhanVienHopDong) nv;
                    dsTheoLoai.add(nvhd);
                }
            }
        }
        return  dsTheoLoai;
    }
}
