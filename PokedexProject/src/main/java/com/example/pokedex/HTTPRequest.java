package com.example.pokedex;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* fait la requête http et renvoie l'objet HttpGet*/
public class HTTPRequest {
    public static Object run(int iD) {
        String jsonResponse = "";
        Object resultObject;
        try {
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet("https://pokeapi.co/api/v2/pokemon/" + iD);
            request.addHeader("content-type", "application/json");
            HttpResponse result = httpClient.execute(request);
            jsonResponse = EntityUtils.toString(result.getEntity(), "UTF-8");

            JSONParser parser = new JSONParser();
            resultObject = parser.parse(jsonResponse);
            return resultObject;

        } catch (IOException e) {
        e.printStackTrace();
        } catch (ParseException e) {
        System.err.println("Could not parse the response given by the API as JSON");
        System.err.println("Response body is :");
        System.err.println(jsonResponse);
        e.printStackTrace();
    }
        return null;
    }
}
