/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlidanhsachhdtd;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DSKHACHHANG {
    public ArrayList<KHACHHANG> khachhangs = new ArrayList<>();
    public DSKHACHHANG(){
        
    }
    
    public boolean them(KHACHHANG kh){
        return khachhangs.add(kh);
    }
    public boolean  xoa(String maKH){
        for (KHACHHANG khachhang : khachhangs) {
            if(maKH.equalsIgnoreCase(khachhang.getMaKH())){
                return khachhangs.remove(khachhang);
            }
        }
        return false;
    }
    
    public KHACHHANG timKiem(String maKH){
        for (KHACHHANG khachhang : khachhangs) {
            if(maKH.equalsIgnoreCase(khachhang.getMaKH())){
                return khachhangs.get(khachhangs.indexOf(khachhang));
            }
        }
        return null;
    }
    
   
   public KHACHHANG CapNhat(KHACHHANG kh){
            return khachhangs.set(khachhangs.indexOf(timKiem(kh.getMaKH())),kh);
   }
   
   
   
  
      
      
   
    
    

}