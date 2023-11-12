/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bellarao
 * A JUnit test class to test the class SingleObject.
 */
public class SingleObjectTest {
    
    @Test
    public void testShowMyIdentity() {
        // Test setup
        SingleObject object = SingleObject.getInstance();
        // Get identity
        String identity = object.showMyIdentity();
        // Verify identity
        assertEquals("I'm instance one", identity);
    }
}
