package chapter15_exercise;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class EyeHandCoordinationQuestion19 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		Circle[] circles = new Circle[5];

//		for (int i = 0; i < 5; i++) {
//			circles[i] = new Circle(Math.random() * pane.getWidth(), Math.random() * pane.getHeight(), 10);
//		}
//
//		for(int i = 0;i < 5;i++) {
//			pane.getChildren().add(circles[i]);
//			circles[i].setOnMouseClicked(e->{
//				if(e.getButton() == MouseButton.PRIMARY) {
//					pane.getChildren().clear();
//					//pane.getChildren().add(circles[i]);
//				}
//			});
//		}
		
		
//		for(int i = 0;i < 5;i++) {
//			Circle circle = new Circle(50, 50, 10);
//			pane.getChildren().add(circle);
//			circle.setOnMouseClicked(e->{
//				if(e.getButton() == MouseButton.PRIMARY) {
//					pane.getChildren().clear();
//				}
//			});
//		
//		}
		
		
//		for(int i = 0;i<5;i++) {
//			circles[i] = new Circle(Math.random()*500,Math.random()*500,10);
//			circles[i].setOnMouseClicked(e->{
//				if(e.getButton() == MouseButton.PRIMARY) {
//					pane.getChildren().addAll(circles);
//				}
//			});
//		}
		
		
		
		
		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_09"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

}
