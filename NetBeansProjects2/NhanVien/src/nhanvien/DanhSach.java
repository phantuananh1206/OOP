/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.ArrayList;

/**
 *
 * @author Sun
 */
public class DanhSach {
     
    private ArrayList <NhanVien> NhanViens;

    public DanhSach() {
    }

    public DanhSach(ArrayList<NhanVien> NhanViens) {
        this.NhanViens = NhanViens;
    }
  
    public boolean Them (NhanVien nhanVien )
    {
       return NhanViens.add(nhanVien);
       
    }
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
}
