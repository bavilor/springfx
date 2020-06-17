package by.bavilor.springfx.controller;

import by.bavilor.springfx.constant.ImageConstant;
import by.bavilor.springfx.util.ImageUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {
  @FXML
  public VBox content;

  public String userName;

  public RootController(final String userName) {
    this.userName = userName;
  }

  @Override
  public void initialize(final URL location, final ResourceBundle resources) {

  }

  @FXML
  public Node getDashboardIcon() {
    return ImageUtil.loadImageAsImageView(ImageConstant.SPACE, 24.0, 240.);
  }

  @FXML
  public String getUserName() {
    return userName;
  }

  @FXML
  public void changeUser(final ActionEvent event) {
    userName = "Changed!";
  }
}
