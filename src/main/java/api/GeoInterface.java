package api;

import mapeo.Informacion;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface GeoInterface {

	@GET("ip_api.php")
	public Call<Informacion> ipCheck(@Query("ip") String ip);

}