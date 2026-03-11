import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class Panes extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("FlowPane with buttons");
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        FlowPane pane = new FlowPane ();
        pane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
        Scene scene = new Scene(pane , 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
