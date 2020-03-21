package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private AlienDictionary dizionario = new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Inserttxt;

    @FXML
    private Button Translatebtn;

    @FXML
    private TextArea Resulttxt;

    @FXML
    private Button Cleartxt;

    @FXML
    void handleClear(ActionEvent event) {
    	Resulttxt.clear();
    	Inserttxt.clear();
    }

    @FXML
    void handleTranslate(ActionEvent event) {
    	Resulttxt.clear();
    	
    	String input = Inserttxt.getText().toLowerCase();
    	String alienWord = "";
    	String translation = "";
    	    	if(input.length()==0 || input==null) {
    		Resulttxt.appendText("Devi inserire almeno una parola!!");
    		return;
    	}
    	    	
    	    	/*if(!input.matches('[a-zA-Z]*')) {
    	    		Resulttxt.appendText("Puoi inserire solamente lettere!");
    	    		return
    	    	}*/
    	    	
    	    	if(!input.matches("[a-zA-Z]*")) {
    	    		Resulttxt.appendText("Puoi inserire soltanto lettere!!");
    	    	}
    	
    if(input.contains(" ")==true) {
    	String[] split = input.split(" "); 
    	
    	
    	alienWord = split[0];
    	translation = split [1]; 
    	dizionario.addWord(alienWord, translation);
    	Resulttxt.appendText("Abbiamo aggiunto la tua Traduzione! "+alienWord+ " significa : "+translation);
    	return;
    	
    	
    	//Resulttxt.appendText("Puoi inserire soltanto 2 parole!!");
    		//afreturn;
    }
    else {
   Resulttxt.appendText("La parola : " +input+ "in alieno significa : "+dizionario.translateWord(input));
   return;
    }
    	    	
    	    
    
    

    }

    @FXML
    void initialize() {
        assert Inserttxt != null : "fx:id=\"Inserttxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Translatebtn != null : "fx:id=\"Translatebtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Resulttxt != null : "fx:id=\"Resulttxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Cleartxt != null : "fx:id=\"Cleartxt\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
