package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Question17 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();

		pane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().add(new Circle(e.getX(), e.getY(), 10));
				Rectangle rectangle = addRectangle(pane);
				pane.getChildren().add(rectangle);
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
		primaryStage.setTitle("Exercise15_17"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	public static Rectangle addRectangle(Pane pane) {
		
		Rectangle rectangle;
		int minX,minY;
		
		minX = pane.getChildren().get(0);
		minY = pane.getChildren().get(0);
		
		for (int i = 0; i < pane.getChildren().size(); i++) {
			if(pane.getChildren().get(i))
			
			
			if (pane.getChildren().get(i).contains(e.getX(), e.getY())) {
				pane.getChildren().remove(i);
				break;
			}
		}
		
		
	}
}
