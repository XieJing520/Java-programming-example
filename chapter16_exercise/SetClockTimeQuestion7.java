package chapter16_exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SetClockTimeQuestion7 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		BorderPane mainPane = new BorderPane();
		ClockPane clock = new ClockPane(10, 10, 30);
		HBox hBox = new HBox();
		TextField hourField = new TextField();
		TextField minuteField = new TextField();
		TextField secondField = new TextField();
		Label hourLabel = new Label("Hour", hourField);
		Label minuteLabel = new Label("Minute", minuteField);
		Label secondLabel = new Label("Second", secondField);

		mainPane.setCenter(clock);
		mainPane.setBottom(hBox);
		hBox.getChildren().addAll(hourLabel, minuteLabel, secondLabel);
		hBox.setAlignment(Pos.CENTER);

		hourField.setAlignment(Pos.CENTER_RIGHT);
		hourField.setText("10");
		minuteField.setAlignment(Pos.CENTER_RIGHT);
		minuteField.setText("10");
		secondField.setAlignment(Pos.CENTER_RIGHT);
		secondField.setText("30");

		hourLabel.setContentDisplay(ContentDisplay.RIGHT);
		minuteLabel.setContentDisplay(ContentDisplay.RIGHT);
		secondLabel.setContentDisplay(ContentDisplay.RIGHT);

		hourField.textProperty().addListener(e -> {
			try {
				clock.setHour(Integer.parseInt(hourField.getText()));
			} catch (Exception e2) {
			}

		});

		minuteField.textProperty().addListener(e -> {
			try {
				clock.setHour(Integer.parseInt(minuteField.getText()));
			} catch (Exception e2) {
			}

		});

		secondField.textProperty().addListener(e -> {
			try {
				clock.setHour(Integer.parseInt(secondField.getText()));
			} catch (Exception e2) {
			}

		});

		Scene scene = new Scene(mainPane, 800, 800);
		primaryStage.setTitle("Exercise16_07"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}

class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;

	/** Construct a default clock with the current time */
	public ClockPane() {
		setCurrentTime();
	}

	/** Construct a clock with specified hour, minute, and second */
	public ClockPane(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	/** Return hour */
	public int getHour() {
		return hour;
	}

	/** Set a new hour */
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}

	/** Return minute */
	public int getMinute() {
		return minute;
	}

	/** Set a new minute */
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}

	/** Return second */
	public int getSecond() {
		return second;
	}

	/** Set a new second */
	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}

	/* Set the current time for the clock */
	public void setCurrentTime() {
		// Construct a calendar for the current date and time
		Calendar calendar = new GregorianCalendar();

		// Set current hour, minute and second
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);

		paintClock(); // Repaint the clock
	}

	/** Paint the clock */
	private void paintClock() {
		// Initialize clock parameters
		double clockRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
		double centerX = getWidth() / 2;
		double centerY = getHeight() / 2;

		// Draw circle
		Circle circle = new Circle(centerX, centerY, clockRadius);
		// circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");

		// Draw second hand
		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);

		// Draw minute hand
		double mLength = clockRadius * 0.65;
		double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, xMinute, minuteY);
		mLine.setStroke(Color.BLUE);

		// Draw hour hand
		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);

		getChildren().clear();
		getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
	}

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paintClock();
	}

	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paintClock();
	}
}