package util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    Silnik powinien posiadać pola:
    - stałą maxObroty
    - aktualneObroty
    oraz metody:
    - uruchom() (wypisuje na ekranie napis "Silnik: uruchamiam", ustawia obroty na 1000)
    - zgaś() (wypisuje na ekranie napis "Silnik: zatrzymuję", ustawia obroty na 1000)
    - dodajGazu() (dodaje do aktualnych obrotów 500, wypisuje na ekranie napis "Silnik: daję gazu! Aktualne obroty: [aktualneObroty]",
    jednocześnie sprawdza czy nie przekroczone zostały maksymalne obroty. Jeśli tak wypisuje na ekran "Za bardzo gazujesz!! Zaraz wybuchnę!!!")

 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Engine {

    private static final int maxRpm = 5000;
    private int currentRpm;

    private void turnOn(){
        System.out.println("Silnik: uruchamiam");
        setCurrentRpm(1000);
    }

    private void turnOff(){
        System.out.println("Silnik: zatrzymuję");
        setCurrentRpm(1000);
    }

    private void increasePower(){
        setCurrentRpm(getCurrentRpm() + 500);
        if (getCurrentRpm()>maxRpm){
            setCurrentRpm(maxRpm);
            System.out.println("Za bardzo gazujesz!! Zaraz wybuchnę!!! + \n"
                                + " Osiągnięto maksimum obrotów: " + maxRpm);

        }else {
            System.out.println("Silnik: daję gazu! Aktualne obroty: " + getCurrentRpm());
        }

    }

}
