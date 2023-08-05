package edu.metrostate.ics372.FY8314.p5;

import java.util.ArrayList;
import java.util.List;

public class Board {
	
	private List<Pit> pits;
	
	public Board() {
		this.pits = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
			Pit pit = new Pit();
			pits.add(pit);
		}
	}
	 public void setOwner(Player player) {
	        for (Pit pit : pits) {
	            pit.setOwner(player);
	        }
	    }

	    public void distributeSeeds(Player player, Pit pit) {
	        int numSeeds = pit.getSeeds();
	        pit.setSeeds(0);
	        for (int i = 0; i < numSeeds; i++) {
	            Pit nextPit = pits.get((i + 1) % pits.size());
	            if (nextPit.getOwner() == player) {
	                nextPit.addSeed();
	            } else {
	                pits.get((i + 1) % pits.size()).addSeed();
	            }
	        }
	    }
		public List<Pit> getPits() {
			return null;
		}


	}