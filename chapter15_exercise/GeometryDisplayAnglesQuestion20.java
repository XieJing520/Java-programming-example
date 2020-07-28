package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GeometryDisplayAnglesQuestion20 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Circle[] dots = new Circle[3];
		Line[] lines = new Line[3];
		Text[] texts = new Text[3];
		double[] distances = new double[3];
		
		for (int i = 0; i < 3; i++) {
			dots[i] = new Circle(Math.random() * 1000, Math.random() * 600, 10);
			lines[i] = new Line();
			texts[i] = new Text();
		}

		for (int i = 0; i < 3; i++) {
			lines[i].setStartX(dots[i % 3].getCenterX());
			lines[i].setStartY(dots[i % 3].getCenterY());
			lines[i].setEndX(dots[(i + 1) % 3].getCenterX());
			lines[i].setEndY(dots[(i + 1) % 3].getCenterY());
			
			distances[i] = Math.sqrt(Math.pow((dots[i % 3].getCenterX()-dots[(i + 1) % 3].getCenterX()),2)
					+Math.pow((dots[i % 3].getCenterY()-dots[(i + 1) % 3].getCenterY()),2));
			
			
			texts[i].setText("fdaf");
		}

		for (int i = 0; i < 3; i++) {
			pane.getChildren().addAll(dots[i], lines[i],texts[i]);
		}

		dots[0].setOnMouseDragged(e -> {
			dots[0].setCenterX(e.getX());
			dots[0].setCenterY(e.getY());

			lines[0].setStartX(e.getX());
			lines[0].setStartY(e.getY());
			lines[2].setEndX(e.getX());
			lines[2].setEndY(e.getY());
		});

		dots[1].setOnMouseDragged(e -> {
			dots[1].setCenterX(e.getX());
			dots[1].setCenterY(e.getY());

			lines[0].setEndX(e.getX());
			lines[0].setEndY(e.getY());
			lines[1].setStartX(e.getX());
			lines[1].setStartY(e.getY());
		});

		dots[2].setOnMouseDragged(e -> {
			dots[2].setCenterX(e.getX());
			dots[2].setCenterY(e.getY());

			lines[1].setEndX(e.getX());
			lines[1].setEndY(e.getY());
			lines[2].setStartX(e.getX());
			lines[2].setStartY(e.getY());
		});

		Scene scene = new Scene(pane, 1000, 600);
		primaryStage.setTitle("Exercise15_03"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	//public static distances
	
	
}
