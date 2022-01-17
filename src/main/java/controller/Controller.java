package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import api.GeoService;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import mapeo.Informacion;

public class Controller implements Initializable {

	// Segundo plano
	private Task<Void> tarea;

	// Main
	private GeoService geoservice = new GeoService();
	private StringProperty ip = new SimpleStringProperty();
	private ObjectProperty<Informacion> informacion = new SimpleObjectProperty<Informacion>();

	// Ubicacion
	private StringProperty latitud = new SimpleStringProperty();
	private StringProperty longitud = new SimpleStringProperty();
	private StringProperty ciudad = new SimpleStringProperty();
	private StringProperty zip = new SimpleStringProperty();
	private StringProperty idioma = new SimpleStringProperty();
	private StringProperty horaria = new SimpleStringProperty();
	private StringProperty telefono = new SimpleStringProperty();
	private StringProperty moneda = new SimpleStringProperty();
	private StringProperty localizacion = new SimpleStringProperty();
	private ObjectProperty<Image> bandera = new SimpleObjectProperty<Image>();

	// Coneccion
	private StringProperty direccionIp = new SimpleStringProperty();
	private StringProperty isp = new SimpleStringProperty();
	private StringProperty tipo = new SimpleStringProperty();
	private StringProperty asn = new SimpleStringProperty();
	private StringProperty host = new SimpleStringProperty();

	// Seguridad
	private StringProperty escudo = new SimpleStringProperty();
	private BooleanProperty proxy = new SimpleBooleanProperty();
	private BooleanProperty tor = new SimpleBooleanProperty();
	private BooleanProperty crawler = new SimpleBooleanProperty();
	private StringProperty nivelAmenaza = new SimpleStringProperty();
	private StringProperty tipoAmenaza = new SimpleStringProperty();

	@FXML
	private BorderPane vista;

	@FXML
	private BorderPane borderUbicacion;

	@FXML
	private Label labelLatitudCont;

	@FXML
	private Label labelLongitudCont;

	@FXML
	private Label labelCiudadCont;

	@FXML
	private Label labelZipCont;

	@FXML
	private Label labelIdiomaCont;

	@FXML
	private Label labelHorariaCont;

	@FXML
	private Label labelTelefonoCont;

	@FXML
	private Label labelMonedaCont;

	@FXML
	private Label labelLocalizacionCont;

	@FXML
	private ImageView imageBandera;

	@FXML
	private Label labelDireccionIpCont;

	@FXML
	private Label labelIspCont;

	@FXML
	private Label labelTipoCont;

	@FXML
	private Label labelAsnCont;

	@FXML
	private Label labelHostCont;

	@FXML
	private Label labelEscudoCont;

	@FXML
	private CheckBox checkProxy;

	@FXML
	private CheckBox checkTor;

	@FXML
	private CheckBox checkCrawler;

	@FXML
	private Label labelNivelAmenazaCont;

	@FXML
	private Label labelTipoAmenazaCont;

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

		// bindings

		// Main
		ip.bind(textFieldIp.textProperty());

		// Ubicacion
		labelLatitudCont.textProperty().bind(latitud);
		labelLongitudCont.textProperty().bind(longitud);
		labelCiudadCont.textProperty().bind(ciudad);
		labelZipCont.textProperty().bind(zip);
		labelIdiomaCont.textProperty().bind(idioma);
		labelHorariaCont.textProperty().bind(horaria);
		labelTelefonoCont.textProperty().bind(telefono);
		labelMonedaCont.textProperty().bind(moneda);
		labelLocalizacionCont.textProperty().bind(localizacion);
		imageBandera.imageProperty().bind(bandera);

		// Coneccion
		labelDireccionIpCont.textProperty().bind(direccionIp);
		labelIspCont.textProperty().bind(isp);
		labelTipoCont.textProperty().bind(tipo);
		labelAsnCont.textProperty().bind(asn);
		labelHostCont.textProperty().bind(host);

		// Seguridad
		labelEscudoCont.textProperty().bind(escudo);
		checkProxy.selectedProperty().bind(proxy);
		checkTor.selectedProperty().bind(tor);
		checkCrawler.selectedProperty().bind(crawler);
		labelNivelAmenazaCont.textProperty().bind(nivelAmenaza);
		labelTipoAmenazaCont.textProperty().bind(tipoAmenaza);

	}

	// Ubicacion (getters/setters)
	public final StringProperty latitudProperty() {
		return this.latitud;
	}

	public final String getLatitud() {
		return this.latitudProperty().get();
	}

	public final void setLatitud(final String latitud) {
		this.latitudProperty().set(latitud);
	}

	public final StringProperty longitudProperty() {
		return this.longitud;
	}

	public final String getLongitud() {
		return this.longitudProperty().get();
	}

	public final void setLongitud(final String longitud) {
		this.longitudProperty().set(longitud);
	}

	public final StringProperty localizacionProperty() {
		return this.localizacion;
	}

	public final String getLocalizacion() {
		return this.localizacionProperty().get();
	}

	public final void setLocalizacion(final String localizacion) {
		this.localizacionProperty().set(localizacion);
	}

	public final StringProperty ciudadProperty() {
		return this.ciudad;
	}

	public final String getCiudad() {
		return this.ciudadProperty().get();
	}

	public final void setCiudad(final String ciudad) {
		this.ciudadProperty().set(ciudad);
	}

	public final StringProperty zipProperty() {
		return this.zip;
	}

	public final String getZip() {
		return this.zipProperty().get();
	}

	public final void setZip(final String zip) {
		this.zipProperty().set(zip);
	}

	public final StringProperty idiomaProperty() {
		return this.idioma;
	}

	public final String getIdioma() {
		return this.idiomaProperty().get();
	}

	public final void setIdioma(final String idioma) {
		this.idiomaProperty().set(idioma);
	}

	public final StringProperty horariaProperty() {
		return this.horaria;
	}

	public final String getHoraria() {
		return this.horariaProperty().get();
	}

	public final void setHoraria(final String horaria) {
		this.horariaProperty().set(horaria);
	}

	public final StringProperty telefonoProperty() {
		return this.telefono;
	}

	public final String getTelefono() {
		return this.telefonoProperty().get();
	}

	public final void setTelefono(final String telefono) {
		this.telefonoProperty().set(telefono);
	}

	public final StringProperty monedaProperty() {
		return this.moneda;
	}

	public final String getMoneda() {
		return this.monedaProperty().get();
	}

	public final void setMoneda(final String moneda) {
		this.monedaProperty().set(moneda);
	}

	public final ObjectProperty<Image> banderaProperty() {
		return this.bandera;
	}

	public final Image getBandera() {
		return this.banderaProperty().get();
	}

	public final void setBandera(final Image bandera) {
		this.banderaProperty().set(bandera);
	}

	// Coneccion (getters/setters)

	public final StringProperty direccionIpProperty() {
		return this.direccionIp;
	}

	public final String getDireccionIp() {
		return this.direccionIpProperty().get();
	}

	public final void setDireccionIp(final String direccionIp) {
		this.direccionIpProperty().set(direccionIp);
	}

	public final StringProperty ispProperty() {
		return this.isp;
	}

	public final String getIsp() {
		return this.ispProperty().get();
	}

	public final void setIsp(final String isp) {
		this.ispProperty().set(isp);
	}

	public final StringProperty tipoProperty() {
		return this.tipo;
	}

	public final String getTipo() {
		return this.tipoProperty().get();
	}

	public final void setTipo(final String tipo) {
		this.tipoProperty().set(tipo);
	}

	public final StringProperty asnProperty() {
		return this.asn;
	}

	public final String getAsn() {
		return this.asnProperty().get();
	}

	public final void setAsn(final String asn) {
		this.asnProperty().set(asn);
	}

	public final StringProperty hostProperty() {
		return this.host;
	}

	public final String getHost() {
		return this.hostProperty().get();
	}

	public final void setHost(final String host) {
		this.hostProperty().set(host);
	}

	// Seguridad (getters/setters)

	public final BooleanProperty proxyProperty() {
		return this.proxy;
	}

	public final boolean isProxy() {
		return this.proxyProperty().get();
	}

	public final void setProxy(final boolean proxy) {
		this.proxyProperty().set(proxy);
	}

	public final BooleanProperty torProperty() {
		return this.tor;
	}

	public final boolean isTor() {
		return this.torProperty().get();
	}

	public final void setTor(final boolean tor) {
		this.torProperty().set(tor);
	}

	public final BooleanProperty crawlerProperty() {
		return this.crawler;
	}

	public final boolean isCrawler() {
		return this.crawlerProperty().get();
	}

	public final void setCrawler(final boolean crawler) {
		this.crawlerProperty().set(crawler);
	}

	public final StringProperty escudoProperty() {
		return this.escudo;
	}

	public final String getEscudo() {
		return this.escudoProperty().get();
	}

	public final void setEscudo(final String escudo) {
		this.escudoProperty().set(escudo);
	}

	public final StringProperty nivelAmenazaProperty() {
		return this.nivelAmenaza;
	}

	public final String getNivelAmenaza() {
		return this.nivelAmenazaProperty().get();
	}

	public final void setNivelAmenaza(final String nivelAmenaza) {
		this.nivelAmenazaProperty().set(nivelAmenaza);
	}

	public final StringProperty tipoAmenazaProperty() {
		return this.tipoAmenaza;
	}

	public final String getTipoAmenaza() {
		return this.tipoAmenazaProperty().get();
	}

	public final void setTipoAmenaza(final String tipoAmenaza) {
		this.tipoAmenazaProperty().set(tipoAmenaza);
	}

	@FXML
	void onComprobarIpAction(ActionEvent event) throws Exception {
		//tarea = new Task<Void>() {
			
			//protected Void call() throws Exception {
				setTelefono(geoservice.mensaje(ip.getValue()).getLocation().getCallingCode());
				setCiudad(geoservice.mensaje(ip.getValue()).getCity().toString());
				setLocalizacion(geoservice.mensaje(ip.getValue()).getCountryName());
				setMoneda(geoservice.mensaje(ip.getValue()).getCurrency().getName());
				setBandera(new Image(
						"/Banderas/64x42/" + geoservice.mensaje(ip.getValue()).getCountryCode().concat(".png")));
				setIdioma(geoservice.mensaje(ip.getValue()).getLocation().getLanguages().get(0).getName());
				setLatitud(geoservice.mensaje(ip.getValue()).getLatitude().toString());
				setLongitud(geoservice.mensaje(ip.getValue()).getLongitude().toString());
				setHoraria(geoservice.mensaje(ip.getValue()).getTimeZone().getCode());
				setZip(geoservice.mensaje(ip.getValue()).getZip().toString());

				setAsn(geoservice.mensaje(ip.getValue()).getConnection().getAsn().toString());
				setHost(geoservice.mensaje(ip.getValue()).getHostname());
				setDireccionIp(geoservice.mensaje(ip.getValue()).getIp());
				setIsp(geoservice.mensaje(ip.getValue()).getConnection().getIsp());
				setTipo(geoservice.mensaje(ip.getValue()).getType());

				setCrawler(geoservice.mensaje(ip.getValue()).getSecurity().getIsCrawler());
				setProxy(geoservice.mensaje(ip.getValue()).getSecurity().getIsProxy());
				setNivelAmenaza(geoservice.mensaje(ip.getValue()).getSecurity().getThreatLevel());
				setTor(geoservice.mensaje(ip.getValue()).getSecurity().getIsTor());
				switch (geoservice.mensaje(ip.getValue()).getSecurity().getThreatLevel()) {
				case "low":
					setEscudo("No se ha detectado ninguna amenaza");
					setTipoAmenaza("No se han detectado amenazas en esta direccion IP.");
					break;

				case "high":
					setEscudo("Definitive threats detected. This IP is unsafe.");
					break;

				default:

					break;
				}
				//return null;
			//}
		//};
		
		//new Thread(tarea).start();
		
	}

}
