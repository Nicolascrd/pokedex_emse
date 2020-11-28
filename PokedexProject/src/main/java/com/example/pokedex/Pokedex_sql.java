package com.example.pokedex;

import java.sql.*;

/* Appelle la classe qui fait la requête SQL, affiche le résultat */

public class Pokedex_sql {
    public static void run(int Number, String adresse) {
        try {
            ResultSet rs = SQLrequest.run(Number, adresse);
            System.out.println("Pokémon name : " + rs.getString("name"));
            System.out.println("Pokémon description : " + rs.getString("description"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
