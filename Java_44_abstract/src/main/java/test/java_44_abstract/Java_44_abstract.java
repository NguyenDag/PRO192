/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.java_44_abstract;

/**
 *
 * @author admin
 */
public class Java_44_abstract {

    public static void main(String[] args) {
        ToaDo td1 = new  ToaDo(5, 6);
        ToaDo td2 = new  ToaDo(10, 15);
        ToaDo td3 = new  ToaDo(20, 11);
        
//        Hinh h =new Hinh(td3); => loi
        Hinh h1 = new Diem(td1);
        Hinh h2 = new Hinhtron(10, td2);
        Hinh h3 = new HinhChuNhat(3, 10, td3);
        
        System.out.println("DT1: " + h1.tinhDienTich());
        System.out.println("DT2: " + h2.tinhDienTich());
        System.out.println("DT3: " + h3.tinhDienTich());
    }
}
