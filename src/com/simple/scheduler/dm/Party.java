package com.simple.scheduler.dm;

/**
 * 
 * @author loneranger
 * 
 */
public class Party {
	private int leads;
	private int wins;
	private float vote_percentage;
	private int swing;

	public Party() {
		super();
	}

	public Party(int leads, int wins, float vote_percentage, int swing) {
		super();
		this.leads = leads;
		this.wins = wins;
		this.vote_percentage = vote_percentage;
		this.swing = swing;
	}

	public int getLeads() {
		return leads;
	}

	public int getWins() {
		return wins;
	}

	public float getVote_percentage() {
		return vote_percentage;
	}

	public int getSwing() {
		return swing;
	}

	@Override
	public String toString() {
		return "Party [leads=" + leads + ", wins=" + wins
				+ ", vote_percentage=" + vote_percentage + ", swing=" + swing
				+ "]";
	}

}
