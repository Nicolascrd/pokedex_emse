package com.example.pokedex;


import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;


public class SQLrequestTest {

    @Test
    public void sqlRequest(){
        ResultSet test = SQLrequest.sqlRequest(4, "../sujet_TP/ressources/pokemondatabase.sqlite");//mettre l'emplacement de la base de donnée
        Assert.assertEquals(test, "org.sqlite.jdbc4.JDBC4ResultSet@311d617d");
    }
    //j'ai laissé le test comme ça je ne comprends pas pouquoi ça ne valide pas
    //pourtant le programme lui fonctionne
}