package chapter16_exercise;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class UseRadioButtonsQuestion1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	Text text = new Text(100, 50, "Programming is fun");

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		text.setFont(Font.font(30));

		BorderPane pane = new BorderPane();//
		RadioButton[] buttons = new RadioButton[5];
		ToggleGroup toggleGroup = new ToggleGroup();//
		Button leftButton = new Button("<=");
		Button rightButton = new Button("=>");
		HBox topHBox = new HBox();//
		HBox buttomHBox = new HBox();//

		for (int i = 0; i < 5; i++) {
			buttons[i] = new RadioButton();
			buttons[i].setContentDisplay(ContentDisplay.LEFT);
			topHBox.getChildren().add(buttons[i]);
			buttons[i].setToggleGroup(toggleGroup);
		}
		buttons[0].setText("Red");
		buttons[1].setText("Yellow");
		buttons[2].setText("Black");
		buttons[3].setText("Orange");
		buttons[4].setText("Green");

		// Set topHBox Property
		topHBox.setAlignment(Pos.BOTTOM_CENTER);
		topHBox.setSpacing(10);

		// Set buttomHBox Property
		buttomHBox.setAlignment(Pos.BOTTOM_CENTER);
		buttomHBox.setSpacing(10);
		buttomHBox.getChildren().addAll(leftButton, rightButton);

		Pane testPane = new Pane();
		testPane.getChildren().add(text);

		// Set pane Property
		pane.setTop(topHBox);
		pane.setCenter(testPane);
		pane.setBottom(buttomHBox);

		leftButton.setOnAction(e -> {
			text.setX(text.getX() - 10);
		});

		rightButton.setOnAction(e -> {
			text.setX(text.getX() + 10);
		});

		buttons[0].setOnAction(e -> {
			if (buttons[0].isSelected()) {
				text.setFill(Color.RED);
			}
		});

		buttons[1].setOnAction(e -> {
			if (buttons[1].isSelected()) {
				text.setFill(Color.YELLOW);
			}
		});

		buttons[2].setOnAction(e -> {
			if (buttons[2].isSelected()) {
				text.setFill(Color.BLACK);
			}
		});

		buttons[3].setOnAction(e -> {
			if (buttons[3].isSelected()) {
				text.setFill(Color.ORANGE);
			}
		});

		buttons[4].setOnAction(e -> {
			if (buttons[4].isSelected()) {
				text.setFill(Color.GREEN);
			}
		});

		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("Exercise16_01"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
