package chapter15_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class CreateASimpleCalculatorQuestion4 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		HBox labelText, buttons;
		labelText = new HBox();
		buttons = new HBox();

		TextField num1, num2, result;

		num1 = new TextField();
		num2 = new TextField();
		result = new TextField();

		num1.setPrefWidth(70);
		num2.setPrefWidth(70);
		result.setPrefWidth(70);

		labelText.setSpacing(10);
		labelText.getChildren().addAll(new Text("Number 1:"), num1, new Text("Number 2:"), num2, new Text("Result:"),
				result);

		Button addBT, subtractBT, multiplyBT, divideBT;

		addBT = new Button("Add");
		subtractBT = new Button("Subtract");
		multiplyBT = new Button("Multiply");
		divideBT = new Button("Divide");

		addBT.setOnAction(e -> {
			result.setText("" + (Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText())));
		});

		subtractBT.setOnAction(e -> {
			result.setText("" + (Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText())));
		});

		multiplyBT.setOnAction(e -> {
			result.setText("" + (Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText())));
		});

		divideBT.setOnAction(e -> {
			if (!num2.getText().equals("0"))
				result.setText("" + (Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText())));
			else
				result.setText("Infinity");
		});

		buttons.getChildren().addAll(addBT, subtractBT, multiplyBT, divideBT);
		buttons.setSpacing(20);
		buttons.setAlignment(Pos.CENTER);

		BorderPane pane = new BorderPane();

		pane.setCenter(labelText);
		pane.setBottom(buttons);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise15_04"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
