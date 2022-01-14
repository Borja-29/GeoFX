package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controller implements Initializable{
	
	@FXML
	private BorderPane vista;
	
	@FXML
	private TabPane tabPane;
	
	@FXML
	private Tab tabUbicacion;
	
	@FXML
	private BorderPane borderUbicacion;
	
	@FXML
	private GridPane gridUbicacion;
	
	@FXML
	private VBox vBoxLatitud;
	
	@FXML
	private Label labelLatitud;
	
	@FXML
	private Label labelLatitudCont;
	
	@FXML
	private VBox vBoxCiudad;
	
	@FXML
	private Label labelCiudad;
	
	@FXML
	private Label labelCiudadCont;
	
	@FXML
	private VBox vBoxZip;
	
	@FXML
	private Label labelZip;
	
	@FXML
	private Label labelZipCont;
	
	@FXML
	private VBox vBoxIdioma;

	@FXML
	private Label labelIdioma;

	@FXML
	private Label labelIdiomaCont;

	@FXML
	private VBox vBoxHoraria;

	@FXML
	private Label labelHoraria;

	@FXML
	private Label labelHorariaCont;

	@FXML
	private VBox vBoxTelefono;

	@FXML
	private Label labelTelefono;

	@FXML
	private Label labelTelefonoCont;

	@FXML
	private VBox vBoxMoneda;

	@FXML
	private Label labelMoneda;

	@FXML
	private Label labelMonedaCont;

	@FXML
	private HBox hBoxLocalizacion;

	@FXML
	private Label labelLocalizacion;

	@FXML
	private Label labelLocalizacionCont;

	@FXML
	private Tab tabConeccion;

	@FXML
	private BorderPane borderConeccion;

	@FXML
	private VBox vBoxConeccion;
	
	@FXML
	private VBox vBoxDireccionip;

	@FXML
	private Label labelDireccionip;

	@FXML
	private Label labelDireccionipCont;

	@FXML
	private HBox hBoxIsp;

	@FXML
	private Label labelIsp;

	@FXML
	private Label labelIspCont;

	@FXML
	private HBox hBoxConeccion;
	
	@FXML
	private VBox vBoxTipo;

	@FXML
	private Label labelTipo;

	@FXML
	private Label labelTipoCont;

	@FXML
	private VBox vBoxAsn;

	@FXML
	private Label labelAsn;

	@FXML
	private Label labelAsnCont;
	
	@FXML
	private VBox vBoxHost;

	@FXML
	private Label labelHost;

	@FXML
	private Label labelHostCont;

	@FXML
	private Tab tabSeguridad;

	@FXML
	private BorderPane borderSeguridad;

	@FXML
	private VBox vBoxSeguridad;

	@FXML
	private HBox hBoxEscudo;

	@FXML
	private Label labelEscudoCont;

	@FXML
	private GridPane gridSeguridad;

	@FXML
	private VBox vBoxProxy;

	@FXML
	private Label labelProxy;

	@FXML
	private CheckBox checkProxy;

	@FXML
	private VBox vBoxTor;

	@FXML
	private Label labelTor;

	@FXML
	private CheckBox cjeckTor;

	@FXML
	private VBox vBoxCrawler;

	@FXML
	private Label labelCrawler;

	@FXML
	private CheckBox checkCrawler;

	@FXML
	private VBox vBoxNivelAmenaza;

	@FXML
	private Label labelNivelAmenaza;

	@FXML
	private Label labelNivelAmenazaCont;

	@FXML
	private VBox vBoxTipoAmenaza;

	@FXML
	private Label labelTipoAmenaza;

	@FXML
	private Label labelTipoAmenazaCont;

	@FXML
	private HBox hBoxArriba;

	@FXML
	private TextField textFieldIp;

	@FXML
	private Button buttonComprobar;

	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/FXML.fxml"));
		loader.setController(this);
		loader.load();
	}

	public BorderPane getView() {
		return vista;
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
