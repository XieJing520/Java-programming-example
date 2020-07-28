package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AlternateTwoMessagesQuestion6 extends Application {

	private int numberOfPressed = 0;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Text text1 = new Text(100, 100, "Java is fun");
		Text text2 = new Text(100, 100, "Java is powerful");

		pane.setOnMousePressed(e -> {
			pane.getChildren().clear();
			if (e.getButton() == MouseButton.PRIMARY && numberOfPressed % 2 == 0) {
				pane.getChildren().add(text1);
				numberOfPressed++;
			} else if (e.getButton() == MouseButton.PRIMARY && numberOfPressed % 2 != 0) {
				pane.getChildren().add(text2);
				numberOfPressed++;
			}
		});

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise15_06"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
