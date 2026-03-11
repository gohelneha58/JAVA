import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class image_view_example extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Image image = new Image("file:C:Users\\user\\Documents\\NetBeansProjects\\javafx_bca4\\pic.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        Scene scene = new Scene(root,400,300);
        primaryStage.setTitle("imageView example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
