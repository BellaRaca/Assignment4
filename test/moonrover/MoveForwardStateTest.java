/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Tests for MoveForwardState's functionalities.
 *
 * @author bellarao
 */
public class MoveForwardStateTest {

    private RoverState roverState;
    private static final String AT_REST_STATE_NAME = "InternalState: DEFAULT_AT_REST, SubState: DEFAULT_NONE_AT_REST";
    private static final String MOVE_FORWARD_ACCELERATE_STATE_NAME = "InternalState: MOVE_FORWARD, SubState: ACCELERATE";
    private static final String MOVE_FORWARD_DECELERATE_STATE_NAME = "InternalState: MOVE_FORWARD, SubState: DECELERATE";
    private static final String MOVE_FORWARD_CONSTANT_STATE_NAME = "InternalState: MOVE_FORWARD, SubState: CONSTANT";

    @Before
    public void setUp() {
        roverState = new MoveForwardState();
    }

    @Test
    public void testInitialState_atRestState() {
        assertEquals(roverState.getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
    }

    @Test
    public void testPressLeftPedal_pressedNotOnce_noEffect() {
        assertEquals(roverState.pressLeftPedal(0).getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
    }

    @Test
    public void testPressLeftPedal_pressedOnce_alreadyAccelerating_noEffect() {
        assertEquals(roverState.pressLeftPedal(1).getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
    }

    @Test
    public void testPressLeftPedal_pressedOnce_currentConstant_changeToAccelerating() {
        roverState = roverState.pressRightPedalForTime(3);
        assertEquals(roverState.pressLeftPedal(1).getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
    }

    @Test
    public void testPressLeftPedal_pressedOnce_currentDecelerating_changeToAccelerating() {
        roverState = roverState.pressRightPedal(1);
        assertEquals(roverState.pressLeftPedal(1).getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
    }

    @Test
    public void testPressLeftPedalForTime_currentForward_pressedNoLessThanThreeSeconds_noEffect() {
        assertEquals(roverState.pressLeftPedalForTime(3).getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
    }

    @Test
    public void testPressRightPedal_currentDecelerating_noEffect() {
        roverState = roverState.pressRightPedal(1);
        assertEquals(roverState.pressRightPedal(1).getStateName(), MOVE_FORWARD_DECELERATE_STATE_NAME);
    }

    @Test
    public void testPressRightPedal_currentAccelerating_pressedNotOnceNorTwice_noEffect() {
        assertEquals(roverState.pressRightPedal(3).getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
    }

    @Test
    public void testPressRightPedal_currentAccelerating_pressedOnce_changeToDeceleratingState() {
        assertEquals(roverState.pressRightPedal(1).getStateName(), MOVE_FORWARD_DECELERATE_STATE_NAME);
    }

    @Test
    public void testPressRightPedal_currentAccelerating_pressedTwice_changeToAtRestState() {
        assertEquals(roverState.pressRightPedal(2).getStateName(), AT_REST_STATE_NAME);
    }

    @Test
    public void testPressRightPedalForTime_lessThanThreeSeconds_noEffect() {
        assertEquals(roverState.pressRightPedalForTime(2).getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
    }

    @Test
    public void testPressRightPedalForTime_noLessThanThreeSeconds_changeToConstantSpeed() {
        assertEquals(roverState.pressRightPedalForTime(3).getStateName(), MOVE_FORWARD_CONSTANT_STATE_NAME);
    }
}
