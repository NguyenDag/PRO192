/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.java_42_overriding;

/**
 *
 * @author admin
 */
public class Java_42_Overriding {

    public static void main(String[] args) {
        System.out.println("Test dog");
        Dog d = new Dog();
        d.eat();
        d.makeSound();
        System.out.println("--------------");
        System.out.println("Test cat");
        Cat c = new Cat();
        c.eat();
        c.makeSound();
        
    }
}
