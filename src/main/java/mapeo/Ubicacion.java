package mapeo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Ubicacion {

	@SerializedName("geoname_id")
	@Expose
	private Integer geonameId;
	@SerializedName("capital")
	@Expose
	private String capital;
	@SerializedName("languages")
	@Expose
	private List<Idioma> languages = null;
	@SerializedName("country_flag")
	@Expose
	private String countryFlag;
	@SerializedName("country_flag_emoji")
	@Expose
	private String countryFlagEmoji;
	@SerializedName("country_flag_emoji_unicode")
	@Expose
	private String countryFlagEmojiUnicode;
	@SerializedName("calling_code")
	@Expose
	private String callingCode;
	@SerializedName("is_eu")
	@Expose
	private Boolean isEu;

	public Integer getGeonameId() {
		return geonameId;
	}

	public void setGeonameId(Integer geonameId) {
		this.geonameId = geonameId;
	}

	public Ubicacion withGeonameId(Integer geonameId) {
		this.geonameId = geonameId;
		return this;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Ubicacion withCapital(String capital) {
		this.capital = capital;
		return this;
	}

	public List<Idioma> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Idioma> languages) {
		this.languages = languages;
	}

	public Ubicacion withLanguages(List<Idioma> languages) {
		this.languages = languages;
		return this;
	}

	public String getCountryFlag() {
		return countryFlag;
	}

	public void setCountryFlag(String countryFlag) {
		this.countryFlag = countryFlag;
	}

	public Ubicacion withCountryFlag(String countryFlag) {
		this.countryFlag = countryFlag;
		return this;
	}

	public String getCountryFlagEmoji() {
		return countryFlagEmoji;
	}

	public void setCountryFlagEmoji(String countryFlagEmoji) {
		this.countryFlagEmoji = countryFlagEmoji;
	}

	public Ubicacion withCountryFlagEmoji(String countryFlagEmoji) {
		this.countryFlagEmoji = countryFlagEmoji;
		return this;
	}

	public String getCountryFlagEmojiUnicode() {
		return countryFlagEmojiUnicode;
	}

	public void setCountryFlagEmojiUnicode(String countryFlagEmojiUnicode) {
		this.countryFlagEmojiUnicode = countryFlagEmojiUnicode;
	}

	public Ubicacion withCountryFlagEmojiUnicode(String countryFlagEmojiUnicode) {
		this.countryFlagEmojiUnicode = countryFlagEmojiUnicode;
		return this;
	}

	public String getCallingCode() {
		return callingCode;
	}

	public void setCallingCode(String callingCode) {
		this.callingCode = callingCode;
	}

	public Ubicacion withCallingCode(String callingCode) {
		this.callingCode = callingCode;
		return this;
	}

	public Boolean getIsEu() {
		return isEu;
	}

	public void setIsEu(Boolean isEu) {
		this.isEu = isEu;
	}

	public Ubicacion withIsEu(Boolean isEu) {
		this.isEu = isEu;
		return this;
	}

}