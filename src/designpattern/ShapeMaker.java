/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

/**
 * Create the shape of circle, rectangle, and square.
 *
 * @author bellarao
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    // The constructor of ShapeMaker.
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    // Draw Circle.
    public String drawCircle() {
        String drawMessage = circle.draw();
        //Get drawMessage.
        System.out.println(drawMessage);
        //Return the class drawMessage.
        return drawMessage;
    }

    // Draw Rectangle.
    public String drawRectangle() {
        //Get drawMessage
        String drawMessage = rectangle.draw();
        System.out.println(drawMessage);
        //Return the class drawMessage.
        return drawMessage;
    }

    // Draw Square.
    public String drawSquare() {
        String drawMessage = square.draw();
        System.out.println(drawMessage);
        return drawMessage;
    }
}
