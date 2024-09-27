package com.suneralinkedin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Count characters in a string
		
		
		String s = "something rodger maybe";
		//With spaces
//		System.out.println(s.length());
//		
//		//Without white spaces.
//		s = s.replaceAll("\\s", "");
//		System.out.println(s.length());
		
		//Count repeated characters and print.
		String[] strArray = s.split(" ");
		//int[] strArray = {1, 2, 3, 4, 5, 5, 4, 6};
		
		/*
		 * for (int a=0; a<strArray.length; a++) { System.out.println(strArray[a]); }
		 */
		
		for (int i=0; i<strArray.length; i++) {
			for (int j=i+1; j<strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					System.out.println("Repeated letters: " + strArray[i]);
				}
			}
		}
		
		//classsa and classb, same methods, classb super of a.
		
		
		
	}	//END MAIN METHOD
}
