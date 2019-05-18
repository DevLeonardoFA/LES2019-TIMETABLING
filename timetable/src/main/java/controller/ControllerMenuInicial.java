package controller;

import java.io.File;
import java.net.URL;
import java.util.List;

import DAO.DaoGeneric;
import DAO.DaoList;
import DAO.DaoTable;
import Tabelas.TabelaCurso;
import Tabelas.TabelaMateria;
import Tabelas.TabelaProfessor;
import Tabelas.TabelaProfessorHora;
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
import javafx.stage.StageStyle;
import model.Curso;
import model.Materia;
import model.Professor;
import net.bytebuddy.asm.Advice.Exit;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TreeTableView;

public class ControllerMenuInicial {
	
	Curso ObjCadCurso = new Curso();
	Professor ObjCadPro = new Professor();
	Materia ObjCadMat = new Materia();
	
	@FXML private Button btn_Config;
	@FXML private Button btn_Register;
	@FXML private AnchorPane Pane_cad;
	@FXML private Button btn_Hour;
	@FXML private AnchorPane Pane_hour;
	@FXML private Button btn_Report;
	@FXML private AnchorPane Pane_report;
	@FXML private Button btn_Leave;


	@FXML private ComboBox CboListCur;
	@FXML private ComboBox CboListPro;
	@FXML private ComboBox CboListPer;
	@FXML private ComboBox CboListSem;
	@FXML private TextField TxtWorkload;
	@FXML private TextField TxtInitials;
	
	
	@FXML private Button btn_reg_curso;
	@FXML private AnchorPane Pane_cad_int_curso;
	@FXML private Button btn_int_cur_concluir;
	@FXML private Button btn_reg_professor;
	@FXML private AnchorPane Pane_cad_int_professor;
	@FXML private Button btn_reg_materia;
	@FXML private AnchorPane Pane_cad_int_materia;
	@FXML private TextField txtCurso;

	
	@FXML private TableView<TabelaCurso> TableCurse;
	
	
	@FXML private TableColumn<TabelaCurso, Long> TableCurseId;
	@FXML private TableColumn<TabelaCurso, String> TableCurseName;
	@FXML private TableColumn<TabelaCurso, String> TableCursePeriod;
	@FXML private TableColumn<TabelaCurso, String> TableCurseSemester;
	@FXML private TableColumn<TabelaCurso, String> TableCurseTime;
	
	@FXML private ComboBox CboPeriodo;
	@FXML private ComboBox CboQtdSemestres;
	@FXML private TextField TxtWorkloadCurso;

	@FXML private TableView TableP;
	@FXML private TableView<TabelaProfessorHora> TablePH;
	@FXML private TableColumn TablePId;
	@FXML private TableColumn TablePName;
	@FXML private TableColumn TablePEmail;
	
	@FXML private TableColumn TableMId;
	@FXML private TableColumn TableMName;
	@FXML private TableColumn TableMCurse;
	@FXML private TableColumn TableMPeriod;
	@FXML private TableView TableM;
	
	
	@FXML private TextField txtEmailProfessor;
	@FXML private TextField txtNameProfessor;
	@FXML private TextField txtNameMatter;
	@FXML private TextField txtCurse_name;
	@FXML private TextField TxtQtdSemestres;
	

	@FXML private AnchorPane Pane_gen_timetable;
	@FXML private Button BtnGenerateTT;
	@FXML private ComboBox CboPeriodGenerateTT;
	@FXML private ComboBox CboCurseGenerateTT;

	@FXML private Button BtnCadastrarCur;
	@FXML private Button BtnEditCurso;
	@FXML private Button BtnDeleteCurso;
	
	@FXML private Button BtnCadastrarProfessor;
	@FXML private Button BtnEditProfessor;
	@FXML private Button BtnDeleteProfessor;
	
	@FXML private Button BtnCadastrarMat;
	@FXML private Button BtnEditMateria;
	@FXML private Button BtnDeleteMateria;
	
	@FXML private Button BtnBacktoNormalC;
	@FXML private Button BtnBacktoNormalP;
	@FXML private Button BtnBacktoNormalM;
	
	@FXML RadioButton radProfessoresLista;
	@FXML RadioButton radProfessoresHora;
	
	@FXML TableColumn<TabelaProfessorHora, String> colHor;
	@FXML TableColumn<TabelaProfessorHora, Boolean> colDom;
	@FXML TableColumn<TabelaProfessorHora, Boolean> colSeg;
	@FXML TableColumn<TabelaProfessorHora, Boolean> colTer;
	@FXML TableColumn<TabelaProfessorHora, Boolean> colQua;
	@FXML TableColumn<TabelaProfessorHora, Boolean> colQui;
	@FXML TableColumn<TabelaProfessorHora, Boolean> colSex;
	@FXML TableColumn<TabelaProfessorHora, Boolean> colSab;
	
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

	
	DaoGeneric daoG = new DaoGeneric();
	
	
	
	private DaoTable<Curso> daoTableC = new DaoTable<Curso>();
	private List<Curso> cursolist = daoTableC.list(Curso.class);
	private ObservableList<TabelaCurso> ListTelaCurso = FXCollections.observableArrayList();

	public void TableUpdateCurso() {
		
		if(!ListTelaCurso.isEmpty()) {
			ListTelaCurso.clear();
		}
		
		for(Curso curso : cursolist) {
			
			TabelaCurso objTabelaCurso = new TabelaCurso(curso.getId(), curso.getName(), 
					curso.getPeriod(), curso.getQtdhalf(), curso.getWorkload());
			
			ListTelaCurso.add(objTabelaCurso);
			
		}
		
		TableCurseId.setCellValueFactory(new PropertyValueFactory<TabelaCurso, Long>("id"));
		TableCurseName.setCellValueFactory(new PropertyValueFactory<TabelaCurso, String>("nome"));
		TableCursePeriod.setCellValueFactory(new PropertyValueFactory<TabelaCurso, String>("periodo"));
		TableCurseSemester.setCellValueFactory(new PropertyValueFactory<TabelaCurso, String>("semestre"));
		TableCurseTime.setCellValueFactory(new PropertyValueFactory<TabelaCurso, String>("tempo"));
		
		TableCurse.setItems(ListTelaCurso);
		
	}

	private DaoTable<Professor> daoTableP = new DaoTable<Professor>();
	private List<Professor> professorlist = daoTableP.list(Professor.class);
	private ObservableList<TabelaProfessor> ListTelaProfessor = FXCollections.observableArrayList();
	
	
	public void TableUpdateProfessor() {
		
		if(!ListTelaProfessor.isEmpty()) {
			ListTelaProfessor.clear();
		}
		
		for(Professor professor : professorlist) {
			
			TabelaProfessor objTabelaProfessor = new TabelaProfessor(professor.getId(), professor.getName(), 
					professor.getEmail());
			
			ListTelaProfessor.add(objTabelaProfessor);
			
		}
		
		TablePId.setCellValueFactory(new PropertyValueFactory<TabelaProfessor, Long>("id"));
		TablePName.setCellValueFactory(new PropertyValueFactory<TabelaProfessor, String>("nome"));
		TablePEmail.setCellValueFactory(new PropertyValueFactory<TabelaProfessor, String>("email"));
		
		TableP.setItems(ListTelaProfessor);
	}

	private DaoTable<Materia> daoTableM = new DaoTable<Materia>();
	private List<Materia> materialist = daoTableM.list(Materia.class);
	private ObservableList<TabelaMateria> ListTelaMateria = FXCollections.observableArrayList();
	 
	public void TableUpdateMateria() {
		
		if(!ListTelaMateria.isEmpty()) {
			ListTelaMateria.clear();
		}
		
		for(Materia materia : materialist) {
			
			TabelaMateria objTabelaMateria = new TabelaMateria(materia.getId(), materia.getName(), materia.getMatter(), materia.getPeriod());
			
			ListTelaMateria.add(objTabelaMateria);
			
		}
		
		TableMId.setCellValueFactory(new PropertyValueFactory<TabelaMateria, Long>("id"));
		TableMName.setCellValueFactory(new PropertyValueFactory<TabelaMateria, String>("nome"));
		TableMCurse.setCellValueFactory(new PropertyValueFactory<TabelaMateria, String>("curso"));
		TableMPeriod.setCellValueFactory(new PropertyValueFactory<TabelaMateria, String>("periodo"));
		
		TableM.setItems(ListTelaMateria);
		
	}

	
	//-------------------------------------------------------
	public void TableDeleteCurso() {	
		TabelaCurso TCurso = TableCurse.getSelectionModel().getSelectedItem();
		long id = TCurso.getId();
		
		ListTelaCurso.remove(TCurso);
		
		Curso c = new Curso();
		c.setId(id);
		
		daoG.deletar(c); 
		
		cursolist = daoTableC.list(Curso.class);
		TableUpdateCurso();
	}
	
	public void TableDeleteProfessor() {	
		Professor objPro = new Professor();
		TabelaProfessor TProf = (TabelaProfessor) TableP.getSelectionModel().getSelectedItem();
		Long id = TProf.getId();
		
		ListTelaProfessor.remove(TProf);
		
		Professor p = new Professor();
		p.setId(id);
		
		
		daoG.deletar(p);
		professorlist = daoTableP.list(Professor.class);
		TableUpdateCurso();
	}
	
	public void TableDeleteMateria() {	
		TabelaMateria TMat = (TabelaMateria) TableM.getSelectionModel().getSelectedItem();
		Long id = TMat.getid();
		
		ListTelaMateria.remove(TMat);
		
		Materia m = new Materia();
		m.setId(id);
		
		daoG.deletar(m);
		materialist = daoTableM.list(Materia.class);
		TableUpdateCurso();
	}
	
	//------------------------------------------------------
	
	public void TableFromFieldsCurso() {
		TabelaCurso TabelaCurso = TableCurse.getSelectionModel().getSelectedItem();
		long id = TabelaCurso.getId();
		
		DaoTable daoT = new DaoTable();
		
		Curso c = new Curso();
		c.setId(id);
		
		ObservableList<Curso> list = FXCollections.observableArrayList(daoT.listEsp(c));
		
		txtCurse_name.setText(list.get(0).getName());
		TxtWorkloadCurso.setText(list.get(0).getWorkload());
		CboQtdSemestres.setValue(list.get(0).getQtdhalf().toString());
		CboPeriodo.setValue(list.get(0).getPeriod().toString());

		BtnCadastrarCur.setVisible(false);
		BtnEditCurso.setVisible(true);
		BtnDeleteCurso.setVisible(true);
		BtnBacktoNormalC.setVisible(true);
	}
	
	public void TableFromFieldsProfessor() {
		TabelaProfessor TabelaProfessor = (Tabelas.TabelaProfessor) TableP.getSelectionModel().getSelectedItem();
		long id = TabelaProfessor.getId();
		
		DaoTable daoT = new DaoTable();
		
		Professor p = new Professor();
		p.setId(id);
		
		ObservableList<Professor> list = FXCollections.observableArrayList(daoT.listEsp(p));
		
		txtNameProfessor.setText(list.get(0).getName());
		txtEmailProfessor.setText(list.get(0).getEmail());

		BtnCadastrarProfessor.setVisible(false);
		BtnEditProfessor.setVisible(true);
		BtnDeleteProfessor.setVisible(true);
		BtnBacktoNormalP.setVisible(true);
		
	}
	
	public void TableFromFieldsMateria() {
		TabelaMateria TabelaMateria = (Tabelas.TabelaMateria) TableM.getSelectionModel().getSelectedItem();
		long id = TabelaMateria.getid();
		
		DaoTable daoT = new DaoTable();
		
		Materia m = new Materia();
		m.setId(id);
		
		ObservableList<Materia> list = FXCollections.observableArrayList(daoT.listEsp(m));
		
		txtNameMatter.setText(list.get(0).getName());
		CboListCur.setValue(list.get(0).getMatter().toString());
		CboListSem.setValue(list.get(0).getSemester().toString());
		CboListPer.setValue(list.get(0).getPeriod().toString());
		TxtWorkload.setText(list.get(0).getWorkload());
		TxtInitials.setText(list.get(0).getInitials());
		CboListPro.setValue(list.get(0).getProfessional().toString());
		
		BtnCadastrarMat.setVisible(false);
		BtnEditMateria.setVisible(true);
		BtnDeleteMateria.setVisible(true);
		BtnBacktoNormalM.setVisible(true);
	}
	
	public void BacktoNormalC() {
		BtnBacktoNormalC.setVisible(false);
		BtnCadastrarCur.setVisible(true);
		BtnEditCurso.setVisible(false);
		BtnDeleteCurso.setVisible(false);
	}
	
	public void BacktoNormalP() {
		BtnBacktoNormalP.setVisible(false);
		BtnCadastrarProfessor.setVisible(true);
		BtnEditProfessor.setVisible(false);
		BtnDeleteProfessor.setVisible(false);
	}
	
	public void BacktoNormalM() {
		BtnBacktoNormalM.setVisible(false);
		BtnCadastrarMat.setVisible(true);
		BtnEditMateria.setVisible(false);
		BtnDeleteMateria.setVisible(false);
	}
	
	
	public void TableEditCurso() {
		
		ObjCadCurso.setName(txtCurse_name.getText());
		ObjCadCurso.setQtdhalf(CboQtdSemestres.getValue().toString());
		ObjCadCurso.setWorkload(TxtWorkloadCurso.getText());
		ObjCadCurso.setPeriod(CboPeriodo.getValue().toString());
		
		daoG.salvarAtualizar(ObjCadCurso);
		
		cursolist = daoTableC.list(Curso.class);
		TableUpdateCurso();
		
	}
	
	
	
	private ObservableList<TabelaProfessorHora> listadeHoras(){
		return FXCollections.observableArrayList(
				new TabelaProfessorHora("07:40"),
				new TabelaProfessorHora("09:30"),
				new TabelaProfessorHora("11:20"),
				new TabelaProfessorHora("13:10"),
				new TabelaProfessorHora("15:00"),
				new TabelaProfessorHora("16:50"),
				new TabelaProfessorHora("19:00"),
				new TabelaProfessorHora("21:40")
				);
	} 
	
	public void AtualizarTabelaHora() {
	
		colHor.setCellValueFactory(new PropertyValueFactory<TabelaProfessorHora, String>("horaField"));
		colDom.setCellValueFactory(new PropertyValueFactory<TabelaProfessorHora, Boolean>("horaDom"));
		colSeg.setCellValueFactory(new PropertyValueFactory<TabelaProfessorHora, Boolean>("horaSeg"));
		colTer.setCellValueFactory(new PropertyValueFactory<TabelaProfessorHora, Boolean>("horaTer"));
		colQua.setCellValueFactory(new PropertyValueFactory<TabelaProfessorHora, Boolean>("horaQua"));
		colQui.setCellValueFactory(new PropertyValueFactory<TabelaProfessorHora, Boolean>("horaQui"));
		colSex.setCellValueFactory(new PropertyValueFactory<TabelaProfessorHora, Boolean>("horaSex"));
		colSab.setCellValueFactory(new PropertyValueFactory<TabelaProfessorHora, Boolean>("horaSab"));
		 
		colDom.setCellFactory(CheckBoxTableCell.forTableColumn(colDom));
		colSeg.setCellFactory(CheckBoxTableCell.forTableColumn(colSeg));
		colTer.setCellFactory(CheckBoxTableCell.forTableColumn(colTer));
		colQua.setCellFactory(CheckBoxTableCell.forTableColumn(colQua));
		colQui.setCellFactory(CheckBoxTableCell.forTableColumn(colQui));
		colSex.setCellFactory(CheckBoxTableCell.forTableColumn(colSex));
		colSab.setCellFactory(CheckBoxTableCell.forTableColumn(colSab));
		
		TablePH.setItems(listadeHoras());
	}
	
	public void showProfessor() {
		radProfessoresHora.setSelected(false);
		TableP.setVisible(true);
		TablePH.setVisible(false);
	}
	
	public void showProfessorHour() {
		AtualizarTabelaHora();
		
		radProfessoresLista.setSelected(false);
		TablePH.setVisible(true);
		TableP.setVisible(false);
	}
	
	
	
	//--------------------------------------------------------
	public void BtnOpenCurInt() {
		
		CboQtdSemestres.getItems().setAll("1", "2", "3", "4", "5", "6","7","8","9","10");
		CboPeriodo.getItems().setAll("Manhã","Tarde","Noite");
		
		DaoGeneric<Curso> objdao = new DaoGeneric<Curso>();
		java.util.List<Curso> listaC = objdao.listar(Curso.class);
		ObservableList<Curso> listaCF = FXCollections.observableList(listaC);
		
		cursolist = daoTableC.list(Curso.class);
		TableUpdateCurso();
		
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
		
		TableUpdateProfessor();
		
		if (Pane_cad_int_professor.isVisible()) {
			Pane_cad_int_professor.setVisible(false);
		} else {
			Pane_cad_int_professor.setVisible(true);
		}
	}
	
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
		
		TableUpdateMateria();
		
		if (Pane_cad_int_materia.isVisible()) {
			Pane_cad_int_materia.setVisible(false);
		} else {
			
			Pane_cad_int_materia.setVisible(true);
		}
	}

//------------------------------------------------------------

	public void BtnCadastrarCurso() {

		DaoGeneric<Curso> objDaoG = new DaoGeneric<Curso>();
		
		ObjCadCurso.setName(txtCurse_name.getText());
		ObjCadCurso.setPeriod(CboPeriodo.getValue().toString());
		ObjCadCurso.setQtdhalf(CboQtdSemestres.getValue().toString());
		ObjCadCurso.setWorkload(TxtWorkloadCurso.getText());
		objDaoG.salvarAtualizar(ObjCadCurso);
		
		txtCurse_name.setText(null);
		TxtWorkloadCurso.setText(null);
		CboPeriodo.setValue(null);
		CboQtdSemestres.setValue(null);
		
		cursolist = daoTableC.list(Curso.class);
		TableUpdateCurso();
		
	}

	public void BtnCadastrarProfessor() {

		DaoGeneric<Professor> objDaoG = new DaoGeneric<Professor>();
		
		ObjCadPro.setName(txtNameProfessor.getText());
		ObjCadPro.setEmail(txtEmailProfessor.getText());
		objDaoG.salvarAtualizar(ObjCadPro);
		
		txtNameProfessor.setText(null);
		txtEmailProfessor.setText(null);
		
		professorlist = daoTableP.list(Professor.class);
		TableUpdateProfessor();
		
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
		
		txtNameMatter.setText(null);
		TxtWorkload.setText(null);
		TxtInitials.setText(null);
		CboListCur.setValue(null);
		CboListSem.setValue(null);
		CboListPer.setValue(null);
		CboListPro.setValue(null);
		
		materialist = daoTableM.list(Materia.class);
		TableUpdateMateria();
	}
	
	private Object mainScreen() {
		// TODO Auto-generated method stub
		return null;
	}

	
//---------------------------------------------------------
	
// 	SUB MENU HOUR
	

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
		
		newstage.getIcons().add(new Image("view/images/System/timetable.icon.png"));
		
		try {
			URL url = new File(getClass().getResource("/view/resultscreen.fxml").getPath()).toURI().toURL();
			rootb = FXMLLoader.load(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scene newScene = new Scene(rootb);
		newstage.setScene(newScene);
		newstage.setTitle(null);
		newstage.initStyle(StageStyle.UNDECORATED);
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
