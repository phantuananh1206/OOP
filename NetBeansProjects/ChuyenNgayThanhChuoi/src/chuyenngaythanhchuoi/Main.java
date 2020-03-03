/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuyenngaythanhchuoi;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gemini
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat formatdate = new SimpleDateFormat("dd/MM/YYYY hh:mm");
        Date date = new Date();
        String strDate;
        strDate = formatdate.format(date);
        System.out.print( " Chuyen ngay thanh chuoi :" + strDate);
        


    }
    
}
