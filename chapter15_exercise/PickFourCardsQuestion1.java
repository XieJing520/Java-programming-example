package chapter15_exercise;

import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PickFourCardsQuestion1 extends Application {

	private HBox pane = new HBox();

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		// Create a pane to hold the image views
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(10);

		display();

		Button btRefresh = new Button("Refresh");
		btRefresh.setOnAction(e -> display());

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(btRefresh);
		BorderPane.setAlignment(btRefresh, Pos.CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 1500, 600);
		primaryStage.setTitle("Exercise15_01"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public void display() {
		pane.getChildren().clear();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 52; i++)
			list.add(i);
		Collections.shuffle(list);

		for (int i = 0; i < 4; i++) {
			ImageView imageView = new ImageView("card/" + list.get(i) + ".png");
			imageView.setFitWidth(300);
			imageView.setFitHeight(550);
			pane.getChildren().add(imageView);
		}
	}

}
