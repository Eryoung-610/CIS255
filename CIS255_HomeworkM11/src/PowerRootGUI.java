import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;
import java.lang.Math;

public class PowerRootGUI extends Application {

	private Button powerButton, squareRootButton;
	private TextField numberField, powerField;
	private Text resultText;

	public void start(Stage primaryStage) {
		VBox mainVBox = new VBox();
		mainVBox.setStyle("-fx-background-color: cyan");
		mainVBox.setAlignment(Pos.CENTER);
		mainVBox.setSpacing(10);

		GridPane gridPane = new GridPane();
		gridPane.setStyle("-fx-background-color: cyan");
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		mainVBox.getChildren().add(gridPane);

		Text numberText = new Text("Number");
		numberText.setFont(Font.font("Helvetica", 24));
		numberText.setFill(Color.BLUE);
		HBox numberTextBox = new HBox(numberText);
		numberTextBox.setAlignment(Pos.CENTER);
		gridPane.add(numberTextBox, 1, 0);

		Text powerText = new Text("Exponent");
		powerText.setFont(Font.font("Helvetica", 24));
		powerText.setFill(Color.BLUE);
		HBox powerTextBox = new HBox(powerText);
		powerTextBox.setAlignment(Pos.CENTER);
		gridPane.add(powerTextBox, 2, 0);

		numberField = new TextField();
		numberField.setPrefWidth(1);
		numberField.setOnAction(this::handleButtons);
		gridPane.add(numberField, 1, 1);

		powerField = new TextField();
		powerField.setPrefWidth(1);
		powerField.setOnAction(this::handleButtons);
		gridPane.add(powerField, 2, 1);

		powerButton = new Button("Calculate Power");
		powerButton.setOnAction(this::handleButtons);
		gridPane.add(powerButton, 1, 2);

		squareRootButton = new Button("Calculate Square Root");
		squareRootButton.setOnAction(this::handleButtons);
		gridPane.add(squareRootButton, 2, 2);

		resultText = new Text("Ready for Math?"); // MODIFY THIS LINE AS NEEDED
		// LINES ADDED HERE AS NEEDED
		resultText.setFont(Font.font("Arial", 20));
		resultText.setFill(Color.BLACK);
		HBox resultTextBox = new HBox(resultText);
		resultTextBox.setAlignment(Pos.CENTER);
		gridPane.add(resultTextBox, 0, 3, 3, 1);

		Scene scene = new Scene(mainVBox, 275, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void handleButtons(ActionEvent event) {
		// YOUR CODE HERE
		try {
			if (event.getSource() == powerButton) {

				double number = Double.parseDouble(numberField.getText());
				double exponent = Double.parseDouble(powerField.getText());
				double power = Math.pow(number, exponent);

				resultText.setText(String.valueOf(power));
				powerButton.setDisable(true);

				if (!(squareRootButton.isDisabled())) {
					powerField.setDisable(false);
					numberField.setDisable(false);
				}

				if (powerButton.isDisabled()) {
					powerField.setDisable(true);
				}

			}
			if (event.getSource() == squareRootButton) {
				double number = Double.parseDouble(numberField.getText()); // Repeated code but I can't find another way
				double squareRoot = Math.sqrt(number); // to get this to work

				resultText.setText(String.valueOf(squareRoot));
				squareRootButton.setDisable(true);

				if (!(powerField.isDisabled())) {
					numberField.setDisable(false);
				}

				if ((squareRootButton.isDisabled())) {
					numberField.setDisable(false);
				}

				if (powerButton.isDisabled()) {
					numberField.setDisable(true);
				}
			}

			if (powerButton.isDisabled() && squareRootButton.isDisabled()) {
				numberField.setDisable(true);
			}

		} catch (NumberFormatException ex) {
			resultText.setText("Error, Try Again");
		} finally {
			numberField.clear();
			powerField.clear();
		}

	}

	public static void main(String[] args) {
		launch(args);

	}

}
