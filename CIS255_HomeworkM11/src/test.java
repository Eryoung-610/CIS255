import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class test extends Application {

	private Button button;
	private int clickCount;
	private TextField inputField;
	private Text outputText;

	public void start(Stage primaryStage) {

		clickCount = 0;

		Pane pane = new FlowPane();

		outputText = new Text("Hello World");
		outputText.setFont(Font.font(18));
		outputText.setFill(Color.SKYBLUE);
		pane.getChildren().add(outputText);

		inputField = new TextField();
		inputField.setOnAction(this::handleTextField);
		pane.getChildren().add(inputField);

		Scene scene = new Scene(pane, 300, 300, Color.RED);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello");
		primaryStage.show();
	}

	private void handleButton(ActionEvent event) {
		clickCount++;
		button.setText("Count : " + clickCount);
	}

	public void handleTextField(ActionEvent e) {
		String inputText = inputField.getText();
		boolean correct = inputText.equals("here") ? true : false;
		outputText.setText(correct ? "you got it" : "not quite");
	}

	public static void main(String[] args) {
		launch(args);

	}
}
