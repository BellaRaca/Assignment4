/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Test MoonRover's functionality
 *
 * @author bellarao
 */
public class MoonRoverTest {

    private static final String AT_REST_STATE_NAME = "InternalState: DEFAULT_AT_REST, SubState: DEFAULT_NONE_AT_REST";
    private static final String MOVE_FORWARD_ACCELERATE_STATE_NAME = "InternalState: MOVE_FORWARD, SubState: ACCELERATE";
    private static final String MOVE_FORWARD_DECELERATE_STATE_NAME = "InternalState: MOVE_FORWARD, SubState: DECELERATE";
    private static final String MOVE_FORWARD_CONSTANT_STATE_NAME = "InternalState: MOVE_FORWARD, SubState: CONSTANT";
    private static final String MOVE_BACKWARD_ACCELERATE_STATE_NAME = "InternalState: MOVE_BACKWARD, SubState: ACCELERATE";
    private static final String MOVE_BACKWARD_DECELERATE_STATE_NAME = "InternalState: MOVE_BACKWARD, SubState: DECELERATE";
    private static final String MOVE_BACKWARD_CONSTANT_STATE_NAME = "InternalState: MOVE_BACKWARD, SubState: CONSTANT";

    private MoonRover rover;

    @Before
    public void setUp() {
        rover = new MoonRover();
    }

    @Test
    public void testAllFunctionailities() {
        // Initial state
        assertEquals(rover.getCurrentState().getStateName(), AT_REST_STATE_NAME);

        // Move Forward State 
        rover.pressLeftPedal(1); // Move Forward - Accelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
        rover.pressRightPedal(1); // Move Forward - Decelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_FORWARD_DECELERATE_STATE_NAME);
        rover.pressLeftPedal(1); // Move Forward - Accelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
        rover.pressRightPedal(3); // No effect. Move Forward - Accelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
        rover.pressLeftPedal(2); // No effect. Move Forward - Accelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_FORWARD_ACCELERATE_STATE_NAME);
        rover.pressRightPedalForTime(3); // Move Forward - Constant speed
        assertEquals(rover.getCurrentState().getStateName(), MOVE_FORWARD_CONSTANT_STATE_NAME);

        rover.pressRightPedal(2); // Transition to at rest.
        assertEquals(rover.getCurrentState().getStateName(), AT_REST_STATE_NAME);

        // Move Backward State
        rover.pressLeftPedalForTime(3); // Move Backward - Accelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_BACKWARD_ACCELERATE_STATE_NAME);
        rover.pressRightPedal(1); // Move Backward - Decelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_BACKWARD_DECELERATE_STATE_NAME);
        rover.pressLeftPedal(1); // Move Backward - Accelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_BACKWARD_ACCELERATE_STATE_NAME);
        rover.pressRightPedal(3); // No effect. Move Backward - Accelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_BACKWARD_ACCELERATE_STATE_NAME);
        rover.pressLeftPedal(2); // No effect. Move Backward - Accelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_BACKWARD_ACCELERATE_STATE_NAME);
        rover.pressLeftPedalForTime(3); // No effect. Move Backward - Accelerate
        assertEquals(rover.getCurrentState().getStateName(), MOVE_BACKWARD_ACCELERATE_STATE_NAME);
        rover.pressRightPedalForTime(3); // Move Backward - Constant speed
        assertEquals(rover.getCurrentState().getStateName(), MOVE_BACKWARD_CONSTANT_STATE_NAME);

        rover.pressRightPedal(2); // Transition to at rest.
        assertEquals(rover.getCurrentState().getStateName(), AT_REST_STATE_NAME);
    }
}
