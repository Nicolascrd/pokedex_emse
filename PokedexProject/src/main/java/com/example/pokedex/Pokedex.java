package com.example.pokedex;

public class Pokedex {

    public static void main(String[] args) {
        //System.out.println("It's working !");
        switch (args.length) {
            case 0:
                //aucun argument fourni, réponse par défaut
                System.out.println("Vous n'avez fourni aucun argument, je vous présente Bulbasaur !");
                Pokedex_api.run(1);
                break;
            case 1:
                //on va chercher l'API
                Pokedex_api.run(Integer.parseInt(args[0]));
                break;
            case 2:
                //on va chercher la base SQLite donnée en paramètre
                Pokedex_sql.run(Integer.parseInt(args[0]),args[1]);
                break;
        }

    }

    public String getName() {
        return "Hello";
    }
}
