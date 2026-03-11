import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class animation extends Application {

    @Override
    public void start(Stage stage) {

        Pane root = new Pane();

        // Car body
        Rectangle body = new Rectangle(60, 120, 120, 40);
        body.setFill(Color.RED);

        // Car top
        Rectangle top = new Rectangle(90, 90, 60, 30);
        top.setFill(Color.DARKRED);

        // Wheels
        Circle wheel1 = new Circle(85, 140, 15);
        wheel1.setFill(Color.BLACK);

        Circle wheel2 = new Circle(155, 140, 15);
        wheel2.setFill(Color.BLACK);

        root.getChildren().addAll(body, top, wheel1, wheel2);

        Scene scene = new Scene(root, 600, 200);

        // Animation
        TranslateTransition moveCar = new TranslateTransition();
        moveCar.setNode(root);
        moveCar.setDuration(Duration.seconds(5));
        moveCar.setFromX(0);
        moveCar.setToX(400);
        moveCar.setCycleCount(TranslateTransition.INDEFINITE);
        moveCar.setAutoReverse(true);

        moveCar.play();

        stage.setTitle("Moving Car Animation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}