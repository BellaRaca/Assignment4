/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

/**
 *
 * @author bellarao
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        
        // Get an object of Circle
        Shape circle = factory.getShape("Circle");
        
        // Call draw method of Circle
        String circleMessage = circle.draw();
        System.out.println(circleMessage);
        
        // Get an object of Rectangle
        Shape rectangle = factory.getShape("Rectangle");
        
        // Call draw method of Rectangle
        String rectangleMessage = rectangle.draw();
        System.out.println(rectangleMessage);
        
        // Get an object of Square
        Shape square = factory.getShape("Square");
        
        // Call draw method of Square
        String squareMessage = square.draw();
        System.out.println(squareMessage);
    }

}
