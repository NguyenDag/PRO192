/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java_42_overriding;

/**
 *
 * @author admin
 */
public class Cat extends Animal{

    public Cat() {
        super("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }

    @Override
    public void eat() {
        System.out.println("Toi thich ca");
    }
    
}
