package AZMI07;

import java.util.Scanner;
import java.util.Arrays;

public class LabB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input The Array Size : ");
        int n = input.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < players.length; ++i) {
            System.out.print("Input The player name : ");
            String name = input.next();

            System.out.print("Input The player Score : ");
            int score = input.nextInt();

            players[i] = new Player(name, score);
        }

        System.out.println("\nSorted Data : ");
        Arrays.sort(players);
        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getScore());
            input.close();
        }
        
    }
}

class Player implements Comparable<Player> {

    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Player b) {
        int scoreCompare = Integer.compare(score, b.score);
        if (scoreCompare != 0) {
            return -scoreCompare;
        }
        return name.compareTo(b.name);
    }
}
