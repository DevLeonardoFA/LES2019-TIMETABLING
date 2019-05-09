package timetable;

import java.io.File;
import java.net.URL;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

import DAO.DaoGeneric;
import DAO.DaoList;
import Util.hibernateUtil;
import javafx.application.Application;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Curso;

public class main extends Application {

	 public void telaprincipal() {
		Stage newstage = new Stage();
		Parent rootb = null;

		newstage.getIcons().add(new Image("view/images/System/timetable.icon.png"));
		
		try {
			URL url = new File(getClass().getResource("/view/mainscreen.fxml").getPath()).toURI().toURL();
			rootb = FXMLLoader.load(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scene newScene = new Scene(rootb);
		newScene.getStylesheets().add("/view/mainscreen.css");
		newstage.setScene(newScene);
		newstage.setTitle(null);
		newstage.show();
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {

		final Stage splashStage = new Stage();
		Parent roota = null;

		try {
			URL url = new File(getClass().getResource("/view/splashscreen.fxml").getPath()).toURI().toURL();
			roota = FXMLLoader.load(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scene splashScene = new Scene(roota);
		splashScene.getStylesheets().add("/view/mainscreen.css");
		splashStage.setScene(splashScene);
		splashStage.setTitle(null);
		splashStage.initStyle(StageStyle.UNDECORATED);
		
//----------------------------------------------------------------------------------

		Service<Boolean> splashService = new Service<Boolean>() {

			@Override
			public void start() {
				super.start();
				splashStage.show();
			}
			
			@Override
			protected Task<Boolean> createTask() {
				return new Task<Boolean>() {
					protected Boolean call() throws Exception {
						try {
							hibernateUtil.getEntityManager();
							return true;
						}
						catch(Exception ex){
							System.exit(0);
							return false;
						}
					}
				};
			}

			@Override
			protected void succeeded() {
				splashStage.close();
				try {
					telaprincipal();
				} catch (Exception ex) {
				}
			}
		};
		
		splashService.start();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
