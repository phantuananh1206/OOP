/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysv;

import java.util.ArrayList;


/**
 *
 * @author Gemini
 */
public class DanhSach  {
    
    private ArrayList <SinhVien> sinhViens;
    public DanhSach(){
        sinhViens = new ArrayList <>();
        
    }
    public boolean them(SinhVien sinhVien){
        return sinhViens.add(sinhVien);      
    }
    
   
    public int vitri(String maSV){
       for (SinhVien sv : sinhViens){
           if(sv.getMaSV().equalsIgnoreCase(maSV)){
               return sinhViens.indexOf(sv); 
           }
       }
       return -1;
   }

   public SinhVien tim (String maSV){
       int index = vitri(maSV);
        if ( index == -1 ){
            return null;
        }
         return sinhViens.get(index);
        }
   
        public boolean xoa (String maSV){
        SinhVien sv = tim(maSV);
       if (sv == null){
           return false;
       }
       return sinhViens.remove(sv);
   }

   private float getDTBMAX(){
       float max =0;
       for (SinhVien sv : sinhViens){
           if(sv.getDTB()>max){
               max=sv.getDTB();
           }
       }
       return max;
   }
   
      public ArrayList <SinhVien> layDanhSachSVDTMA(){
      ArrayList <SinhVien> sinhVienMaxs = new ArrayList();  // tạo arraylist mới
       float max = getDTBMAX();
       for (SinhVien sv : sinhViens){ //duyet sinh vien trong arraylist
           //
           sinhVienMaxs.add(sv);
       }
       return sinhVienMaxs;
   }
 
      public  ArrayList<SinhVien> layDanhSachSinhVienTheoLop (String lop){
          ArrayList <SinhVien> danhSachLop = new ArrayList<>();
          for (SinhVien sv : sinhViens ){
              if ( sv.getLop().equalsIgnoreCase(lop)){
                  danhSachLop.add(sv);
              }
            
          }          
           return danhSachLop; 
           }
      
      
      public ArrayList<SinhVien> LayDanhSachSinhVienTheoGioiTinh (boolean gioiTinh){
          ArrayList <SinhVien> danhSachGioiTinh = new ArrayList<>();
          for (SinhVien sv : sinhViens){
              if (sv.isGioiTinh() == gioiTinh){
                  danhSachGioiTinh.add(sv);
                  
              }
          }
           return danhSachGioiTinh;
      }
      
      public ArrayList<SinhVien> LayDanhSachSinhVienTheoNoiSinh (String queQuan){
          ArrayList <SinhVien> danhSachNoiSinh = new ArrayList<>();
          for(SinhVien sv : sinhViens){
              if(sv.getQueQuan().equalsIgnoreCase(queQuan)){
                  danhSachNoiSinh.add(sv);
              }
          }
          return danhSachNoiSinh;
          
      }
      
      public ArrayList<SinhVien> LayDanhSachToanBoSinhVien(){
          return sinhViens;
      }
      
      
      
      
      
}
      
      
      
      