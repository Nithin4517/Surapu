package Nithin.Reddy;

import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Main {
	public static void main(String[] args)throws Exception{
		HttpResponse<String> response = Unirest.get("https://covid-193.p.rapidapi.com/countries")
				.header("X-RapidAPI-Key", "d9d0133ff4msh62d22991437c316p125fa6jsn2d0002d80255")
				.header("X-RapidAPI-Host", "covid-193.p.rapidapi.com")
				.asString();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
	      JsonParser jp = new JsonParser();
	      JsonElement je = jp.parse(response.getBody().toString());
	      String prettyJsonString = gson.toJson(je);
	      System.out.println(prettyJsonString);
	}

}
