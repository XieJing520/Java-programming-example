package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GeometryAddAndRemovePointsQuestion15 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();

		pane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().add(new Circle(e.getX(), e.getY(), 30));
			} else if (e.getButton() == MouseButton.SECONDARY) {
				for (int i = 0; i < pane.getChildren().size(); i++) {
					if (pane.getChildren().get(i).contains(e.getX(), e.getY())) {
						pane.getChildren().remove(i);
						break;
					}
				}
			}
		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_15"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
