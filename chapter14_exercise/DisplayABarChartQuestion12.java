package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class DisplayABarChartQuestion12 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Rectangle ProjectBar, QuizBar, MidtermBar, FinalBar;
		ProjectBar = new Rectangle(10, 175, 100, 120);
		QuizBar = new Rectangle(140, 235, 100, 60);
		MidtermBar = new Rectangle(270, 115, 100, 180);
		FinalBar = new Rectangle(400, 55, 100, 240);

		ProjectBar.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		QuizBar.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		MidtermBar.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		FinalBar.setFill(Color.color(Math.random(), Math.random(), Math.random()));

		Text ProjectTitle, QuizTitle, MidtermTitle, FinalTitle;
		ProjectTitle = new Text("Project -- 20%");
		QuizTitle = new Text("Quiz -- 10%");
		MidtermTitle = new Text("Midterm -- 30%");
		FinalTitle = new Text("Final -- 40%");

		ProjectTitle.setLayoutX(18);
		ProjectTitle.setLayoutY(165);
		QuizTitle.setLayoutX(150);
		QuizTitle.setLayoutY(225);
		MidtermTitle.setLayoutX(275);
		MidtermTitle.setLayoutY(110);
		FinalTitle.setLayoutX(410);
		FinalTitle.setLayoutY(50);

		pane.getChildren().addAll(ProjectBar, QuizBar, MidtermBar, FinalBar, ProjectTitle, QuizTitle, MidtermTitle,
				FinalTitle);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 510, 300);
		primaryStage.setTitle("Exercise14_11"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}
