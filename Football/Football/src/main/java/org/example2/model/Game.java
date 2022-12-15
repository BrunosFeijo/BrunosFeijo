package org.example2.model;

public class Game {
    private Team teamA;
    private Team teamB;
    private int goalsA;
    private int goalsB;

    public Game(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public String scoreBoard() {
        String result = teamA.getName() + " " + goalsA + " x " + goalsB + " " + teamB.getName();

        return result;
    }

    public String winner() {
        String result = "Empate";
        if (goalsA > goalsB) {
            return result = teamA.getName();
        } else if (goalsB > goalsA) {
            return result = teamB.getName();
        }
        return result;
    }

    public void goalA() {
        goalsA++;
    }

    public void goalB() {
        goalsB++;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public int getGoalsA() {
        return goalsA;
    }

    public void setGoalsA(int goalsA) {
        this.goalsA = goalsA;
    }

    public int getGoalsB() {
        return goalsB;
    }

    public void setGoalsB(int goalsB) {
        this.goalsB = goalsB;
    }
}
