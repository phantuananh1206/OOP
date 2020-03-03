
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY 13 PRO
 */
public class NhanVienBienChe extends NhanVien{
    private float HSL;
    public static float LUONG_TOI_THIEU=1150000;

    public NhanVienBienChe() {
    }

    public NhanVienBienChe(float HSL, String CMND, String hoTen, String phongBan, Date ngayVaoLam) {
        super(CMND, hoTen, phongBan, ngayVaoLam);
        this.HSL = HSL;
    }

    public float getHSL() {
        return HSL;
    }

    public void setHSL(float HSL) {
        this.HSL = HSL;
    }
    //cai de 

    @Override
    public float tinhLuong() {
        return tinhPhuCap()+(HSL*LUONG_TOI_THIEU);
    }

    @Override
    public float tinhPhuCap() {
        //lay ngay gio he thong ngay/gio/phut/giay...
        Calendar c=Calendar.getInstance();
        int namHienTai=c.get(Calendar.YEAR);//2019
        c.setTime(ngayVaoLam);
        int namVaoLam=c.get(Calendar.YEAR);//lay nam vao lam
        return (namHienTai-namVaoLam)*200000;
    }
    
}
