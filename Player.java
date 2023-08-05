package edu.metrostate.ics372.FY8314.p5;

import java.util.ArrayList;
import java.util.List;

/**
* The Player class represents a player in the Mancala game.
* Each player has a name, a store to keep captured seeds, and a list of pits that belong to the player.
*/

	public class Player {
	   private String name;
	   private int store;
	   private List<Pit> pits;
	   
	   /**
	    * Constructor to create a new player with the given name.
	    *
	    * @param name The name of the player.
	    */

	   public Player(String name) {
	       this.name = name;
	       this.store = 0;
	       this.pits = new ArrayList<>();
	   }
	   
	   /**
	    * Sow seeds from the selected pit to the following pits in a circular manner.
	    * After sowing, the selected pit will be empty.
	    *
	    * @param pit The pit from which seeds will be sown.
	    */

	   public void sowSeeds(Pit pit) {
	       int numSeeds = pit.getSeeds();
	       pit.setSeeds(0);
	       for (int i = 0; i < numSeeds; i++) {
	           Pit nextPit = pits.get((pits.indexOf(pit) + i + 1) % pits.size());
	           nextPit.addSeed();
	       }
	   }

	   public int getStore() {
	       return store;
	   }

	   public void setStore(int store) {
	       this.store = store;
	   }

	   public List<Pit> getPits() {
	       return pits;
	   }

	   public void setPits(List<Pit> pits) {
	       this.pits = pits;
	   }
	}