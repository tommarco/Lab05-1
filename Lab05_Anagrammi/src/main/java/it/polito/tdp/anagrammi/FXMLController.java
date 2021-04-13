package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Model model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtRisultatoCorretto;

    @FXML
    private TextArea txtRisultatoErrato;

    @FXML
    void doAnagrammi(ActionEvent event) {
    	
    	String parola= txtParola.getText();
    	
    	
    	model.Controlla(parola);
    	
    	txtRisultatoCorretto.setText(model.getC().toString());
    	txtRisultatoErrato.setText(model.getE().toString());
    		
    		
    		
    		
    	}
    	

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtParola.clear();
    	txtRisultatoCorretto.clear();
    	txtRisultatoErrato.clear();

    }
    
    public void setModel(Model model) {
    	
    	this.model= model;
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultatoCorretto != null : "fx:id=\"txtRisultatoCorretto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultatoErrato != null : "fx:id=\"txtRisultatoErrato\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
