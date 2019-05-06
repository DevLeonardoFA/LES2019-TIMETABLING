package controller;

import java.io.File;
import java.net.URL;

import DAO.DaoGeneric;
import DAO.DaoList;
import DAO.DaoTable;
import javafx.beans.binding.When;
import javafx.beans.value.ObservableListValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.print.Collation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Curso;
import model.Materia;
import model.Professor;
import net.bytebuddy.asm.Advice.Exit;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class ControllerMenuInicial {
	
	Curso ObjCadCurso = new Curso();
	Professor ObjCadPro = new Professor();
	Materia ObjCadMat = new Materia();
	
	@FXML
	private Button btn_Config;
	@FXML
	private Button btn_Register;
	@FXML
	private AnchorPane Pane_cad;
	@FXML
	private Button btn_Hour;
	@FXML
	private AnchorPane Pane_hour;
	@FXML
	private Button btn_Report;
	@FXML
	private AnchorPane Pane_report;
	@FXML
	private Button btn_Leave;

//-----------------------------------------------
	public void BtnRegisterOpenScreen() {
	
		Pane_cad_int_curso.setVisible(false);
		Pane_cad_int_professor.setVisible(false);
		Pane_cad_int_materia.setVisible(false);
		Pane_gen_timetable.setVisible(false);
		Pane_hour.setVisible(false);
		
		if (Pane_cad.isVisible()) {
			Pane_cad.setVisible(false);
		} else {
			Pane_cad.setVisible(true);
		}

	}

	public void BtnHourOpenScreen() {
		Pane_cad_int_curso.setVisible(false);
		Pane_cad_int_professor.setVisible(false);
		Pane_cad_int_materia.setVisible(false);
		Pane_gen_timetable.setVisible(false);
		Pane_cad.setVisible(false);
		
		if (Pane_hour.isVisible()) {
			Pane_hour.setVisible(false);
		} else {
			Pane_hour.setVisible(true);
		}
	}

	public void BtnReportOpenScreen() {
		
		Pane_cad_int_curso.setVisible(false);
		Pane_cad_int_professor.setVisible(false);
		Pane_cad_int_materia.setVisible(false);
		Pane_gen_timetable.setVisible(false);
		Pane_cad.setVisible(false);
		Pane_hour.setVisible(false);
		
		/*if (Pane_report.isVisible()) {
			Pane_report.setVisible(false);
		} else {
			Pane_report.setVisible(true);
		}*/
	}
	
	public void BtnLeave() {
		System.exit(0);
	}

//----------------------------------------------------------------

//	SUB MENU cadastro 

	@FXML
	private Button btn_reg_curso;
	@FXML
	private AnchorPane Pane_cad_int_curso;
	@FXML
	private Button btn_int_cur_concluir;
	@FXML
	private Button btn_reg_professor;
	@FXML
	private AnchorPane Pane_cad_int_professor;
	@FXML
	private Button btn_reg_materia;
	@FXML
	private AnchorPane Pane_cad_int_materia;
	@FXML
	private TextField txtCurso;

	@FXML ComboBox CboPeriodo;
	@FXML ComboBox CboQtdSemestres;
	@FXML TableView TableCurse;
	
	public void BtnOpenCurInt() {
		
		CboQtdSemestres.getItems().setAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		CboPeriodo.getItems().setAll("Manhã","Tarde","Noite");
	
		DaoGeneric<Curso> objdao = new DaoGeneric<Curso>();
		java.util.List<Curso> listaC = objdao.listar(Curso.class);
		ObservableList<Curso> listaCF = FXCollections.observableList(listaC);
		
		TableCurse.getColumns().addAll(listaCF);
		
		TableUpdate();
		
		Pane_cad_int_materia.setVisible(false);
		Pane_cad_int_professor.setVisible(false);
		Pane_gen_timetable.setVisible(false);
		
		if (Pane_cad_int_curso.isVisible()) {
			Pane_cad_int_curso.setVisible(false);
		} else {
			Pane_cad_int_curso.setVisible(true);
		}
	}

	public void BtnOpenProInt() {
		
		Pane_cad_int_curso.setVisible(false);
		Pane_cad_int_materia.setVisible(false);
		Pane_gen_timetable.setVisible(false);
		
		if (Pane_cad_int_professor.isVisible()) {
			Pane_cad_int_professor.setVisible(false);
		} else {
			Pane_cad_int_professor.setVisible(true);
		}
	}

	
	@FXML ComboBox CboListCur;
	@FXML ComboBox CboListPro;
	@FXML ComboBox CboListPer;
	@FXML ComboBox CboListSem;
	@FXML TextField TxtWorkload;
	@FXML TextField TxtInitials;
	
	public void BtnOpenMatInt() {
		Pane_cad_int_curso.setVisible(false);
		Pane_cad_int_professor.setVisible(false);
		Pane_gen_timetable.setVisible(false);
		
		DaoList objdao = new DaoList();
		
		java.util.List<Curso> listaC = objdao.listar(Curso.class, "name");
		ObservableList<Curso> listaCF = FXCollections.observableList(listaC);
		CboListCur.setItems(listaCF);
		
		java.util.List<Professor> listaP = objdao.listar(Professor.class, "name");
		ObservableList<Professor> listaPF = FXCollections.observableList(listaP);
		CboListPro.setItems(listaPF);
		
		CboListSem.getItems().setAll("1", "2", "3", "4", "5", "6");
		
		CboListPer.getItems().setAll("Manhã","Tarde","Noite");
		
		if (Pane_cad_int_materia.isVisible()) {
			Pane_cad_int_materia.setVisible(false);
		} else {
			
			Pane_cad_int_materia.setVisible(true);
		}
	}

//------------------------------------------------------------

	@FXML TextField txtEmailProfessor;
	@FXML TextField txtNameProfessor;
	@FXML TextField txtNameMatter;
	@FXML TextField txtCurse_name;
	@FXML TextField TxtQtdSemestres;
	
	public void BtnCadastrarCurso() {

		DaoGeneric<Curso> objDaoG = new DaoGeneric<Curso>();
		
		ObjCadCurso.setName(txtCurse_name.getText());
		ObjCadCurso.setPeriod(CboPeriodo.getValue().toString());
		ObjCadCurso.setQtdhalf(CboQtdSemestres.getValue().toString());
		ObjCadCurso.setWorkload(TxtQtdSemestres.getText());
		objDaoG.salvarAtualizar(ObjCadCurso);
		
	}

	public void BtnCadastrarProfessor() {

		DaoGeneric<Professor> objDaoG = new DaoGeneric<Professor>();
		ObjCadPro.setName(txtNameProfessor.getText());
		ObjCadPro.setEmail(txtEmailProfessor.getText());
		objDaoG.salvarAtualizar(ObjCadPro);
		
	}

	public void BtnCadastrarMateria() {
		DaoGeneric<Materia> objDaoG = new DaoGeneric<Materia>();
		
		ObjCadMat.setName(txtNameMatter.getText());
		ObjCadMat.setMatter(CboListCur.getValue().toString());
		ObjCadMat.setSemester(CboListSem.getValue().toString());
		ObjCadMat.setPeriod(CboListPer.getValue().toString());
		ObjCadMat.setWorkload(TxtWorkload.getText().toString());
		ObjCadMat.setInitials(TxtInitials.getText());
		ObjCadMat.setProfessional(CboListPro.getValue().toString());
		
		objDaoG.salvarAtualizar(ObjCadMat);
	}
	
	private Object mainScreen() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@FXML private TableColumn<Curso, Long> TableCurseId;
	/*
	@FXML TableColumn TableCurseName;
	@FXML TableColumn TableCursePeriod;
	@FXML TableColumn TableCurseSemester;
	@FXML TableColumn TableCurseTime;
	*/
	private void TableUpdate() {
		/*	
		DaoGeneric<Curso> SelectForTable = new DaoGeneric<Curso>();
		
		ObservableList<Curso> ObsSelectAll = FXCollections.observableList(SelectForTable.listar(Curso.class));
		 */
	}

	
//---------------------------------------------------------
	
// 	SUB MENU HOUR
	
	@FXML AnchorPane Pane_gen_timetable;
	@FXML Button BtnGenerateTT;
	@FXML ComboBox CboPeriodGenerateTT;
	@FXML ComboBox CboCurseGenerateTT;


	public void BtnOpenGenTT() {
		Pane_cad_int_materia.setVisible(false);
		Pane_cad_int_professor.setVisible(false);
		Pane_cad_int_curso.setVisible(false);
	
		DaoList objdao = new DaoList();
		
		java.util.List<Curso> listaC = objdao.listar(Curso.class, "name"); 
		ObservableList<Curso> listaCF = FXCollections.observableList(listaC);
		CboCurseGenerateTT.setItems(listaCF);
		
		CboPeriodGenerateTT.getItems().setAll("Manhã","Tarde","Noite");
		
		if (Pane_gen_timetable.isVisible()) {
			Pane_gen_timetable.setVisible(false);
		} else {
			Pane_gen_timetable.setVisible(true);
		}
			
	}

	public void openscreen() {
		Stage newstage = new Stage();
		Parent rootb = null;

		try {
			URL url = new File(getClass().getResource("/view/resultscreen.fxml").getPath()).toURI().toURL();
			rootb = FXMLLoader.load(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scene newScene = new Scene(rootb);
		newstage.setScene(newScene);
		newstage.setTitle(null);
		newstage.show();
	}
	
	
	public void BtnGenerateTT(){
		String sCurse;
		//String sPeriod;
		
		sCurse = CboCurseGenerateTT.getValue().toString();
		//sPeriod = CboPeriodGenerateTT.getValue().toString();
		
		DaoList objDaolist = new DaoList();
		java.util.List listaC = objDaolist.ListAll(Materia.class, sCurse);
		ObservableList listaCF = FXCollections.observableList(listaC);
		
		System.out.println(listaCF);
		
		openscreen();
		
	}
	
}
