
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
public class NhanVienHopDong extends NhanVien {

    private int tongGioLam;
    private float tienCongMotGio;

    public NhanVienHopDong(int tongGioLam, float tienCongMotGio, String CMND, String hoTen, String phongBan, Date ngayVaoLam) {
        super(CMND, hoTen, phongBan, ngayVaoLam);
        this.tongGioLam = tongGioLam;
        this.tienCongMotGio = tienCongMotGio;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }

    public float getTienCongMotGio() {
        return tienCongMotGio;
    }

    public void setTienCongMotGio(float tienCongMotGio) {
        this.tienCongMotGio = tienCongMotGio;
    }

    public NhanVienHopDong() {
    }

    @Override
    public float tinhPhuCap() {
        if (tongGioLam > 170) {
            return 200000;
        } else if (tongGioLam > 80) {
            return 100000;
        } else {
            return 0;
        }
    }

    @Override
    public float tinhLuong() {
        return tinhPhuCap()+(tongGioLam*tienCongMotGio);
    }

}
