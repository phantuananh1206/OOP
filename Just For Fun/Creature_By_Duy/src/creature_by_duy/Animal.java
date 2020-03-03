/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creature_by_duy;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Animal extends Creature {
    private int soChan;
    private String tapTinh;
    private String loiSong;
    
    public Animal(){
        
    }

    public Animal(int soChan, String tapTinh, String loiSong, String ten, Date ngaySinh, String gioiTinh) {
        super(ten, ngaySinh, gioiTinh);
        this.soChan = soChan;
        this.tapTinh = tapTinh;
        this.loiSong = loiSong;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public String getTapTinh() {
        return tapTinh;
    }

    public void setTapTinh(String tapTinh) {
        this.tapTinh = tapTinh;
    }

    public String getLoiSong() {
        return loiSong;
    }

    public void setLoiSong(String loiSong) {
        this.loiSong = loiSong;
    }
    
    
    @Override
    public double tinhTuoiTho() {
        Calendar c =Calendar.getInstance();
        int namHienTai=c.get(Calendar.YEAR);//2019
        c.setTime(ngaySinh);
        int namSinh=c.get(Calendar.YEAR);//lay nam sinh
        return (namHienTai - namSinh);
    }
    
}
