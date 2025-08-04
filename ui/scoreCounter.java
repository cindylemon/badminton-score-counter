package ui;

import java.util.Scanner;

public class scoreCounter {
    public int set;

    public String team1;
    public String team2;
    
    public int team1Points;
    public int team2Points;
    public int servingTeam; // i have this idea where the serving team is always stored as an integer and can change
                            // like each team is stored

    public scoreCounter() {
        set = 0;
        team1Points = 0;
        team2Points = 0;
    }

    void init() {
        Scanner type = new Scanner(System.in);
        int startType = numInput(type, 1, 2, "Select 1 for quick start and 2 for custom");
        if (startType == 1) {
            team1 = "Team A";
            team2 = "Team B";
        } else {
        Scanner scan = new Scanner(System.in);
        int selection = numInput(scan, 1, 2, "Select 1 for singles and 2 for doubles");
        if (selection == 1) {
            System.out.println("What is Player A's name?");
            Scanner name = new Scanner(System.in);
            team1 = name.nextLine();
            System.out.println("What is Player B's name?");
            team2 = name.next();
        } else {
        	System.out.println("What is player 1 on Team A's name?");
            Scanner name = new Scanner(System.in);
            team1 = name.nextLine();
            System.out.println("What is player 2 on Team A's name?");
            team1 = team1 + name.nextLine();          // concatenate the names
            System.out.println("What is player 1 on Team B's name?");
            team2 = name.nextLine();
            System.out.println("What is player 2 on Team B's name?");
            team2 = team2 + name.nextLine();          // concatenate the names
            System.out.println(team1 + team2);
        }}

        startCounter();
    }

    void startCounter() {
        System.out.println("start counter");
        Scanner scan = new Scanner(System.in);
        numInput(scan, 1, 3, "What team is serving? Select A for " + team1 + ", 2 for " + team2);
        
    }

    // MODIFIES: this
    // EFFECTS: takes in the user input for numbers
    public int numInput(Scanner scan, int min, int max, String text) {
        int choice;
        while (true) {
            System.out.println(text);
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
                if (choice < min || choice > max) {
                    System.err.println("ERROR. INPUT IS NOT IN RANGE");
                } else {
                    break;
                }
            } else {
                System.err.println("ERROR. INVALID INPUT.");
                scan.next();
            }
        } 
        return choice;
    }
}
