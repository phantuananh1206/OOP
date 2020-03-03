/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author BINHPA-PC
 */
public class DanhSachSinhVien {
    private ArrayList<SinhVien> sinhViens;

    public DanhSachSinhVien() {
        sinhViens = new ArrayList<>();
    }
    
    public boolean themSinhVien(SinhVien sinhVien){
        return sinhViens.add(sinhVien);
    }
    
    public int timViTri(String ma){
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getMa().equalsIgnoreCase(ma)) {
                return sinhViens.indexOf(sinhVien);
            }
        }
        return -1;
    }
    
    public SinhVien tim(String ma){
        int viTri = timViTri(ma);
        if (viTri!=-1) {
            return sinhViens.get(viTri);
        }
        return null;
    }
    
    public boolean xoaSinhVien(String ma){
        int viTri = timViTri(ma);
        if (viTri!=-1) {
            return sinhViens.remove(sinhViens.get(viTri));
        }
        return false;
    }
    
    public ArrayList<SinhVien> layDanhSach(){
        return sinhViens;
    }
}
