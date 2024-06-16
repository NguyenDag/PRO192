/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author admin
 */
public class Java_43_Overloading {

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println(mm.timMin(5, 7));
        System.out.println(mm.timMin(5.5, 8.8));
        System.out.println(mm.tinhTong(5,8));
        double arr[] = new double[] {1,2,3,4,5};
        System.out.println(mm.tinhTong(arr));
    }
}
