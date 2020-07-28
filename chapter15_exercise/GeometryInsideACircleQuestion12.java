package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryInsideACircleQuestion12 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Circle circle = new Circle(400, 400, 100);

		circle.setFill(null);
		circle.setStroke(Color.PURPLE);
		pane.getChildren().add(circle);

		pane.setOnMouseMoved(e -> {
			pane.getChildren().clear();
			pane.getChildren().add(circle);
			if (Math.sqrt(Math.pow((e.getX() - 400), 2) + Math.pow((e.getY() - 400), 2)) <= 100) {
				pane.getChildren().add(new Text(e.getX(), e.getY(), "Mouse point is inside the circle"));
			} else {
				pane.getChildren().add(new Text(e.getX(), e.getY(), "Mouse point is outside the circle"));
			}

		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_12"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
