import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class Rectangle_ex extends Application
{
    @Override
    public void start(Stage stage)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setWidth(60);
        rectangle.setHeight(60);
        rectangle.setFill(Color.LIGHTBLUE);
        rectangle.setStroke(Color.DARKGREEN);
        rectangle.setStrokeWidth(3);
        Pane root = new Pane();
        root.getChildren().add(rectangle);
        Scene scene = new Scene(root,400,300);
        stage.setTitle("javafx rectangle example");
        
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}