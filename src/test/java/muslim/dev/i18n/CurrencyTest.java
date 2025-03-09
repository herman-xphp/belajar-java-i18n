package muslim.dev.i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class CurrencyTest {

  @Test
  void testCurrencyIndonesia() {
    Locale locale = new Locale("in", "ID");
    Currency currency = Currency.getInstance(locale);

    System.out.println(currency.getDisplayName());
    System.out.println(currency.getCurrencyCode());
    System.out.println(currency.getSymbol(locale));
  }

  @Test
  void testCurrencyUSA() {
    Locale locale = new Locale("en", "US");
    Currency currency = Currency.getInstance(locale);

    System.out.println(currency.getDisplayName());
    System.out.println(currency.getCurrencyCode());
    System.out.println(currency.getSymbol(locale));
  }

  @Test
  void testNumberFormatCurrencyIndonesia() {
    Locale locale = new Locale("in", "ID");
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
    String format = numberFormat.format(10000000.255);

    System.out.println(format);
  }

  @Test
  void testNumberFormatCurrencyParseIndonesia() throws ParseException {
    Locale locale = new Locale("in", "ID");
    var numberFormat = NumberFormat.getCurrencyInstance(locale);

    var result = numberFormat.parse("Rp10.000.000,26").doubleValue();
    System.out.println(result);
  }
}
