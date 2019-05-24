package main.java.pl.cars.interfaceexercises;

public class DodgeCar implements Car{
    private String klucz;

    @Override
    public void wlaczSilnik() {
        System.out.println("Dodge Car System");
        System.out.println("Wciśnij przycisk start");
    }

    @Override
    public void wylaczSilnik() {
        System.out.println("Przytrzymaj przycisk start");
    }

    @Override
    public void otworzSamochod(String DodgeKlucz) {
        klucz = DodgeKlucz;
    }
}
