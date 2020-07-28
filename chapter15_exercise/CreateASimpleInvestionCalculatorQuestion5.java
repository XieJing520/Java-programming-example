package chapter15_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class CreateASimpleInvestionCalculatorQuestion5 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		BorderPane mainPane = new BorderPane();
		VBox textBox = new VBox();
		VBox textFieldBox = new VBox();
		Text[] texts = new Text[4];
		TextField[] textFields = new TextField[4];
		Button calculate = new Button("Calculate");

		for (int i = 0; i < 4; i++) {
			texts[i] = new Text();
			textFields[i] = new TextField();
			textFields[i].setAlignment(Pos.CENTER_RIGHT);
		}

		texts[0].setText("Investment Amount:");
		texts[1].setText("Number of Years:");
		texts[2].setText("Annual Interest Rate:");
		texts[3].setText("Future value:");

		for (int i = 0; i < 4; i++) {
			textBox.getChildren().add(texts[i]);
			textFieldBox.getChildren().add(textFields[i]);
		}
		textBox.setSpacing(10);
		;

		mainPane.setLeft(textBox);
		mainPane.setRight(textFieldBox);
		mainPane.setBottom(calculate);
		BorderPane.setAlignment(calculate, Pos.BOTTOM_RIGHT);

		calculate.setOnAction(e -> {
			textFields[3].setText("$" + String.format("%.2f",
					Double.parseDouble(textFields[0].getText())
							* Math.pow(1 + Double.parseDouble(textFields[2].getText()) * 0.01 / 12.0,
									Double.parseDouble(textFields[1].getText()) * 12)));
		});

		Scene scene = new Scene(mainPane);
		primaryStage.setTitle("Exercise15_05"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
