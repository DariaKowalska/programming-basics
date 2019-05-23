package main.java.pl.shopwithsandwiches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserScanner {
    public static void main(String[] args) {

        String napis = "List do \n mamy";

        // System.out - systemowe wyjscie czyli konsola
        // System.in  - systemowe wejscie czyli klawiatura
        Scanner skaner = new Scanner(System.in);


        /**
         * Zadanie wprowadz z klawiatury
         * 3 imiona i zapisz w postaci
         * listy z wykorzystaniem petli
         */
        System.out.println("Wprowadz 3 imiona:");
        List<String> listaImion = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("\nWprowadz imię i nacisnij enter: ");
            // skanner nextLine()
            String imie = skaner.nextLine();
            listaImion.add(imie);
            System.out.printf("Wprowadziłeś imie: %s", imie);

        }
    }}