/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java_44_abstract;

/**
 *
 * @author admin
 */
public class HinhChuNhat extends Hinh {

    private double chieuRong, chieuCao;

    public HinhChuNhat(double chieuRong, double chieuCao, ToaDo toaDo) {
        super(toaDo);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuCao * this.chieuRong;
    }

}
