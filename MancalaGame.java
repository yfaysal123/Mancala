package edu.metrostate.ics372.FY8314.p5;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MancalaGame {
	   private Player player1;
	   private Player player2;
	   private Board board;

	   @BeforeEach
	   public void setUp() {
	       player1 = new Player("Player 1");
	       player2 = new Player("Player 2");
	       board = new Board();
	       board.setOwner(player1);
	       board.setOwner(player2);
	       player1.setPits(board.getPits().subList(0, 6));
	       player2.setPits(board.getPits().subList(6, 12));
	   }

	   @Test
	   public void testStartingGame() {
	       // Ensure both players' stores are initialized to 0
	       assertEquals(0, player1.getStore());
	       assertEquals(0, player2.getStore());

	       // Ensure each pit of both players is initialized with 4 seeds
	       for (Pit pit : player1.getPits()) {
	           assertEquals(4, pit.getSeeds());
	       }

	       for (Pit pit : player2.getPits()) {
	           assertEquals(4, pit.getSeeds());
	       }
	   }

	   @Test
	   public void testSowingSeeds() {
	       // Test case for sowing seeds from a pit
	       Pit pit = player1.getPits().get(0);
	       pit.setSeeds(6); // Set a pit with 6 seeds for testing
	       player1.sowSeeds(pit);

	       // Ensure all seeds are sown from the selected pit
	       assertEquals(0, pit.getSeeds());

	       // TODO: Implement assertions for the rest of the test case,
	       // checking if the seeds are distributed correctly.
	   }

	   @Test
	   public void testCapturingSeeds() {
	       // TODO: Implement this test case to check if capturing seeds works correctly.
	   }

	   @Test
	   public void testInvalidMove() {
	       // TODO: Implement this test case to check if the game handles invalid moves correctly and displays an error message.
	   }

	   @Test
	   public void testEndingGame() {
	       // TODO: Implement this test case to check if the game ends correctly when one player's pits are completely empty.
	   }

	   @Test
	   public void testAdditionalTurn() {
	       // TODO: Implement this test case to check if the player gets an additional turn when the last sown seed lands in their store.
	   }
	}