package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DrawArrowLineQuestion20 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		double startX, startY, endX, endY;
		startX = Math.random() * 300;
		startY = Math.random() * 300;
		endX = Math.random() * 300;
		endY = Math.random() * 300;

		drawArrowLine(startX, startY, endX, endY, pane);
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise14_20"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {
		Line line = new Line(startX, startY, endX, endY);

		double alpha = -1 * Math.atan((startX - endX) / (startY - endY)) + Math.PI * 5 / 6;
		double leftArrowX, leftArrowY, rightArrowX, rightArrowY;


		Text text = new Text(endX,endY,"s");
		
		
		Line leftArrow = new Line(endX, endY, leftArrowX, leftArrowY);
//		Line rightArrow = new Line(startX,startY,);
//		
//		pane.getChildren().addAll(line,leftArrow,rightArrow);
		pane.getChildren().addAll(line, leftArrow,text);
	}

}
