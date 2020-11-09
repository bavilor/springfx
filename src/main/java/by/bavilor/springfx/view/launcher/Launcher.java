package by.bavilor.springfx.view.launcher;

import by.bavilor.springfx.util.FxmlUtil;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Launcher {
  private static final String FXML_PATH = "/fxml/Launcher.fxml";

  public Launcher(final Stage stage) {
    final Parent pane =
        FxmlUtil.<Pane>loadFxml(FXML_PATH).orElseThrow(() -> new RuntimeException("Can't initialize launcher pane."));

    final Scene scene = new Scene(pane);
    scene.getStylesheets().add(getClass().getResource("/style/LauncherStylesheet.css").toExternalForm());

    stage.setScene(scene);
    stage.show();
  }
}
