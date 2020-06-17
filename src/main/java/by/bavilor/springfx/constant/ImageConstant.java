package by.bavilor.springfx.constant;

import lombok.Getter;

public enum ImageConstant {
  WALLET_TASKBAR("wallet_taskbar.svg"),
  SPACE("space.svg");

  public static final String FOLDER = "/image";
  @Getter
  private String name;

  ImageConstant(final String name) {
    this.name = name;
  }

  public String getPath() {
    return FOLDER + "/" + name;
  }
}
