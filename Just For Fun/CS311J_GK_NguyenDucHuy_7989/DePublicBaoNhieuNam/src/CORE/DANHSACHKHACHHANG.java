/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CORE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import CORE.KHACHHANGVIETNAM;

/**
 *
 * @author Administrator
 */
public class DANHSACHKHACHHANG {
    ArrayList<KHACHHANG> khachHangs;
    Scanner reader;

    public DANHSACHKHACHHANG() {
        khachHangs = new ArrayList<>();
        reader = new Scanner(System.in);
    }
    
    public void  themMoi(KHACHHANG khachHang){
        khachHangs.add(khachHang);
    }
    
    public boolean xoaKhachHangTheoMa(String maKH){
        for (KHACHHANG khachHang : khachHangs) {
            if(khachHang.getMaKH().equalsIgnoreCase(maKH)){
                return khachHangs.remove(khachHang);
            }
        }
        return false;
    }
    
    public KHACHHANG capNhatThongTinKhachHang(String maKH){
//        for (KHACHHANG khachHang : khachHangs) {
//            if(khachHang.getMaKH().equalsIgnoreCase(maKH)){
//                System.out.println("Nhap ma Khach Hang: ");
//                khachHang.setMaKH(reader.nextLine());
//                System.out.println("Nhap ho ten Khach Hang: ");
//                khachHang.setHoTen(reader.nextLine());
//                System.out.println("Nhap ngay ra hoa don: ");
//                khachHang.setNgayRaHoaDon(chuyenChuoiThanhNgay(reader.nextLine()));
//                System.out.println("Nhap so luong(Kwh tieu thu): ");
//                khachHang.setSoLuong(Double.parseDouble(reader.nextLine()));
//                System.out.println("Nhap don gia: ");
//                khachHang.setDonGia(Double.parseDouble(reader.nextLine()));
//                if(khachHang instanceof KHACHHANGVIETNAM){
//                    System.out.println("Nhap doi tuong khach hang: ");
//                    ((KHACHHANGVIETNAM)khachHang).setDoiTuongKH(reader.nextLine());
//                    System.out.println("Nhap so Kwh dinh muc: ");
//                    ((KHACHHANGVIETNAM)khachHang).setDinhMuc(Double.parseDouble(reader.nextLine()));
//                } if(khachHang instanceof KHACHHANGNUOCNGOAI){
//                    System.out.println("Nhap quoc tich: ");
//                    ((KHACHHANGNUOCNGOAI)khachHang).setQuocTich(reader.nextLine());
//                }
//                return khachHang;
//            }
//        }
//        return null;
        for (KHACHHANG khachHang : khachHangs) {
            if(khachHang.getMaKH().equalsIgnoreCase(maKH)){
                return khachHang;
            }
        }
        return null;
    }

    public KHACHHANG timKiemKH(String maKH){
        for (KHACHHANG khachHang : khachHangs) {
            if(khachHang.getMaKH().equalsIgnoreCase(maKH)){
                return khachHang;
            }
        }
        return null;
    }
    
    public ArrayList<KHACHHANG> HienThi(){
        return khachHangs;
    }
    
    private Date chuyenChuoiThanhNgay(String nextLine) {
        try {
            return new SimpleDateFormat("dd/mm/yyyy").parse(nextLine);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
