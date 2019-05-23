package main.java.pl.shopwithsandwiches;

public class User {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public City getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(City residenceCity) {
        this.residenceCity = residenceCity;
    }

    // alt + insert
    // pola uzyte w uzytkowniku

    private String name;
    private String lastname;
    private int age;
    private TypStatus status;
    private City residenceCity;
    public enum TypStatus {AKTYWNY,NIEAKTYWNY,ZALOGOWANY,NIE_ZALOGOWANY,LOCAL};
    public enum Sex {MEZCZYZNA, KOBIETA,NIEOKRESLONA}
    private Sex userSex;

    /**
     * Konstruktor z argumentami
     * @param giveName
     * @param giveLastName
     * @param giveAge
     */

    public User(String giveName, String giveLastName, int giveAge){
        name = giveName;
        lastname = giveLastName;
        age = giveAge;
    }

    public User(String giveName, String giveLastName){
        name = giveName;
        lastname = giveLastName;

    }

    public User(String name, String lastname, int age, Sex userSex) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.userSex = userSex;
    }

    /**
     * Konstruktor bez argumentowy
     */

    public User() {
        //inicjalizujemy pola w konstruktorze
        name = "anonim";
        lastname = "nieznane";
        age = 0;
        userSex = Sex.NIEOKRESLONA;
        status = TypStatus.NIEAKTYWNY;
    }

    public String toString() {
        return name + " " + lastname + " " + age + " "+ userSex.toString().toLowerCase();
    }

    public String pobierzImieINazwisko(){
        return name + " " + lastname;
    }

    public TypStatus getStatus(){
        return status;
    }

    public void setStatus(TypStatus ustawianyStatus){

        // this - to jest klasa w ktorej jestesmy
        // czyli User
        // this.status - to pole status w uzytkowniku

        this.status = ustawianyStatus;
    }

    public  City getCity(){
        return residenceCity;
    }

    public  void setCity(City ustawiamyMiasto){
        this.residenceCity = ustawiamyMiasto;
    }

    public Sex getUserSex(){
        return userSex;
    }

    public void setUserSex(Sex wybranaSex){
        this.userSex = wybranaSex;

    }
}
