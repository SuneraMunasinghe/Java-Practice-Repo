package testing;

public class Calculator {
	
	//Method to square an integer.
	public int square(int x) {
		return x*x;
	}
	
	//Method to count "A" from word.
	public int countA(String word) {
		int count=0;
		
		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i) == 'A' || word.charAt(i) == 'a') {
				count++;
			}
		}
		
		
		return count;
	}
	
}
