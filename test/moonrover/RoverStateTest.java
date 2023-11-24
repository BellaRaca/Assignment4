/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author bellarao
 */
public class RoverStateTest {

    private RoverState roverState;
    private static final String EXPECTED_STATE_NAME = "InternalState: DEFAULT_AT_REST, SubState: DEFAULT_NONE_AT_REST";

    @Before
    public void setUp() {
        roverState = new RoverState();
    }
    
    @Test
    public void testAllFunctionalities() {
      assertEquals(roverState.pressLeftPedal(1).getStateName(), EXPECTED_STATE_NAME);
      assertEquals(roverState.pressLeftPedalForTime(3).getStateName(), EXPECTED_STATE_NAME);
      assertEquals(roverState.pressRightPedal(1).getStateName(), EXPECTED_STATE_NAME);
      assertEquals(roverState.pressRightPedalForTime(3).getStateName(), EXPECTED_STATE_NAME);
      assertEquals(roverState.pressLeftPedal(3).getStateName(), EXPECTED_STATE_NAME);
      assertEquals(roverState.pressLeftPedalForTime(1).getStateName(), EXPECTED_STATE_NAME);
      assertEquals(roverState.pressRightPedal(3).getStateName(), EXPECTED_STATE_NAME);
      assertEquals(roverState.pressRightPedalForTime(1).getStateName(), EXPECTED_STATE_NAME);
      assertEquals(roverState.getStateName(), EXPECTED_STATE_NAME);
    }
}
