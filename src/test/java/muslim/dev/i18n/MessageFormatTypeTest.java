package muslim.dev.i18n;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageFormatTypeTest {

  @Test
  void testMessageFormatType() {
    Locale locale = new Locale("in", "ID");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

    String pattern = resourceBundle.getString("status");

    MessageFormat messageFormat = new MessageFormat(pattern, locale);
    String format = messageFormat.format(new Object[] {
        "Herman", new Date(), 1_000_000
    });

    System.out.println(format);
  }

  @Test
  void testMessageFormatTypeAmerica() {
    Locale locale = new Locale("en", "US");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

    String pattern = resourceBundle.getString("status");

    MessageFormat messageFormat = new MessageFormat(pattern, locale);
    String format = messageFormat.format(new Object[] {
        "Herman", new Date(), 1_000_000
    });

    System.out.println(format);
  }
}
