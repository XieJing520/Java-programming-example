package chapter16_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SelectGeometricFiguresQuestion2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		BorderPane mainPane = new BorderPane();
		StackPane stackPane = new StackPane();
		HBox hBox = new HBox();
		ToggleGroup toggleGroup = new ToggleGroup();
		CheckBox checkBox = new CheckBox("Fill");
		RadioButton circle = new RadioButton("circle");
		RadioButton rectangle = new RadioButton("rectangle");
		RadioButton ellipse = new RadioButton("ellipse");
		Circle shapeCircle = new Circle(200);
		Rectangle shapeRectangle = new Rectangle(400, 300);
		Ellipse shapeEllipse = new Ellipse(250, 180);

		mainPane.setCenter(stackPane);
		mainPane.setBottom(hBox);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(circle, rectangle, ellipse, checkBox);

		circle.setToggleGroup(toggleGroup);
		circle.setFont(Font.font(20));
		rectangle.setToggleGroup(toggleGroup);
		rectangle.setFont(Font.font(20));
		ellipse.setToggleGroup(toggleGroup);
		ellipse.setFont(Font.font(20));
		checkBox.setFont(Font.font(20));

		circle.setOnAction(e -> {
			shapeCircle.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			shapeCircle.setFill(null);
			shapeCircle.setStrokeWidth(5);
			stackPane.getChildren().clear();
			stackPane.getChildren().add(shapeCircle);
			if (checkBox.isSelected()) {
				shapeCircle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
			}
		});

		rectangle.setOnAction(e -> {
			shapeRectangle.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			shapeRectangle.setFill(null);
			shapeRectangle.setStrokeWidth(5);
			stackPane.getChildren().clear();
			stackPane.getChildren().add(shapeRectangle);
			if (checkBox.isSelected()) {
				shapeRectangle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
			}
		});

		ellipse.setOnAction(e -> {
			shapeEllipse.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			shapeEllipse.setFill(null);
			shapeEllipse.setStrokeWidth(5);
			stackPane.getChildren().clear();
			stackPane.getChildren().add(shapeEllipse);
			if (checkBox.isSelected()) {
				shapeEllipse.setFill(Color.color(Math.random(), Math.random(), Math.random()));
			}
		});

		checkBox.setOnAction(e -> {
			if (checkBox.isSelected()) {
				if (circle.isSelected()) {
					shapeCircle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
				} else if (rectangle.isSelected()) {
					shapeRectangle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
				} else if (ellipse.isSelected()) {
					shapeEllipse.setFill(Color.color(Math.random(), Math.random(), Math.random()));
				}
			} else {
				if (circle.isSelected()) {
					shapeCircle.setFill(null);
				} else if (rectangle.isSelected()) {
					shapeRectangle.setFill(null);
				} else if (ellipse.isSelected()) {
					shapeEllipse.setFill(null);
				}
			}
		});

		Scene scene = new Scene(mainPane, 600, 600);
		primaryStage.setTitle("Exercise16_02"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}
}
