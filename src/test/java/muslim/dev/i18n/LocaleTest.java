package muslim.dev.i18n;

import java.util.Locale;

import org.junit.jupiter.api.Test;

public class LocaleTest {

  @Test
  void testNewLocale() {
    var language = "in";
    var country = "ID";
    var locale = new Locale(language, country);

    System.out.println(locale.getLanguage());
    System.out.println(locale.getCountry());

    System.out.println(locale.getDisplayLanguage());
    System.out.println(locale.getDisplayCountry());
  }

  @Test
  void testNewLocaleUs() {
    var language = "en";
    var country = "US";
    var locale = new Locale(language, country);

    System.out.println(locale.getLanguage());
    System.out.println(locale.getCountry());

    System.out.println(locale.getDisplayLanguage());
    System.out.println(locale.getDisplayCountry());
  }

}
