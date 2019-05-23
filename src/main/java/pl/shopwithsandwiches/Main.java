package main.java.pl.shopwithsandwiches;

import main.java.pl.shopwithsandwiches.methods.Kanapka;

public class Main {
    public static void main(String[] args) {

        User janusz = new User();
        Kanapka kanapkazSzynka = new Kanapka("szynka");
        System.out.println(janusz.toString());
        System.out.println(janusz);
        System.out.println(kanapkazSzynka);

        StringBuilder budujNapis = new StringBuilder();
        budujNapis.append('\n');
        budujNapis.append("=====================\n");
        budujNapis.append("== Lista Zamówień ===\n");
        budujNapis.append("=====================\n");


        // zadanie utworz string buildera i
        // za pomoca metody append dodaj napisy ponizej do siebie

        // zdanie stworz 5 zamowien i oblicz sume tych zamowień
        // i wysietlic zamowienia na ekranie oraz sume zamowien
        // trzeba zrobić metode toString() w zamowieniu

        Order order1 = new Order(1, 2.99);
        budujNapis.append("\n>").append('\t').append(order1);
        Order order2 = new Order(2, 1.99);
        budujNapis.append("\n>").append('\t').append(order2);

        Order order3 = new Order(3, 0.99);
        budujNapis.append("\n>").append('\t').append(order3);

        Order order4 = new Order(4, .19);
        budujNapis.append("\n>").append('\t').append(order4);

        Order order5 = new Order(5, .09);
        budujNapis.append("\n>").append('\t').append(order5);


        float suma = 0;
        float cena1 = order1.getPrice();
        // czy ma być ?
        suma = cena1;

        float cena2 = order2.getPrice();
        float cena3 = order3.getPrice();
        float cena4 = order4.getPrice();
        float cena5 = order5.getPrice();
        suma = cena1 + cena2 + cena3 + cena4 + cena5; // ? czy to jest poprawnie ?

        // formatowanie do 2 cyfr po przecinku

        System.out.printf("Suma: %.2f zł",suma);


        // podpowiedź: użyj String.format() dziala podobnie jak linijka wyżej

        budujNapis.append(String.format("\n\nSuma: %.2f zł",suma));

        //System.out.println("Suma: "+suma);
        // brak formatowania wiele cyfr po przecinku
        System.out.println(budujNapis);

    }

}
