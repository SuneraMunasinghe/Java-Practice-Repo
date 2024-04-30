package com.sunerajavaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1) Swap 2 numbers
//		int a = 0;
//		int b = 0;
//		int tempNum;
//		
//		Scanner numScan = new Scanner(System.in);
//		System.out.println("Assign value for a");
//		a = numScan.nextInt();
//		System.out.println("Assign value for b");
//		b = numScan.nextInt();
//		
//		tempNum = a;
//		a = b;
//		b = tempNum;
//		
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);

		//2) Reverse a number - If user gives 1234, output 4321
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your number(2 digits or more) : ");
//		
//		int num = sc.nextInt();
//		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		
//		System.out.println("Reversed line: " + rev);
		
		//3) Reverse string - same as before
		
		//4) Palindrome number - check if number is same if reversed.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter your number(2 digits or more) : ");
//		
//		int num = sc.nextInt();
//		sc.close();
//		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		sb.reverse();	//Reverse the string
//		String strRev = sb.toString();	//Convert to string.
//		int intRev = Integer.parseInt(strRev);	//Convert to integer
//		
//		if (num == intRev) {
//			System.out.println(num + " is a palindrome!");
//		} else {
//			System.out.println(num + " is not a palindrome.");
//		}
		
		//6) Number of digits in a number
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number: ");
//		
//		int num = sc.nextInt();
//		
//		String strNum = String.valueOf(num);	//Convert to string, method 1
//	
//		System.out.println("Digits: " + strNum.length());
//		
//		int count = 0;	//Method 2 - divide by 10 until output becomes 0.
//		
//		while (num != 0) {
//			num = num/10;
//			count++;
//		}
//		
//		System.out.println("Number of digits: " + count);
		
		//7) Amount of even and odd numbers
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number: ");
//		
//		int num = sc.nextInt();
//		sc.close();
//		
//		int remainder = 0;
//		int oddCount = 0;
//		int evenCount = 0;
//		ArrayList<Integer> intArray = new ArrayList<>();
//		
//		while (num != 0) {		//Adds all numbers to array list.
//			remainder = num % 10;
//			intArray.add(remainder);
//			num = num/10;
//		}
//		
//		
//		for (int i = 0; i<intArray.size(); i++) {
//			if (intArray.get(i) % 2 == 0) {
//				evenCount++;
//			} else {
//				oddCount++;
//			}			
//		}
//		
//		System.out.println("Odd Digits: " + oddCount);
//		System.out.println("Even Digits: " + evenCount);
		
		//8) Count Sum Of Digits in a Number
		
//		int num = 7529;
//		int remainder = 0;
//		int total = 0;
//		
//		while (num != 0) {
//			remainder = num % 10;
//			total =total + remainder;
//			num = num/10;
//		}
//		
//		System.out.println("Total of all numbers : " + total);
		
		//9) Find Largest Of 3 Numbers
		
//		int num1 = 246;
//		int num2 = 247;
//		int num3 = 4;
//		
//		int largest = 0;
//		
//		if (num1>num2 && num1>num3) {
//			largest = num1;
//		} else if(num2>num3 && num2>num1) {
//			largest = num2;
//		} else {
//			largest = num3;
//		}
//		
//		System.out.println(largest);

		//Fibonacci Series
		
//		int num1 = 1;
//		int num2 = 2;
//		
//		int sum = num1 + num2;
//		int total = 0;
//		//int count = 0;
//		
//		System.out.println(num1);
//		System.out.println(num2);
//		//System.out.println(sum);
//		
//		for (int i=0; i<7; i++) {
//			sum = num1 + num2;
//			System.out.print(" " + sum);
//			num1 = num2;
//			num2 = sum;
//		}
		
		//Checking Prime Number - Can only be divisible by 1 and itself.
//		int num = 344;
//		
//		int count = 0;
//		
//		if (num > 1) {
//			
//			for (int i=1; i<num; i++) {
//				if (num%i == 0) {
//					count++;
//				}
//			}
//			
//			if (count == 1) {
//				System.out.println("Prime Number!");
//			} else {
//				System.out.println("Not prime number!");
//			}
//			
//		} else {
//			System.out.println("Number is not a prime number");
//		}
		
		//14) Find Sum of Elements in Array - 5 element array.
		
//		int[] numArray = {4, 6, 8, 2, 5};
//		
//		int sum = 0;
//		
//		for (int i=0; i<numArray.length; i++) {
//			sum += numArray[i];
//		}
//		
//		System.out.println("Total = " + sum);
		
		//15) Print even and odd numbers from an array.
		
//		int array[] = {1, 2, 3, 4, 5, 6};
//		
//		ArrayList<Integer> oddArrayList = new ArrayList<>();
//		ArrayList<Integer> evenArrayList = new ArrayList<>();
//				
//		for (int i=0; i<array.length; i++) {
//			if (array[i] % 2 == 0) {
//				evenArrayList.add(array[i]);
//			} else {
//				oddArrayList.add(array[i]);
//			}			
//		}
//		
//		System.out.println("Even Numbers = " + evenArrayList);
//		System.out.println("Odd Numbers = " + oddArrayList);
		
		//16) Check The Equality Of Two Arrays
		
//		int[] array1 = {1, 2, 3, 4};
//		int[] array2 = {1, 2, 3, 4};
//
//		System.out.println(Arrays.equals(array1, array2));	//Method 1 Arrays class.
//		
//		int count = 0;	//Method 2 - for loops
//		
//		for (int i=0; i<array1.length; i++) {
//			if (array1[i] == array2[i]) {
//				count++;
//			}
//		}
//		
//		if (count == array1.length) {
//			System.out.println("Arrays are equal.");
//		} else {
//			System.out.println("Arrays are not equal!");
//		}
		
		//17) Find Missing Number in an Array
		
//		int[] array = {1, 2, 4, 5};
//		
//		int sumOriginal = 0;
//		int sumIdeal = 0;
//		
//		for (int i=0; i<array.length; i++) {
//			sumOriginal += array[i];
//		}
//		
//		for (int j=1; j<=5; j++) {
//			sumIdeal += j;
//		}
//		
//		System.out.println("Missing Number: " + (sumIdeal - sumOriginal));
		
		//17) Find Maximum & Minimum Values in Array
		
//		int[] array = {24, 64, 91, 52, 7};
//		
//		int max = array[0];
//		int min = array[0];
//		
//		for (int i=0; i<array.length; i++) {
//			if (array[i] > max) {
//				max = array[i];
//			}
//			
//			if (array[i] < min) {
//				min = array[i];
//			}
//		}
//		
//		System.out.println("Maximum Value: " + max);
//		System.out.println("Minimum Value: " + min);

		//19) Find Duplicate Elements in Array
		
//		int[] arr = {1, 2, 3, 4, 4, 6, 2, 5, 9};
//		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=i + 1; j<arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println("Repeating numbers: " + arr[i]);
//				}
//			}
//		}
		
		//20) Searching an Element in Array | Linear Search
		
//		int[] array = {10, 20, 30, 40, 50};
//		
//		int search = 30;
//		boolean flag = false;
//		
//		for (int i=0; i<array.length; i++) {
//			if (array[i]==search) {
//				System.out.println("Element found at index " + i);
//				flag = true;
//				break;
//			}
//		}
//		
//		if (flag == false) {
//			System.out.println("Element not in array.");
//		}
		
		//21) Searching an Element in Array | Binary Search
		
//		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int key = 5;
//		
//		int l = 0;					//lower value
//		int h = array.length - 1;	//higher value
//		int m = 0;					//mid value
//		boolean flag = false;		//element found? flag
//		
//		while (l <= h) {			//Exit loop if l is higher than h
//			m = (l+h)/2;
//			
//			if (m == key) {			//Case 1
//				System.out.println("Value found at position " + m);
//				flag = true;
//				break;
//			}
//			
//			if (key > m) {			//Case 2
//				l = m + 1;
//			}
//			
//			if (key < m) {			//Case 3
//				h = m - 1;
//			}	
//		}
//		
//		if (flag == false) {
//			System.out.println("Element not found within array");
//		}
		
		//22) Sort Elements in Array | Bubble Sort
		
//		int[] array = {4, 2, 1, 5, 3};
//		
//		int temp = 0;
//		
//		for (int i=0; i<array.length - 1; i++) {
//			for (int j=0; j<array.length - 1; j++) {
//				if (array[j] > array[j+1]) {
//					temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				} 
//			}
//		}
//		
//		System.out.println(Arrays.toString(array));
		
		//23) Other built in sorting methods
		
//		Integer[] array = {40, 10, 50, 20, 30};
//		//Must be wrapper class for Collections class to work.
//		
//		System.out.println(Arrays.toString(array));	//printing
//		Arrays.sort(array);							//sorting ascending
//		System.out.println(Arrays.toString(array));	//printing
//		
//		Arrays.sort(array, Collections.reverseOrder());	//sort descending
//		System.out.println(Arrays.toString(array));	//printing
		
		//24) How to remove junk/special characters in string

//		String s = "$%&& hello &%&((()* java *&%*$%*";
//		
//		s= s.replaceAll("[^a-zA-z0-9]", "");
//		System.out.println(s);
		
		//26) Count Occurrences of a Character in a String
		
		String s = "java programming java oop";
		
		int initial = s.length();
		
		int remove_a = initial - s.replace("a", "").length();
		
		System.out.println("Amount of a occurences: " + remove_a);
		
	}	//END MAIN METHOD

}
