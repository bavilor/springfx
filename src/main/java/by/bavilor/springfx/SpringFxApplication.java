package by.bavilor.springfx;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFxApplication {

  public static void main(String[] args) {
    Application.launch(UiStarter.class, args);
  }
}
