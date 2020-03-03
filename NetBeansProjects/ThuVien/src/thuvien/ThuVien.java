/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvien;
import java.util.Scanner;


/**
 *
 * @author Gemini
 */
public class ThuVien extends DanhSach {
     Scanner reader = new Scanner(System.in);
     Bao bao = new Bao();
     TapChi tapchi = new TapChi();
     Sach sach = new Sach();
    
    public ThuVien(){
        
    }
    
    
    public void mainMenu(){
        int chon;
        do {            
            System.out.println("------------Thu Vien------------");
            System.out.println("1. Them vao danh sach cac tai lieu");
            System.out.println("2. Hien thi danh sach cac tai lieu trong thu vien");
            System.out.println("3. Tim kiem tai lieu theo nha xuat ban");
            System.out.println("4. Tim kiem tai lieu theo tieu de");
            System.out.println("5. Tim kiem tai lieu co so ban phat hanh lon nhat");
            System.out.println("6. Tim kiem sach theo ten tac gia gan dung");
            System.out.println("7. Xoa tai lieu co ma tai lieu duoc chi dinh");
            System.out.println("8. Cap nhat thong tin cho tai lieu theo ma chi dinh");
            System.out.println("--------------------------------");
            System.out.print("Moi chon : ");
            chon = Integer.parseInt(reader.nextLine());
            switch(chon){
                case 1:{
                    them();
                    break;
                }
                case 2:{
                    dSCTL();
                    break;
                }
                case 3:{
                    timTheoNXB();
                    break;
                }
                case 4:{
                    
                    break;
                }
                case 5:{
                    
                    break;
                }
                case 6:{
                    
                    break;
                }
                case 7:{
                    
                    break;
                }
                case 8:{
                    
                    break;
                }
            }
        } while (chon !=0);
    }
    
    
    private void them(){
        int chon;
        do {
            System.out.println("--------------------------------");
            System.out.println("1. Them sach");
            System.out.println("2. Them Tap chi");
            System.out.println("3. Them Bao");
            System.out.println("0. Quay lai");
            System.out.println("--------------------------------");
            System.out.print("Moi chon : ");
            chon= Integer.parseInt(reader.nextLine());
            switch(chon){
                case 1 :{
                    if(them(themSach())){
                        System.out.println("Them thanh cong :)");
                    }else{
                        System.out.println("Them that bai :) ");
                    }
                    break;
                }
                case 2 :{
                    if(them(themTapChi())){
                        System.out.println("Them thanh cong :) ");
                    }else{
                        System.out.println("Them that bai :) ");
                    }
                    break;
                }
                case 3: {
                    if(them(themBao())){
                        System.out.println("Them thanh cong :)");
                    }else{
                        System.out.println("The that bai :) ");
                    }
                    break;
                }
            }
        } while (chon !=0);
        
    }
    
    private TaiLieu themSach(){
        TaiLieu taiLieu = new Sach();
        System.out.print("Ma tai lieu : ");
        taiLieu.setMaTL(reader.nextLine());
        System.out.print("Tieu de : ");
        taiLieu.setTieuDe(reader.nextLine());
        System.out.print("Ten nha xuat ban : ");
        taiLieu.setTenNXB(reader.nextLine());
        System.out.print("So ban phat hanh : ");
        taiLieu.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
        System.out.print("Ten tac gia : ");
        ((Sach)taiLieu).setTenTG(reader.nextLine());
        System.out.print("So trang : ");
        ((Sach)taiLieu).setSoTrang(Integer.parseInt(reader.nextLine()));
        return taiLieu;
    }
    private TaiLieu themTapChi(){
        TaiLieu taiLieu = new TapChi();
        System.out.print("Ma tai lieu : ");
        taiLieu.setMaTL(reader.nextLine());
        System.out.print("Tieu de : ");
        taiLieu.setTieuDe(reader.nextLine());
        System.out.print("Ten nha xuat ban : ");
        taiLieu.setTenNXB(reader.nextLine());
        System.out.print("So ban phat hanh : ");
        taiLieu.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
        System.out.print("So phat hanh : ");
        ((TapChi)taiLieu).setSoPH(Integer.parseInt(reader.nextLine()));
        System.out.print("Thang nam phat hanh : ");
        ((TapChi)taiLieu).setThangNamPH(xuLiChuoiThanhNgayThangNam(reader.nextLine()));
        return taiLieu;
    }
    private TaiLieu themBao(){
        TaiLieu taiLieu = new Bao();
        System.out.print("Ma tai lieu : ");
        taiLieu.setMaTL(reader.nextLine());
        System.out.print("Tieu de : ");
        taiLieu.setTieuDe(reader.nextLine());
        System.out.print("Ten nha xuat ban : ");
        taiLieu.setTenNXB(reader.nextLine());
        System.out.print("So ban phat hanh : ");
        taiLieu.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
        System.out.print("Ngay phat hanh : ");
        ((Bao)taiLieu).setNgayPH(xuLiChuoiThanhNgayThangNam(reader.nextLine()));
        return taiLieu;
    }
    
    private void dSCTL(){
        int chon;
        do {
            System.out.println("--------------------------------");
            System.out.println("1. Sach");
            System.out.println("2. Tap chi");
            System.out.println("3. Bao");
            System.out.println("0.Quay Lai");
            System.out.println("--------------------------------");
            System.out.print("Moi chon : ");
            chon = Integer.parseInt(reader.nextLine());
            switch(chon){
                case 1 :{
                    try{
                    for(TaiLieu tl : tailieus){
                      sach.hienThi(tl);
                    }}catch(ClassCastException e){
                    }
                    break;
                }
                case 2:{
                    try{
                    for(TaiLieu tl : tailieus){
                    tapchi.hienThi(tl);
                    }}catch(ClassCastException e){
                    }
                    break;
                }
                case 3:{
                    try{
                    for(TaiLieu tl : tailieus){
                    bao.hienThi(tl);
                    }}catch(ClassCastException e){
                    }
                    break;
                }
            }
        }while (chon!=0);
    }
    
    
    
    
     public void timTheoNXB(){
         String nxb;
         System.out.println("Nhap ten nha xuat ban : ");
         nxb = reader.nextLine();
        for(TaiLieu tl : tailieus){
           if(nxb.equalsIgnoreCase(tl.getTenNXB())){
               tl.hienThi(tl);
               
           }
        }
    }
     
    public void timTheoTieuDe(){
        String tieuDe;
        System.out.println("Nhap tieu de : " );
        tieuDe = reader.nextLine();
        for(TaiLieu tl : tailieus){
            if(tieuDe.equalsIgnoreCase(tl.getTieuDe())){
                tl.hienThi(tl);
            }
        }
    }
    
    public void timSoBanPHLonNhat(){
        
    }
     
     
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
     
    
}
