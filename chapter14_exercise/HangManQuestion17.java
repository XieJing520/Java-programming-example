package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class HangManQuestion17 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Circle head = new Circle(280, 95, 25);
		head.setFill(null);
		head.setStroke(Color.BLACK);

		Arc base = new Arc(70, 370, 60, 30, 0, 180);
		base.setType(ArcType.OPEN);
		base.setFill(Color.WHITE);
		base.setStroke(Color.BLACK);

		Polyline bracket = new Polyline(70, 340, 70, 30, 280, 30, 280, 70);

		Line body, leftArm, rightArm, leftLeg, rightLeg;
		body = new Line(280, 120, 280, 210);
		leftArm = new Line(260, 110, 210, 150);
		rightArm = new Line(300, 110, 350, 150);
		leftLeg = new Line(280, 210, 240, 250);
		rightLeg = new Line(280, 210, 320, 250);

		pane.getChildren().addAll(head, base, bracket, body, leftArm, rightArm, leftLeg, rightLeg);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Exercise14_17"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}