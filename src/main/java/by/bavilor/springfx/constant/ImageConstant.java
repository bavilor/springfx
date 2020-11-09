package by.bavilor.springfx.constant;

import lombok.Getter;

public enum ImageConstant {
  WALLET_TASKBAR("wallet_taskbar.svg"),
  SPACE("space.svg"),
  DASHBOARD("dashboard.svg"),
  SELECTED_HOVERED_DASHBOARD("selected_hovered_dashboard.svg"),
  SELECTED_DATA_TABLE("selected_data_table.svg"),
  DATA_TABLE("data_table.svg"),
  LOGIN_PROFILE("login_profile.svg"),
  TEST("test.svg");

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
