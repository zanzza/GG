package ch.makery.address.view;

import java.net.URL;
import java.util.ResourceBundle;

import ch.makery.address.Main;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javafx.fxml.Initializable;

public class DirecteurController extends Application implements Initializable{

	@FXML
	private Button b1;

	@FXML
	private Button b2;

	@FXML
	private Button b3;

	@FXML
	private Button b4;

	@FXML
	private Button b5;

	@FXML
	private Button b6;

	@FXML
	private Button BD;


	public void actionBD(){
		Main vc = new Main();
		vc.setScene("ListeOverview.fxml");
	}


	public void actionB1(){
		Main vc = new Main();
		System.out.println("test b1");
		vc.setScene("TauxJournalierRemplissageHotel.fxml");
	}

	public void actionB2(){
		Main vc = new Main();
		vc.setScene("MoyenneTauxFrequentation.fxml");
	}

	public void actionB3(){
		Main vc = new Main();
		vc.setScene("NombrePetitDejeuner.fxml");
	}

	public void actionB4(){
		Main vc = new Main();
		vc.setScene("PanierMoyen.fxml");
	}

	public void actionB5(){
		Main vc = new Main();
		vc.setScene("DepenseParService.fxml");
	}

	public void actionB6(){
		Main vc = new Main();
		vc.setScene("EmployeParService.fxml");
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

	}

}
