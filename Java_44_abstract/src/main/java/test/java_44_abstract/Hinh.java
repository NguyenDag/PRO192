/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java_44_abstract;

/**
 *
 * @author admin
 */
public abstract class Hinh {
    protected ToaDo toaDo;
    
    public Hinh(ToaDo toaDo){
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }
    
    public abstract double tinhDienTich();
}
