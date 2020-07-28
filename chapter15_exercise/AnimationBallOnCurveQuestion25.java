package chapter15_exercise;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AnimationBallOnCurveQuestion25 extends Application{

	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		
		
		
		
		
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Exercise15_25"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}


}


//Polyline polylineSin = new Polyline();
//Polyline polylineCos = new Polyline();
//ObservableList<Double> listSin = polylineSin.getPoints();
//ObservableList<Double> listCos = polylineCos.getPoints();
//
//Text mTowPi = new Text(getWidth() / 4 - 15, getHeight() * 7 / 8 + 15, "-2\u03c0");
//Text mPi = new Text(getWidth() / 4 + getWidth() / 8 - 15, getHeight() * 7 / 8 + 15, "-\u03c0");
//Text zero = new Text(getWidth() / 2 + 7, getHeight() * 7 / 8 + 15, "0");
//Text TowPi = new Text(getWidth() / 2 + getWidth() / 4 - 15, getHeight() * 7 / 8 + 15, "2\u03c0");
//Text Pi = new Text(getWidth() / 2 + getWidth() / 8 - 15, getHeight() * 7 / 8 + 15, "\u03c0");
//
//mTowPi.setFont(Font.font(20));
//mPi.setFont(Font.font(20));
//zero.setFont(Font.font(20));
//TowPi.setFont(Font.font(20));
//Pi.setFont(Font.font(20));
//
//for (int x = -170; x <= 170; x++) {
//	listSin.add(x + getWidth() / 2);
//	listSin.add(getHeight() * 7 / 8 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
//}
//
//for (int x = -170; x <= 170; x++) {
//	listCos.add(x + getWidth() / 2);
//	listCos.add(getHeight() * 7 / 8 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
//}
//
//polylineSin.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
//polylineSin.setStrokeWidth(4);
//polylineSin.setFill(null);
//
//polylineCos.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
//polylineCos.setStrokeWidth(4);
//polylineCos.setFill(null);
//
//Line lineX = new Line(0, getHeight() * 7 / 8, getWidth() - 15, getHeight() * 7 / 8);
//Line lineY = new Line(getWidth() / 2, getHeight() / 12, getWidth() / 2, getHeight());
//Line arrowHeadXTop = new Line(getWidth() - 15, getHeight() * 7 / 8, getWidth() - 15 - 10 * Math.sqrt(3),
//		getHeight() * 7 / 8 - 10);
//Line arrowHeadXBottom = new Line(getWidth() - 15, getHeight() * 7 / 8, getWidth() - 15 - 10 * Math.sqrt(3),
//		getHeight() * 7 / 8 + 10);
//Line arrowHeadYLeft = new Line(getWidth() / 2, getHeight() / 12, getWidth() / 2 - 10,
//		getHeight() / 12 + 10 * Math.sqrt(3));
//Line arrowHeadYRight = new Line(getWidth() / 2, getHeight() / 12, getWidth() / 2 + 10,
//		getHeight() / 12 + 10 * Math.sqrt(3));
//
//Text textX, textY;
//textX = new Text(getWidth() - 30, getHeight() * 7 / 8 - 20, "X");
//textY = new Text(getWidth() / 2 + 20, getHeight() / 12 + 20, "Y");
//
//getChildren().clear();
//getChildren().addAll(lineX, lineY, arrowHeadXTop, arrowHeadXBottom, arrowHeadYLeft, arrowHeadYRight, textX,
//		textY, polylineSin, polylineCos, mTowPi, mPi, zero, TowPi, Pi);


