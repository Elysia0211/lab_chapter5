/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuyenxe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ChuyenXeNoiThanh> arrChuyenXeNoiThanh = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> arrChuyenXeNgoaiThanh = new ArrayList<>();
        int soChuyenNoiThanh;
        int soChuyuenNgoaiThanh;
        double doanhThuNoiThanh = 0;
        double doanhThuNgoaiThanh = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chuyến xe nội thành: ");
        soChuyenNoiThanh = scanner.nextInt();
        System.out.print("Nhập số chuyến xe ngoại thành: ");
        int soChuyenNgoaiThanh = scanner.nextInt();
         
        System.out.println("Nhập thông tin chuyến xe nội thành:");
        for (int i = 0; i < soChuyenNoiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            chuyenXeNoiThanh.nhapThongTinChuyenXe();
            doanhThuNoiThanh += chuyenXeNoiThanh.getDoanhThu();
            arrChuyenXeNoiThanh.add(chuyenXeNoiThanh);
        }
         
        System.out.println("Nhập thông tin chuyến xe ngoại thành:");
        for (int i = 0; i < soChuyenNgoaiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            chuyenXeNgoaiThanh.nhapThongTinChuyenXe();
            doanhThuNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
            arrChuyenXeNgoaiThanh.add(chuyenXeNgoaiThanh);
        }
         
        System.out.println("nội thành");
        for (int i = 0; i < arrChuyenXeNoiThanh.size(); i++) {
            System.out.println(arrChuyenXeNoiThanh.get(i).toString());
        }
         
        System.out.println(" ngoại thành");
        for (int i = 0; i < arrChuyenXeNgoaiThanh.size(); i++) {
            System.out.println(arrChuyenXeNgoaiThanh.get(i).toString());
        }
         
        System.out.println("Doanh thu từng chuyến xe: ");
        System.out.println("Doanh thu chuyến xe nội thành: " + doanhThuNoiThanh);
        System.out.println("Doanh thu chuyến xe ngoại thành: " + doanhThuNgoaiThanh);
    }
 
}
        
    }
    
}
