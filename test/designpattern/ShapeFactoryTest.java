/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *A JUnit test class to test the class ShapeFactory.
 * @author bellarao
 */
public class ShapeFactoryTest {
    private ShapeFactory shapeFactory;
    
    @Before
    public void setUp() {
      shapeFactory = new ShapeFactory();
    }
    
    @Test
    public void testDrawCircle() {
      assertEquals("Circle", shapeFactory.getShape("Circle").draw());
    }
    
    @Test
    public void testDrawRectangle() {
      assertEquals("Rectangle", shapeFactory.getShape("Rectangle").draw());
    }
    
    @Test
    public void testDrawSquare() {
      assertEquals("Square", shapeFactory.getShape("Square").draw());
    }
    
    @Test
    public void testNoShapeTypeProvided() {
      assertNull(shapeFactory.getShape(null));
    }
    
    @Test
    public void testInvalidShapeType() {
      assertNull(shapeFactory.getShape("test"));
    }
}
