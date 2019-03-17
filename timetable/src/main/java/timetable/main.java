package timetable;

import java.io.File;
import java.net.URL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import jpahibernate.dao.DaoGeneric;
import model.Curso;

public class main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
				
		Stage newstage = new Stage();
		Parent root = null;

		try {
			URL url = new File(getClass().getResource("/view/mainscreen.fxml").getPath()).toURI().toURL();
			root = FXMLLoader.load(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scene newScene = new Scene(root);
		newScene.getStylesheets().add("/view/mainscreen.css");
		newstage.setScene(newScene);
		newstage.setTitle(null);
		newstage.show();
		
	/*	Curso mCurso = new Curso();
		DaoGeneric daoGeneric = new DaoGeneric();
		
		daoGeneric.salvarAtualizar(mCurso);*/
	}

	public static void main(String[] args) {
		launch(args);
	}

}
