/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creature_by_duy;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Human extends Creature {
    private String yThuc;
    private String hanhDong;
    public Human(){
        
    }

    public Human(String yThuc, String hanhDong, String ten, Date ngaySinh, String gioiTinh) {
        super(ten, ngaySinh, gioiTinh);
        this.yThuc = yThuc;
        this.hanhDong = hanhDong;
    }

    public String getyThuc() {
        return yThuc;
    }

    public void setyThuc(String yThuc) {
        this.yThuc = yThuc;
    }

    public String getHanhDong() {
        return hanhDong;
    }

    public void setHanhDong(String hanhDong) {
        this.hanhDong = hanhDong;
    }

    
    
    @Override
    public double tinhTuoiTho() {
            double tuoi = (new Date().getTime() - ngaySinh.getTime()) / (365*24*60*60*1000);
            return tuoi;
    }
    
}
