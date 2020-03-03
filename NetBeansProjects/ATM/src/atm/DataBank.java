/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.ArrayList;

/**
 *
 * @author Gemini
 */
public abstract class DataBank {
    
            
            // static cấp phát bộ nhớ toàn bộ khi bắt đầu chương trình và kết thúc chương trình  
        public static ArrayList <Card> cards = new ArrayList <Card>(){{
            add(new Card("01","1111",150000,"tk01","pass1","Vo Van A ","15/08/1999","Quang Nam","0378xxxxxx"));   
            add(new Card("02","2222",150000,"tk02","pass2","Vo Van B","12/04/1999","Sai Gon","0377xxxxxx"));
            add(new Card("03","3333",150000,"tk03","pass3","Vo Van C","05/12/1999","Tam Ki","0376xxxxxx"));
            add(new Card("04","4444",150000,"tk04","pass4","Vo Van D","09/6/1999","Quang Ngai","0375xxxxxx"));
            add(new Card("05","5555",150000,"tk05","pass5","Vo Van E","09/6/1999","Ha Noi","0374xxxxxx"));
        
        }};
        
       
        

        
        
        
}
