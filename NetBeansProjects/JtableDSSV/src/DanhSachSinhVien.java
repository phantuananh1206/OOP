
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gemini
 */
public class DanhSachSinhVien {
    public ArrayList<SinhVien> sinhViens = new ArrayList<SinhVien>();
    public DanhSachSinhVien(){
        
    }
    
    
    public boolean them(SinhVien sv){
        return sinhViens.add(sv);
    }
    
    public int Vitri(String ma){
        for (SinhVien sinhVien : sinhViens) {
            if(sinhVien.getMa().equalsIgnoreCase(ma)){
                return sinhViens.indexOf(sinhVien);
            }
        }
        return -1;
    }
    
    public SinhVien Tim(String ma){
        int tm = Vitri(ma);
        if(tm !=-1){
            return sinhViens.get(tm);
        }
        return null;
    }
    public boolean Xoa(String ma){
       return sinhViens.remove(Tim(ma));
    }
     
   public ArrayList<SinhVien> layDanhSach(){
       return sinhViens;
   }
    
    
    
    
    
    
}
