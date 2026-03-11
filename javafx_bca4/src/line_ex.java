import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class line_ex extends Application
{
    @Override
    public void start(Stage stage)
    {
        Line line = new Line();
        line.setStartX(50);
        line.setStartY(50);
        line.setEndX(250);
        line.setEndY(150);
        line.setStroke(Color.BLUE);
        line.setStrokeWidth(2);
        Pane root = new Pane();
       root.getChildren().add(line);
       Scene scene = new Scene(root,400,300);
       stage.setTitle("javafx line example");
       stage.setScene(scene);
       stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
