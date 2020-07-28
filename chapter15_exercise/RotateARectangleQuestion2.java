package chapter15_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class RotateARectangleQuestion2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private double angle = 0;

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Rectangle rectangle = new Rectangle();
		pane.getChildren().add(rectangle);

		rectangle.xProperty().bind(pane.widthProperty().divide(4));
		rectangle.yProperty().bind(pane.heightProperty().divide(4));
		rectangle.widthProperty().bind(pane.widthProperty().divide(2));
		rectangle.heightProperty().bind(pane.heightProperty().divide(2));

		Button btRotate = new Button("Rotate");
		btRotate.setOnAction(e -> {
			angle -= 15;
			rectangle.setRotate(angle);
		});

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(btRotate);
		BorderPane.setAlignment(btRotate, Pos.CENTER);

		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("Exercise15_02"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
