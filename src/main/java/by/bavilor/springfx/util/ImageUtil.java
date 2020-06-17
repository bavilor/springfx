package by.bavilor.springfx.util;

import by.bavilor.springfx.constant.ImageConstant;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageUtil {

  public static Image loadImage(final ImageConstant constant, final double width, final double height) {
    return new Image(constant.getPath(), width, height, true, true);
  }

  public static ImageView loadImageAsImageView(final ImageConstant constant, final double width, final double height) {
    return new ImageView(loadImage(constant, width, height));
  }
}
