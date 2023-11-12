/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

/**
 *
 * @author bellarao
 */
public class SingleObject {
    // Identity of this object
    private String identity = "";
    //create an object of SingleObect
    private static SingleObject instance = new SingleObject("I'm instance one");

    //make the constructor private so that this class cannot be 
    //instantiated
    private SingleObject(String identity) {
        this.identity = identity;
    }

    //Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    // Show the identity of this class
    public String showMyIdentity() {
        return identity;
    }
}
