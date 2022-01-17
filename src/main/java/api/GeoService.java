package api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import mapeo.Informacion;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GeoService {

	private static final String BASE_URL = "https://ipapi.com/";

	private GeoInterface service;

	public GeoService() {

		ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

		OkHttpClient client = new OkHttpClient.Builder().connectionPool(pool).build();

		Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).client(client)
				.addConverterFactory(GsonConverterFactory.create()).build();

		service = retrofit.create(GeoInterface.class);
	}

	public Informacion mensaje(String ip) throws IOException {

		Response<Informacion> respuesta = service.ipCheck(ip).execute();

		Informacion message = respuesta.body();

		return message;

	}

}