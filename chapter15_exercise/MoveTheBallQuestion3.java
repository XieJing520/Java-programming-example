package chapter15_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class MoveTheBallQuestion3 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		BallPane ballPane = new BallPane();

		HBox hBox = new HBox();
		Button leftBT, rightBT, upBT, downBT;

		leftBT = new Button("Left");
		rightBT = new Button("Right");
		upBT = new Button("Up");
		downBT = new Button("Down");

		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(leftBT, rightBT, upBT, downBT);

		leftBT.setOnAction(e -> ballPane.moveLeft());
		rightBT.setOnAction(e -> ballPane.moveRight());
		upBT.setOnAction(e -> ballPane.moveUp());
		downBT.setOnAction(e -> ballPane.moveDown());

		BorderPane borderPane = new BorderPane();

		borderPane.setCenter(ballPane);
		borderPane.setBottom(hBox);

		Scene scene = new Scene(borderPane, 1000, 600);
		primaryStage.setTitle("Exercise15_03"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}

class BallPane extends Pane {

	private Circle circle = new Circle(100, 100, 20);

	BallPane() {

		getChildren().add(circle);
	}

	public void moveLeft() {
		if (circle.getCenterX() > 20) {
			circle.setCenterX(circle.getCenterX() - 10);
		} else {
			circle.setCenterX(20);
		}

	}

	public void moveRight() {
		if (circle.getCenterX() < getWidth() - 20) {
			circle.setCenterX(circle.getCenterX() + 10);
		} else {
			circle.setCenterX(getWidth() - 20);
		}
	}

	public void moveUp() {
		if (circle.getCenterY() > 20) {
			circle.setCenterY(circle.getCenterY() - 10);
		} else {
			circle.setCenterY(20);
		}

	}

	public void moveDown() {
		if (circle.getCenterY() < getHeight() - 20) {
			circle.setCenterY(circle.getCenterY() + 10);
		} else {
			circle.setCenterY(getHeight() - 20);
		}
	}
}
