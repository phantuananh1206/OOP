/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytable;

import java.util.ArrayList;

/**
 *
 * @author Sun
 */
public class DanhSach {

    ArrayList <SinhVien> DanhSachs ;

    public DanhSach() {
  
    DanhSachs = new ArrayList<>();
    
    }
   

    public boolean  themMoi (  SinhVien SinhViens   )
    {    
     return DanhSachs.add(SinhViens);
    
    }
    public  boolean Xoatheoma(String ma )
    {
        for( SinhVien temp : DanhSachs )
        {
               if(temp.getMaSv().equals(ma) )
               { 
                   return DanhSachs.remove(temp);                   
               }
        }
        return false;   
    }
    
    
//    public void xuat()
//    {
//     for( SinhVien temp : DanhSachs )
//        {
//             System.out.println(temp.getTenSv());
//        }
//      
//    }
    
    
}
