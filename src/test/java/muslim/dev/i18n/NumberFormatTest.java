package muslim.dev.i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class NumberFormatTest {

  @Test
  void testNumberFormat() {
    NumberFormat numberFormat = NumberFormat.getInstance();
    String format = numberFormat.format(10000000.255);

    System.out.println(format);
  }

  @Test
  void testNumberFormatIndonesia() {
    Locale locale = new Locale("in", "ID");
    NumberFormat numberFormat = NumberFormat.getInstance(locale);
    String format = numberFormat.format(10000000.255);

    System.out.println(format);
  }

  @Test
  void testNumberFormatParseIndonesia() throws ParseException {
    Locale locale = new Locale("in", "ID");
    var numberFormat = NumberFormat.getInstance(locale);

    var result = numberFormat.parse("10.000.000,255").doubleValue();
    System.out.println(result);
  }

}
