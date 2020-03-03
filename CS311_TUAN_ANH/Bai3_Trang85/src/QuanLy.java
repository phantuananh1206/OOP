
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
    DanhSachSinhVien ds;
    Scanner reader;

    public QuanLy() {
        ds=new DanhSachSinhVien();
        reader=new Scanner(System.in);
    }
    
    //tạo ra đối tượng sinh vien
    public SinhVien taoDoiTuongSinhVien(){
        SinhVien sv=new SinhVien();
        System.out.print("Nhap so BD: ");
        sv.setSoBD(reader.nextLine());
        System.out.print("Nhap ho ten: ");
        sv.setHoTen(reader.nextLine());
        System.out.print("Nhap dia chi: ");
        sv.setDiaChi(reader.nextLine());
        System.out.print("Nhap mon hoc: ");
        sv.setMonHoc(reader.nextLine());
        System.out.print("Nhap diem HK1: ");
        sv.setDiemThiKH1(Double.parseDouble(reader.nextLine()));
        System.out.print("Nhap diem HK2: ");
        sv.setDiemThiHK2(Double.parseDouble(reader.nextLine()));
        return  sv;               
    }
    public void inThongTin(SinhVien sv){
        System.out.printf("%-10s %-20s %-20s %-20s %-10.2f %-10.2f",
                sv.getSoBD(), sv.getHoTen(), sv.getDiaChi(),
                sv.getMonHoc(), sv.getDiemThiKH1(),
                sv.getDiemThiHK2());    
        System.out.println("");
    }
    
    public void themMoi(){
        if (ds.themVaoDanhSach(taoDoiTuongSinhVien())) {
            System.out.println("Nhap thanh cong!!!");
        } else {
            System.out.println("Nhap that bai!!!");
        }
    }
    
    public void inToanBoDanhSach(){
        for (SinhVien sv : ds.layToanBoDanhSach()) {
            inThongTin(sv);
        }
    }
    public void xoa(){
        System.out.print("Nhap so bao danh can xoa: ");
        String soBD=reader.nextLine();
        if (ds.xoaTheoSoBaoDanh(soBD)) {
            System.out.println("Xoa thanh cong!!");
        } else {
            System.out.println("Xoa that bai!!!");
        }
    }
    public void inDanhSachSinhVienTheoDiem(){
        System.out.print("Nhap diem can in: ");
        double diem=Double.parseDouble(reader.nextLine());
        for (SinhVien sv : ds.layDanhSachSinhVienTheoDiem(diem)) {
            inThongTin(sv);
        }
    }
    public void menuChuongTrinh(){
        int chon;
        do {            
            System.out.println("\n1. Them moi");
            System.out.println("2. In toan bo danh sach");
            System.out.println("3. Tim kiem sv theo diem");
            System.out.println("4. Xoa theo So bao danh");
            System.out.println("0. Dung chuong trinh");
            System.out.print("Chon chuc nang chuong trinh: ");
            chon=Integer.parseInt(reader.nextLine());
            switch (chon) {
                case 1:
                    themMoi();
                    break;
                case 2:
                    inToanBoDanhSach();
                    break;
                case 3:
                    inDanhSachSinhVienTheoDiem();
                    break;
                case 4:
                    xoa();
                    break;
            }
        } while (chon!=0);
    }
}
