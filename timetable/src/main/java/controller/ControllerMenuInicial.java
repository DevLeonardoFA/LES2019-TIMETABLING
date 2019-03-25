package controller;

import DAO.DaoGeneric;
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

	@FXML TextField txtEmailPro;
	@FXML TextField txtNamePro;
	@FXML TextField txtNomeMateria;

	public void BtnCadastrarCurso() {

		DaoGeneric<Curso> objDaoG = new DaoGeneric<Curso>();
		ObjCadCurso.setNome_curso(txtCurso.getText());
		objDaoG.salvarAtualizar(ObjCadCurso);
		
		txtCurso.setText("");
	}

	public void BtnCadastrarProfessor() {

		DaoGeneric<Professor> objDaoG = new DaoGeneric<Professor>();
		ObjCadPro.setName(txtNamePro.getText());
		ObjCadPro.setEmail(txtEmailPro.getText());
		objDaoG.salvarAtualizar(ObjCadPro);
		
		txtEmailPro.setText("");
		txtNamePro.setText("");
	}

	public void BtnCadastrarMateria() {
		DaoGeneric<Materia> objDaoG = new DaoGeneric<Materia>();
		
		ObjCadMat.setNome(txtNomeMateria.getText());
		objDaoG.salvarAtualizar(ObjCadMat);
		
		txtNomeMateria.setText("");
	}

	private Object mainScreen() {
		// TODO Auto-generated method stub
		return null;
	}
}
