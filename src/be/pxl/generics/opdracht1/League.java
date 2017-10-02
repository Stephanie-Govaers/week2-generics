package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class League<T extends Player> {

    private ArrayList<Team<T>> teams;

    public void addTeam(Team<T> team) {
        teams.add(team);
    }

    public void printTeams() {
        for(int i = 0; i < teams.size(); i++) {
            System.out.println("TEAMNAAM: " + ((Team) teams.get(i)).getName());
            System.out.println("won: " + ((Team) teams.get(i)).getWon());
            System.out.println("lost: " + ((Team) teams.get(i)).getLost());
            System.out.println("tied: " + ((Team) teams.get(i)).getTied());
            System.out.println("ranking: " + ((Team) teams.get(i)).ranking());
            System.out.println();
        }
    }
}