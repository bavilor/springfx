package by.bavilor.springfx;

import by.bavilor.springfx.constant.ImageConstant;
import by.bavilor.springfx.controller.RootController;
import by.bavilor.springfx.event.spring.StageReadyEvent;
import by.bavilor.springfx.util.FxmlUtil;
import by.bavilor.springfx.util.ImageUtil;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer {

  public static final double WIDTH = 1024.0;
  public static final double HEIGHT = 768.0;
  public static final double MIN_WIDTH = 900.0;
  public static final double MIN_HEIGHT = 600.0;

  private RootController controller;

  public StageInitializer(final RootController controller) {
    this.controller = controller;
  }

  @EventListener
  public void onApplicationEvent(final StageReadyEvent event) {
    final Stage stage = event.getStage();
    stage.setMinHeight(MIN_HEIGHT);
    stage.setMinWidth(MIN_WIDTH);
    stage.setHeight(HEIGHT);
    stage.setWidth(WIDTH);

    final BorderPane rootPane =
        FxmlUtil.<BorderPane>loadFxmlWithController(
            "/fxml/Root.fxml",
            b -> controller
        ).orElseThrow(() -> new RuntimeException("Can't initialize root pane."));

    final Scene scene = new Scene(rootPane);
    scene.getStylesheets().add("/stylesheet/DefaultStylesheet.css");
    stage.setScene(scene);
    stage.setTitle("springfx");
    stage.getIcons().add(ImageUtil.loadImage(ImageConstant.WALLET_TASKBAR, 24.0, 24.0));
    stage.show();
  }
}
