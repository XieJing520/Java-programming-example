package chapter16_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConvertNumbersQuestion5 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		VBox mainPane = new VBox();

		TextField decimal = new TextField();
		TextField hex = new TextField();
		TextField binary = new TextField();

		Label decimalLabel = new Label("Decimal", decimal);
		Label hexLabel = new Label("Hex", hex);
		Label binaryLabel = new Label("Binary", binary);

		mainPane.getChildren().addAll(decimalLabel, hexLabel, binaryLabel);

		decimalLabel.setContentDisplay(ContentDisplay.RIGHT);
		hexLabel.setContentDisplay(ContentDisplay.RIGHT);
		binaryLabel.setContentDisplay(ContentDisplay.RIGHT);

		decimal.setAlignment(Pos.CENTER_RIGHT);
		hex.setAlignment(Pos.CENTER_RIGHT);
		binary.setAlignment(Pos.CENTER_RIGHT);

		decimal.setOnAction(e -> {
			hex.setText(Integer.toHexString(Integer.parseInt(decimal.getText(), 10)));
			binary.setText(Integer.toBinaryString(Integer.parseInt(decimal.getText(), 10)));
		});

		hex.setOnAction(e -> {
			decimal.setText(Integer.parseInt(hex.getText(), 16) + "");
			binary.setText(Integer.toBinaryString(Integer.parseInt(hex.getText(), 16)));
		});

		binary.setOnAction(e -> {
			hex.setText(Integer.toHexString(Integer.parseInt(binary.getText(), 2)));
			decimal.setText(Integer.parseInt(binary.getText(), 2) + "");
		});

		Scene scene = new Scene(mainPane);
		primaryStage.setTitle("Exercise16_05"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
