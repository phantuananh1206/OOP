
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gemini
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat formatdate = new SimpleDateFormat("dd/MM/YYYY");
        Date date;
        try{
            date = formatdate.parse("11/08/2000");
            System.out.println("date :" + date);
        }catch (ParseException e){
            e.printStackTrace();
        }
        
        
        
        
        
        
    }
    
}
