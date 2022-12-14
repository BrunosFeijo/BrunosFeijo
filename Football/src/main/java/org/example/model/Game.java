package org.example.model;

public class Game {
    private Team teamA;
    private Team teamB;
    private int goalsA;
    private int goalsB;

    public String gameResult(){
        String result = teamA.getName() + " " + goalsA + " x " + goalsB + " " + teamB.getName() +"\n"+
                "Empate";

        if (goalsA > goalsB){

            result = teamA.getName() + " " + goalsA + " x " + goalsB + " " + teamB.getName() +"\n"+
                    "Vencedor: " + teamA.getName();
        } else if (goalsB > goalsA) {
            result = teamA.getName() + " " + goalsA + " x " + goalsB + " " + teamB.getName() +"\n"+
                    "Vencedor: " + teamB.getName();
        }
        return result;
    }

    public Game(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void goalA(){
        goalsA++;
    }

    public void goalB(){
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


}
