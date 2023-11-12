/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

/**
 *
 * @author bellarao
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        
       //Get the only object availbel 
       SingleObject object = SingleObject.getInstance();
       
       //Get the Identity
       String identity = object.showMyIdentity();
       System.out.println(identity);
    }
    
}