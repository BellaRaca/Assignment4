/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

/**
 *
 * @author bellarao
 */
public class MoveBackward extends RoverState {

    public MoveBackward() {
        this.internalState = RoverState.State.MOVE_BACKWARD;
        this.subState = RoverState.SubState.ACCELERATE;
    }

    /**
     * Press right pedal once.
     *
     * @param numOfTimesPressed Use to get how many times the right pedal is
     * pressed. If numOfTimesPressed is 1, decelerate the rover. If
     * numOfTimesPressed is 2, stop the rover.
     * @return whether the operation take any effect or not.
     */
    @Override
    public Boolean pressRightPedal(int numOfTimesPressed) {
        return numOfTimesPressed == 1 || numOfTimesPressed == 2;
    }

    /**
     * Press right pedal for a certain number of seconds.
     *
     * @param numOfSecondsPressed Use to get how many seconds the right pedal is
     * pressed. If numOfSecondsPressed is equal to or more than 3 seconds,
     * switch to constant mode.
     * @return whether the operation take any effect or not.
     */
    @Override
    protected Boolean pressRightPedalForTime(int numOfSecondsPressed) {
        return numOfSecondsPressed >= 3;
    }

    /**
     * Press left pedal once.
     *
     * @param numOfTimesPressed Use to get how many times the left pedal is
     * pressed. If numOfTimesPressed is 1, accelerate the rover.
     * @return whether the operation take any effect or not.
     */
    @Override
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return numOfTimesPressed == 1;
    }
}
