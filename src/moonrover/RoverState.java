/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

/**
 * Rover has four states and the transition between different states follow the
 * following rules: 1. When the left pedal was pressed once it accelerates the
 * buggy forward. 2. If accelerating forward and you press right pedal once, it
 * decelerates. 3. To achieve constant forward speed press the right pedal for
 * more than 3 seconds. 4. If the buggy is at rest and the left pedal is pressed
 * for more than 3 seconds, it will accelerate backwards.
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
        ACCELARATE,
        DECELARATE,
    }

    protected RoverState.State internalState = State.DEFAULT_AT_REST;
    protected RoverState.SubState subState = SubState.DEFAULT_NONE_AT_REST;

    public RoverState() {
    }

    /**
     * Press right pedal once.
     *
     * @return whether the operation take any effect or not.
     */
    public Boolean pressRightPedalOnce() {
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
     * Press left pedal once.
     *
     * @return whether the operation take any effect or not.
     */
    protected Boolean pressLeftPedalOnce() {
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
    protected String getStateName() {
        return String.format("InternalState: %s, SubState: %s", internalState.name(), subState.name());
    }
}
