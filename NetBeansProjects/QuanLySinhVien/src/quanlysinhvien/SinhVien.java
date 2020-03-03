/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;
import java.util.Scanner;
/**
 *
 * @author Gemini
 */
public class SinhVien extends Nguoi { // Lớp SinhVien kế thừa lớp Nguoi
    protected String maSV;
    protected String tenMon1,tenMon2;
    protected Double diemMon1,diemMon2;
    protected Double diemTB;
    public SinhVien(){
    }
    
    public SinhVien(String hoTen,String diaChi,int namSinh,String maSV){
        super(hoTen, diaChi, namSinh);
   }
    @Override
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        super.NhapTT(); // super ham
        System.out.println("Mã Sinh Viên :");
        maSV = sc.nextLine();
        System.out.println("Tên môn 1 :");
        tenMon1 = sc.nextLine();
        System.out.println("Điểm môn 1 :");
        diemMon1 = Double.parseDouble(sc.nextLine());
        System.out.println("Tên môn 2 :");
        tenMon2 = sc.nextLine();
        System.out.println("Điểm môn 2 :");
        diemMon2 = Double.parseDouble(sc.nextLine());
    }
  
    public double TinhDiemTB(){ 
     diemTB =(diemMon1+diemMon2)/2;
     return diemTB;
    }
    
    @Override
    public void HienThiTT(){
    super.HienThiTT();
        System.out.println("=============================");
        System.out.println("Mã sinh viên :"+this.maSV);
        System.out.println("Tên sinh viên :"+this.hoTen);
        System.out.println("Địa chỉ :"+this.diaChi);
        System.out.println("Năm sinh :"+this.namSinh);
        System.out.println("Tên môn 1 :"+this.tenMon1);
        System.out.println("Điểm môn 1 :"+this.diemMon1);
        System.out.println("Tên môn 2 :"+this.tenMon2);
        System.out.println("Điểm môn 2:"+this.diemMon2);
        System.out.println("Điểm trung bình :"+TinhDiemTB());
        
    }
    
}
