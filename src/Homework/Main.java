package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Filling with Consturctor
        
        Player  player1 = new Player(9,"Roberto Soldado","Forward",12.3);
        Player  player2 = new Player(1,"Volkan Demirel", "GoalKeeper", 6.9);
        Player  player3 = new Player(30,"Serdar Aziz", "Defender",3.8);
        Player  player4 = new Player(28,"Mathieu Valbenau","Midfielder",9.6);
        Player  player5 = new Player(3,"Hasan Ali Kaldırım","Defender",8.9);
        Player  player6 = new Player(10,"Andre Ayew","Forward",6.3);
        Player  player7 = new Player(12,"Mehmet Ali Topal", "Midfielder",7.8);
        Player  player8 = new Player(3,"Martin Skirtel","Defender",11.2);
        Player  player9 = new Player(7,"Alper Potuk", "Midfielder",15.8);
        Player  player10 = new Player(11,"Mehmet Ekici","Midfielder",2.1);
        Player  player11 = new Player(17,"Nabil Dirar","Midfielder",7.8);
        
        ArrayList<Player> team1 = new ArrayList<Player>();
        team1.add(player1);
        team1.add(player2);
        team1.add(player3);
        team1.add(player4);
        team1.add(player5);
        team1.add(player6);
        team1.add(player7);
        team1.add(player8);
        team1.add(player9);
        team1.add(player10);
        team1.add(player11);
        
        FootballTeam footballTeam = new FootballTeam("Fenerbahçe","Süper Lig", team1);
        footballTeam.displayTeamInfo();
        
        
    /*
        //Filling with scanner
        Scanner sc = new Scanner(System.in);
        ArrayList<FootballTeam> teams = new ArrayList<FootballTeam>();

        int tempSrtNo;
        String tempName, tempPost;

        double tempValue;
        String tempTeamName, tempLeague;

        ArrayList<Player> players = new ArrayList<Player>();

        System.out.println("How many teams do you want to add?");
        FootballTeam.setNumOfTeam(sc.nextInt());
        for (int i = 0; i <= FootballTeam.getNumOfTeam(); i++) {
            System.out.print("Team Name: ");
            sc.nextLine();
            tempTeamName = sc.nextLine();

            System.out.print("Team League:");
            tempLeague = sc.nextLine();

            System.out.println("");
            System.out.println("Add players info");
            System.out.println("==============");
            for (int j = 0; j < FootballTeam.getNumOfPlayer(); j++) {
                System.out.print("Shirt Number:");
                tempSrtNo = sc.nextInt();

                System.out.print("Name: ");
                tempName = sc.next();

                System.out.print("Position: ");
                sc.nextLine();
                tempPost = sc.nextLine();

                System.out.print("Value: ");
                tempValue = sc.nextFloat();
                sc.nextLine();

                System.out.println("");
                Player tempPlayer = new Player(tempSrtNo, tempName, tempPost, tempValue);

                players.add(tempPlayer);

            }

            FootballTeam tempTeam = new FootballTeam(tempTeamName, tempLeague, players);
            teams.add(tempTeam);

        }

        for (int i = 0; i < teams.size(); i++) {
            teams.get(i).displayTeamInfo();
        }
*/
    }

}
