package by.bavilor.springfx;

import by.bavilor.springfx.controller.MainController;
import by.bavilor.springfx.event.spring.StageReadyEvent;
import by.bavilor.springfx.util.FxmlUtil;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer {

  @EventListener
  public void onApplicationEvent(StageReadyEvent event) {
    final Stage stage = event.getStage();

    FxmlUtil.<BorderPane>loadFxmlWithController(
        "/fxml/Main.fxml",
        b -> new MainController("Bavilor!")
    ).ifPresent(b -> stage.setScene(new Scene(b)));

    //FxmlUtil.<BorderPane>loadFxml("/fxml/Main.fxml").ifPresent(b -> stage.setScene(new Scene(b)));
    stage.setHeight(500);
    stage.setWidth(500);
    stage.show();
  }
}
