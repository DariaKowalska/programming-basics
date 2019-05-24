package main.java.pl.shopwithsandwiches;

import static main.java.pl.shopwithsandwiches.User.TypStatus.*;

public class SwitchInstruction {    public static void main(String[] args) {

    User janusz = new User("Janusz", "Typowy", 43, User.Sex.MEZCZYZNA);
    janusz.setStatus(NIE_ZALOGOWANY);

    User uzytkownik = new User();// uzytkownik utworzony konstruktorem domyślnym

    // uzycie metody statycznej z UserUtils
    System.out.println("\n\nTest uzycia metody statycznej z UserUtils");
    String napisStatusUzytkownika = UserUtils.pobierzStatus(uzytkownik);
    System.out.println(napisStatusUzytkownika);

    // pobieranie napisu Plec i wypisanie na konsoli
    String napisPlecUzytkownika = UserUtils.pobierzPlec(uzytkownik);
    System.out.println(napisPlecUzytkownika);

    String napisStatusJanuszUzytkownika = UserUtils.pobierzStatus(janusz);
    System.out.println(napisStatusJanuszUzytkownika);

    // pobieranie napisu Plec i wypisanie na konsoli
    String napisPlecJanusz = UserUtils.pobierzPlec(janusz);
    System.out.println(napisPlecJanusz);


}

}
