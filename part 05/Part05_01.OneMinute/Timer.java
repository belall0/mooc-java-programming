/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abuelela
 */
public class Timer {

    ClockHand seconds;
    ClockHand hundredths;

    public Timer() {
        seconds = new ClockHand(60);
        hundredths = new ClockHand(100);
    }

    public String toString() {
        String secStr;
        String hundStr;
        if (seconds.value() < 10) {
            secStr = "0" + seconds.value();
        } else {
            secStr = "" + seconds.value();
        }

        if (hundredths.value() < 10) {
            hundStr = "0" + hundredths.value();
        } else {
            hundStr = "" + hundredths.value();
        }

        return secStr + ":" + hundStr;
    }

    public void advance() {
        hundredths.advance();

        if (hundredths.value() == 0) {
            seconds.advance();
        }
    }

}
