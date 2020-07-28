package chapter16_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TrafficLightsQuestion3 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		BorderPane mainPane = new BorderPane();
		StackPane colorsPane = new StackPane();
		VBox lightsPane = new VBox();
		HBox bottonsBox = new HBox();

		Circle redLight = new Circle(20);
		Circle yellowLight = new Circle(20);
		Circle greenLight = new Circle(20);
		Rectangle borderLights = new Rectangle(50, 150);

		RadioButton red = new RadioButton("Red");
		RadioButton yellow = new RadioButton("Yellow");
		RadioButton green = new RadioButton("Green");
		ToggleGroup colorsGroup = new ToggleGroup();

		mainPane.setCenter(colorsPane);
		mainPane.setBottom(bottonsBox);
		lightsPane.setAlignment(Pos.CENTER);
		lightsPane.setSpacing(10);
		lightsPane.getChildren().addAll(redLight, yellowLight, greenLight);
		colorsPane.getChildren().addAll(lightsPane, borderLights);
		bottonsBox.getChildren().addAll(red, yellow, green);
		bottonsBox.setAlignment(Pos.CENTER);
		bottonsBox.setSpacing(20);

		borderLights.setFill(null);
		borderLights.setStroke(Color.BLACK);
		borderLights.setStrokeWidth(5);
		redLight.setFill(null);
		redLight.setStroke(Color.BLACK);
		yellowLight.setFill(null);
		yellowLight.setStroke(Color.BLACK);
		greenLight.setFill(null);
		greenLight.setStroke(Color.BLACK);

		red.setToggleGroup(colorsGroup);
		red.setFont(Font.font(23));
		yellow.setToggleGroup(colorsGroup);
		yellow.setFont(Font.font(23));
		green.setToggleGroup(colorsGroup);
		green.setFont(Font.font(23));

		red.setOnAction(e -> {
			redLight.setFill(Color.RED);
			yellowLight.setFill(null);
			greenLight.setFill(null);
		});

		yellow.setOnAction(e -> {
			redLight.setFill(null);
			yellowLight.setFill(Color.YELLOW);
			greenLight.setFill(null);
		});

		green.setOnAction(e -> {
			redLight.setFill(null);
			yellowLight.setFill(null);
			greenLight.setFill(Color.GREEN);
		});

		Scene scene = new Scene(mainPane, 600, 600);
		primaryStage.setTitle("Exercise16_03"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
