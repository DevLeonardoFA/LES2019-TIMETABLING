package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class mainScreen {
	
	@FXML
	private Button btn_Register;
	@FXML
	private Button btn_Hour;
	@FXML
	private Button btn_Report;
	
	@FXML
	private Pane pane_cad;
	@FXML
	private Pane pane_hour;
	@FXML
	private Pane pane_report;
	
	
	
	public void btn_register_open_screen(){
		if(pane_cad.isVisible()) {
			pane_cad.setVisible(false);	
		}
		else {
			pane_cad.setVisible(true);
		}
		
	}
	public void btn_hour_open_screen(){
		if(pane_hour.isVisible()) {
			pane_hour.setVisible(false);	
		}
		else {
			pane_hour.setVisible(true);
		}
	}
	public void btn_report_open_screen(){
		if(pane_report.isVisible()) {
			pane_report.setVisible(false);	
		}
		else {
			pane_report.setVisible(true);
		}
	}

}
