package main.java.pl.cars.interfaceexercises;

public interface Car {
    /**
     * Metoda wlaczajaca silnik zwraca void czyli nie zwraca zadnych informacji
     */
    void wlaczSilnik();

    void wylaczSilnik();

    /**
     * Metoda otwierajaca auto przy uzyciu klucza autoryzacyjnego
     * @param klucz dlugi ciag znakow
     */
    void otworzSamochod(String klucz);
}
