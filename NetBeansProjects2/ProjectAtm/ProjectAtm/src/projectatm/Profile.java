/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatm;


/**
 *
 * @author Sun
 */
public class Profile   {
           protected String Name,ngaylap ,DiaChi,NgaySinh,CMND, Password ,IDa; 
           protected float Money ,SentMoney,InMoney; 

    public Profile(String Name, String ngaylap, String DiaChi, String NgaySinh, String CMND, String Password, String IDa) {
        this.Name = Name;
        this.ngaylap = ngaylap;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
        this.CMND = CMND;
        this.Password = Password;
        this.IDa = IDa; 
    }
          
           
           
           public void  OutProfile () 
           {
           System.out.println ("======= Thông tin cá nhân =======");
           System.out.println ("name : "+Name);
           System.out.println ("Ngay Sinh :"+NgaySinh  );
           System.out.println ("days : "+ngaylap);
           System.out.println ("Address :"+DiaChi );
           System.out.println ("CMND :"+CMND );
           System.out.println ("Money :" +Money);
           
           }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getIDa() {
        return IDa;
    }

    public void setIDa(String IDa) {
        this.IDa = IDa;
    }

    public float getMoney() {
        return Money;
    }

    public void setMoney(float Money) {
        this.Money = Money;
    }

    public float getSentMoney() {
        return SentMoney;
    }

    public void SentMoney(float SentMoney) {
        this.Money = SentMoney + this.Money   ;
    }

    public float getInMoney() {
        return InMoney;
    }

    public void InMoney(float InMoney) {
        this.Money = this.Money - InMoney;
    }     
           
    public void OutMoney (float TakeMoney )
    {
     this.Money = this.Money - TakeMoney;
    
    }
}
