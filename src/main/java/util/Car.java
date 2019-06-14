package util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Car {

    private String model;
    private Wheel[] array;
    private Engine engine;


    public void turnOnCar(){

        System.out.printf("Samochód %s: uruchamiam\n",
                model);
        engine.turnOn();
    }

    public void turnOffCar(){

        System.out.printf("Samochód %s: zatrzymuję\n",
                model);
        engine.turnOff();
    }

    public void goForward(){
        System.out.printf("Samochód %s: jadę do przodu\n",
                model);
        engine.increasePower();
        for (Wheel wheels: array
             ) {
            wheels.turnForward(engine);
        }
    }

    public void goBack(){
        System.out.printf("Samochód %s: jadę do tyłu\n",
                model);
        engine.increasePower();
        for (Wheel wheels: array
                ) {
            wheels.turnBackward();
        }
    }
    public void turnLeftOrRight(String direction){
        System.out.printf("Samochód %s: skręcam w %s\n",
                model, direction);

        for (Wheel wheels: array
             ) {
            if (wheels.isFrontWheels()){
                wheels.turn(direction);
            }
        }

    }




}
