package by.bavilor.springfx.configuration;

import by.bavilor.springfx.controller.ItemController;
import by.bavilor.springfx.controller.RootController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class ControllerConfiguration {

  @Bean
  public RootController createMainController() {
    return new RootController("Bavilor");
  }

  @Bean
  public ItemController createMainController1() {
    return new ItemController();
  }
}
