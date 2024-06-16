/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author admin
 */
public class Java_45_BtapAbstract {

    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hang1", "Viet Nam");
        HangSanXuat h2 = new HangSanXuat("Hang2", "US");
        HangSanXuat h3 = new HangSanXuat("Hang3", "Nhat Ban");
        
        PhuongTienDiChuyen p1 = new MayBay("xang", "may bay", h1);
        PhuongTienDiChuyen p2 = new XeOto("dau", "xe oto", h2);
        PhuongTienDiChuyen p3 = new XeDap("xe dap", h3);
        
        System.out.println("lay hang san xuat");
        System.out.println("p1: " + p1.layTenHangSanXuat());
    }
}
