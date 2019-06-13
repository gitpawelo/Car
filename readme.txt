Napisz program, w skład którego wejdą klasy Samochód, Silnik i Koła.
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

    Silnik powinien posiadać pola:
    - stałą maxObroty
    - aktualneObroty
    oraz metody:
    - uruchom() (wypisuje na ekranie napis "Silnik: uruchamiam", ustawia obroty na 1000)
    - zgaś() (wypisuje na ekranie napis "Silnik: zatrzymuję", ustawia obroty na 1000)
    - dodajGazu() (dodaje do aktualnych obrotów 500, wypisuje na ekranie napis "Silnik: daję gazu! Aktualne obroty: [aktualneObroty]", jednocześnie sprawdza czy nie przekroczone zostały maksymalne obroty. Jeśli tak wypisuje na ekran "Za bardzo gazujesz!! Zaraz wybuchnę!!!")

    Koło powinno posiadać pola:
    - pozycja ("prawe", "lewe")
    - przednie (prawda/fałsz)
    - srednica (w centymetrach)
    oraz metody:
    - (prywatna) obliczPredkosc(int obrotySilnika) - oblicza prędkość koła na podstawie obrotów i wielkości koła wg wzoru: 2*Pi*100*srednica*(obrotySilnika/5000)
    - krecDoPrzodu() (wypisuje na ekranie napis "[lewe/prawe] [przednie/tylne] koło: kręcę do przodu! Aktualna prędkość: [obliczPredkosc] km/h!")
    - krecDoTylu() (wypisuje na ekranie napis "[lewe/prawe] [przednie/tylne] koło: kręcę do tylu!")
    - skrec(String kierunek) (wypisuje na ekranie napis "[lewe/prawe] [przednie/tylne] koło: skręcam w [lewo/prawo]")

   w metodzie main:
   - utwórz samochód
   - uruchom
   - jedzDoPrzodu
   - skręć w prawo
   - skręć w lewo
   - jedź do przodu
   - jedź do tyłu
   - zgaś


*/