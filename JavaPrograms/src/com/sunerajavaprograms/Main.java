package com.sunerajavaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println("I am the main block!");
		
		
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
		
//		String s = "java programming java oop";
//		
//		int initial = s.length();
//		
//		int remove_a = initial - s.replace("a", "").length();
//		
//		System.out.println("Amount of a occurences: " + remove_a);
		
//		String s = "something rodger maybe";
//		
//		//Regular expression to remove white spaces.
//		s = s.replaceAll("\\s", ""); 
//		//Replaced "\\s" with "".
//		
//		//char[] characters = new char[s.length()];
//		ArrayList<Character> charAL = new ArrayList();
//		
//		//Add string to array
//		for (int a=0; a<s.length(); a++) {
//			//characters[a] = s.charAt(a);
//			charAL.add(s.charAt(a));
//		}
//		
//		//Check if characters are equal.
//		for (int i = 0; i < charAL.size(); i++) {
//		    for (int j = i + 1; j < charAL.size(); j++) {
//		        if (charAL.get(i) == charAL.get(j)) {
//		            System.out.println("Repeated letter: " + charAL.get(i));
//		            //charAL.remove(i);
//		            charAL.remove(j);
//		        }
//		    }
//		}
//		
//		System.out.println(charAL);
		
//		int[] array = {1, 2, 3, 4};
//		
//		int[]  = {5, 6, 7, 8};
		
		//Deleting an element from an array.
//		int[] array = {1, 2, 3, 4, 5};
//		int delete = 4;
//		
//		ArrayList<Integer> newList = new ArrayList<>();
//		
//		for (int i=0; i<array.length; i++) {
//			if (array[i] != delete) {
//				newList.add(array[i]);
//			}
//		}
//		
//		System.out.println(newList);
		
		//int day = Calendar.get(Calendar.DAY_OF_MONTH);
//		Date date = new Date();
//
//	    // Print the date in default format (e.g., Tue May 21 2024 17:32:09 GMT-04:00)
//	    System.out.println(date);
//		
		
		//Print missing numbers of an array
//		int[] array = {2, 4, 1, 5, 7, 8, 0};
//		//return 3 and 6
//		Arrays.sort(array);	//Sort array
//		System.out.println(Arrays.toString(array));
//		
//		int temp = 0;
//		
//		for (int i=0; i<array.length; i++) {
//			if (array[i] != temp) {
//				System.out.print(temp);
//				temp++;
//			}
//			temp++;
//		}
//		
		
//		int a = 5;
//		int b = 4;
//		
//		System.out.println(a.equals(b));
		
		//Program to get count of characters - count occurences in string for all letters
		
//		String s = "automation";
//		
//		int preLength = s.length();
//		
//		int postLength = preLength - s.replace("a", "").length();
//		
//		System.out.println("Amount of a: " + postLength);
		
		//Count vowels and consonants in string
		
//		String s = "sunera";
//		
//		ArrayList<Character> charArray = new ArrayList<>(); 
//		
//		for (char c : s.toCharArray()) {
//			charArray.add(c);
//		}
//		
//		System.out.println(charArray);
//		
//		int count = 0;
//		
//		String vowels = "aeiou";
//		
//		for (int i=0; i<charArray.size(); i++) {
//			if (charArray.get(i) == 'a') {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
//		HashMap<Integer, String> map = new HashMap<>();
//		
//		map.put(1, "Sunera");
//		map.put(2, "John");
//		map.put(3, "Max");
//		
//		System.out.println(map.get(1));
		
		//Count repeated characters in string.
//		String str = "automation";
//		
//		ArrayList<Character> charArray = new ArrayList<>();
//		
//		System.out.println(str.indexOf(4));
//		
//		for (char c : str.toCharArray()) {
//			charArray.add(c);
//		}
//		
//		System.out.println(charArray);
//		
//		for (int i=0; i<charArray.size(); i++) {
//			for(int j=i + 1; j<charArray.size(); j++) {
//				if (charArray.get(i) == charArray.get(j)) {
//					System.out.println(charArray.get(i));
//				}
//			}
//		}
		
		//Enhanced for loops
//		int[] array = {1, 2, 3, 4, 5};
//		int sum = 0;
//		
//		for (int i: array) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		//Max element with enhanced for loops
//		int[] array = {4, 6, 1, 9, 3};
//		int max = 0;
//		
//		for (int i : array) {
//			if (i > max) {
//				max = i;
//			}
//		}
//		System.out.println(max);
		
		//Count occurences
//		int[] numbers = {1, 2, 3, 2, 5, 4, 7, 2};
//		int target = 2;
//		int count = 0;
//		
//		for (int val : numbers) {
//			if (val == target) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		//Filter even numbers
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 57, 28};
//		
//		for (int val : numbers) {
//			if (val % 2 == 0) {
//				System.out.print(val + " ");
//			}
//		}
		
		//Print in reverse order.
//		int[] array = {10, 20, 30, 40, 50};
//		int[] newArray = new int[array.length];
//		int adder = 0;
//		
//		for (int i=array.length - 1; i>=0; i--) {
//			newArray[adder] = array[i];
//			adder++;
//		}
//		
//		System.out.println(Arrays.toString(newArray));
		
		//Sum of arraylist
//		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//		int sum = 0;
//				
//		for (int val : numbers) {
//			sum += val;
//		}
//		System.out.println(sum);
		
		//Find longest String
//		String[] words = {"apple", "banana", "watermelon", "grape"};
//		int length = 0;
//		String longest = "";
//		
//		for (String val : words) {
//			if (val.length() > length) {
//				longest = val;
//				length = val.length();
//			}
//		}
//		System.out.println(longest);
		
//		for (int i=1; i<=100; i++) {
//			if (i%3 == 0 && i%5 == 0) {
//				System.out.println("FizzBuzz");
//			} else if (i % 5 == 0) {
//				System.out.println("Buzz");
//			} else if (i % 3 == 0) {
//				System.out.println("Fizz");
//			} else {
//				System.out.println(i);
//			}
//		}
		
		//Find majority element
//		int[] nums = { 2, 3, 4, 5, 2, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 5 };
//		Arrays.sort(nums);
//		
//		ArrayList<Integer> numArray = new ArrayList<>(Arrays.asList(2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5));
//		
//		HashMap<Integer, Integer> numMap = new HashMap<>();
//		int tempKey = numArray.get(0);
//		int count = 1;
//		int maxKey = 0;
//		
//		//Make hash map with key as the number, and value as the occurrences.
//		for (int i : numArray) {
//			if (tempKey == i) {
//				numMap.put(tempKey, count);
//				count++;
//			} else {
//				count = 1;
//				tempKey = i;
//				numMap.put(tempKey, count);
//				count++;
//			}
//		}
//		
//		System.out.println(numMap);
//		
//		//Find max value of all the key value pairs.
//		for (int j : numMap.keySet()) {	//Use numMap.values() for straight values, instead of going through keys.
//			if (maxKey < numMap.get(j)) {
//				maxKey = numMap.get(j);
//			}
//		}
//		System.out.println("Most occuring number : " + maxKey);
		
		//Sort names in an array.
		//String[] name = {"BANANA","APPLE","PINEAPPLE","MANGO","KIWI"};
		
//		Arrays.sort(name);
//		System.out.println(Arrays.toString(name));
		
//		System.out.println(name[1].compareTo(name[0]));
//		
//		//Basically bubble sort.
//		for (int i=0; i<name.length; i++) {
//			for (int j=i+1; j<name.length; j++) {
//				if (name[i].compareTo(name[j]) > 0) {
//					String temp = name[i];
//					name[i] = name[j];
//					name[j] = temp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(name));
		
		//String compression
//		String str = "aaabbbcc";
//		char[] array = new char[str.length()];
//		char tempKey = array[0];
//		int count = 0;
//		HashMap<Character, Integer> map = new HashMap<>();
//		
//		//Create character array from string.
//		for (int i=0; i<str.length(); i++) {
//			array[i] = str.charAt(i);
//		}
//		
//		System.out.println(Arrays.toString(array));
//		
//		//Creating map(Better version)
//		for (char i : array) {
//			if (i == tempKey) {
//				count++;
//				map.put(tempKey, count);
//			} else {
//				count = 1;		//Reset counter
//				tempKey = i;	//Assign new key in map
//				map.put(tempKey, count);
//			}
//		}
//		
//		System.out.println(map);
//		
//		//Printing occurrences
//		//Use map.containsValue(x) to work with values instead of keys.
//		for (char j : map.keySet()) {
//			//System.out.println("Occurrences of " + j + ": " + map.get(j));
//			System.out.print(Character.toString(j) + map.get(j));
//		}
		
		//Count spaces
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("What is the sentence?");
//		String s = scanner.nextLine();
//		
//		System.out.println("Which letter do you need to find?");
//		char findChar = scanner.nextLine().charAt(0);
//		
//		int count = 0;
//		
//		for (int i=0; i<s.length(); i++) {
//			if (s.charAt(i) == findChar) {
//				count++;
//			}
//		}
//		System.out.println("Number of occurrences: " + count);
		
		//Number of vowels
//		String s = "automation hellooo";
//		
//		int iniLen = s.length();
//		
//		String newString = s.replaceAll("[aeiou]", "");
//		
//		int finLen = newString.length();
//		
//		System.out.println("Vowels in word " + s + ": " + (iniLen - finLen));
//		
//		System.out.println(newString);
		
		//Reverse the word
//		String str = "automation";
//		
//		char[] array = new char[str.length()];
//		StringBuilder builder = new StringBuilder();
//		
//		//Adding to char array in reverse order.
//		for (int i=str.length()-1; i>=0; i--) {
//			array[str.length() - 1 - i] = str.charAt(i);
//		}
//		
//		//Building string
//		for (char c : array) {
//			builder.append(c);
//		}
//		
//		//Converting from builder object to string object.
//		System.out.println(builder.toString());
		
		//palindrome string
		//String s = "A man, a plan, a canal: Panama";
//		String s = "Level!";
//
//		s = s.toLowerCase().replaceAll("[^A-Za-z]", "");
//		
//		StringBuffer sb = new StringBuffer(s);
//		
//		//sb.reverse();
//		String newStr = sb.reverse().toString();
//		
//		System.out.println(s);
//		System.out.println(newStr);
//		
//        if (s == newStr) {
//        	System.out.println("Palindrome!");
//        } else {
//        	System.out.println("Notttt!");
//        }
		
		//Leetcode stocks selling and buying.
		//prices = [7,1,5,3,6,4]
//		int[] prices = {7,1,5,3,6,4};
//		//int[] prices = {7,6,4,3,1};
//		
//		int buy = 0;
//		int sell = 0;
//		
//		//Check each element 'i' against 'i+1' to find lowest.
//		for (int i=1; i<prices.length; i++) {
//			if (prices[i] < prices[i-1]) {
//				buy = prices[i];
//				for (int j = i+2; j<prices.length; j++) {
//					if (prices[j-1]>prices[j]) {
//						sell = prices[j-1];
//					}
//				}
//			}
//			if (buy == prices[prices.length - 2]) {
//				System.out.println("Profit : " + buy);
//			} else {
//				int profit = sell - buy;
//				System.out.println("Profit = " + sell + " - " + buy + " = " + profit);
//			}
//			break;
//		}
		
		//Attempt 2
		//int[] prices = {7,1,5,3,6,4};
		//int[] prices = {7,6,4,3,1};
//		int[] prices = {2,4,1};

		
		//Find best value and day to buy
//		int buyVal = Integer.MAX_VALUE, buyDay = 0;
//		
//		//Find best day and relevant value to buy(lowest)
//		for (int i=0; i<prices.length; i++) {
//			if (prices[i] < buyVal) {
//				buyVal = prices[i];
//				buyDay = i;
//			}
//		}
//		
//		int sellVal = Integer.MIN_VALUE;
//		
//		//Find best day and relevant value to sell
//		for (int j=buyDay + 1; j<prices.length; j++) {
//			if (prices[j] > sellVal) {
//				sellVal = prices[j];
//			}
//		}
//		
//		int profit = sellVal - buyVal;
//		
//		System.out.println(buyDay);
//		
//		System.out.println("Profit = " + sellVal + " - " + buyVal + " = " + profit);
		
		//Leetcode String checker
//		String s = "()[]{}";
//		
//		if (s.contains("()")) {
//			s = s.replace("()", "");
//		} else if (s.contains("[]")) {
//			s = s.replace("[]", "");
//		} else if (s.contains("{}")) {
//			s = s.replace("{}", "");
//		}
//		
//		if (s.isEmpty()) {
//			return true;
//		} else {
//			return false;
//		}
		
//		String s = "hello.my.name.is.john";
//
//        // Split the string using the period (".") as the delimiter
//        String[] splitString = s.split("\\.");
//
//        // Create variables dynamically using a loop (optional)
//        for (int i = 0; i < splitString.length; i++) {
//            String varName = "s" + (i + 1); // Create variable names like s1, s2, s3, etc.
//            System.out.println(varName + " = \"" + splitString[i] + "\""); // Print the variable assignments
//        }
		
		//System.out.println("Sunera" + 100 + 100 + 100);
		
//		String s = "hello my name is john";
//		
//		//Split the string
//		String[] array = s.split("\\s");
//		
//		System.out.println(Arrays.toString(array));
		
		//Geeks4geeks common prefix
		//String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
//		String[] arr = {"hello", "world"};
//		int N = 4;
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		String key = arr[0];
//		int count = 0;
//		boolean flag = false;
//		
//		while (flag == false) {
//			for (String word : arr) {
//				if (word.contains(key)) {
//					count++;
//					//System.out.println(count);
//				}
//				
//				if (count == N) {
//					System.out.println("Keyword is : " + key);
//					flag = true;
//				}
//			}
//			
//			key = key.substring(0, key.length() - 1);
//			//System.out.println(key);
//			count = 0;
//			
//			if (key == "") {
//				System.out.println("No common thing found :(");
//				break;
//			}
//		}
		
		//Uber acronym - Check whether the target is an acronym of the array.
//		String[] array = {"Hire", "Me", "Uber"};
//		String target = "HMU";
//		
//		Acronyms acronym = new Acronyms();
//		System.out.println(acronym.checkAcronyms(array, target));
		
		//Visa repeating numbers question (Doesn't work yet.)
//		int[] array = {1,1,2,2,3,4};
//		
//		HashMap<Integer, Integer> repeatMap = new HashMap<>();
//		int count = 1;
//		
//		//Detect repeating numbers
//		for(int i=0; i<array.length; i++) {
//			if (array[i] == array[i+1]) {
//				count++;
//				repeatMap.put(i, count);
//			} else {
//				count = 1;
//				repeatMap.put(null, null);
//			}
//		}
		
		//Reverse a num array
//		int[] nums = {1, 2, 3, 4, 5};
//		int[] reverseNums = new int[nums.length];
//		
//		//Reverse the array
//		for (int i=nums.length-1; i>=0; i--) {
//			reverseNums[nums.length - i - 1] = nums[i];
//		}
//		
//		Printer printer = new Printer();
//		System.out.println(printer.ArrayPrint(reverseNums));
//		
//		//Using static method.
//		Printer.ArrayPrint(reverseNums);
		
//		String s = "Hello world!";
//		
//		System.out.println(s.charAt(0));
//		
//		System.out.println(s);
		
		//Loop to print all numbers backward without for loop.
//		int num = 64295;
//		
//		while (num > 0) {;
//			System.out.println(num%10);
//			num/=10;
//		}
		
//		int num = 64295;
//		
//		String numStr = Integer.toString(num);
//		
//		//Loop to print all numbers
//		for (int i=0; i<numStr.length(); i++) {
//			System.out.println(Character.getNumericValue(numStr.charAt(i)));
//		}
//		
//		System.out.println("-------------");
//		
//		//Loop to print all number backward
//		for (int j=numStr.length()-1; j>=0; j--) {
//			System.out.println(Character.getNumericValue(numStr.charAt(j)));
//		}
		
		//Switch case statements
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Input number: ");
//		int num = scanner.nextInt();
//		scanner.close();
//		
//		switch (num) {
//		case 1:
//			System.out.println("Hello");
//			break;
//		case 2:
//			System.out.println("Yello");
//			break;
//		default:
//			System.out.println("Nega what?");
//			break;
//		}
		
		//ChatGPT java Question about elections.
		//Input: ["Alice", "Bob", "Alice", "David", "Bob", "Bob", "Alice"]
		
//		String[] names = {"Alice", "Bob", "Alice", "David", "Bob", "Bob", "Alice"};
//		
//		Arrays.sort(names);
//		//Treemaps are ordered hashmaps.
//		TreeMap<String, Integer> votes = new TreeMap<>();
//		int count = 0;
//		
//		//Add the candidates and votes to a treemaps.
//		for (String name : names) {
//			if (votes.containsKey(name)) {
//				count++;
//				votes.put(name, count);
//			} else {
//				count = 1;
//				votes.put(name, count);
//			}
//		}
//		
//		System.out.println(votes);
//		
//		int maxVotes = Integer.MIN_VALUE;
//		String winner = "";
//		
//		//Find the most voted candidate.
//		for (String candidate : votes.keySet()) {
//			if (votes.get(candidate) > maxVotes) {
//				maxVotes = votes.get(candidate);
//				winner = candidate;
//			}
//		}
//		
//		System.out.println("The winner of the election is " + winner + "!!!");
		
		//Sort the array (Bubble Sort)
//		String[] fruits = {"banana", "kiwi", "apple", "tomato", "papaya"};
//		
//		String temp = "";
//		
//		for (int i=0; i<fruits.length; i++) {
//			for (int j=i+1; j<fruits.length; j++) {
//				if (fruits[i].charAt(0)>fruits[j].charAt(0)) {
//					temp = fruits[j];
//					fruits[j] = fruits[i];
//					fruits[i] = temp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(fruits));
		
		//Reversing a String
//		String str = "helloooow";
//		String reversed = "";
//		int count = 0;
//		
//		//Reverse with for loop
//		for (int i=str.length()-1; i>=0; i--) {
//			//Annotate to new String.
//			reversed += str.charAt(i);
//		}
//		
//		System.out.println(reversed);
		
		//Sorting a String
//		String str = "helloooow";
//		
//		char[] charArray = str.toCharArray();
//		
//		Arrays.sort(charArray);
//		
//		for (char character : charArray) {
//			System.out.print(character);
//		}
		
//		List<Integer> intList = new LinkedList<>();
//		intList.add(7);
//		
//		System.out.println(intList);
		
//		System.out.println("Value of a: " + a);
		
		
		//Learning Java Lambdas, cat and printable classes
//		Cat myCat = new Cat();
//		myCat.Print();
		
		/*No need to create below object 
		since functionality is included in lambda*/
//		Cat myCat = new Cat();	
//		
//		printThing(
//			() -> {
//				System.out.println("Meow");
//			}
//		);
		
		//Word count
//		String str = "Hello world this is sunera speaking";
//		
//		//Count spaces and add 1.
//		int iniLen = str.length();
//		int newLen = str.replace(" ", "").length();
//		
//		int count = iniLen - newLen + 1;
//		
//		System.out.println("Number of words: " + count);
//		
//		//Method 2 - Split "str" from every space.
//		System.out.println("Method 2: " + str.trim().split("\\s").length);
		
		//Append 0 to end.
//		int[] numbers = {3, 5, 8, 9, 0, 4, 2};
//		
//		int temp = Integer.MIN_VALUE;
//		
//		for (int i=0; i<numbers.length; i++) {
//			if (numbers[i] == 0) {
//				temp = numbers[numbers.length-1];
//				numbers[numbers.length-1] = numbers[i];
//				numbers[i] = temp;
//			}
//		}
//		
//		System.out.println(Arrays.toString(numbers));
		
		//Random hashmaps practice
		
//		Map<Integer, String> example = new HashMap();
//		example.put(1, "John");
//		example.put(2, "Jack");
//		example.put(3, "Max");
//		example.put(4, "Anne");
//		
//		System.out.println(example);
		
//		for (int num : example.keySet()) {	//Getting values from keys.
//			System.out.println(example.get(num));
//		}
//		
//		for (String name : example.values()) {	//Getting keys from values.
//			System.out.println(name);
//		}
		
		
		//Find missing number from an array of 100 numbers
//		int[] numbers = new int[10];
//		
//		for (int i=0; i<numbers.length; i++) {
//			numbers[i] = i + 1;
//		}
//		
//		System.out.println(Arrays.toString(numbers));
		
//		HashSet<String> hashset = new HashSet();
//		
//		hashset.add("Anni");
//		hashset.add("John");
//		hashset.add("Anni");
//		hashset.add("Max");
//		hashset.add("Ben");
//		
//		System.out.println(hashset);
		
		//Create an obj of static class
//		StaticTest myObj = new StaticTest();
//		myObj.printAge();
//		System.out.println(StaticTest.age);
//		StaticTest.printAge();
		
//		final double maxVal;
//		
//		maxVal = 69;
//
//		System.out.println(maxVal);
		
//		StaticTest myObj = new StaticTest();
//		System.out.println(myObj.add(1, 2));
//		System.out.println(myObj.add("Carl", "Marx"));
		
//		String s = "Anni";
//		
//		String modified = s.concat(" Boi");
//		
//		System.out.println(s);
//		System.out.println(modified);
		
		/*When a new string literal is created, it is 
		 * stored in the string pool. So when another 
		 * object(s2) is created with the same string
		 * literal, it is assigned to the same memory
		 * location*/
//		String s1="Welcome";  
//		String s2="Welcome";  
//		String s3="Welcome"; 
//		String s4 = new String("Welcome");
//		
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));
//		System.out.println(System.identityHashCode(s3));
//		System.out.println(System.identityHashCode(s4));
		
//		StaticTest obj = new StaticTest();
//		System.out.println(obj.add(2, 5));
//		System.out.println(obj);
		
		//Bubble Sort (This version is not accurate, refer line 350)
//		int[] array = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
//		
//		int temp = 0;
//		
//		for (int i=0; i<array.length; i++) {
//			for (int j=i+1; j<array.length; j++) {
//				if (array[i]>array[j]) {
//					temp = array[j];
//					array[j] = array[i];
//					array[i] = temp;
//					System.out.println(Arrays.toString(array));
//				}
//			}
//		}
//		
//		Arrays.sort(array);
		
		//Selection sort algorithm
		//Search through an array to find the minimum variable. At the end, swap the variables. 
//		int[] array = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
//		
//		//Initial for loop to iterate through each element.
//		for (int i=0; i<array.length-1; i++) {
//			
//			//Initialize the minimum index value to itself(Compared number)
//			int minIndex = i;
//			
//			//For loop to compare each element after (i) to find the minimum index.
//			for (int j=i+1; j<array.length; j++) {
//				if (array[j] < array[minIndex]) {
//					minIndex = j;
//				}
//			}
//			
//			//Variable swapping to replace compared element to minimum number.
//			int temp = array[i];
//			array[i] = array[minIndex];
//			array[minIndex] = temp;			
//		}
//		
//		//For each loop to print sorted array.
//		for (int element : array) {
//			System.out.print(element + " ");
//		}
		
		//Exception Handling
		
//		try {
//			int myInt  = Integer.parseInt("122");
//			System.out.println(myInt);
//		} catch (Exception e) {
//			System.out.println("You didn't enter a number!");
//		} finally {
//			System.out.println("The finally block was executed.");
//		}
		
//		Scanner myScn = new Scanner(System.in);
//		System.out.print("Enter the value: ");
//	
//		try {
//		int myInt = myScn.nextInt();
//		System.out.println("Number : " + myInt);
//		} catch (InputMismatchException ime) {
//			System.out.println("Enter number retard.");
//		}
		
		//RealSingleton myObj = new RealSingleton();
		//RealSingleton.getInstance().printHello();		//Works!!!
		
		//Create 2 instances of the singleton class.
//		RealSingleton obj1 = RealSingleton.getInstance();
//		RealSingleton obj2 = RealSingleton.getInstance();
//		
//		obj1.setCount(69);	//Set only obj1 to 69
//		
//		System.out.println("Object 1: " + obj1.getCount());	//Output: 69
//		System.out.println("Object 2: " + obj2.getCount());	//Output: 69

		
		//Application to count digits
//		int number = 8649;
//		
//		int count = 0;
//		
//		if (number != 0) {
//			while (number != 0) {
//				number = number/10;
//				//System.out.println(number);
//				count++;
//			}
//			
//			System.out.println("Number of digits: " + count);
//		} else {
//			System.out.println("Number of digits: 1");
//		}
		
		//Reversing a string
//		String str = "hello world";
//		
//		for (int i=str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Value: ");
//		
//		String a = "hello";
//		String b = "hello";
//		scn.close();
//		
//		System.out.println(a == b);
		
		//Check equality of 2 arrays.
//		int[] array1 = {1, 2, 3, 4};
//		int[] array2 = {1, 2, 3, 4};
//		
//		int count = 0;
//	
//		for (int i=0; i<array1.length; i++) {
//			if (array1[i] == array2[i]) {
//				count++;
//			}
//		}
//		
//		if (array1.length == array2.length && count == array1.length) {
//			System.out.println("Equal arrays!");
//		} else {
//			System.out.println("Unequal arrays!");
//		}
//		
//		String s1 = "Java";
//		 String s2 = "Ja";
//		 String s3 = "va";
//		 String s4 = s2 + s3;
//		 System.out.println(s1 == s4);
		
		//Palindrome number
		
//		String word = "hellolleh";
//		String reversed = "";
//		
//		
//		//Build the reversed string
//		for (int i=word.length()-1; i>=0; i--) {
//			char letter = word.charAt(i);
//			reversed = reversed.concat(String.valueOf(letter));
//		}
//		
//		//System.out.println(reversed);
//		
//		if (reversed.equals(word)) {
//			System.out.println("Equal word " + reversed);
//		} else {
//			System.out.println("Unequal word" + reversed);
//		}
		
		//Find the missing number out of 100 numbers.
		
//		int count = 0;
//		
//		for (int i=1; i<=10; i++) {
//			count = count + i;
//		}
//		
//		//System.out.println(count);
//		
//		//Initialize an array with 10 numbers.
//		int[] numbers = new int[9];
//		
//		for (int j=1; j<=9; j++) {
//			
//			if (j != 4) {
//				numbers[j-1] = j;
//			}
//		}
//		
//		System.out.println(Arrays.toString(numbers));
		
		/*
		 * AAAAAAAAA	9
		 * AAAAAA		6
		 * AAA			3
		 * AAAAAA		6
		 * AAAAAAAAA	9
		 * */
		
//		int count = 9;
//		
//		
//		while (count >= 3) {
//			//for loop to duplicate "A"s
//			for (int i=1; i<=count; i++) {
//				System.out.print("A");
//			}
//			
//			System.out.println("");
//			count-=3;	//Modify count each iteration
//		}
//		
//		count = 6;		//Printing sequence changed to increment "A"s
//		
//		while (count <= 9) {
//			for (int j=1; j<=count; j++) {
//				System.out.print("A");
//			}
//			
//			System.out.println("");
//			count+=3;
//		}
		
		
		/*
		 * AAAAAAAAA	9
		 * AAAAAA		6
		 * AAA			3
		 * AAAAAA		6
		 * AAAAAAAAA	9
		 * */
		
//		for (int j=9; j>=3; j-=3) {
//			for (int i=1; i<=j; i++) {
//				System.out.print("A");
//			}
//			System.out.println();
//		}
//		
//		for (int a=6; a<=9; a+=3) {
//			for (int b=1; b<=a; b++) {
//				System.out.print("A");
//			}
//			System.out.println();
//		}
		
		/*	Print star pattern triangle.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * */
		
//		for (int j=1; j<=5; j++) {
//			for (int i=1; i<=j; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Print mirrored triangle
		
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * */
		
//		int rows = 5;
//		
//		for (int j=1; j<=rows; j++) {
//			
//			//Spaces printer
//			for (int i=1; i<=rows-j; i++) {
//				System.out.print(" ");
//			}
//			
//			//Star Printer
//			for (int a=1; a<=j; a++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		
//		1
//		2  3
//		4  5  6
//		7  8  9  10
//		11 12 13 14 15
		
//		int rows = 5;
//		
//		int count = 1;
//		
//		for (int i=1; i<=rows; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print(count + " ");
//				count++;
//			}
//			System.out.println();
//		}
//		
		
//		  *
//		 * *
//		* * *
		
		
//		int rows = 5;
//		
//		for (int i=1; i<=rows; i++) {
//			
//			//Initial spaces printer
//			for (int j=1; j<=rows-i;j++) {
//				System.out.print(" ");
//			}
//			
//			//Star printer
//			for (int a=1; a<=i; a++) {
//				System.out.print("*" + " ");
//			}
//			
//			System.out.println();
//			
//		}
		
		
		//2 hour recap video telusko
		
//		System.out.println(2+3*4 + " " + 2 + 3 + 4);
		
//		String str1 = "Hello";
//		String str2 = "Hell";
//		
//		String str3 = str2.concat("o");
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str3.hashCode());
//		
//		int[] array = new int[5];
		
//		String s = "Cunera";
//		s = s + "Mune";
//		
//		System.out.println(s);
		
//		List<Integer> numSet = new ArrayList<>();
//		numSet.add(1);
//		numSet.add(3);
//		numSet.add(1);
//		numSet.add(4);
//		numSet.add(4);	//Duplicate element
//
//		System.out.println(numSet);
		//Output: [1, 2, 3, 4]
		
		System.out.println("Hello!");
		

		


		
		
		
		
		
		
		
	}	//END MAIN METHOD
	
	/* "thing" is any object that
	implements "Printable" interface. */
//	static void printThing(Printable thing) {
//		thing.Print();
//	}
//	
//	static {
//		System.out.println("I am the static block!");
//	}

}
