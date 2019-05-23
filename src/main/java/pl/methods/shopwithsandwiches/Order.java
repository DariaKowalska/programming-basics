package main.java.pl.methods.shopwithsandwiches;

public class Order {
    int numer;
    float cena;

    public Order(int giveNumber, float givePrice) {
        numer = giveNumber;
        cena = givePrice;
    }

    public Order(int giveNumber, Double givePrice) {
        numer = giveNumber;
        cena = givePrice.floatValue();
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "numer=" + numer +
                ", cena=" + cena +
                '}';
    }

    public float getPrice(){
        return cena;
    }

}
