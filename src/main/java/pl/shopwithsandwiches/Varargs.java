package main.java.pl.shopwithsandwiches;

public class Varargs {

    public static void main(String[] args) {

        //zamowienia
        Order zamowienie1 = new Order(1, 12.99);
        Order zamowienie2 = new Order(1, 2.99);
        Order zamowienie3 = new Order(1, 0.99);

        // sumujemy zamowienia
        double suma1 = sumaZamowien(zamowienie1, zamowienie2, zamowienie3);
        double suma2 = sumaZamowien2(zamowienie1, zamowienie2);
        double suma3 = sumaZamowien3(zamowienie1, zamowienie2, zamowienie3);

        System.out.print("Wyswietlanie - suma2: ");
        System.out.println(suma2);
        System.out.print("Wyświetlanie - suma1: ");
        System.out.println(suma1);
        System.out.print("Wyświetlanie - suma3: ");
        System.out.println(suma3);


    }

    /**
     * Metoda zawierajaca w argumencie ... 3kropki - wiele elemenetow
     * uzywamy for z 'i' tym elementem z tablicy
     *
     * @param zamowienie1
     * @param zamowienie2
     * @param zamowienie3
     * @param zamowienia
     * @return
     */
    public static double sumaZamowien(Order zamowienie1, Order zamowienie2, Order zamowienie3, Order... zamowienia) {
        double suma = 0;
        for (int i = 0; i < zamowienia.length; i++) {
            suma += zamowienia[i].getPrice();
        }
        return suma;
    }

    /**
     * Uzywamy for z ':'
     *
     * @param zamowienie1
     * @param zamowienie2
     * @param zamowienie3
     * @param zamowienia
     * @return
     */
    public static double sumaZamowien3(Order zamowienie1, Order zamowienie2, Order zamowienie3, Order... zamowienia) {
        double suma = 0;
        for (Order zamowienie : zamowienia) {
            suma += zamowienie.getPrice();
        }
        return suma;
    }

   /**
     * Metoda zawerajaca dokladnie dwa argumenty
     *
     * @param zamowienie1
     * @param zamowienie2
     * @return
     */
    public static double sumaZamowien2(Order zamowienie1, Order zamowienie2) {
        return zamowienie1.getPrice() + zamowienie2.getPrice();
    }
}
