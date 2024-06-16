/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    
    public void catCanh(){
        
    }
    
    public void haCanh(){
        
    }

    @Override
    public double layVanToc() {
        System.out.println("Van toc la: ");
        return 100;
    }
    
    
}
