package chapter14_exercise;

import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class InsidePolygonQuestion24 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Scanner input = new Scanner(System.in);

		double[] dots = new double[10];

		for (int i = 0; i < 10; i++)
			dots[i] = input.nextDouble();

		Polygon polygon = new Polygon();
		ObservableList<Double> list = polygon.getPoints();
		for (int i = 0; i < 8; i++)
			list.add(dots[i]);
		polygon.setFill(null);
		polygon.setStroke(Color.BLACK);

		if (polygon.contains(dots[8], dots[9]))
			pane.getChildren().add(new Text(20, 280, "The point is inside the polygon"));
		else
			pane.getChildren().add(new Text(20, 280, "The point isn't inside the polygon"));

		input.close();

		pane.getChildren().addAll(polygon, new Circle(dots[8], dots[9], 10));

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise14_24"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
