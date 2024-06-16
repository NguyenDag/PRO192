/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java_42_overriding;

/**
 *
 * @author admin
 */
public class Animal {
    protected String nameString;

    public Animal() {
    }

    public Animal(String nameString) {
        this.nameString = nameString;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }
  
    public void eat(){
        System.out.println("Toi dang an ... ");
    }
    
    public void makeSound(){
        System.out.println(".........");
    }
}
