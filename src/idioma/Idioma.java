package idioma ;

import java.util.Locale;

public class Idioma {
    public static void main(String[] args) {
        System.out.println("Seu sistema etsa em");
        Locale locale  = Locale.getDefault();
        String lang = locale.getDisplayLanguage();
        String country = locale.getDisplayCountry();
        System.out.println(lang);
    }
}
