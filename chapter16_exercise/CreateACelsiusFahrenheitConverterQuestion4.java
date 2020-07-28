package chapter16_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateACelsiusFahrenheitConverterQuestion4 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		VBox mainPane = new VBox();
		TextField mileField = new TextField();
		TextField kilometerField = new TextField();
		Label mileLabel = new Label("Mile", mileField);
		Label kiloLabel = new Label("Kilometer", kilometerField);

		mainPane.getChildren().addAll(mileLabel, kiloLabel);
		mainPane.setAlignment(Pos.CENTER);

		mileLabel.setContentDisplay(ContentDisplay.RIGHT);
		kiloLabel.setContentDisplay(ContentDisplay.RIGHT);

		mileField.setAlignment(Pos.CENTER_RIGHT);
		kilometerField.setAlignment(Pos.CENTER_RIGHT);

		mileField.setOnAction(e -> {
			kilometerField.setText(Double.parseDouble(mileField.getText()) * 1.609344 + "");
		});

		kilometerField.setOnAction(e -> {
			mileField.setText(Double.parseDouble(kilometerField.getText()) * 0.621371192237 + "");
		});

		Scene scene = new Scene(mainPane);
		primaryStage.setTitle("Exercise16_04"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
