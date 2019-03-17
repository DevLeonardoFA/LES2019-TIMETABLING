package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;


public class mainScreen {
//-----------------------------------------------
//Buttons Menu Principal

	@FXML
	private Button btn_Config;
	@FXML
	private Button btn_Register;
	@FXML
	private Button btn_Hour;
	@FXML
	private Button btn_Report;
	
//------------------------------------------------
//Butons Menu de Cadastro

	@FXML
	private Button btn_reg_curso;
	@FXML
	private Button btn_reg_professor;
	@FXML
	private Button btn_reg_materia;
	
//------------------------------------------------
//Buttons de confirmar

	@FXML
	private Button btn_int_cur_concluir;
	
//-----------------------------------------------
//Telas filhas do menu Principal
	
	//Tela Menu de Cadastro
	@FXML
	private Pane pane_cad;
	
	//Tela Menu de Horas
	@FXML
	private Pane pane_hour;
	
	//Tela Menu de Relatorio
	@FXML
	private Pane pane_report;
	
//-----------------------------------------------
//Telas filhas do menu secundário
	
	@FXML
	private Pane pane_cad_int_curso;
	@FXML
	private Pane pane_cad_int_professor;
	@FXML
	private Pane pane_cad_int_materia;

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

	public void btn_open_reg_cur_int() {
		if(pane_cad_int_curso.isVisible()) {
			pane_cad_int_curso.setVisible(false);
		}else {
			pane_cad_int_curso.setVisible(true);
		}
	}
	
}
