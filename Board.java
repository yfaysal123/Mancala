package edu.metrostate.ics372.FY8314.p5;

import java.util.ArrayList;
import java.util.List;

/**
* The Board class represents the game board.
* It consists of a list of pits.
*/

	public class Board {
	   private List<Pit> pits;
	   
	   /**
	    * Constructor to create a new game board.
	    * Initializes the list of pits with 12 empty pits.
	    */

	   public Board() {
	       this.pits = new ArrayList<>();
	       for (int i = 0; i < 12; i++) {
	           Pit pit = new Pit();
	           pits.add(pit);
	       }
	   }
	   
	   /**
	    * Set the owner of the pits on the board to the given player.
	    *
	    * @param player The player who owns the pits.
	    */

	   public void setOwner(Player player) {
	       for (Pit pit : pits) {
	           pit.setOwner(player);
	       }
	   }

	   public void distributeSeeds(Player player, Pit pit) {
	       int numSeeds = pit.getSeeds();
	       pit.setSeeds(0);
	       for (int i = 0; i < numSeeds; i++) {
	           Pit nextPit = pits.get((pits.indexOf(pit) + i + 1) % pits.size());
	           if (nextPit.getOwner() == player) {
	               nextPit.addSeed();
	           } else {
	               pits.get((pits.indexOf(pit) + i + 1) % pits.size()).addSeed();
	           }
	       }
	   }
	   
	   /**
	    * Get the list of pits on the board.
	    *
	    * @return The list of pits on the board.
	    */

	   public List<Pit> getPits() {
	       return pits;
	   }
	}