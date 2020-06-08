package by.bavilor.springfx.util;

import by.bavilor.springfx.I18N;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.util.Callback;

import java.io.IOException;
import java.util.Optional;

public class FxmlUtil {
  private FxmlUtil() {

  }

  public static <T extends Parent> Optional<T> loadFxml(final String fxmlName) {
    try {
      return Optional.of(FXMLLoader.load(FxmlUtil.class.getResource(fxmlName), I18N.RESOURCE_BUNDLE));
    } catch (IOException e) {
      e.printStackTrace();
      return Optional.empty();
    }
  }

  public static <T extends Parent> Optional<T> loadFxmlWithController(
      final String fxmlName,
      final Callback<Class<?>, Object> controllerFactory) {
    try {
      return Optional.of(
          FXMLLoader.load(
              FxmlUtil.class.getResource(fxmlName),
              I18N.RESOURCE_BUNDLE,
              null,
              controllerFactory
          )
      );
    } catch (IOException e) {
      e.printStackTrace();
      return Optional.empty();
    }
  }
}
