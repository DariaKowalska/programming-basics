package main.java.pl.shopwithsandwiches.methods;

public class Kanapka {
    String sklad;// deklaracja zmiennej sklad
    int iloscSkladnikow;

    /**
     * Konstruktor kanapki bezargumentowy - domyślnym
     */
    public Kanapka(){
        sklad = "ser,pomidor";// inicjalizacja zmiennej sklad
        iloscSkladnikow = 2;
    }

    /**
     * Konstruktor argumentowy
     * @param podanySkladTworzonejKanapki
     */
    public Kanapka(String podanySkladTworzonejKanapki){
        sklad = podanySkladTworzonejKanapki;
    }

    /**
     * Konstruktor argumentowy
     * @param podanySkladTworzonejKanapki
     */
    public Kanapka(String podanySkladTworzonejKanapki,int podanaIloscSkladnik){
        sklad = podanySkladTworzonejKanapki;
        iloscSkladnikow = podanaIloscSkladnik;
    }

    /**
     * Konstruktor argumentowy
     * @param podanaIloscSkladnikow
     */
    public Kanapka(int podanaIloscSkladnikow){
        iloscSkladnikow = podanaIloscSkladnikow;
    }

    /**
     * Metoda podajaca sklad kanapki
     * @return sklad kanapki
     */
    public String podajSklad(){
        return sklad;
    }

    public String toString() {
        return "sklad: " + sklad + " ilosc skladnikow: " + iloscSkladnikow;
    }
}
