/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

/**
 * Moon Rover class.
 * @author bellarao
 */
public class MoonRover {

    private RoverState currentState;

    public MoonRover() {
        currentState = new AtRestState();
        printStateAndSubState();
    }
    
    /**
     * Press left pedal.
     *
     * @param numOfTimesPressed Use to get how many times the left pedal is
     * pressed.
     */
    public void pressLeftPedal(int numOfTimesPressed) {
        this.currentState = currentState.pressLeftPedal(numOfTimesPressed);
        printStateAndSubState();
    }

    /**
     * Press left pedal for a certain number of seconds.
     *
     * @param numOfSecondsPressed Use to get how many seconds the left pedal is
     * pressed.
     */
    public void pressLeftPedalForTime(int numOfSecondsPressed) {
        this.currentState = currentState.pressLeftPedalForTime(numOfSecondsPressed);
        printStateAndSubState();
    }

    /**
     * Press right pedal.
     *
     * @param numOfTimesPressed Use to get how many times the right pedal is
     * pressed
     */
    public void pressRightPedal(int numOfTimesPressed) {
        this.currentState = currentState.pressRightPedal(numOfTimesPressed);
        printStateAndSubState();
    }

    /**
     * Press right pedal for a certain number of seconds.
     *
     * @param numOfSecondsPressed Use to get how many seconds the right pedal is
     * pressed
     */
    public void pressRightPedalForTime(int numOfSecondsPressed) {
        this.currentState = this.currentState.pressRightPedalForTime(numOfSecondsPressed);
        printStateAndSubState();
    }

    private void printStateAndSubState() {
        System.out.println(this.currentState.getStateName());
    }
    
    public RoverState getCurrentState() {
      return this.currentState;
    }

    public static void main(String[] args) {
        MoonRover rover = new MoonRover();

        // Move Forward State 
        rover.pressLeftPedal(1); // Move Forward - Accelerate
        rover.pressRightPedal(1); // Move Forward - Decelerate
        rover.pressLeftPedal(1); // Move Forward - Accelerate
        rover.pressRightPedal(3); // No effect. Move Forward - Accelerate
        rover.pressLeftPedal(2); // No effect. Move Forward - Accelerate
        rover.pressRightPedalForTime(3); // Move Forward - Constant speed

        rover.pressRightPedal(2); // Transition to at rest.

        // Move Backward State
        rover.pressLeftPedalForTime(3); // Move Backward - Accelerate
        rover.pressRightPedal(1); // Move Backward - Decelerate
        rover.pressLeftPedal(1); // Move Backward - Accelerate
        rover.pressRightPedal(3); // No effect. Move Backward - Accelerate
        rover.pressLeftPedal(2); // No effect. Move Backward - Accelerate
        rover.pressLeftPedalForTime(3); // No effect. Move Backward - Accelerate
        rover.pressRightPedalForTime(3); // Move Backward - Constant speed

        rover.pressRightPedal(2); // Transition to at rest.
    }
}
