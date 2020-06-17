package by.bavilor.springfx;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFxApplication {

  public static void main(final String[] args) {
    Application.launch(UiStarter.class, args);
  }
}
