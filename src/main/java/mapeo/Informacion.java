package mapeo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Informacion {

	@SerializedName("ip")
	@Expose
	private String ip;
	@SerializedName("hostname")
	@Expose
	private String hostname;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("continent_code")
	@Expose
	private String continentCode;
	@SerializedName("continent_name")
	@Expose
	private String continentName;
	@SerializedName("country_code")
	@Expose
	private String countryCode;
	@SerializedName("country_name")
	@Expose
	private String countryName;
	@SerializedName("region_code")
	@Expose
	private String regionCode;
	@SerializedName("region_name")
	@Expose
	private String regionName;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("zip")
	@Expose
	private String zip;
	@SerializedName("latitude")
	@Expose
	private Double latitude;
	@SerializedName("longitude")
	@Expose
	private Double longitude;
	@SerializedName("location")
	@Expose
	private Ubicacion location;
	@SerializedName("time_zone")
	@Expose
	private ZonaHoraria timeZone;
	@SerializedName("currency")
	@Expose
	private Moneda currency;
	@SerializedName("connection")
	@Expose
	private Coneccion connection;
	@SerializedName("security")
	@Expose
	private Seguridad security;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Informacion withIp(String ip) {
		this.ip = ip;
		return this;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Informacion withHostname(String hostname) {
		this.hostname = hostname;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Informacion withType(String type) {
		this.type = type;
		return this;
	}

	public String getContinentCode() {
		return continentCode;
	}

	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

	public Informacion withContinentCode(String continentCode) {
		this.continentCode = continentCode;
		return this;
	}

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	public Informacion withContinentName(String continentName) {
		this.continentName = continentName;
		return this;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Informacion withCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Informacion withCountryName(String countryName) {
		this.countryName = countryName;
		return this;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public Informacion withRegionCode(String regionCode) {
		this.regionCode = regionCode;
		return this;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Informacion withRegionName(String regionName) {
		this.regionName = regionName;
		return this;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Informacion withCity(String city) {
		this.city = city;
		return this;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Informacion withZip(String zip) {
		this.zip = zip;
		return this;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Informacion withLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Informacion withLongitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	public Ubicacion getLocation() {
		return location;
	}

	public void setLocation(Ubicacion location) {
		this.location = location;
	}

	public Informacion withLocation(Ubicacion location) {
		this.location = location;
		return this;
	}

	public ZonaHoraria getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(ZonaHoraria timeZone) {
		this.timeZone = timeZone;
	}

	public Informacion withTimeZone(ZonaHoraria timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	public Moneda getCurrency() {
		return currency;
	}

	public void setCurrency(Moneda currency) {
		this.currency = currency;
	}

	public Informacion withCurrency(Moneda currency) {
		this.currency = currency;
		return this;
	}

	public Coneccion getConnection() {
		return connection;
	}

	public void setConnection(Coneccion connection) {
		this.connection = connection;
	}

	public Informacion withConnection(Coneccion connection) {
		this.connection = connection;
		return this;
	}

	public Seguridad getSecurity() {
		return security;
	}

	public void setSecurity(Seguridad security) {
		this.security = security;
	}

	public Informacion withSecurity(Seguridad security) {
		this.security = security;
		return this;
	}

}