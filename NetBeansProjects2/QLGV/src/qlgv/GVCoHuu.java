/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgv;


import java.util.Date;

/**
 *
 * @author Sun
 */
public class GVCoHuu extends GiangVien{
    private  Date ngayVao ;
    private  double luongCB;
  
    public GVCoHuu() {
    }

    public GVCoHuu(Date ngayVao, double luongCB, String ma, String hoTen, int soGio, boolean phai) {
        super(ma, hoTen, soGio, phai);
        this.ngayVao = ngayVao;
        this.luongCB = luongCB;
    }

   

    public Date getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(Date   ngayVao) {
        this.ngayVao = ngayVao;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
  
 
   
   
    @Override
    public double luong() {
      return  luongGV = (soGio*donGia)+luongCB;
    }

    @Override
    public double phuCap() {
         Date date = new Date();
        int soNam = (int) ( (date.getTime() - ngayVao.getTime())/(365*24*60*60*1000) ) ;
        return  phucap=  soNam*50000 ; 
        }

    }
    

