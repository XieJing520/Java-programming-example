package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EnterAndDisplayAStringQuestion10 extends Application {

	private String string = "";

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Text text = new Text();

		pane.getChildren().add(text);

		text.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case ENTER:
				text.setX(200);
				text.setY(200);
				text.setText(string);
				break;
			default:
				string += e.getText();
				break;
			}

		});

		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_10"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		text.requestFocus();
	}

}
