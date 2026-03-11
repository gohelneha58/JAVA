import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MouseEventExample extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Circle circle = new Circle(50, Color.LIGHTGOLDENRODYELLOW);
        circle.setOnMouseClicked(e -> System.out.println("circle clicked!"));
        circle.setOnMouseEntered(e -> circle.setFill(Color.PLUM));
        circle.setOnMouseExited(e -> circle.setFill(Color.LIGHTSLATEGREY));
        StackPane root = new StackPane(circle);
        Scene scene = new Scene(root , 400 , 400);
        primaryStage.setTitle("mouse event example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
