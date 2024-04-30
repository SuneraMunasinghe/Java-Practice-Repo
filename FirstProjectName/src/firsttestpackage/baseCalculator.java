package firsttestpackage;

import java.util.Scanner;

//Episode 7, 8*, 9*

public class baseCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner calcScan = new Scanner(System.in);
		int fnum, snum, ans;
		
		System.out.println("Enter first num = ");
		fnum = calcScan.nextInt();
		System.out.println("Enter second num = ");
		snum = calcScan.nextInt();
		
		ans = fnum + snum;
		System.out.println("Answer = " + ans);
	}

}
