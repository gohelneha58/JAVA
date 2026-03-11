import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
public class Polygon_ex extends Application
{
    @Override
    public void start(Stage stage)
    {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
        150.0, 50.0,
        100.0, 150.0,
        200.0, 150.0);
        triangle.setFill(Color.LIGHTPINK);
        triangle.setStroke(Color.CHOCOLATE);
        triangle.setStrokeWidth(3);
        Pane root = new Pane();
       root.getChildren().add(triangle);
       Scene scene = new Scene(root,400,300);
       stage.setTitle("javafx Ellipse example");
       stage.setScene(scene);
       stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    }