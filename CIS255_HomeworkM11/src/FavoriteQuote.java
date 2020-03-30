import javafx.application.*; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.layout.*; 
import javafx.scene.paint.*; 
import javafx.scene.text.*; 
import javafx.geometry.*; 
import javafx.scene.layout.*; 
import javafx.scene.shape.*;


public class FavoriteQuote extends Application{

	private Text quoteText, author;
	
	
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setStyle("-fx-background-color: yellow");
		gridPane.setHgap(3);
		gridPane.setVgap(3);
		
		quoteText = new Text("Never regret anything that made you smile.");
		quoteText.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		quoteText.setFill(Color.DEEPSKYBLUE);
		gridPane.add(quoteText,1,0);
		
		author = new Text(" - Mark Twain");
		author.setFont(Font.font("Arial",FontPosture.ITALIC,18));
		author.setFill(Color.BLACK);
		gridPane.add(author,1,1);
		
		Scene scene = new Scene(gridPane,450,100,Color.GOLDENROD);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Favorite Quote");
		primaryStage.show();
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}

}
