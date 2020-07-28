package chapter15_exercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayTheMousePositionQuestion8 extends Application  {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		Text mouseLocation = new Text();
		
		pane.getChildren().add(mouseLocation);
		
		pane.setOnMousePressed(e->{
			mouseLocation.setX(e.getX());
			mouseLocation.setY(e.getY());
			mouseLocation.setText("("+e.getX()+","+e.getY()+")");
		});
		
		pane.setOnMouseReleased(e->{
			mouseLocation.setText("");
		});
		
		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise15_08"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
