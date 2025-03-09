package muslim.dev.i18n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateFormatTest {

  @Test
  void testDateFormat() {
    var pattern = "EEEE dd MMMM yyyy";
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }

  @Test
  void testDateFormatIndonesia() {
    var pattern = "EEEE dd MMMM yyyy";
    Locale locale = new Locale("in", "ID");
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, locale);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }

  @Test
  void testDateFormatJapan() {
    var pattern = "EEEE dd MMMM yyyy";
    Locale locale = new Locale("ja", "JP");
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, locale);

    var format = dateFormat.format(new Date());
    System.out.println(format);
  }

  @Test
  void testDateFormatParseIndonesia() throws ParseException {
    var pattern = "EEEE dd MMMM yyyy";
    Locale locale = new Locale("in", "ID");
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, locale);

    var format = dateFormat.parse("Minggu 09 Maret 2025");
    System.out.println(format);
  }

  @Test
  void testDateFormatParseJapan() throws ParseException {
    var pattern = "EEEE dd MMMM yyyy";
    Locale locale = new Locale("ja", "JP");
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, locale);

    var format = dateFormat.parse("日曜日 09 3月 2025");
    System.out.println(format);
  }

}
