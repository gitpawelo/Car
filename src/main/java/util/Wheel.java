package util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Wheel {

    private String position;
    private boolean isFrontWheels;
    private double diameter;


    public double currentSpeed(int currentRpm) {

        return 2 * Math.PI * diameter * (currentRpm / 5000.0);
    }

    public void turnForward(Engine engine) {

        System.out.printf("%s %s koło: kręcę do przodu! Aktualna prędkość: %.2f km/h!\n",
                position, (isFrontWheels ? "przednie" : "tylne"), //to tzw. wyrażenie warunkowe - działa dokładnie jak if/else
                currentSpeed(engine.getCurrentRpm()));
    }

    public void turnBackward() {

        System.out.printf("%s %s koło: kręcę do tyłu!\n",
                position, (isFrontWheels ? "przednie" : "tylne"));
    }

    public void turn(String direction) {

        if (isForward()) {
            System.out.printf("%s %s koło: skręcam w %s\n",
                    position, (isFrontWheels ? "przednie" : "tylnie"), direction);
        }
    }

    public boolean isForward() {
        return isFrontWheels;
    }


}
