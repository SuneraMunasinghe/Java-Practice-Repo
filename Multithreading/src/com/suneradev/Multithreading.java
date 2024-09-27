package com.suneradev;

//Step 1: Implement Runnable Interface
public class Multithreading implements Runnable {
	
	//Step 2: Override the run method.
	@Override
	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.println(i);
			
			//Optional sleep 1 sec each iteration
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				
			}
		}
	}
}
