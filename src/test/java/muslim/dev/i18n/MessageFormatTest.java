package muslim.dev.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageFormatTest {

  @Test
  void testMessageFormat() {

    var pattern = "Hi {0}, Anda bisa mencari data anda dengan mengetik \"{0}\" di pencarian.";
    var messageFormat = new MessageFormat(pattern);

    var format = messageFormat.format(new Object[] {
        "Herman"
    });

    System.out.println(format);
  }

  @Test
  void testMessageFormatResourceBundle() {
    Locale locale = new Locale("in", "ID");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

    String pattern = resourceBundle.getString("welcome.message");

    MessageFormat messageFormat = new MessageFormat(pattern);
    String format = messageFormat.format(new Object[] {
        "Herman", "Muslim Dev"
    });

    System.out.println(format);
  }

}
