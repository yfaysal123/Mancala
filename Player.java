package edu.metrostate.ics372.FY8314.p5;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	   private String name;
	   private int store;
	   private List<Pit> pits;

	   public Player(String name) {
	       this.name = name;
	       this.store = 0;
	       this.pits = new ArrayList<>();
	   }

	   public void sowSeeds(Pit pit) {
	       int numSeeds = pit.getSeeds();
	       pit.setSeeds(0);
	       for (int i = 0; i < numSeeds; i++) {
	           Pit nextPit = pits.get((i + 1) % pits.size());
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

	