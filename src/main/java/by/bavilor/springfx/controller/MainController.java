package by.bavilor.springfx.controller;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

  public String userName;

  public MainController(final String userName) {
    this.userName = userName;
  }

  @Override
  public void initialize(final URL location, final ResourceBundle resources) {

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
