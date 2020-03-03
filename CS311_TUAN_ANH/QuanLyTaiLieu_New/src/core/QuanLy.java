/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SONY 13 PRO
 */
public class QuanLy {
    private DanhSachTaiLieu danhSach;
    private Scanner reader;

    public QuanLy() {
        danhSach=new DanhSachTaiLieu();
        reader=new Scanner(System.in);
    }
    
    public Sach taoDoiTuongSach(String maTaiLieu){
        Sach sach=new Sach();
        //Nếu đã có sẵn mã tài liệu thì lấy lại mã tài liệu cũ
        if(maTaiLieu.length()>0){
            sach.setMaTaiLieu(maTaiLieu);
        }else//Ngược lại thì nhập mới mã tài liệu
            {
                System.out.print("Nhập mã sách: ");sach.setMaTaiLieu(reader.nextLine());
                System.out.print("Nhap tiêu đề: ");sach.setTieuDe(reader.nextLine());
                System.out.print("Nhap tên nhà xuất ban: ");sach.setTenNXB(reader.nextLine());
                System.out.print("Nhập Số bản phát hành: ");sach.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
                System.out.print("Nhập tên tác giả: ");sach.setTenTacGia(reader.nextLine());
                System.out.print("Nhập số trang: ");sach.setSoTrang(Integer.parseInt(reader.nextLine()));
            }
        return sach;
    }
    public Bao taoBao(String maTaiLieu){
        Bao bao=new Bao();
        if (maTaiLieu.length()>0) {
            bao.setMaTaiLieu(maTaiLieu);
        }else{
            System.out.print("Nhập mã báo: ");bao.setMaTaiLieu(reader.nextLine());
            System.out.print("Nhập tiêu đề: ");bao.setTieuDe(reader.nextLine());
            System.out.print("Nhập tên nhà xuất bản: ");bao.setTenNXB(reader.nextLine());
            System.out.print("Nhập số bản phát hành: ");bao.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
            System.out.print("Nhập ngày phát hành: ");bao.setNgayPhatHanh(chuyenChuoiThanhNgay(reader.nextLine()));
            
        }
        return bao;
    }

    public TapChi taoTapChi(String maTaiLieu){
        TapChi tapChi=new TapChi();
        if (maTaiLieu.length()>0) {
            tapChi.setMaTaiLieu(maTaiLieu);
        } else {
            System.out.print("Nhập mã tạp chí: ");tapChi.setMaTaiLieu(reader.nextLine());
            System.out.print("Nhập tiêu đề: ");tapChi.setTieuDe(reader.nextLine());
            System.out.print("Nhập tên nhà xuất bản: ");tapChi.setTenNXB(reader.nextLine());
            System.out.print("Nhập số bản phát hành: ");tapChi.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
            System.out.print("Nhập số phát hành: ");tapChi.setSoPhatHanh(reader.nextLine());
            System.out.print("Nhập tháng năm phát hành: ");tapChi.setThangNamPhatHanh(reader.nextLine());                  
        }
        return tapChi;
    }
    public Date chuyenChuoiThanhNgay(String strNgay) {
        try{
            return new SimpleDateFormat("dd/MM/yyyy").parse(strNgay);
        
        }catch(ParseException ex){
            System.out.println("Loi: "+ex.getMessage());
        };
        return null;
    }
    
    public void inThongTinTaiLieu(TaiLieu taiLieu){
        System.out.printf("%-5s %-20s %-20s %-5d ",taiLieu.getMaTaiLieu(), taiLieu.getTieuDe(),taiLieu.getTenNXB(),taiLieu.getSoBanPhatHanh());
        if (taiLieu instanceof Sach) {//nếu taiLieu là thể hiện cụ thể của Sach
            Sach sach=(Sach)taiLieu;//ép kiểu downcasting
            System.out.printf("%-20s %-10d",sach.getTenTacGia(), sach.getSoTrang());            
        } else if (taiLieu instanceof Bao) {
                Bao bao=(Bao)taiLieu;
                System.out.printf("%-10s",chuyenNgayThanhChuoi(bao.getNgayPhatHanh()));
                 }else
                    {
                        TapChi tapChi=(TapChi)taiLieu;
                        System.out.printf("%-10s %-15s",tapChi.getSoPhatHanh(),tapChi.getThangNamPhatHanh());
                    }
        System.out.println("");
    }
    private String chuyenNgayThanhChuoi(Date ngayPhatHanh) {
       return new SimpleDateFormat("dd/MM/yyyy").format(ngayPhatHanh);
    }
    
    public void themMoi(){
        int chon;boolean kq=false;
        do{
            System.out.println("1. Nhập thông tin Sách");
            System.out.println("2. Nhập thông tin Báo");
            System.out.println("3. Nhập thông tin Tạp Chí");
            System.out.print("Nhập lựa chọn: ");
            chon=Integer.parseInt(reader.nextLine());
            switch(chon){
                case 1:{
                            kq=danhSach.themVaoTaiLieu(taoDoiTuongSach(""));break;
                       }
                case 2:{
                           kq=danhSach.themVaoTaiLieu(taoBao(""));break;
                       }
                case 3:{
                           kq=danhSach.themVaoTaiLieu(taoTapChi(""));break;
                        }
            }
            if (kq==true) {
                System.out.println("Thêm mới thành công!!!");
            }else {System.out.println("Thêm mới thất bại!!!");}
                    
        }while(chon!=0);
    }
   
    public void inDanhSachTaiLieu(){
        for (TaiLieu taiLieu : danhSach.layDanhSachTaiLieu()) {
            inThongTinTaiLieu(taiLieu);
        }
    }
    
    public void timKiem(){
        System.out.print("Nhập mã tài liệu cần tìm kiếm: ");
        String maTaiLieu=reader.nextLine();
        TaiLieu taiLieu=danhSach.timKiemTaiLieuTheoMaChiDinh(maTaiLieu);
        if (taiLieu!=null) {
            inThongTinTaiLieu(taiLieu);
        }else
            System.out.println("Không tìm thấy tài liệu trong danh sách!!!");
        
    }
    public void xoa(){
        System.out.println("Nhập mã tài liệu cần xóa: ");
        if (danhSach.xoaTaiLieuTheoMaChiDinh(reader.nextLine())) {
            System.out.println("Xóa thành công!!!");
        }else{
                System.out.println("Không tìm thấy mã tài liệu cần xóa!!!");
            }
    }
    public void capNhat(){
        String maTaiLieu;
        System.out.print("Nhập mã tài liệu cần cập nhật: ");
        TaiLieu taiLieu=danhSach.timKiemTaiLieuTheoMaChiDinh(reader.nextLine());
            if (taiLieu==null) {
                System.out.println("Không tìm thấy mã tài liệu cần cập nhật!!!");
        } else {
                System.out.print("Cập nhật tiêu đề: ");taiLieu.setTieuDe(reader.nextLine());
                System.out.print("Cập nhật tên nhà xuất bản: ");taiLieu.setTenNXB(reader.nextLine());
                System.out.print("Cập nhật số bản phát hành: ");taiLieu.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
                if (taiLieu instanceof Sach) {
                    Sach sach=(Sach)taiLieu;
                    System.out.print("Cập nhật tên tác giả: ");sach.setTenTacGia(reader.nextLine());
                    System.out.print("Cập nhật số trang: ");sach.setSoTrang(Integer.parseInt(reader.nextLine()));                   
                }else if (taiLieu instanceof Bao ) {
                    Bao bao=(Bao)taiLieu;
                    System.out.print("Cập nhật ngày phát hành: ");bao.setNgayPhatHanh(chuyenChuoiThanhNgay(reader.nextLine()));                    
                }else{
                    TapChi tapChi=(TapChi)taiLieu;
                    System.out.print("Cập nhật số phát hành: ");tapChi.setSoPhatHanh(reader.nextLine());
                    System.out.print("Cập nhật tháng năm phát hành: ");tapChi.setThangNamPhatHanh(reader.nextLine());                   
                }
        }                
    }
 
    public void inDanhSachTaiLieuTheoNhaXuatBan(){
        System.out.print("Nhập tên nhà xuất bản cần tìm kiếm: ");
        for (TaiLieu taiLieu : danhSach.timKiemTaiLieuTheoNhaXuatBan(reader.nextLine())) {
            inThongTinTaiLieu(taiLieu);
        }
    }
    public void inDanhSachTaiLieuTheoTieuDe(){
        System.out.print("Nhập tiêu đề cần tìm kiếm: ");
        for (TaiLieu taiLieu : danhSach.timKiemTaiLieuTheoTieuDe(reader.nextLine())) {
            inDanhSachTaiLieu();
        }
    }
    
    public void inDanhSachTaiLieuCoSoPhatHanhLonNhat(){
        for (TaiLieu taiLieu : danhSach.timTaiLieuCoSoPhatHanhLonNhat()) {
            inThongTinTaiLieu(taiLieu);
        }
    }
    
    public void menu(){
        int chon;
        do{
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ THƯ VIỆN");
            System.out.println("1. Thêm mới");
            System.out.println("2. In danh sách tài liệu");
            System.out.println("3. In danh sách tài liệu theo Nhà xuất bản");
            System.out.println("4. In danh sách tài liệu theo Tiêu đề");
            System.out.println("5. In danh sách tài liệu có số phát hành lớn nhất");
            System.out.println("6. Tìm kiếm theo mã tài liệu");
            System.out.println("7. Xóa theo mã tài liệu");
            System.out.println("8. Cập nhật theo mã tài liệu");
            System.out.println("0. Bấm 0 để thoát chương trình");
            System.out.print("Chọn chức năng chương trình: ");chon=Integer.parseInt(reader.nextLine());
            switch(chon){
                case 1:{
                        themMoi();break;
                        }
                case 2:{
                        inDanhSachTaiLieu();break;
                        }
                case 3:{
                        inDanhSachTaiLieuTheoNhaXuatBan();break;
                        }
                case 4:{
                        inDanhSachTaiLieuTheoTieuDe();break;
                        }
                case 5:{
                        inDanhSachTaiLieuCoSoPhatHanhLonNhat();break;
                        }
                case 6:{
                        timKiem();break;                              
                        }
                case 7:{
                        xoa();break;
                        }
                case 8:{
                        capNhat();break;
                        }
            }
        }while(chon!=0);
    }
    
}
