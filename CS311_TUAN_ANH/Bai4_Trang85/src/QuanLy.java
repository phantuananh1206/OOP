
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SONY 13 PRO
 */
public class QuanLy {

    DanhSachNhanVien ds;
    Scanner reader;

    public QuanLy() {
        ds = new DanhSachNhanVien();
        reader = new Scanner(System.in);
    }

    public NhanVienBienChe taoNhanVienBienChe() {
        NhanVienBienChe nvbc = new NhanVienBienChe();
        System.out.print("Nhap CMND: ");
        nvbc.setCMND(reader.nextLine());
        System.out.println("Nhap ho ten: ");
        nvbc.setHoTen(reader.nextLine());
        System.out.println("Nhap phong ban: ");
        nvbc.setPhongBan(reader.nextLine());
        System.out.println("Nhap ngay vao lam: ");
        nvbc.setNgayVaoLam(chuyenChuoiThanhNgay(reader.nextLine()));
        System.out.println("Nhap HSL: ");
        nvbc.setHSL(Float.parseFloat(reader.nextLine()));
        return nvbc;
    }

    public NhanVienHopDong taoNhanVienHopDong() {
        NhanVienHopDong nvhd = new NhanVienHopDong();
        System.out.print("Nhap CMND: ");
        nvhd.setCMND(reader.nextLine());
        System.out.println("Nhap ho ten: ");
        nvhd.setHoTen(reader.nextLine());
        System.out.println("Nhap phong ban: ");
        nvhd.setPhongBan(reader.nextLine());
        System.out.println("Nhap ngay vao lam: ");
        nvhd.setNgayVaoLam(chuyenChuoiThanhNgay(reader.nextLine()));
        System.out.println("Nhap tong gio lam: ");
        nvhd.setTongGioLam(Integer.parseInt(reader.nextLine()));
        System.out.println("Nhap tien cong mot gio: ");
        nvhd.setTienCongMotGio(Float.parseFloat(reader.nextLine()));
        return nvhd;
    }

    private Date chuyenChuoiThanhNgay(String str) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(str);
        } catch (ParseException e) {
            System.out.println("Loi: " + e.getMessage());
        }
        return null;//neu khong co loi thi return null
    }
    public String chuyenNgayThanhChuoi(Date ngay){
        return new SimpleDateFormat("dd/MM/yyyy").format(ngay);
    }

    public void themMoi() {
        int chon;
        do {
            System.out.println("1. Nhap nhan vien bien che");
            System.out.println("2. Nhap nhan vien hop dong");
            System.out.print("Chon 1 hoac 2: ");
            chon = Integer.parseInt(reader.nextLine());
            switch (chon) {
                case 1:
                    if (ds.themVaoDanhSach(taoNhanVienBienChe())) {
                        System.out.println("Them moi thanh cong");
                    } else {
                        System.out.println("Them moi that bai");
                    }
                    break;
                case 2:
                    if (ds.themVaoDanhSach(taoNhanVienHopDong())) {
                        System.out.println("Them moi thanh cong");
                    } else {
                        System.out.println("Them moi that bai");
                    }
                    break;
            }
        } while (chon != 0);
    }

    public void inDoiTuong(NhanVien nv) {
        System.out.printf("%-10s %-10s %-20s %-20s",
                nv.getCMND(), nv.getHoTen(), nv.getPhongBan(), chuyenNgayThanhChuoi(nv.getNgayVaoLam()));
        if (nv instanceof NhanVienBienChe) {
            NhanVienBienChe nvbc = (NhanVienBienChe) nv;
            System.out.printf("%-10.2f %-20.2f %-20.2f",
                    nvbc.getHSL(), nvbc.tinhPhuCap(), nvbc.tinhLuong());
        } else {
            NhanVienHopDong nvhd = (NhanVienHopDong) nv;
            System.out.printf("%-10d %-20.2f %-20.2f %-20.2f",
                    nvhd.getTongGioLam(), nvhd.getTienCongMotGio(),
                    nvhd.tinhPhuCap(), nvhd.tinhLuong());
        }
        System.out.println();//xuong dong
    }

    public void inDanhSachNhanVien() {
        for (NhanVien nv : ds.layDanhSachNhanVien()) {
            inDoiTuong(nv);
        }
    }

    public void xoa() {
        System.out.print("Nhap CMND can xoa: ");
        if (ds.xoaTheoCMND(reader.nextLine())) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Xoa that bai");
        }
    }

    public void inTongLuongChiTra() {
        System.out.println("Tong luong chi tra: " + ds.xuatTongLuongChiTra());
    }

    public void inDanhSachLuongCaoNhat() {
        for (NhanVien nv : ds.layDanhSachLuongCaoNhat()) {
            inDoiTuong(nv);
        }
    }

    public void timKiem() {
        System.out.println("Nhap CMND can tim: ");
        NhanVien nv = ds.timNhanVienTheoCMND(reader.nextLine());
        if (nv == null) {
            System.out.println("Khong tim thay");
        } else {
            inDoiTuong(nv);
        }
    }

    public void inDanhSachNhanVienTheoLoai() {
        System.out.print("Nhap loai nhan vien can tim: (1. Bien che; 2: Hop dong: ");
        int loai = Integer.parseInt(reader.nextLine());
        for (NhanVien nv : ds.layDanhSachNhanVienTheoLoai(loai)) {
            inDoiTuong(nv);
        }
    }

    public void taoMeNu() {
        int chon;
        do {
            System.out.println("1. Them moi");
            System.out.println("2. In danh sach nhan vien: ");
            System.out.println("3. Xoa theo CMND");
            System.out.println("4. Tong luong phai tra");
            System.out.println("5. In danh sach luong cao nhat");
            System.out.println("6. Tim kiem theo CMND");
            System.out.println("7. In danh sach theo loai nhan vien");
            System.out.println("Chon chuc nang chuong trinh:   ");
            chon = Integer.parseInt(reader.nextLine());
            switch (chon) {
                case 1:
                    themMoi();
                    break;
                case 2:
                    inDanhSachNhanVien();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    inTongLuongChiTra();
                    break;
                case 5:
                    inDanhSachLuongCaoNhat();
                    break;
                case 6:
                    timKiem();
                    break;
                case 7:
                    inDanhSachNhanVienTheoLoai();
                    break;
            }
        } while (chon != 0);
    }
}
