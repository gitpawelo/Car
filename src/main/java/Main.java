import util.Car;
import util.Engine;
import util.Wheel;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine();
        Wheel [] wheels = new Wheel[4];

        wheels[0] = new Wheel("prawe", true, 40);
        wheels[1] = new Wheel("prawe", false, 40);
        wheels[2] = new Wheel("lewe", true, 40);
        wheels[3] = new Wheel("lewe", false, 40);

        Car ford = new Car("Ford", wheels, engine);

        ford.turnOnCar();
        for (int i = 0; i < 7; i++) {
            ford.goForward();
        }

        ford.turnLeftOrRight("prawo");
        ford.turnLeftOrRight("lewo");

        ford.goBack();
        ford.goForward();

        ford.turnOffCar();



    }


}
