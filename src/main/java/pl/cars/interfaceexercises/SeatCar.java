package main.java.pl.cars.interfaceexercises;

public class SeatCar implements Car{
    private String klucz;

    @Override
    public void wlaczSilnik() {
        System.out.println("Seat System");
        System.out.println("wcisnij przycisk start");
    }

    @Override
    public void wylaczSilnik() {
        System.out.println("przytrzymaj przycisk start przez 3 sekundy");
    }

    @Override
    public void otworzSamochod(String podanyklucz) {
        klucz = podanyklucz;
    }
}
