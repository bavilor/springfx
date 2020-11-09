package by.bavilor.springfx;

import by.bavilor.springfx.constant.ImageConstant;
import by.bavilor.springfx.event.spring.StageReadyEvent;
import by.bavilor.springfx.util.IconUtil;
import by.bavilor.springfx.view.launcher.Launcher;
import javafx.stage.Stage;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer {
  public StageInitializer() {

  }


  @EventListener
  public void onApplicationEvent(final StageReadyEvent event) {
    final Stage stage = event.getStage();

    stage.setTitle("springfx");
    stage.getIcons().add(IconUtil.loadImage(ImageConstant.WALLET_TASKBAR, 24.0, 24.0));

    new Launcher(stage);
  }
}
