package main.java.pl.methods.shopwithsandwiches;

public class TestStatus {
    public static void main(String[] args) {
        User uzytkownik = new User();


        uzytkownik.setStatus(User.TypStatus.AKTYWNY);
        uzytkownik.setCity(City.KRAKOW);

        //uzytkownik.setMiasto(User.Miasto.POZNAN);
        // TODO
        // * utworzyć getter/setter miasto
        // * enum Miasto POZNAN,WROCLAW,WARSZAWA,KRAKOW
        // * ustawic jak powyzej setMiasto
        // * utworzy if jesli z Poznania to
        // wypisz Uzytkownik Lokalny i ustaw
        // status na LOCAL

        // jezeli uzytkownik jest
        // aktywny wypisz "imie nazwisko jest aktywny"

        if(uzytkownik.getStatus()== User.TypStatus.AKTYWNY){
            System.out.println(uzytkownik+ " jest aktywny");
        }

        if (uzytkownik.getCity()== City.POZNAN){
            System.out.println("uzytkownik lokalny" );
            uzytkownik.setStatus(User.TypStatus.LOCAL);
        }

    }
}
