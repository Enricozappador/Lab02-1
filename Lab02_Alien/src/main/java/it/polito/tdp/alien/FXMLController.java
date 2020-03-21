package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField inserttxt;

    @FXML
    private Button translatebtn;

    @FXML
    private TextArea responsetxt;

    @FXML
    private Button clearbtn;

    @FXML
    void handleclear(ActionEvent event) {
    	responsetxt.clear();

    }

    @FXML
    void handletranslate(ActionEvent event) {
    	responsetxt.clear();
    	/*String a = inserttxt.getText(); 
    	responsetxt.setText(a);
    	*/

    }

    @FXML
    void initialize() {
        assert inserttxt != null : "fx:id=\"inserttxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert translatebtn != null : "fx:id=\"translatebtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert responsetxt != null : "fx:id=\"responsetxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert clearbtn != null : "fx:id=\"clearbtn\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
