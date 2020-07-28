package chapter15_exercise;

import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DisplayARunningFanQuestion28 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Circle circle = new Circle(400, 400, 350);
		Circle circlePath = new Circle(400, 400, 330);
		Arc[] fans = new Arc[4];

		circlePath.setFill(null);
		circlePath.setStroke(Color.DEEPPINK);
		
		
		for (int i = 0; i < 4; i++) {
			fans[i] = new Arc(400, 400, 330, 330, (i * 90), 30);
			fans[i].setType(ArcType.ROUND);
			fans[i].setFill(Color.color(Math.random(), Math.random(), Math.random()));
			pane.getChildren().add(fans[i]);
		}

		// Arc testArc = new Arc(400, 400, 330, 330, startAngle, length))

		circle.setFill(null);
		circle.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		circle.setStrokeWidth(4);

		pane.getChildren().add(circle);
		pane.getChildren().add(circlePath);
		
		
//		PathTransition[] pt = new PathTransition[40];
//
//		for (int i = 0; i < 4; i++) {
//			pt[i] = new PathTransition();
//			pt[i].setPath(circlePath);
//			pt[i].setNode(fans[i]);
//			pt[i].setCycleCount(Timeline.INDEFINITE);
//			pt[i].setDuration(Duration.millis(5000));
//			pt[i].setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
//			pt[i].play();
//		}

		
		
		
		
		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_28"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
