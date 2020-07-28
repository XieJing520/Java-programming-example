package chapter15_exercise;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class DrawLinesUsingTheArrowKeysQuestion9 extends Application {

	private double x = 100, y = 100;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Polyline line = new Polyline();

		pane.getChildren().add(line);
		line.setStrokeWidth(5);

		ObservableList<Double> list = line.getPoints();
		list.add(x);
		list.add(y);

		line.setOnKeyPressed(e -> {

			switch (e.getCode()) {

			case DOWN:
				y += 10;
				list.add(x);
				list.add(y);
				break;
			case UP:
				y -= 10;
				list.add(x);
				list.add(y);
				break;
			case LEFT:
				x -= 10;
				list.add(x);
				list.add(y);
				break;
			case RIGHT:
				x += 10;
				list.add(x);
				list.add(y);
				break;
			default:
				break;

			}
		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_09"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		line.requestFocus();
	}

}
