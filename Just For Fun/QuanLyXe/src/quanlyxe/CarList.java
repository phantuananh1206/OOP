/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyxe;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CarList {
    ArrayList<Car> cars ;
    public CarList() {
        cars = new ArrayList<>();
    }
    
    public boolean themMoi(Car carcar){
        return cars.add(carcar);
    }
    
    public boolean xoa(String bienSoXe){
        for (Car car : cars) {
            if (car.getBienSo().equalsIgnoreCase(bienSoXe)){
                return cars.remove(car);
            }
        }
        return false;
    } 
//        public Car capNhat (String bienSoXe){
//        for (Car car : cars) {
//            if (car.getBienSo().equalsIgnoreCase(bienSoXe)){
//                return car;
//            }
//        }
//        return null;
//    }
        public void capNhat (int stt, Car car){
            cars.set(stt, car);
        }
        
    public Car timKiem(String bienSoXe){
        for (Car car : cars) {
            if (car.getBienSo().equalsIgnoreCase(bienSoXe)){
                return car;
            }
        }
        return null;
    }
    
    public ArrayList<Car> layDanhSach(){
        return cars;
    }
    
    public ArrayList<Car> lietKeDanhSach(String giaChiDinh){
        ArrayList<Car> danhSachMoi = new ArrayList<>();
        for (Car car : cars) {
            if (car.tinhGiaXe() < Double.parseDouble(giaChiDinh)){
                danhSachMoi.add(car);
            }
        }
        return danhSachMoi;
    }
    
}
