/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

/**
 *
 * @author bellarao
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        //Create a new ShapeMaker
        ShapeMaker shapeMaker = new ShapeMaker();

        //Draw circle, rectangle, and square
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
