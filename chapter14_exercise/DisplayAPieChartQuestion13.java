package chapter14_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class DisplayAPieChartQuestion13 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Arc ProjectPie, QuizPie, MidtermPie, FinalPie;
		ProjectPie = new Arc(300, 300, 280, 280, 0, 36);// %10
		QuizPie = new Arc(300, 300, 280, 280, 36, 72);// %20
		MidtermPie = new Arc(300, 300, 280, 280, 108, 108);// %30
		FinalPie = new Arc(300, 300, 280, 280, 216, 144);// %40

		ProjectPie.setType(ArcType.ROUND);
		QuizPie.setType(ArcType.ROUND);
		MidtermPie.setType(ArcType.ROUND);
		FinalPie.setType(ArcType.ROUND);

		ProjectPie.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		QuizPie.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		MidtermPie.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		FinalPie.setFill(Color.color(Math.random(), Math.random(), Math.random()));

		Text ProjectTitle, QuizTitle, MidtermTitle, FinalTitle;
		ProjectTitle = new Text("Project -- 20%");
		QuizTitle = new Text("Quiz -- 10%");
		MidtermTitle = new Text("Midterm -- 30%");
		FinalTitle = new Text("Final -- 40%");

		ProjectTitle.setLayoutX(435);
		ProjectTitle.setLayoutY(260);
		QuizTitle.setLayoutX(350);
		QuizTitle.setLayoutY(120);
		MidtermTitle.setLayoutX(100);
		MidtermTitle.setLayoutY(260);
		FinalTitle.setLayoutX(300);
		FinalTitle.setLayoutY(475);

		ProjectTitle.setFont(Font.font(20));
		QuizTitle.setFont(Font.font(20));
		MidtermTitle.setFont(Font.font(20));
		FinalTitle.setFont(Font.font(20));

		ProjectTitle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		QuizTitle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		MidtermTitle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		FinalTitle.setFill(Color.color(Math.random(), Math.random(), Math.random()));

		pane.getChildren().addAll(ProjectPie, QuizPie, MidtermPie, FinalPie, ProjectTitle, QuizTitle, MidtermTitle,
				FinalTitle);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 600, 600);
		primaryStage.setTitle("Exercise14_11"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}
