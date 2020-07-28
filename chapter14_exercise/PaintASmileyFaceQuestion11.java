package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class PaintASmileyFaceQuestion11 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Circle face = new Circle(150, 150, 140);
		face.setStroke(Color.BLACK);
		face.setFill(Color.WHITE);

		Arc mouth = new Arc(150, 210, 80, 50, -20, -140);
		mouth.setType(ArcType.OPEN);
		mouth.setStroke(Color.BLACK);
		mouth.setFill(Color.WHITE);

		Ellipse leftEye, rightEye;
		leftEye = new Ellipse(80, 100, 40, 20);
		rightEye = new Ellipse(220, 100, 40, 20);
		leftEye.setFill(Color.WHITE);
		rightEye.setFill(Color.WHITE);
		leftEye.setStroke(Color.BLACK);
		rightEye.setStroke(Color.BLACK);

		Circle leftEye1, rightEye1;
		leftEye1 = new Circle(80, 100, 15);
		rightEye1 = new Circle(220, 100, 15);
		leftEye1.setFill(Color.BLACK);
		rightEye1.setFill(Color.BLACK);

		Polygon nose = new Polygon(150, 120, 190, 200, 110, 200);
		nose.setFill(Color.WHITE);
		nose.setStroke(Color.BLACK);

		pane.getChildren().addAll(face, mouth, leftEye, rightEye, leftEye1, rightEye1, nose);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise14_11"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}