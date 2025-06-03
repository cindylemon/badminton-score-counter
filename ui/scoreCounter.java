package ui;

import java.util.Scanner;

public class scoreCounter {
    public int set;

    public String team1;
    public String team2;
    
    public int team1Points;
    public int team2Points;

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
            startCounter();
        }
        Scanner scan = new Scanner(System.in);
        int selection = numInput(scan, 1, 2, "Select 1 for singles and 2 for doubles");
        if (selection == 1) {
            System.out.println("What is player 1's name?");
            Scanner name = new Scanner(System.in);
            team1 = name.nextLine();
            System.out.println("What is player 2's name?");
            team2 = name.next();
        } else {
            // concatenate the names
        }
    }

    void startCounter() {

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
