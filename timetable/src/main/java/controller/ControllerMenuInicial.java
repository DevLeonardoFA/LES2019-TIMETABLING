package controller;

import DAO.DaoGeneric;
import DAO.DaoList;
import antlr.collections.List;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import model.Curso;
import model.Materia;
import model.Professor;
import javafx.scene.control.TextField;

public class ControllerMenuInicial {
	
	Curso ObjCadCurso = new Curso();
	Professor ObjCadPro = new Professor();
	Materia ObjCadMat = new Materia();
	
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
	public void BtnRegisterOpenScreen() {
		if (pane_cad.isVisible()) {
			pane_cad.setVisible(false);
		} else {
			pane_cad.setVisible(true);
		}

	}

	public void BtnHourOpenScreen() {
		if (pane_hour.isVisible()) {
			pane_hour.setVisible(false);
		} else {
			pane_hour.setVisible(true);
		}
	}

	public void BtnReportOpenScreen() {
		if (pane_report.isVisible()) {
			pane_report.setVisible(false);
		} else {
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
	@FXML
	private TextField txtCurso;

	public void BtnOpenCurInt() {
		if (pane_cad_int_curso.isVisible()) {
			pane_cad_int_curso.setVisible(false);
		} else {
			pane_cad_int_curso.setVisible(true);
		}
	}

	public void BtnOpenProInt() {
		if (pane_cad_int_professor.isVisible()) {
			pane_cad_int_professor.setVisible(false);
		} else {
			pane_cad_int_professor.setVisible(true);
		}
	}

	public void BtnOpenMatInt() {
		if (pane_cad_int_materia.isVisible()) {
			pane_cad_int_materia.setVisible(false);
		} else {
			pane_cad_int_materia.setVisible(true);
		}
	}

//------------------------------------------------------------

	@FXML TextField txtEmailProfessor;
	@FXML TextField txtNameProfessor;
	@FXML TextField txtNameMatter;
	@FXML TextField txtCurse_name;

	public void BtnCadastrarCurso() {

		DaoGeneric<Curso> objDaoG = new DaoGeneric<Curso>();
		
		ObjCadCurso.setName(txtCurse_name.getText());
		objDaoG.salvarAtualizar(ObjCadCurso);
		
		txtCurse_name.setText("");
	}

	public void BtnCadastrarProfessor() {

		DaoGeneric<Professor> objDaoG = new DaoGeneric<Professor>();
		ObjCadPro.setName(txtNameProfessor.getText());
		ObjCadPro.setEmail(txtEmailProfessor.getText());
		objDaoG.salvarAtualizar(ObjCadPro);
		
		txtEmailProfessor.setText("");
		txtNameProfessor.setText("");
		
	}

	public void BtnCadastrarMateria() {
		DaoGeneric<Materia> objDaoG = new DaoGeneric<Materia>();
		
		ObjCadMat.setName(txtNameMatter.getText());
		objDaoG.salvarAtualizar(ObjCadMat);
	}

	private Object mainScreen() {
		// TODO Auto-generated method stub
		return null;
	}
}
