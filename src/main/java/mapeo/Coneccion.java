package mapeo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Coneccion {

	@SerializedName("asn")
	@Expose
	private Integer asn;
	@SerializedName("isp")
	@Expose
	private String isp;

	public Integer getAsn() {
		return asn;
	}

	public void setAsn(Integer asn) {
		this.asn = asn;
	}

	public Coneccion withAsn(Integer asn) {
		this.asn = asn;
		return this;
	}

	public String getIsp() {
		return isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
	}

	public Coneccion withIsp(String isp) {
		this.isp = isp;
		return this;
	}
}