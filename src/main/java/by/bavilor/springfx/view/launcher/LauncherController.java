package by.bavilor.springfx.view.launcher;

import by.bavilor.springfx.constant.ImageConstant;
import by.bavilor.springfx.util.IconUtil;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

public class LauncherController implements Initializable {
  @Override
  public void initialize(final URL location, final ResourceBundle resources) {

  }

  public Image getLoginProfileImage() {
    return IconUtil.loadImage(ImageConstant.LOGIN_PROFILE, 60.0, 60.0);
  }
}
