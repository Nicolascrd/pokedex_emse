package com.example.pokedex;

import java.sql.*;

/* Fait la requête SQL, envoie l'objet ResultSet (sql)*/

public class SQLrequest {
    public static ResultSet run(int Number, String adresse) {
        /* Connect to the database */
        Connection conn = null;
        ResultSet rs = null;
        try {
            // create a connection to the database
            conn = DriverManager.getConnection("jdbc:sqlite:" + adresse);
            System.out.println("Connection to SQLite has been established.");

            PreparedStatement stmt = conn.prepareStatement("SELECT name, description FROM pokemons WHERE id = " + Number);
            //stmt.setInt(1,1);
            rs = stmt.executeQuery();
            rs.next();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;
    }
}
