/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

/**
 * Represents Rover's at rest state.
 *
 * @author bellarao
 */
public class AtRestState extends RoverState {

    public AtRestState() {
        this.internalState = RoverState.State.DEFAULT_AT_REST;
        this.subState = RoverState.SubState.DEFAULT_NONE_AT_REST;
    }

    /**
     * Press left pedal.
     *
     * @param numOfTimesPressed Use to get how many times the left pedal is
     * pressed. If numOfTimesPressed is 1, accelerate the rover forward.
     * @return whether the operation take any effect or not.
     */
    @Override
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return numOfTimesPressed == 1;
    }

    /**
     * Press left pedal for a certain number of seconds.
     *
     * @param numOfSecondsPressed Use to get how many seconds the right pedal is
     * pressed. If numOfSecondsPressed >= 3, accelerate rover backward.
     * @return whether the operation take any effect or not.
     */
    @Override
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return numOfSecondsPressed >= 3;
    }
}
