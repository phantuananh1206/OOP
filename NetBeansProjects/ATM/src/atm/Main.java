/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;





/**
 *
 * @author Gemini
 */
public class Main {

    /**
     * @param args the command line arguments
     * 
     *                  ma the|ma pin | so du |tai khoan| mat khau|   ten    |  ngSinh     |  dia chi    |     sdt    |  
     *       Card 1    | "01" |"1111" |150000 | "tk01"  | "pass1" |"Vo Van A"|"15/08/1999" |"Quang Nam"  |"0378xxxxxx"| 
             Card 2    | "02" |"2222" |150000 | "tk02"  | "pass2" |"Vo Van B"|"12/04/1999" |"Sai Gon"    |"0377xxxxxx"|
             Card 3    | "03" |"3333" |150000 | "tk03"  | "pass3" |"Vo Van C"|"05/12/1999" |"Tam Ki"     |"0376xxxxxx"|
             Card 4    | "04" |"4444" |150000 | "tk04"  | "pass4" |"Vo Van D"|"09/06/1999" |"Quang Ngai" |"0375xxxxxx"|
             Card 5    | "05" |"5555" |150000 | "tk05"  | "pass5" |"Vo Van E"|"09/06/1999" |"Ha Noi"     |"0374xxxxxx"|
     * 
     */
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.menuOfATM();
    }
    
}