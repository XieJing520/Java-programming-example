package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryInsideARectangleQuestion13 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Rectangle rectangle = new Rectangle(400, 400, 200, 160);

		rectangle.setFill(Color.WHITE);
		rectangle.setStroke(Color.CHARTREUSE);
		pane.getChildren().add(rectangle);

		pane.setOnMouseMoved(e -> {
			pane.getChildren().clear();
			pane.getChildren().add(rectangle);
			if (rectangle.contains(e.getX(), e.getY())) {
				pane.getChildren().add(new Text(e.getX(), e.getY(), "Mouse point is inside the rectangle"));
			} else {
				pane.getChildren().add(new Text(e.getX(), e.getY(), "Mouse point is outside the rectangle"));
			}
		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_13"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
