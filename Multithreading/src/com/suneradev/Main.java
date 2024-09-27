package com.suneradev;

public class Main {

	public static void main(String[] args) {
		
		/*
		Step 3: Create a Thread object since Runnable 
		interface doesn't provide the mechanism to run 
		and manage the task like the Thread class. 
		*/
		
		for (int i=1; i<=3; i++) {
			Multithreading myObj = new Multithreading();
			Thread myThread = new Thread(myObj);
			myThread.start();
		}
		
	}

}
