package com.qa.main;

public class BlackJack {
	//Method takes two numbers
	//Returns highest number that doesn't exceed 21
	//if both are over 21 return 0
	
	private int limit;
	
	public BlackJack() {
		super();
		this.limit = 21;
	}

	public int play (int player1, int player2) {
		
		if(player1 > this.limit && player2 > this.limit) {
			
			return 0;
			
		} else if (player1 > this.limit) {
			
			return player2;
			
		} else if (player2 > this.limit) {
			
			return player1;
			
		} else {
			return Math.max(player1, player2);
		}

	}

}
