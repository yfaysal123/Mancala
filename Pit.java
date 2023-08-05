package edu.metrostate.ics372.FY8314.p5;

/**
* The Pit class represents a pit in the Mancala game.
* Each pit holds a certain number of seeds and belongs to a player.
*/

public class Pit {
	   private int seeds;
	   
	   /**
	    * Constructor to create a new pit with 0 seeds.
	    */

	   public Pit() {
	       this.seeds = 0;
	   }

	   public int getSeeds() {
	       return seeds;
	   }

	   public void setSeeds(int seeds) {
	       this.seeds = seeds;
	   }

	   public void addSeed() {
	       this.seeds++;
	   }

	   private Player owner; 
	   
	   /**
	    * Set the owner of the pit to the given player.
	    *
	    * @param player The player who owns the pit.
	    */

	   public void setOwner(Player player) {
	       this.owner = player;
	   }
	   /**
	    * Get the owner of the pit.
	    *
	    * @return The player who owns the pit.
	    */

	   public Player getOwner() {
	       return owner;
	   }
	}