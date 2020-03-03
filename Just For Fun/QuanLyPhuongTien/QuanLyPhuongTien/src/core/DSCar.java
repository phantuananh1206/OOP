/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DSCar {
    ArrayList<Car> cars;

    public DSCar() {
        cars = new ArrayList<>();
    }
    
    public boolean themMoi(Car car){
        return cars.add(car);
    }
    
    public boolean xoaXe(String bienSo){
        for (Car car : cars) {
            if(car.getBienSo().equalsIgnoreCase(bienSo)){
                return cars.remove(car);
            }
        }
        return false;
    }
    
    public Car capNhatXe(String bienSo){
        for (Car car : cars) {
            if(car.getBienSo().equalsIgnoreCase(bienSo)){
                return cars.get(cars.indexOf(car));
            }
        }
        return null;
    }
    public Car timKiem(String bienSo){
        for (Car car : cars) {
            if(car.getBienSo().equalsIgnoreCase(bienSo)){
                return car;
            }
        }
        return null;
    }
    
    public ArrayList<Car> danhSachXeCoGiaBanNhoHonGiaNguoiDungChiDinh(double  giaChiDinh){
        ArrayList<Car> ds = new ArrayList<>();
        for (Car car : cars) {
            if(car.getGiaGoc()<giaChiDinh){
                ds.add(car);
            }
        }
        return ds;
    }
    
    public ArrayList<Car> danhSachXe(){
        return cars;
    }
}
