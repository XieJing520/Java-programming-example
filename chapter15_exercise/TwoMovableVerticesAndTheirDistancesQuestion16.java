package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoMovableVerticesAndTheirDistancesQuestion16 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		double Circle1X, Circle1Y, Circle2X, Circle2Y;
		Circle1X = Math.random() * 300;
		Circle1Y = Math.random() * 300;
		Circle2X = Math.random() * 300;
		Circle2Y = Math.random() * 300;

		Circle circle1 = new Circle(Circle1X, Circle1Y, 15, Color.WHITE);
		Circle circle2 = new Circle(Circle2X, Circle2Y, 15, Color.WHITE);
		circle1.setStroke(Color.BLACK);
		circle2.setStroke(Color.BLACK);

		Text circle1Text = new Text(Circle1X, Circle1Y, "1");
		Text circle2Text = new Text(Circle2X, Circle2Y, "2");

		double alpha = Math.atan((Circle2Y - Circle1Y) / (Circle2X - Circle1X));

		double circle1PointX, circle1PointY, circle2PointX, circle2PointY;

		if (Circle1X >= Circle2X) {
			circle1PointX = Circle1X - 15 * Math.cos(alpha);
			circle1PointY = Circle1Y - 15 * Math.sin(alpha);
			circle2PointX = Circle2X + 15 * Math.cos(alpha);
			circle2PointY = Circle2Y + 15 * Math.sin(alpha);
		} else {
			circle1PointX = Circle1X + 15 * Math.cos(alpha);
			circle1PointY = Circle1Y + 15 * Math.sin(alpha);
			circle2PointX = Circle2X - 15 * Math.cos(alpha);
			circle2PointY = Circle2Y - 15 * Math.sin(alpha);
		}
		//Text disText = new Text(,,);
		Line line = new Line(circle1PointX, circle1PointY, circle2PointX, circle2PointY);

		pane.getChildren().addAll(circle1, circle2, circle1Text, circle2Text, line,disText);

		
		
		
		
		
		circle1.setOnMouseDragged(e -> {
			circle1.setCenterX(e.getX());
			circle1.setCenterY(e.getY());

			circle1Text.setX(e.getX());
			circle1Text.setY(e.getY());

			double newAlpha = Math.atan(
					(circle2.getCenterY() - circle1.getCenterY()) / (circle2.getCenterX() - circle1.getCenterX()));

			double newCircle1PointX, newCircle1PointY, newCircle2PointX, newCircle2PointY;

			if (circle1.getCenterX() >= circle2.getCenterX()) {
				newCircle1PointX = circle1.getCenterX() - 15 * Math.cos(newAlpha);
				newCircle1PointY = circle1.getCenterY() - 15 * Math.sin(newAlpha);
				newCircle2PointX = circle2.getCenterX() + 15 * Math.cos(newAlpha);
				newCircle2PointY = circle2.getCenterY() + 15 * Math.sin(newAlpha);
			} else {
				newCircle1PointX = circle1.getCenterX() + 15 * Math.cos(newAlpha);
				newCircle1PointY = circle1.getCenterY() + 15 * Math.sin(newAlpha);
				newCircle2PointX = circle2.getCenterX() - 15 * Math.cos(newAlpha);
				newCircle2PointY = circle2.getCenterY() - 15 * Math.sin(newAlpha);
			}

			line.setStartX(newCircle1PointX);
			line.setStartY(newCircle1PointY);
			line.setEndX(newCircle2PointX);
			line.setEndY(newCircle2PointY);
		});

		
		
		
		
		circle2.setOnMouseDragged(e -> {
			circle2.setCenterX(e.getX());
			circle2.setCenterY(e.getY());

			circle2Text.setX(e.getX());
			circle2Text.setY(e.getY());

			double newAlpha = Math.atan(
					(circle2.getCenterY() - circle1.getCenterY()) / (circle2.getCenterX() - circle1.getCenterX()));

			double newCircle1PointX, newCircle1PointY, newCircle2PointX, newCircle2PointY;

			if (circle1.getCenterX() >= circle2.getCenterX()) {
				newCircle1PointX = circle1.getCenterX() - 15 * Math.cos(newAlpha);
				newCircle1PointY = circle1.getCenterY() - 15 * Math.sin(newAlpha);
				newCircle2PointX = circle2.getCenterX() + 15 * Math.cos(newAlpha);
				newCircle2PointY = circle2.getCenterY() + 15 * Math.sin(newAlpha);
			} else {
				newCircle1PointX = circle1.getCenterX() + 15 * Math.cos(newAlpha);
				newCircle1PointY = circle1.getCenterY() + 15 * Math.sin(newAlpha);
				newCircle2PointX = circle2.getCenterX() - 15 * Math.cos(newAlpha);
				newCircle2PointY = circle2.getCenterY() - 15 * Math.sin(newAlpha);
			}

			line.setStartX(newCircle1PointX);
			line.setStartY(newCircle1PointY);
			line.setEndX(newCircle2PointX);
			line.setEndY(newCircle2PointY);

		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise15_16"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
