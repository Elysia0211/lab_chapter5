/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuyenxe;

/**
 *
 * @author Admin
 */
public class ChuyenXe {
    private String MaSoChuyen;
    private String HotenTaiXe;
    private String SoXe;
    private double DoanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String MaSoChuyen, String HotenTaiXe, String SoXe, double DoanhThu) {
        this.MaSoChuyen = MaSoChuyen;
        this.HotenTaiXe = HotenTaiXe;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }
    

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public String getHotenTaiXe() {
        return HotenTaiXe;
    }

    public String getSoXe() {
        return SoXe;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }

    public void setHotenTaiXe(String HotenTaiXe) {
        this.HotenTaiXe = HotenTaiXe;
    }

    public void setSoXe(String SoXe) {
        this.SoXe = SoXe;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" + "MaSoChuyen=" + MaSoChuyen + ", HotenTaiXe=" + HotenTaiXe + ", SoXe=" + SoXe + ", DoanhThu=" + DoanhThu + '}';
    }
    
}
