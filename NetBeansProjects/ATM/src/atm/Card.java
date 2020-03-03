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
public class Card extends Account {
    
    protected String maThe,maPIN;
    protected int soDu;
    
    public Card(){
        
    }

    public Card(String maThe, String maPIN, int soDu, String taiKhoan, String matKhau, String hoTen, String ngSinh, String queQuan, String sDT) {
        super(taiKhoan, matKhau, hoTen, ngSinh, queQuan, sDT);
        this.maThe = maThe;
        this.maPIN = maPIN;
        this.soDu = soDu;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getMaPIN() {
        return maPIN;
    }

    public void setMaPIN(String maPIN) {
        this.maPIN = maPIN;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }
   
    
}


    