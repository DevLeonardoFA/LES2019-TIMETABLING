package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ResultScreen {

	@FXML Button BtnSaveResultScrTT;
	@FXML javafx.scene.control.Button BtnCanResultScrTT;

	@FXML
	public void Cancelar() {
		Stage stage = (Stage) BtnCanResultScrTT.getScene().getWindow(); //Obtendo a janela atual
	    stage.close(); //Fechando o Stage
	}
}
