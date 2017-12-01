package control;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX{

	@FXML
	private JFXButton btnOpenFree;
	
 

    /**
     * Metodo asignado al boton Getstarted que nos abrira 
     * un nuevo Stage llamadoFreeSolo.fxml
     */
	@FXML
    void openStage(ActionEvent event) {
		AnchorPane pane;
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/FreeSolo.fxml"));
			pane = loader.load();
			Stage sendStage = new Stage();
	        sendStage.setTitle("FreeSolo");
	        
	        Scene scene = new Scene(pane);
	        sendStage.setScene(scene);
	        sendStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
	
	@FXML
    void closeApp(ActionEvent event) {
		Platform.exit();
    }
	
	
}
