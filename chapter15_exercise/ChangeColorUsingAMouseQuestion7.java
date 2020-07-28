package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class ChangeColorUsingAMouseQuestion7 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Circle circle = new Circle(400, 400, 200);

		pane.getChildren().add(circle);
		circle.setFill(Color.RED);

		circle.setOnMousePressed(e -> {
			circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		});

		circle.setOnMouseReleased(e -> {
			circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_07"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
