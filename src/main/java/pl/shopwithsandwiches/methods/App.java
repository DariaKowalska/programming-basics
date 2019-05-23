package main.java.pl.shopwithsandwiches.methods;

public class App {
    public static void main(String[] args) {


        int mojaLiczba;// zmienna z malej litery
        // jest to deklaracja

        mojaLiczba = 3; // inicjalizacja zmiennej
        System.out.println(mojaLiczba);

        int mojaDrugaLiczba = 3; // jednoczesnie
        // deklaracje i inicjalizacje

        System.out.println(Math.PI);
        // tworzenie zmiennej użytej w println


        String coZjemy = "Co na obiad?";
        System.out.println(coZjemy);
        // tworzenie zmiennej użytej w println
        String obiad = coNaObiad();
        System.out.println(obiad);

    }

    /**
     * Przyklad metody bez argumentowej
     *
     * @return co na obiad
     */
    public static String coNaObiad() {
        return "pomidorowa";
    }



}
