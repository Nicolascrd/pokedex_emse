package com.example.pokedex;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.*;

/* Appelle la classe qui fait la requête http, affiche le résultat */

public class Pokedex_api {
    public static void run(int iD) {
            Object resultObject = HTTPRequest.run(iD);
            if (resultObject instanceof JSONObject) {
                JSONObject obj =(JSONObject)resultObject;
                System.out.println("Pokémon name " + obj.get("name"));
                System.out.println("Pokémon description : weight (" +
                        obj.get("weight") +
                        "), height (" +
                        obj.get("height") +
                        ")"
                );
            } else {
                System.err.println("Désolé, cet ID ne correspond à aucun pokémon répertorié");
            }



    }
}
