/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java_42_overriding;

/**
 *
 * @author admin
 */
public class Dog extends Animal{

    
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("gau gau");
    }

    @Override
    public void eat() {
        System.out.println("Toi an xuong");
    }
    
}
