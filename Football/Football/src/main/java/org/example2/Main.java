package org.example2;

import org.example2.model.Game;
import org.example2.model.Team;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random goals = new Random();
        Team team = new Team("Argentina");
        Team team2 = new Team("Brasil");
        Game game = new Game(team,team2);

        for (int i = 0; i < goals.nextInt(6);i++){
            game.goalA();
        }
        for (int i = 0; i < goals.nextInt(6);i++){
            game.goalB();
        }

        System.out.println(game.scoreBoard());
        System.out.println(game.winner());

        team.setGolsPro(game.getGoalsA());
        team.setGolsContra(game.getGoalsB());

        team2.setGolsPro(game.getGoalsB());
        team2.setGolsContra(game.getGoalsA());

        System.out.println("Argentina: Gols Pró " + team.getGolsPro() + " Gols Contra " + team.getGolsContra());
        System.out.println("Brasil: Gols Pró " + team2.getGolsPro() + " Gols Contra " + team2.getGolsContra());
    }
}
