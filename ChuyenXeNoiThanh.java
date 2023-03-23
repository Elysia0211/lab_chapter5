/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuyenxe;

/**
 *
 * @author Admin
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
    private double Sotuyen;
    private double Sokmdiduoc= 100;

    public ChuyenXeNoiThanh() {
    }

    public ChuyenXeNoiThanh(double Sotuyen, double Sokmdiduoc) {
        this.Sotuyen = Sotuyen;
        this.Sokmdiduoc = Sokmdiduoc;
    }

    public ChuyenXeNoiThanh(double Sotuyen, double Sokmdiduoc, String MaSoChuyen, String HotenTaiXe, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HotenTaiXe, SoXe, DoanhThu);
        this.Sotuyen = Sotuyen;
        this.Sokmdiduoc = Sokmdiduoc;
    }

    public double getSotuyen() {
        return Sotuyen;
    }

    public double getSokmdiduoc() {
        return Sokmdiduoc;
    }

    public void setSotuyen(double Sotuyen) {
        this.Sotuyen = Sotuyen;
    }

    public void setSokmdiduoc(double Sokmdiduoc) {
        this.Sokmdiduoc = Sokmdiduoc;
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" + "Sotuyen=" + Sotuyen + ", Sokmdiduoc=" + Sokmdiduoc + '}';
    }

    
    
}
