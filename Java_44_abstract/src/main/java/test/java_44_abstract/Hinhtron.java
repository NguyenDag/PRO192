/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java_44_abstract;

/**
 *
 * @author admin
 */
public class Hinhtron extends Hinh{
    private double r;

    public Hinhtron(double r, ToaDo toaDo) {
        super(toaDo);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * this.r * this.r;
    }
    
    
}
