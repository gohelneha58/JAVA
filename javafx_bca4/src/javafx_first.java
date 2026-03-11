import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class javafx_first extends Application
{
    public void start(Stage primaryStage)
    {
        Button btn = new Button("click me!");
        StackPane root = new StackPane(btn);
        Scene scene = new Scene(root, 3, 200);
        primaryStage.setTitle("javafx basic structure");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
