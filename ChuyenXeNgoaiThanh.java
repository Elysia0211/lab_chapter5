/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuyenxe;

/**
 *
 * @author Admin
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String Noiden;
    private String Songaydiduoc;

    public ChuyenXeNgoaiThanh() {
    }

    public ChuyenXeNgoaiThanh(String Noiden, String Songaydiduoc) {
        this.Noiden = Noiden;
        this.Songaydiduoc = Songaydiduoc;
    }

    public ChuyenXeNgoaiThanh(String Noiden, String Songaydiduoc, String MaSoChuyen, String HotenTaiXe, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HotenTaiXe, SoXe, DoanhThu);
        this.Noiden = Noiden;
        this.Songaydiduoc = Songaydiduoc;
    }

    public String getNoiden() {
        return Noiden;
    }

    public String getSongaydiduoc() {
        return Songaydiduoc;
    }

    public void setNoiden(String Noiden) {
        this.Noiden = Noiden;
    }

    public void setSongaydiduoc(String Songaydiduoc) {
        this.Songaydiduoc = Songaydiduoc;
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh{" + "Noiden=" + Noiden + ", Songaydiduoc=" + Songaydiduoc + '}';
    }
    
}
