package chapter16_exercise;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GeometryTwoCirclesIntersectQuestion8 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		Pane mainPane = new Pane();
		Label
		
		
		
		Button redrawButton = new Button("Redraw Circles");

		mainPane.getChildren().add(redrawButton);


		
		redrawButton.layoutXProperty().bind(mainPane.widthProperty().divide(2).subtract(40));
		redrawButton.layoutYProperty().bind(mainPane.heightProperty().subtract(25));
		

		
		
		Scene scene = new Scene(mainPane, 800, 800);
		primaryStage.setTitle("Exercise16_08"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
