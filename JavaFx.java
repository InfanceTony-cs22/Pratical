import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DialogBoxAndMenuExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dialog Box and Menu Example");

        // Create a menu bar with a menu and menu item
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        fileMenu.getItems().add(openItem);
        menuBar.getMenus().add(fileMenu);

        // Set action for the menu item
        openItem.setOnAction(e -> showAlert("Open Dialog", "File Opened"));

        // Create a layout and add the menu bar
        StackPane layout = new StackPane();
        layout.getChildren().add(menuBar);

        // Set the scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    // Method to display a simple alert dialog
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
