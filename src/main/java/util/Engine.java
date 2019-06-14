package util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Engine {

    private static final int MAX_RPM = 5000;
    private static final int INCREASE_RPM = 500;
    private int currentRpm = 0;

    public void turnOn(){
        System.out.println("Silnik: uruchamiam");
        setCurrentRpm(1000);
    }

    public void turnOff(){
        System.out.println("Silnik: zatrzymuję");
        setCurrentRpm(1000);
    }

    public void increasePower(){
        setCurrentRpm(getCurrentRpm() + INCREASE_RPM);
        if (getCurrentRpm()> MAX_RPM){
            setCurrentRpm(MAX_RPM);
            System.out.println("Za bardzo gazujesz!! Zaraz wybuchnę!!!\n"
                                + "Osiągnięto maksimum obrotów: " + MAX_RPM);

        }else {
            System.out.println("Silnik: daję gazu! Aktualne obroty: " + getCurrentRpm());
        }

    }

}
