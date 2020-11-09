package by.bavilor.springfx.view.dashboard;

import by.bavilor.springfx.component.Day;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
  @FXML
  private HBox firstWeek;
  @FXML
  private HBox secondWeek;
  @FXML
  private HBox thirdWeek;
  @FXML
  private HBox fourthWeek;

  public DashboardController() {

  }

  @Override
  public void initialize(final URL location, final ResourceBundle resources) {
    for(int j = 0; j < 7; j++) {
      firstWeek.getChildren().add(new Day(j, "MON"));
    }

    for(int j = 0; j < 7; j++) {
      secondWeek.getChildren().add(new Day(j, "MON"));
    }

    for(int j = 0; j < 7; j++) {
      thirdWeek.getChildren().add(new Day(j, "MON"));
    }

    for(int j = 0; j < 7; j++) {
      fourthWeek.getChildren().add(new Day(j, "MON"));
    }
  }
}
