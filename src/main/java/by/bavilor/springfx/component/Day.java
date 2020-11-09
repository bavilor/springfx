package by.bavilor.springfx.component;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Day extends Button {
  private static final double MIN_WIDTH = 70.0d;
  private static final double MIN_HEIGHT = 100.0d;
  private static final double WIDTH = 150.0d;
  private static final double HEIGHT = 250.0d;

  private Label day;
  private Label dayOfWeek;

  public Day(final int day, final String dayOfWeek) {
    setMinSize(MIN_WIDTH, MIN_HEIGHT);
    setPrefSize(WIDTH, HEIGHT);

    this.day = new Label(String.valueOf(day));
    this.dayOfWeek = new Label(dayOfWeek);

    final HBox graphics = new HBox(this.day, this.dayOfWeek);
    graphics.setSpacing(6.0);
    setGraphic(graphics);
  }
}
