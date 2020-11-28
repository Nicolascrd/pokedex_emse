package com.example.pokedex;

import java.sql.*;

public class Pokedex_sql {
    public static void run(int Number, String adresse) {
        try {
            ResultSet rs = SQLrequest.main(Number, adresse);
            System.out.println("Pokémon name : " + rs.getString("name"));
            System.out.println("Pokémon description : " + rs.getString("description"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
