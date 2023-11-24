/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

/**
 * Represents Rover's MOVE_FORWARD state.
 *
 * @author bellarao
 */
public class MoveForwardState extends RoverState {

    public MoveForwardState() {
        this.internalState = RoverState.State.MOVE_FORWARD;
        this.subState = RoverState.SubState.ACCELERATE;
    }

    /**
     * Press right pedal.
     *
     * @param numOfTimesPressed Use to get how many times the right pedal is
     * pressed. If numOfTimesPressed is 1, decelerate the rover. If
     * numOfTimesPressed is 2, stop the rover.
     * @return the latest state.
     */
    @Override
    public RoverState pressRightPedal(int numOfTimesPressed) {
        if (numOfTimesPressed == 1) {
          subState = RoverState.SubState.DECELERATE;
          return this;
        }
        return numOfTimesPressed == 2 ? new AtRestState() : this;
    }

    /**
     * Press right pedal for a certain number of seconds.
     *
     * @param numOfSecondsPressed Use to get how many seconds the right pedal is
     * pressed. If numOfSecondsPressed is equal to or more than 3 seconds,
     * switch to constant mode.
     * @return the latest state.
     */
    @Override
    protected RoverState pressRightPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed >= 3) {
         subState = SubState.CONSTANT;
        }
        return this;
    }

    /**
     * Press left pedal.
     *
     * @param numOfTimesPressed Use to get how many times the left pedal is
     * pressed. If numOfTimesPressed is 1, accelerate the rover.
     * @return the latest state.
     */
    @Override
    protected RoverState pressLeftPedal(int numOfTimesPressed) {
        if (numOfTimesPressed == 1) {
          subState = SubState.ACCELERATE;
        }
        return this;
    }
}
