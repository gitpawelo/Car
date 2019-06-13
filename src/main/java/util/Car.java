package util;

/*
    Samochód powinien posiadać pola:
    - nazwę modelu
    - 4 obiekty typu koła w tablicy
    - silnik
    oraz metody:
    - uruchom() (wypisuje na ekranie napis "Samochód [nazwa modelu]: uruchamiam", wywołuje metodę uruchom() obiektu silnik)
    - zgaś() (wypisuje na ekranie napis "Samochód [nazwa modelu]: zatrzymuję", wywołuje metodę zgaś() obiektu silnik)
    - jedzDoPrzodu() (wypisuje na ekranie napis "Samochód [nazwa modelu]: jadę do przodu", wywołuje metodę dodajGazu() obiektu silnik, oraz krecDoPrzodu(obroty) obiektów koła)
    - jedzDoTyłu() (wypisuje na ekranie napis "Samochód [nazwa modelu]: jadę do tyłu", wywołuje metodę dodajGazu() obiektu silnik, oraz krecDoTylu() obiektów kół)
    - skrec(String kierunek) (parametr strona może przyjąć wartości: "prawo" i "lewo", w zależności od tego:
            wypisuje na ekranie napis "Samochód [nazwa modelu]: skręcam w [kierunek]", wywołuję metodę skrec(String kierunek) obiektów kół przednich)

 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Car {

    private String model;
    private Wheel[] array = new Wheel[4];
    private Engine engine;



}
