import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class AnonymouseInnerClassExample extends Application
{
    @Override
    public void start(Stage primarystage)
    {
        Button button = new Button("click me!");
        button.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>()
        {
            @Override
            public void handle(javafx.event.ActionEvent event)
            {
                System.out.println("button clicked!");
            }
        });
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root,300,200);
        primarystage.setTitle("Anonymous inner class example");
        primarystage.setScene(scene);
        primarystage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
