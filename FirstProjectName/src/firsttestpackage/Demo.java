package firsttestpackage;
import java.util.Scanner;


/*
 Episodes 4,5,6,7, 10, 11*,12,13, 14, 15,16
 */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Java Program...");
		
		double testnum;
		testnum = 50;
		System.out.println(testnum);
		
		//Scanner scanSubject = new Scanner(System.in);
		//System.out.println(scanSubject.nextLine());
		
		/*
		int ifOps = 9;
		if (ifOps > 10) {
			System.out.println("Greater than 10");
		} else if(ifOps < 10) {
			System.out.println("Lower than 10");
		} else {
			System.out.println("Equal to 10");
		}
		*/
		
		int age = 1;
		switch(age) {
		case 1:
			System.out.println("You are 1 years old");
			break;
		case 2:
			System.out.println("You are 1 years old");
			break;
		default:
			System.out.println("Who is you?");
			break;
		}
		
		int countUp = 1;
		while (countUp < 10) {
			System.out.print(countUp + " ");
			countUp++;
		}
		
		multiClass classObject = new multiClass();
		classObject.simpleMessage();
		
		/**/
		
		Scanner input = new Scanner(System.in);
		multiClass secondObject = new multiClass();
		
		System.out.println("Enter your name : ");
		String name = input.nextLine();
		
		secondObject.secondMessage(name);
		
	}
}
