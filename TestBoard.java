package edu.metrostate.ics372.FY8314.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBoard {

	public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        Board board = new Board();
        board.setOwner(player1);

        Pit testPit = board.getPits().get(0);
        testPit.setSeeds(4);

        board.distributeSeeds(player1, testPit);

        System.out.println("Player 1 Pit Distribution:");
        for (Pit pit : player1.getPits()) {
            System.out.println("Pit: " + pit.getSeeds());
        }

        System.out.println("Player 2 Pit Distribution:");
        for (Pit pit : player2.getPits()) {
            System.out.println("Pit: " + pit.getSeeds());
        }
    }
}


