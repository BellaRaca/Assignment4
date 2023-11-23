/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

/**
 * Rover has three main states and the transition between different states
 * follow the following rules: 1. When the left pedal was pressed once it
 * accelerates the buggy forward. 2. If accelerating forward and you press right
 * pedal once, it decelerates. 3. To achieve constant forward speed press the
 * right pedal for more than 3 seconds. 4. If the buggy is at rest and the left
 * pedal is pressed for more than 3 seconds, it will accelerate backwards. 5. If
 * right pedal is pressed twice at once, switch the state to at rest.
 *
 * Left pedal is responsible for: 1. Accelerate. (pressed once) 2. Change from
 * At Rest to moving backward. (pressed for more than 3 seconds)
 *
 * Right pedal is responsible for: 1. Decelerate (pressed once) 2. Change to
 * constant speed (pressed for more than 3 seconds) 3. Change to at rest state
 * (pressed twice)
 *
 * @author bellarao
 */
public class RoverState {

    enum State {
        DEFAULT_AT_REST,
        MOVE_FORWARD,
        MOVE_BACKWARD,
    }

    enum SubState {
        DEFAULT_NONE_AT_REST,
        CONSTANT,
        ACCELERATE,
        DECELERATE,
    }

    protected RoverState.State internalState = State.DEFAULT_AT_REST;
    protected RoverState.SubState subState = SubState.DEFAULT_NONE_AT_REST;

    public RoverState() {
    }

    /**
     * Press right pedal.
     *
     * @param numOfTimesPressed Use to get how many times the right pedal is
     * pressed
     * @return whether the operation take any effect or not.
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        return false;
    }

    /**
     * Press right pedal for a certain number of seconds.
     *
     * @param numOfSecondsPressed Use to get how many seconds the right pedal is
     * pressed
     * @return whether the operation take any effect or not.
     */
    protected Boolean pressRightPedalForTime(int numOfSecondsPressed) {
        return false;
    }

    /**
     * Press left pedal.
     *
     * @param numOfTimesPressed Use to get how many times the left pedal is
     * pressed
     * @return whether the operation take any effect or not.
     */
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return false;
    }

    /**
     * Press left pedal for a certain number of seconds.
     *
     * @param numOfSecondsPressed Use to get how many seconds the right pedal is
     * pressed
     * @return whether the operation take any effect or not.
     */
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return false;
    }

    /**
     * Get the name of the current state.
     *
     * @return the name of the state.
     */
    public String getStateName() {
        return String.format("InternalState: %s, SubState: %s", internalState.name(), subState.name());
    }
}
