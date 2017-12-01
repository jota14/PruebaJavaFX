package control;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * 
 * @author Jozet Quipuscoa Ponte
 * @version 1.0
 * Esta clase es la principal que abre nuestra ventana Login.fxml
 *
 */
public class MainFX extends Application {
	@Override
	public void start(Stage primaryStage) {
		AnchorPane anchor;
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/Login.fxml"));
			anchor = loader.load();
			Scene scene = new Scene(anchor);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
