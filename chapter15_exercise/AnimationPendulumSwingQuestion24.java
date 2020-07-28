package chapter15_exercise;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationPendulumSwingQuestion24 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Arc arc = new Arc(400, 400, 300, 200, -180, 180);
		Circle circle = new Circle(50, 50, 20);

		arc.setType(ArcType.OPEN);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);

		pane.getChildren().addAll(arc, circle);

		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(3000));
		pt.setPath(arc);
		pt.setNode(circle);
		pt.setOrientation(null);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play(); // Start animation

		pane.setOnMousePressed(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pt.pause();
			}
		});

		pane.setOnMouseReleased(e -> {
			pt.play();
		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_24"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
