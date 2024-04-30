package com.suneramocktest;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Working with voting machine class.
		/*
		 * VotingMachine vm = new VotingMachine(500, 600);
		 * 
		 * for (int i=0; i<10; i++) { vm.voteConservative(); }
		 * 
		 * System.out.println(vm.getConservativeVote());
		 */
		
		//Working with the crads classes.
		
//		ArrayList<CreditCard> creditcardList = new ArrayList<>();
//		
//		creditcardList.add(new CreditCard("John", 1234, 2027));
//		creditcardList.add(new CreditCard("Adam", 2345, 2027));
//		creditcardList.add(new CreditCard("Mark", 1323, 2028));
//		creditcardList.add(new CreditCard("Evan", 3456, 2026));
//		creditcardList.add(new CreditCard("Loki", 9476, 2027));
//		
//		for (CreditCard c: creditcardList)
//			System.out.println(c);
		
		//Palindromic number problem.
		
		int multiplier;
		boolean flag = false;
		
		
		int num = 8778;
		
		//Checking for a palindrome.
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		sb.reverse();
//		String strRev = sb.toString();
//		int intRev = Integer.parseInt(strRev);
//		
//		if (num == intRev) {
//			System.out.println("It is a palindrome!");
//			flag = true;
//		} else {
//			System.out.println("Not a palindrome :(");
//		}
		
		ArrayList<Integer> iniPal = new ArrayList<>();
		ArrayList<Integer> finPal = new ArrayList<>();

		
		for (int i=100; i<1000; i++) {
			for (int j=100; j<1000; j++) {
				multiplier = i*j;
				
				StringBuffer sb = new StringBuffer(String.valueOf(multiplier));
				sb.reverse();
				String strRev = sb.toString();
				int intRev = Integer.parseInt(strRev);
				
				if (multiplier == intRev) {
					iniPal.add(i);
					finPal.add(j);
				}
			}
		}

		int maxFirst = iniPal.size() - 1;
		int maxSecond = finPal.size() - 1;
		
		System.out.println("Largest multiplier: " 
				+ iniPal.get(maxFirst) + " x " + finPal.get(maxSecond));
		
		
	}	//END MAIN METHOD

}
