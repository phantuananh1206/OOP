/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author SONY 13 PRO
 */
public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTacGia, int soTrang, String maTaiLieu, String tieuDe, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tieuDe, tenNXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
