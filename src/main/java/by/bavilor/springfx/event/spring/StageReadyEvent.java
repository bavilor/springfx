package by.bavilor.springfx.event.spring;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

public class StageReadyEvent extends ApplicationEvent {
  public StageReadyEvent(final Stage source) {
    super(source);
  }

  public Stage getStage() {
    return (Stage) getSource();
  }
}
