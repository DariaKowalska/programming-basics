package main.java.pl.shopwithsandwiches;

public class TablesWithUsers {
    public static void main(String[] args) {

        int[] tablicaLiczb = new int[10];

        tablicaLiczb[9] = 123;
        wypiszElementTablicy(tablicaLiczb, 9);

        tablicaLiczb[0] = 0;
        wypiszElementTablicy(tablicaLiczb, 0);

        int[] tablicaTrzechLiczb = {3, 5, 7};
        // linia powyżej robi to samo co 3 linie ponizej
        // tablicaTrzechLiczb[0] = 3;
        // tablicaTrzechLiczb[1] = 5;
        // tablicaTrzechLiczb[2] = 7;
        {
            User janusz = new User("Janusz", "Typowy");
            User marta = new User("Marta", "Smutna");
            User dominik = new User("Dominik", "Zielony");
            User[] tablicaUzytkownikow = {janusz, marta, dominik};

            tablicaUzytkownikow[1].pobierzImieINazwisko();
            System.out.println(tablicaUzytkownikow[1].pobierzImieINazwisko());

            User[] tablicaJednoElementowa = {new User()};
        }

        /**
         * Stworz tablice 5 uzytkownikow i
         * wypisz imie i nazwisko 2 oraz 4 uzytkownika
         * do konsoli
         * Uwaga. Typ danych to 'User' a nie 'int'
         */
        {
            User[] tablicaUzytkownikow = new User[5];
            tablicaUzytkownikow[2] = new User("Janusz", "Kowalski");
            tablicaUzytkownikow[4] = new User("Jan", "Nowak");

            System.out.println("\n\n" + tablicaUzytkownikow[2].getName() +
                    " " + tablicaUzytkownikow[2].getLastname());
            User uzytkownik = tablicaUzytkownikow[4];
            System.out.println(uzytkownik.pobierzImieINazwisko());
        }

        /*
        Zadanie utworz tablice uzytkownikow i przypisz wartosci
        podczas inicjalizacji
         */

    }

    private static void wypiszElementTablicy(int[] tablicaLiczb, int i) {
        System.out.printf("\nElement %s tablicy to %s", i, tablicaLiczb[i]);
    }
}
