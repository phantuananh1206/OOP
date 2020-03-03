/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgv;

import java.util.ArrayList;

/**
 *
 * @author Sun
 */
public class DSGV {
    ArrayList <GiangVien> list  ;

    public DSGV() {
    list = new ArrayList<>() ;
    }

   
    public void themGV(GiangVien gv)
    {
         list.add(gv);
    }
    public boolean xoaGV(String ma)
    {
        for( GiangVien temp : list )
        {
              if(temp.getMa().equals(ma) )
              {
              return  list.remove(temp);
              
              }
          
        }
      return false;
    }
   
    
    public Double tbcLuongPhucap(GiangVien gv)
    {
     double tbc = 0 ; 
    
       for (GiangVien temp : list) {
                
            if(temp instanceof GVCoHuu)
            {
                
             tbc = (temp.luongGV+temp.phucap)/2 ;   
                
            }
            }
       return tbc ;
    }
    
    
    public ArrayList <GiangVien> LayDanhSach()
    {
     return list ;
    }
    
    public int laySize()
    {
       
       return  list.size();
    
    
    }
    
    public  GiangVien LayGV (String ma)
    {
      for( GiangVien temp : list )
        {
              if(temp.getMa().equals(ma) )
              {
              return   temp;
              
              }
          
        }
        return null;
  
    }
}