package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveACircleUsingKeysQuestion11 extends Application {

	private double x = 400, y = 400, r = 50;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Circle circle = new Circle(x, y, r);

		pane.getChildren().add(circle);

		circle.setOnKeyPressed(e -> {

			switch (e.getCode()) {

			case UP:
				y -= 20;
				circle.setCenterX(x);
				circle.setCenterY(y);
				break;
			case DOWN:
				y += 20;
				circle.setCenterX(x);
				circle.setCenterY(y);
				break;
			case LEFT:
				x -= 20;
				circle.setCenterX(x);
				circle.setCenterY(y);
				break;
			case RIGHT:
				x += 20;
				circle.setCenterX(x);
				circle.setCenterY(y);
				break;
			default:
				break;
			}

		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_11"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		circle.requestFocus();
	}

}
