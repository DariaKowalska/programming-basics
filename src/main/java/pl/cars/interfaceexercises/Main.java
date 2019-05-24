package main.java.pl.cars.interfaceexercises;

public class Main {
    public static void main(String[] args) {

        Car huyndai = new HyundaiCar();
        huyndai.wlaczSilnik();

        Car fiat = new FiatCar();
        fiat.wlaczSilnik();

        Car seat = new SeatCar();
        seat.wlaczSilnik();

    }
}
