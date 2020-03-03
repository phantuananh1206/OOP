
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class DanhSachHangHoa {
    ArrayList<HangHoa> hangHoas;
    public DanhSachHangHoa() {
        hangHoas = new ArrayList<>();
    }
    
    public boolean them(HangHoa hh){
        return hangHoas.add(hh);
    }
    public boolean xoa(String ma){
        for (HangHoa hangHoa : hangHoas) {
            if (hangHoa.getMaHang().equalsIgnoreCase(ma)){
                return  hangHoas.remove(hangHoa);
            }
        }
        return false;
    }
    
    public HangHoa timKiem(String ma){
        for (HangHoa hangHoa : hangHoas) {
            if (hangHoa.getMaHang().equalsIgnoreCase(ma)){
                return  hangHoa;
            }
        }
        return null;
    }
    
    public ArrayList<HangHoa> inDanhSach(){
        return hangHoas;
    }
    
    public double tingTongThanhTien(String hh){
        double tongThanhTienHDM = 0;
        double tongThanhTienHTC = 0;
        for (HangHoa hangHoa : hangHoas) {
            if (hangHoa instanceof HangDienMay){
                tongThanhTienHDM += ((HangDienMay) hangHoa).tinhThanhTien();
            }else{
                tongThanhTienHTC += ((HangThuCong) hangHoa).tinhThanhTien();
            }
        }
        if (hh.equalsIgnoreCase("Hàng điện máy")){
            return tongThanhTienHDM;
        }
        if (hh.equalsIgnoreCase("Hàng thủ công")){
            return tongThanhTienHTC;
        }
        return 0;
    }
    
    public HangHoa capNhat(HangHoa hh){
       return  hangHoas.set(hangHoas.indexOf(timKiem(hh.getMaHang())), hh);
    }
    public void chen(int stt, HangHoa hh){
        hangHoas.add(stt, hh);
    }
}
