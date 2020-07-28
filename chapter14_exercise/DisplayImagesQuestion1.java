package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DisplayImagesQuestion1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the image views
		Pane pane = new Pane();

		// It'll go wrong when there is no following pictures
		ImageView imageView1 = new ImageView(new Image("ca.gif"));
		ImageView imageView2 = new ImageView(new Image("flag5.gif"));
		ImageView imageView3 = new ImageView(new Image("flag6.gif"));

		imageView1.setFitHeight(200);
		imageView1.setFitWidth(320);
		imageView1.setX(0);
		imageView1.setY(0);

		imageView2.setFitHeight(200);
		imageView2.setFitWidth(320);
		imageView2.setX(0);
		imageView2.setY(210);

		imageView3.setFitHeight(200);
		imageView3.setFitWidth(320);
		imageView3.setX(330);
		imageView3.setY(100);

		pane.getChildren().addAll(imageView1, imageView2, imageView3);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_01"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}