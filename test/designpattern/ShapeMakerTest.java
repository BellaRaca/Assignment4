/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author bellarao
 */
public class ShapeMakerTest {
    private ShapeMaker shapeMaker;
    
    @Before
    public void setUp () {
        shapeMaker = new ShapeMaker();
    }
    
    @Test
    public void testDrawCircle() {
        assertEquals("Circle", shapeMaker.drawCircle());
    }
    
    @Test
    public void testDrawRectangle() {
        assertEquals("Rectangle", shapeMaker.drawRectangle());
    }
    
    @Test
    public void testDrawSquare() {
        assertEquals("Square", shapeMaker.drawSquare());
    }
}
