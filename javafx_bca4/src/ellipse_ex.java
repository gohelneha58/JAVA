import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
public class ellipse_ex extends Application
{
    @Override
    public void start(Stage stage)
    {
       Ellipse e1= new Ellipse();
       e1.setCenterX(100);
       e1.setCenterY(100);
       e1.setRadiusX(50);
       e1.setRadiusY(60);
       e1.setFill(Color.LIGHTBLUE);
       e1.setStroke(Color.DARKBLUE);
       e1.setStrokeWidth(2);
       Pane root = new Pane();
       root.getChildren().add(e1);
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
