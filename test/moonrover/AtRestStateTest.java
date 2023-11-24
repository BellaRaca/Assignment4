/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Tests to test MoonRover's AtRestState.
 *
 * @author bellarao
 */
public class AtRestStateTest {

    private RoverState roverState;
    private static final String DEFAULT_STATE_NAME = "InternalState: DEFAULT_AT_REST, SubState: DEFAULT_NONE_AT_REST";
    private static final String MOVE_FORWARD_STATE_NAME = "InternalState: MOVE_FORWARD, SubState: ACCELERATE";
    private static final String MOVE_BACKWARD_STATE_NAME = "InternalState: MOVE_BACKWARD, SubState: ACCELERATE";

    @Before
    public void setUp() {
        roverState = new AtRestState();
    }

    @Test
    public void testInitialState_atRestState() {
        assertEquals(roverState.getStateName(), DEFAULT_STATE_NAME);
    }

    @Test
    public void testPressLeftPedal_pressedNotOnce_noEffect() {
        assertEquals(roverState.pressLeftPedal(0).getStateName(), DEFAULT_STATE_NAME);
    }

    @Test
    public void testPressLeftPedal_pressedOnce_changeToMoveForwardState() {
        assertEquals(roverState.pressLeftPedal(1).getStateName(), MOVE_FORWARD_STATE_NAME);
    }

    @Test
    public void testPressLeftPedalForTime_pressedLessThanThreeSeconds_noEffect() {
        assertEquals(roverState.pressLeftPedalForTime(0).getStateName(), DEFAULT_STATE_NAME);
    }

    @Test
    public void testPressLeftPedalForTime_pressedNoLessThanThreeSeconds_changeToMoveBackwardState() {
        assertEquals(roverState.pressLeftPedalForTime(3).getStateName(), MOVE_BACKWARD_STATE_NAME);
    }

    @Test
    public void testPressRightPedal_noEffect() {
        assertEquals(roverState.pressRightPedal(1).getStateName(), DEFAULT_STATE_NAME);
    }

    @Test
    public void testPressRightPedalForTime_noEffect() {
        assertEquals(roverState.pressRightPedalForTime(3).getStateName(), DEFAULT_STATE_NAME);
    }

}
