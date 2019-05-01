
package Homework;

import java.util.ArrayList;

public class FootballTeam {
    
    private String name;
    private String league;
    private double teamValue;
    ArrayList<FootballTeam> team = new ArrayList<FootballTeam>();
    ArrayList<Player> players = new ArrayList<Player>();
    private final static int numOfPlayer=11;
    private static int numOfTeam;

    public FootballTeam()
    {
        this.name=name;
        this.league="No league";
        this.teamValue=0;
        this.team=new ArrayList<FootballTeam>();
        this.numOfTeam++;
        this.players= new ArrayList<Player>();
    }
    public FootballTeam(String name, String league, ArrayList<Player> players)
    {
        this.league=league;
        this.name=name;
        this.players=players;
        this.setNumOfTeam(numOfTeam);
        this.team=team;
    }

      public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
   
    public static int getNumOfPlayer() {
        return numOfPlayer;
    }

    public ArrayList<FootballTeam> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<FootballTeam> team) {
        this.team = team;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public double getTeamValue() {
        return teamValue;
    }

    public void setTeamValue(double teamValue) {
        this.teamValue = teamValue;
    }
    public static int getNumOfTeam() {
        return numOfTeam;
    }

    public static void setNumOfTeam(int numOfTeam) {
        FootballTeam.numOfTeam = numOfTeam;
    }

    public void displayTeamInfo()
    {
          
        for (int j=0;j<this.getTeam().size();j++) {
        }
        {
            System.out.println("================");
        System.out.println("Team Information");
        System.out.println("================");
        System.out.println("Team Name      : " +getName());
        System.out.println("League         : " +getLeague());
        System.out.println("Team Value     : " +valueOfTeam()+"€");
        System.out.println("Players of Team:");
        for(int i=0; i<this.getPlayers().size();i++)
        {
            System.out.println("===========");
            System.out.println("Player#"+(i+1)+ " Info");
            this.getPlayers().get(i).displayPlayer();
        }
        }
        
    }
    public double valueOfTeam()
    {
        for(int i=0;i<this.getPlayers().size();i++)
        {
            teamValue+=this.getPlayers().get(i).getValue();
        }
        return teamValue;
    }
    
}
