package by.bavilor.springfx;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Optional;
import java.util.ResourceBundle;

public class I18N {
  public static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("LangBundle", new Locale("en", "UK"));

  public static String getString(final String key) {
    return RESOURCE_BUNDLE.getString(key);
  }

  public static Optional<String> getStringOptional(final String key) {
    try {
      return Optional.of(RESOURCE_BUNDLE.getString(key));
    } catch (NullPointerException | MissingResourceException | ClassCastException e) {
      e.printStackTrace();
      return Optional.empty();
    }
  }
}
