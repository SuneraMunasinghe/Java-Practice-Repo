package com.suneramocktest;

import java.util.Random;

//Class for simple election
public class VotingMachine {
	public int labourVote;
	public int conservativeVote;
	
	public VotingMachine(int labourVote, int conservativeVote) {
		this.labourVote = labourVote;
		this.conservativeVote = conservativeVote;
	}

	
	
	public void voteConservative() {
		//int bias = random.nextInt(11);
		conservativeVote++;
	}
	
	public void voteLabour() {
		labourVote++;
	}
	
	public int getLabourVote() {
		return labourVote;
	}
	
	public int getConservativeVote() {
		return conservativeVote;
	}
	
	public void clearState() {
		labourVote = 0;
		conservativeVote = 0;
	}
	
}
