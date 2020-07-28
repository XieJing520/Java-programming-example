package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryInsideAPolygonQuestion14 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Polygon polygon = new Polygon(40, 20, 70, 40, 60, 80, 45, 45, 20, 60);

		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.CHARTREUSE);
		pane.getChildren().add(polygon);

		pane.setOnMouseMoved(e -> {
			pane.getChildren().clear();
			pane.getChildren().add(polygon);
			if (polygon.contains(e.getX(), e.getY())) {
				pane.getChildren().add(new Text(e.getX(), e.getY(), "Mouse point is inside the rectangle"));
			} else {
				pane.getChildren().add(new Text(e.getX(), e.getY(), "Mouse point is outside the rectangle"));
			}
		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_14"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
