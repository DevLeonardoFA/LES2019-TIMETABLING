package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;


public class ControllerMenuInicial {
	@FXML
	private Button btn_Config;
	@FXML
	private Button btn_Register;
		@FXML
		private Pane pane_cad;
	@FXML
	private Button btn_Hour;
		@FXML
		private Pane pane_hour;
	@FXML
	private Button btn_Report;
		@FXML
		private Pane pane_report;

//-----------------------------------------------
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
	
	
	
	
	
	
	
//----------------------------------------------------------------
	
	
	
	
//	SUB MENU cadastro 
	
	
	
	@FXML
	private Button btn_reg_curso;
		@FXML
		private Pane pane_cad_int_curso;
			@FXML
			private Button btn_int_cur_concluir;
	@FXML
	private Button btn_reg_professor;
		@FXML
		private Pane pane_cad_int_professor;
	@FXML
		private Button btn_reg_materia;
	@FXML
		private Pane pane_cad_int_materia;


	
	
	public void btn_open_cur_int() {
		if(pane_cad_int_curso.isVisible()) {
			pane_cad_int_curso.setVisible(false);
		}else {
			pane_cad_int_curso.setVisible(true);
		}
	}
	public void btn_open_pro_int() {
		if(pane_cad_int_professor.isVisible()) {
			pane_cad_int_professor.setVisible(false);
		}else {
			pane_cad_int_professor.setVisible(true);
		}
	}
	public void btn_open_mat_int() {
		if(pane_cad_int_materia.isVisible()) {
			pane_cad_int_materia.setVisible(false);
		}else {
			pane_cad_int_materia.setVisible(true);
		}
	}
	
	public void btn_cadastrar() {
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Object mainScreen() {
		// TODO Auto-generated method stub
		return null;
	}
}
