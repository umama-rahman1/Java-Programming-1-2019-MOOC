/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umama
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand oneHundredthSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.oneHundredthSeconds = new ClockHand(100);

    }

    public String toString() {
        return this.seconds + ":" + this.oneHundredthSeconds;
    }
    
    public void advance() {
        this.oneHundredthSeconds.advance();
        
        if (this.oneHundredthSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
}
