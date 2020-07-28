package chapter16_exercise;

import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DemonstrateTextFieldPropertiesQuestion6 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		BorderPane mainPane = new BorderPane();
		HBox hBox = new HBox();
		TextField textInput = new TextField();
		TextField sizeInput = new TextField();
		Label inputLabel = new Label("Text Field", textInput);
		Label sizeLabel = new Label("Column Size", sizeInput);
		RadioButton left = new RadioButton("Left");
		RadioButton center = new RadioButton("Center");
		RadioButton right = new RadioButton("Right");
		ToggleGroup toggleGroup = new ToggleGroup();

		mainPane.setCenter(inputLabel);
		mainPane.setBottom(hBox);

		hBox.getChildren().addAll(left, center, right, sizeLabel);
		hBox.setSpacing(20);

		textInput.setAlignment(Pos.CENTER_RIGHT);
		textInput.setText("JavaFX");
		textInput.setPrefColumnCount(12);
		sizeInput.setAlignment(Pos.CENTER_RIGHT);
		sizeInput.setText("12");
		sizeInput.setPrefColumnCount(4);

		inputLabel.setContentDisplay(ContentDisplay.RIGHT);
		sizeLabel.setContentDisplay(ContentDisplay.RIGHT);

		left.setToggleGroup(toggleGroup);
		center.setToggleGroup(toggleGroup);
		right.setToggleGroup(toggleGroup);
		right.setSelected(true);

		left.setOnAction(e -> {
			textInput.setAlignment(Pos.CENTER_LEFT);
		});

		center.setOnAction(e -> {
			textInput.setAlignment(Pos.CENTER);
		});

		right.setOnAction(e -> {
			textInput.setAlignment(Pos.CENTER_RIGHT);
		});

		sizeInput.textProperty().addListener(e -> {
			try {
				textInput.setPrefColumnCount(Integer.parseInt(sizeInput.getText()));
			} catch (NumberFormatException e2) {
			}
		});

		Scene scene = new Scene(mainPane);
		primaryStage.setTitle("Exercise16_06"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();

	}
}
