package by.bavilor.springfx;

import by.bavilor.springfx.event.spring.StageReadyEvent;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class UiStarter extends Application {
  private ConfigurableApplicationContext applicationContext;

  @Override
  public void start(Stage stage) {
    applicationContext.publishEvent(new StageReadyEvent(stage));
  }

  @Override
  public void init() {
    applicationContext = new SpringApplicationBuilder(SpringFxApplication.class).run();
  }

  @Override
  public void stop() {
    applicationContext.stop();
    Platform.exit();
  }
}