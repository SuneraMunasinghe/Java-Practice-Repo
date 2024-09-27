package suneraPackage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class firstClass {

	public static void main(String[] args) {
		 
		//System.out.println("Hello world");
		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		
//		Scanner scanObject1 = new Scanner(System.in);
//		System.out.println(scanObject1.nextLine());
		
		//Creating a scanner in java.
//		Scanner scanObj = new Scanner(System.in);
//		System.out.println("The name is " + scanObj.nextLine());
		
		//Building Calculator.
		//Make a scanner obj > initialize variables > Get in[uts > add.
//		Scanner calcObj = new Scanner(System.in);
//		int fnum, snum, ans;
//		
//		System.out.println("Enter first number = ");
//		fnum = calcObj.nextInt();
//		
//		System.out.println("Enter second number = ");
//		snum = calcObj.nextInt();
//		
//		ans = fnum + snum;
//		System.out.println("Your answer is " + (fnum + snum) + ".");
		
		//if statement
//		Scanner scanObj = new Scanner(System.in);
//		
//		System.out.println("Number: ");
//		int ifNum = scanObj.nextInt();
//		
//		if (ifNum > 5) {
//			System.out.println("Greater");
//		} else {
//			System.out.println("Lesser");
//		}
		
		//Switch Case.
//		int age = 12;
//		
//		switch(age) {
//		case 10:
//			System.out.println("Age is 10");
//			break;
//		case 23:
//			System.out.println("Age is 23");
//			break;
//		default:
//			System.out.println("No age fker");
//			break;
//		}
		
		//While loop. Print numbers less than 10.
		//int count = 0;
//		int var = 0; //integer default value is 0. strings def value is null.
//		
//		while (var < 5) {
//			System.out.println("Hello world");
//			var++;
//		};
		
		
//		while (count <= 10) {
//			System.out.print(count);
//			count++;
//		}
		
//		for (int count=0; count<5; count++) {
//			System.out.println("Hello World");
//		};
		
		//for loop. Increment by 1 until 10.
//		for (int count=1;count<=10;count++) {
//			System.out.println(count);
//		}
//		Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            
//           // System.out.println(a + (2^n-1)*b);
//        }
//        in.close();
		
//		for (int i=1;i<=5;i++) {
//			System.out.println("Hello World.");
//		}
		
//		Enemy enemy = new Enemy();
//		Vampire vampire = new Vampire();
		
//		enemy.Talk();
//		vampire.Talk();
		
//		vampire.health = 25;
//		
//		System.out.println(vampire.health);
		
//		enemy.setHealth(30);
//		enemy.getHealth();
		
		//Use tuna class
//		Scanner nameScan = new Scanner(System.in);
//		Tuna tunaObj = new Tuna();
//		
//		System.out.print("Enter your name: ");
//		
//		String name = nameScan.nextLine();
//		
//		tunaObj.simpleMessage(name);
		
//		Scanner girlScan = new Scanner(System.in);
//		Tuna tunaObj = new Tuna();
//		
//		System.out.print("Girlfriend's name: ");
//		
//		String temp = girlScan.nextLine();
//		
//		tunaObj.setName(temp);
//		//System.out.println("Her name is " + tunaObj.getName());
//		tunaObj.Talk();
		
		//Constructors
//		Tuna tunaObj = new Tuna("Anni");
//		Tuna tunaObj2 = new Tuna("Ovi");
//		
//		tunaObj.Talk();
//		tunaObj2.Talk();
		
		//Simple averaging program.
//		Scanner avgScan = new Scanner(System.in);
//		
//		int total = 0, num, counter = 0, average;
//		
//		while (counter < 10) {
//			num = avgScan.nextInt();
//			total = total + num;
//			counter++;
//		}
//		
//		average = total/10;
//		System.out.println("Average = " + average);
		
		//random number generator
//		Random randNum = new Random();
//		int number;
//		int bullet = 0;
//		
//		for (int count=1; count<=10; count++) {
//			number = 1 + randNum.nextInt(6);
//			System.out.println(number);
//		}
		
		//initializing arrays
		
//		int sunera[] = {1, 2, 3, 4, 5};
//		
//		//System.out.println(sunera[2]);
//		
//		for (int i=0; i<sunera.length; i++) {
//			++sunera[i];
//			System.out.println(sunera[i]);
//		};
		
//		for (int count=0; count<5; count++ ) {
//			System.out.println(sunera[count]);
//		};
		
		//OOP concepts 4 with meaning
		//access modifiers private, public
		//constructors
		//Abstract vs. Interface
		//Introduce myself CHATGPT
		
		
//		int array[] = new int[10];
//		int array[] = {1, 2, 3, 4, 5};
		
//		array[0] = 1;
//		array[1] = 2;
//		array[9] = 20;
		
		
//		System.out.println(array[0] + " " + array[4]);
		
		//Array table
//		System.out.println("Index\tValue");
//		int array[] = {19, 34, 56, 26, 92};
//		
//		for (int count=0; count<array.length; count++) {
//			System.out.println(count + "\t" + array[count]);
//		}
		
		//Adding array
//		int array[] = {1, 2, 3, 4, 5};
//		int sum = 0;
//		
//		for(int counter=0; counter<array.length; counter++) {
//			sum = sum + array[counter];
//		}
//		
//		int repeater = 1;
//		
//		do {
//			System.out.print(repeater + " + ");
//			repeater++;
//		}
//		while (repeater<=array.length);
//		
//		System.out.print("= " + sum);
		
		//Array elements as counters
//		Random rand = new Random();
//		int freq[] = new int[7];	//Initialize array with 7 values.
//		
//		for (int roll=1; roll<=1000; roll++) {		//Loop 1000 times
//			++freq[1 + rand.nextInt(6)];		
//		}
//		
//		System.out.println("Face\tFrequency");
//		
//		for (int face = 1; face<=6; face++) {
//			System.out.println(face + "\t" + freq[face]);
//		}
//		
//		int counter = 0;
//		System.out.println("prefix : " + counter++);
//		System.out.println(counter);
//		
//		counter = 0;
//		System.out.println("\npostfix : " + ++counter);
//		System.out.println(counter);
		
		//enhanced for loop
//		int loopArray[] = {1, 2, 3, 4, 5};
//		int total = 0;
//		
//		for (int x: loopArray) {
//			total += x;
//		}
//		System.out.println(total);
		
		//Array in methods(refer method in the end.)
//		int methodArray[] = {1, 2, 3, 4, 5};
//		change(methodArray);
//		
//		for (int y: methodArray) {
//			System.out.println(y);
//		}
		
		//Printing multidimensional arrays. check display array.
//		int firstArray[][] = {{1, 2, 3, 4},{5, 6, 7, 8}};
//		int secondArray[][] = {{23, 45, 78, 37}, {243},{74, 41, 90}};
//		
//		System.out.println("Printing first array...");
//		display(firstArray);
//		
//		System.out.println("Printing second array...");
//		display(secondArray);
		
		//Array Videos
		
//		int sortArray[] = {0, 3, 1, 2, -1}; //sorting integers
//		Arrays.sort(sortArray);
//		//printArray(sortArray);
//		
//		String sortStrArray[] = {"see", "sdf", "krf", "tdl", "ndp"};
//		Arrays.sort(sortStrArray);
//		//printString(sortStrArray);
		
//		int numbers1[] = {3, 5, 8, 3, 5};
//		int numbers2[] = {3, 5, 8, 3, 5};
//		int numbers3[] = {1, 7, 4, 8, 9};
//		
//		System.out.println(Arrays.equals(numbers1, numbers3));
		
//		int fillArray[] = new int[8];
//		
//		Arrays.fill(fillArray, 1, 8, 3);
//		printArray(fillArray);
		
		//Array exercise 1
//		Scanner values = new Scanner(System.in);
//		System.out.println("How many values do you need? ");
//		int indexes = values.nextInt();
//		
//		//Validate if between 1 and 20
//		if (indexes<1 || indexes>20) {
//			System.out.println("Only enter a number between 1 and 20!");
//		} else {
//			//initialize array
//			int userArray[] = new int[indexes];
//			
//			Scanner inputs = new Scanner(System.in);
//			
//			//Enter values
//			for (int counter=0; counter<userArray.length; counter++) {
//				System.out.print("Enter Number : ");
//				userArray[counter] = inputs.nextInt();
//				System.out.println("\n");
//			}
//			
//			printArray(userArray);
//		}
		
//		String stringArray[] = new String[3];
//		Arrays.fill(stringArray, "Hi");
//		
//		System.out.println(Arrays.toString(stringArray));
		
		//Print in descending order
		
//		int descArray[] = {54, 32, 23, 92, 16, 52};
//		
//		Arrays.sort(descArray);
//		
//		int newArray[] = new int[descArray.length];
		
//		for (int i=0; i<descArray.length; i++) {
//			newArray[i] = descArray[(descArray.length - 1) - i];
//		}
		
//		int sortedDescArray[] = sortDescending(descArray);
		
//		printArray(sortDescending(descArray));
		
		Enemy myEnemy = new Enemy();
		myEnemy.setHealth(69);
		
		//Copying the object with references.
		Enemy clonedEnemy = myEnemy;
		
		System.out.println(myEnemy.toString());
		System.out.println(clonedEnemy.toString());


		
	}	// !!! END MAIN METHOD !!!
	
	//print int array method
	public static void printArray(int x[]) {
		for (int counter=0; counter<x.length; counter++) {
			System.out.print(x[counter] + " ");
		}
	}
	
	//print strings method
	public static void printString(String x[]) {
		for (int counter=0; counter<x.length; counter++) {
			System.out.println(x[counter] + " ");
		}
	}
	
	//sort descending method
	public static int[] sortDescending(int x[]) {
		
		int sortedArray[] = new int [x.length];
		
		for (int count=0; count<x.length; count++) {
			sortedArray[count] = x[(x.length - 1) - count];
		}
		return sortedArray;
	}
	
//	public static void change(int x[]) {
//		for (int counter=0; counter<x.length;counter++) {
//			x[counter] += 5;
//		}
//	}
	
//	public static void display(int x[][]) {
//		for (int row=0; row<x.length; row++) {
//			for (int column=0; column<x[row].length; column++) {
//				System.out.print(x[row][column] + "\t");
//			}
//			System.out.println();
//		}
//	}
	
	
}
