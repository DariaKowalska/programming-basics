package main.java.pl.shopwithsandwiches.methods;

public class Chips {
    public static void main(String[] args) {


        System.out.println(poproszeFrytki(20));
        // wykonanie metody sumaLiczb
        System.out.println(sumaLiczb(1, 2, 3));

        System.out.println(informacjeOPrzedmiocie("Frytki", 5));
    }
    //"Frytki: 5 zł"


    /**
     * Przyklad metody z argumentem
     *
     * @param kwota pieniedzy jakie dajemy
     * @return reszte z tranzakcji
     */

    public static int poproszeFrytki(int kwota) {
        return kwota - 5;
    }

    /**
     * Zadanie suma 3 liczb
     *
     * @param a liczba 1
     * @param b liczba 2
     * @param c liczba 3
     * @return suma trzech liczb
     */
    public static int sumaLiczb(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Metoda przyjmuje nazwe przedmiotu i jego cene
     * wypisuje NazwaPrzedmiotu: cena zl
     *
     * @return
     */
    public static String informacjeOPrzedmiocie(String przedmiot, int cena) {
        return przedmiot + ": " + cena + " zł";
    }
}
