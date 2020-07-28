package chapter15_exercise;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlAMovingTextQuestion27 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Text text = new Text("Programming is fun");
		Line line = new Line(0, 400, 1000, 400);

		text.setFont(Font.font(40));
		pane.getChildren().add(text);

		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(5000));
		pt.setPath(line);
		pt.setNode(text);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play(); // Start animation

		pane.setOnMousePressed(e -> {
			pt.pause();
		});

		pane.setOnMouseReleased(e -> {
			pt.play();
		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_12"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}
}
