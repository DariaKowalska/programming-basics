package main.java.pl.shopwithsandwiches;

public class UserUtils {
    /**
     * Metoda zwraca napis imie nazwisko jest status
     *
     * @param uzytkownika
     * @return
     */
    public static String pobierzStatus(User uzytkownik) {
        StringBuilder builder = new StringBuilder();
        builder.append(uzytkownik.getName()).append(" ").append(uzytkownik.getLastname());
        builder.append(" jest ");

        // wykorzystac switch
        User.TypStatus status = uzytkownik.getStatus();
        switch (status) {
            case AKTYWNY:
                builder.append("aktywny");
                break;
            case NIE_ZALOGOWANY:
                builder.append("nie zalogowany");
                break;
            case ZALOGOWANY:
                builder.append("zalogowany");
                break;
            case NIEAKTYWNY:
                builder.append("nieaktywny");
                break;
            default:
                builder.append("????");
        }
        // wykorzysta StringBuildera append
        // zwrocić jako string 'imie' 'nazwisko' jest 'status'
        // ponizej przyklad

        return builder.toString();
    }

    public static String pobierzPlec(User uzytkownik){
        StringBuilder rezultat = new StringBuilder();
        rezultat.append(uzytkownik.getName()).append(" ").append(uzytkownik.getLastname());
        User.Sex plecPobranaOdUzytkownika = uzytkownik.getUserSex();
        rezultat.append(" jest ");

        switch (plecPobranaOdUzytkownika){
            case KOBIETA:
                rezultat.append("kobietą");
                break;
            case NIEOKRESLONA:
                rezultat.append("nie określony");
                break;
            case MEZCZYZNA:
                rezultat.append("mężczyzną");
                break;

        }
        return rezultat.toString();

    }

}
