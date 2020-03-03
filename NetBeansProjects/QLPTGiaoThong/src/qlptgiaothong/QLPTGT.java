/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlptgiaothong;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gemini
 */

public class QLPTGT {
    public ArrayList<PTGT> ptgts = new ArrayList<>();
    Scanner reader = new Scanner(System.in);
    
    public QLPTGT(){
        
    }
    
    
    protected void themMoi(PTGT pt){
       if(ptgts.add(pt)){
           System.out.println("Them thanh cong ");
       }else{
           System.out.println("That bat ");
       }
    }
    
    
    
    protected void timPhuongTien(String mau){
        for(PTGT pt : ptgts){
            if(mau.equalsIgnoreCase(pt.getMau())){
                pt.hienThiThongTin();
            }
        }
    }
    
    protected void hienThiThongTinToanBo(){
        for(PTGT pt : ptgts){
            pt.hienThiThongTin();
        }
    }   
    
    
    
    
    
    
    protected String xuLiDoubleSangChuoi(double so){
        NumberFormat fm = new DecimalFormat();
        return fm.format(so);
    }
    
    
}
