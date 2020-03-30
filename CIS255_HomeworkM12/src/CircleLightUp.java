import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class CircleLightUp extends Application {

	private final static int NUM_CIRCLES = 5;
	private final static int POSITION_SPACING = 100;
	private final static int RADIUS = 50;

	public void start(Stage primaryStage) {

		Pane pane = new Pane();

		for (int i = 0; i < NUM_CIRCLES; i++) {

			int center = POSITION_SPACING + i * POSITION_SPACING;
			Circle circle = new Circle(center, center, RADIUS);
			pane.getChildren().add(circle);
			// YOUR CODE HERE: CODE A

			Group circleGroup = new Group();
			circleGroup.getChildren().add(circle);
			circle.setOnMouseEntered(this::handleMouseEvent);
			circle.setOnMouseExited(this::handleMouseEvent);
			pane.getChildren().add(circleGroup);

			
			// Program works if code below is uncommented.
//			circleGroup.setOnMouseEntered(new EventHandler<MouseEvent>() {
//				@Override
//				public void handle(MouseEvent event) {
//					circle.setFill(Color.YELLOW);
//				}
//			});
//
//			circleGroup.setOnMouseExited(new EventHandler<MouseEvent>() {
//				@Override
//				public void handle(MouseEvent event) {
//					circle.setFill(Color.BLACK);
//				}
//			});

		}

		Scene scene = new Scene(pane, 700, 700, Color.AZURE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// YOUR CODE HERE: CODE B

	public void handleMouseEvent(MouseEvent event) {
		// Source should be a circle since that's the only object.
		Object source = event.getSource();

		/*
		 * SysOut here for information to determine the source. 
		 * For the longest time, Lines 30/31 invoked the methods on a GROUP
		 * rather than the circles itself, which is why I could not invoke the Circle
		 * methods to color the circles.
		 */
		
		//System.out.println(source);

		if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
			((Shape) source).setFill(Color.YELLOW);
		}
		
		if(event.getEventType() == MouseEvent.MOUSE_EXITED) {
			((Shape)source).setFill(Color.BLACK);
		}

	}

	public static void main(String[] args) {
		launch(args);

	}

}
