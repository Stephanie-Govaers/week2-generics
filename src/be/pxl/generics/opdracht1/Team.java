package be.pxl.generics.opdracht1;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player>{

    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private List<T> members = new ArrayList<T>();


    public Team(String name){
        this.name = name;
    }

    public void addPlayer(T player){
        members.add(player);
    }

    public int numberOfPlayers(){
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        played++;
        opponent.setPlayed(opponent.getPlayed()+1);
        if(ourScore > theirScore){
            won++;
            opponent.setLost(opponent.getLost()+1);
        } else if(ourScore < theirScore){
            lost++;
            opponent.setWon(opponent.getWon()+1);
        } else {
            tied++;
            opponent.setTied(opponent.getTied()+1);
        }

        System.out.println("Results: ");
        System.out.println("Name: " + name + "\t" + "Played: " + played + "\t" + "Won: " + won + "\t" + "Lost: " + lost + "\t" + "Tied: " + tied);
        System.out.println("Name: " + opponent.getName() + "\t" + "Played: " + opponent.getName() + "\t" + "Won: " + opponent.getWon() + "\t" + "Lost: " + opponent.getLost() + "\t" + "Tied: " + opponent.getTied());
    }

    public int ranking(){
        int score;

        score = won * 3 + tied;
        return score;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public void setTied(int tied) {
        this.tied = tied;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public List<T> getMembers() {
        return members;
    }
}
