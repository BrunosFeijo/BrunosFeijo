package org.example;

import org.example.model.Game;
import org.example.model.Team;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {

        Team inter = new Team("Internacional");
        Team gremio = new Team("Grêmio");
        Game grenal = new Game(inter, gremio);

        grenal.goalB();
        grenal.goalB();
        grenal.goalB();
        grenal.goalA();

        System.out.println(grenal.gameResult());


    }
}