package main.java.pl.methods;

public class SandwichApp {
    public static void main(String[] args) {
        // przyklad uzycia konstruktora
        // powolujemy do zycia obiekt Kanapka
        // ponizej tworzenie kanapki
        // z wykorzystaniem konsturktora domyslnego
        Kanapka kanapkaZSerem = new Kanapka();

        String skladKanapkiZSerem = kanapkaZSerem.podajSklad();
        System.out.println("Konstruktor przyklad");
        System.out.println("====================");
        System.out.println(skladKanapkiZSerem);
        // zjesc
        // przygotowac
        // poczestowac
        // +rodzaj pieczywa, rozmiar, kształt

        Kanapka kanapkaZSalata = new Kanapka("salata",1);
        Kanapka kanapkaZNieznanymSkladem = new Kanapka(8);
    }
    }

