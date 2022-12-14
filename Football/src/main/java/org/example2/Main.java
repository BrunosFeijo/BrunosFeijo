package org.example2;

import org.example2.model.Game;
import org.example2.model.Team;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random goals = new Random();
        Team team = new Team("Alemanha");
        Team team2 = new Team("Brasil");
        Game game = new Game(team,team2);

        for (int i = 0; i < goals.nextInt();i++){
            game.goalA();
        }
        for (int i = 0; i < goals.nextInt();i++){
            game.goalB();
        }

        System.out.println(game.scoreBoard());
        System.out.println(game.winner());

    }

}
