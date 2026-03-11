import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class KeyEventExample extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Text text = new Text("Press any key");
        StackPane root = new StackPane(text);
        Scene scene = new Scene(root, 400,400);
        scene.setOnKeyPressed(e -> text.setText("Key pressed:"+e.getCode()));
        scene.setOnKeyReleased(e -> text.setText("key released:"+ e.getCode()));
        primaryStage.setTitle("key event Exaple");
        primaryStage.setScene(scene);
        primaryStage.show();
        root.requestFocus();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
