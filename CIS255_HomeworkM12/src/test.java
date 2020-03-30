import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class test extends Application {

	public void start(Stage primaryStage) {

		VBox Box = new VBox();
		Box.setAlignment(Pos.CENTER);
		Box.setSpacing(40);
		
		Image dogImage = new Image("Final Photo 2.jpg",250,250,true,true);
		ImageView dogImageView = new ImageView(dogImage);
		Box.getChildren().add(dogImageView);
		
		Text description = new Text("Icy Young");
		description.setFont(Font.font(18));
		description.setFill(Color.SKYBLUE);
		Box.getChildren().add(description);
		

		Scene scene = new Scene(Box, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

		
	}

}
