package mapeo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Idioma {

	@SerializedName("code")
	@Expose
	private String code;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("native")
	@Expose
	private String _native;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Idioma withCode(String code) {
		this.code = code;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Idioma withName(String name) {
		this.name = name;
		return this;
	}

	public String getNative() {
		return _native;
	}

	public void setNative(String _native) {
		this._native = _native;
	}

	public Idioma withNative(String _native) {
		this._native = _native;
		return this;
	}

}