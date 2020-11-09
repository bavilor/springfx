package by.bavilor.springfx.configuration;

import by.bavilor.springfx.view.dashboard.DashboardController;
import by.bavilor.springfx.view.root.RootController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class ControllerConfiguration {

  @Bean
  public RootController createRootController() {
    return new RootController();
  }

  @Bean
  public DashboardController createDashboardController() {
    return new DashboardController();
  }
}
