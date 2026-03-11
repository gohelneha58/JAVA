import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.geometry.Pos;

public class font_1 extends Application
{
    public void start(Stage stage)
    {
        try
        {
            stage.setTitle("Font");

            TextFlow text_flow = new TextFlow();

            Text text_1 = new Text("hello grace college\n");
            text_1.setFill(Color.BURLYWOOD);

            // ✅ Store font in variable
            Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);

            // ✅ Set font
            text_1.setFont(font);

            text_flow.getChildren().add(text_1);
            text_flow.setLineSpacing(20.0);

            VBox vbox = new VBox(text_flow);
            vbox.setAlignment(Pos.CENTER);

           Scene scene = new Scene(vbox, 400, 300);
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}