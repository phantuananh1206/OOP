
package quanlysinhvien;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String diaChi;
    protected int namSinh;
    public Nguoi(){
    }
//==============================================

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
  public Nguoi(String ht,String dc,int ns){
      hoTen = ht;
      diaChi = dc;
      namSinh = ns;
}
   
    public void NhapTT(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Họ Tên : ");
        hoTen = sc.nextLine();
        System.out.println("Địa Chỉ :");
        diaChi = sc.nextLine();
        System.out.println("Năm Sinh :");
        namSinh = Integer.parseInt(sc.nextLine());
    }
    
    
    public void HienThiTT(){
        System.out.println("Họ Tên :"+this.hoTen);
        System.out.println("Địa Chỉ :"+this.diaChi);
        System.out.println("Năm Sinh :"+this.namSinh);
   
    }
    
    
}

