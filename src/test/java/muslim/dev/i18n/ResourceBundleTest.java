package muslim.dev.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ResourceBundleTest {

  @Test
  void testResourceBundle() {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

    System.out.println(resourceBundle.getString("hello"));
    System.out.println(resourceBundle.getString("goodbye"));
  }

  @Test
  void testResourceBundleIndonesia() {
    Locale locale = new Locale("in", "ID");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

    System.out.println(resourceBundle.getString("hello"));
    System.out.println(resourceBundle.getString("goodbye"));
  }

  @Test
  void testResourceBundleNotFound() {
    Locale locale = new Locale("en", "US");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

    System.out.println(resourceBundle.getString("hello"));
    System.out.println(resourceBundle.getString("goodbye"));
  }

  @Test
  void testResourceBundleMultipleTimes() {
    Locale locale = new Locale("en", "US");
    ResourceBundle resourceBundle1 = ResourceBundle.getBundle("message", locale);
    ResourceBundle resourceBundle2 = ResourceBundle.getBundle("message", locale);

    System.out.println(resourceBundle1 == resourceBundle2);
  }

}
