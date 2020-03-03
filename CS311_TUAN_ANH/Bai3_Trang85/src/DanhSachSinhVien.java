
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
public class DanhSachSinhVien {
    //tạo ra 1 biến có ten danhSachs 
    ArrayList<SinhVien> danhSachs=new ArrayList<>();
 //thêm vào danh sách
    public boolean  themVaoDanhSach(SinhVien sv){
        return danhSachs.add(sv);
    }
    
    public ArrayList<SinhVien>layToanBoDanhSach(){
        return this.danhSachs;
    }
    
    public ArrayList<SinhVien> layDanhSachSinhVienTheoDiem(double  diem){
        ArrayList<SinhVien> dsMoi=new ArrayList<>();
        //duyet tren danh sach cu
        for (SinhVien sv : danhSachs) {
            if (sv.getDiemThiKH1()==diem) {
                dsMoi.add(sv);
            }
        }
        return dsMoi;
    }
    //tim vi tri sv theo soBD 
//    public int timViTriTheoSoBaoDanh(String soBD){
//        int index=-1;
//        for (SinhVien sv : danhSachs) {
//            index++;
//            if (sv.getSoBD().equalsIgnoreCase(soBD) ){
//                return  index;
//            }          
//        }
//        return -1;
//    }
//    public boolean xoaTheoSoBaoDanh(String soBD){
//        int index=timViTriTheoSoBaoDanh(soBD);
//        if (index!=-1) {
//            danhSachs.remove(index);
//            return true;
//        }
//        return false;
//    }
    public boolean xoaTheoSoBaoDanh(String soBD){
        for (SinhVien sv : danhSachs) {
            if (sv.getSoBD().equalsIgnoreCase(soBD.trim())) {
                danhSachs.remove(sv);
                return true;
            }
        }
        return false;
    }
    
}
