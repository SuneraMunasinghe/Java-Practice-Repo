package com.sunerajavaprograms;

//This class belongs to line #908 in main class.
public class Acronyms implements AcronymsInterface {
	
	private int count = 0;
	
	@Override
	public String checkAcronyms(String[] array, String target) {
		
		while (array.length == target.length()) {
			
			for (int i=0; i<array.length; i++) {
				if (target.charAt(i) == array[i].charAt(0)) {
					count++;
				}
			}
			
			if (count == target.length()) {
				return "It is an acronym!";
			}
			
		}
		
		return "No acronym detected!";
		
	}
	
}
