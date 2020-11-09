package by.bavilor.springfx.view.root;

import by.bavilor.springfx.constant.ImageConstant;
import by.bavilor.springfx.view.dashboard.DashboardController;
import by.bavilor.springfx.util.IconUtil;
import by.bavilor.springfx.util.MultiThreadUtil;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class RootController implements Initializable {
  @FXML
  private ToggleButton tableToggle;
  @FXML
  private VBox financesTable;
  @FXML
  private StackPane content;
  @FXML
  private ToggleButton dashboardToggle;

  @Autowired
  @Getter
  private DashboardController financesTableController;
  private final HashMap<ImageConstant, ImageView> icons = new HashMap<ImageConstant, ImageView>() {{
    put(ImageConstant.SELECTED_HOVERED_DASHBOARD, null);
    put(ImageConstant.DASHBOARD, null);
    put(ImageConstant.SELECTED_DATA_TABLE, null);
    put(ImageConstant.DATA_TABLE, null);
  }};

  public RootController() {
    final Task<HashMap<ImageConstant, ImageView>> imageLoadTask = new Task<HashMap<ImageConstant, ImageView>>() {
      @Override
      protected HashMap<ImageConstant, ImageView> call() throws Exception {
        icons.put(
            ImageConstant.SELECTED_HOVERED_DASHBOARD,
            IconUtil.loadImageAsImageView(ImageConstant.SELECTED_HOVERED_DASHBOARD, 24.0, 24.0)
        );
        icons.put(
            ImageConstant.DASHBOARD,
            IconUtil.loadImageAsImageView(ImageConstant.DASHBOARD, 24.0, 24.0)
        );
        icons.put(
            ImageConstant.SELECTED_DATA_TABLE,
            IconUtil.loadImageAsImageView(ImageConstant.SELECTED_DATA_TABLE, 24.0, 24.0)
        );
        icons.put(
            ImageConstant.DATA_TABLE,
            IconUtil.loadImageAsImageView(ImageConstant.DATA_TABLE, 24.0, 24.0)
        );

        return null;
      }
    };

    MultiThreadUtil.getExecutorService().submit(imageLoadTask);
  }

  @Override
  public void initialize(final URL location, final ResourceBundle resources) {
    updateDashboardGraphics(dashboardToggle.isSelected());
    dashboardToggle.selectedProperty().addListener((ov, oldv, newv) -> {
      updateDashboardGraphics(newv);
    });
  }

  private void updateDashboardGraphics(final boolean hoveredOrSelected) {
    dashboardToggle.setGraphic(hoveredOrSelected
                               ? IconUtil.loadImageAsImageView(ImageConstant.SELECTED_HOVERED_DASHBOARD, 24.0, 24.0)
                               : IconUtil.loadImageAsImageView(ImageConstant.DASHBOARD, 24.0, 240.));
  }

  @FXML
  public Node getDashboardIcon() {
    return IconUtil.loadImageAsImageView(ImageConstant.DASHBOARD, 24.0, 24.0);
  }
}
