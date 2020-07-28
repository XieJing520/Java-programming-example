package chapter14_exercise;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;


public class PlotTheQuadraticFunctionQuestion18 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place it in the stage
		Scene scene = new Scene(new MyQuadFunc(), 400, 400);
		primaryStage.setTitle("Exercise14_18"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}

class MyQuadFunc extends Pane {
	private void paint() {
		
		Polyline polyline = new Polyline();
		ObservableList<Double> list = polyline.getPoints();
		double scaleFactor = 0.0125;
		
		for(int x = -100;x <= 100;x++) {
			list.add(x+getWidth()/2);
			list.add(-1*scaleFactor*x*x+getHeight()*7/8);
		}
		
		polyline.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		polyline.setStrokeWidth(4);
		
		Line lineX = new Line(0,getHeight()*7/8,getWidth()-15,getHeight()*7/8);
		Line lineY = new Line(getWidth()/2,getHeight()/12,getWidth()/2,getHeight());
		Line arrowHeadXTop = new Line(getWidth()-15,getHeight()*7/8,getWidth()-15-10 * Math.sqrt(3),getHeight()*7/8-10);
		Line arrowHeadXBottom = new Line(getWidth()-15,getHeight()*7/8,getWidth()-15-10 * Math.sqrt(3),getHeight()*7/8+10);
		Line arrowHeadYLeft = new Line(getWidth()/2,getHeight()/12,getWidth()/2-10,getHeight()/12+10 * Math.sqrt(3));
		Line arrowHeadYRight = new Line(getWidth()/2,getHeight()/12,getWidth()/2+10,getHeight()/12+10 * Math.sqrt(3));
		
		Text textX,textY;
		textX = new Text(getWidth()-30,getHeight()*7/8-20, "X");
		textY = new Text(getWidth()/2+20,getHeight()/12+20, "Y");
		
		
		getChildren().clear();
		getChildren().addAll(lineX,lineY,arrowHeadXTop,arrowHeadXBottom,arrowHeadYLeft,arrowHeadYRight,textX,textY,polyline);
	}

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}

	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}
