package com.suneralinkedin;

public class ThreadExample extends Thread {
	
	@Override
	public void run() {
		int i=1;
		while (i<=100) {
			System.out.println(i + " " + this.getName());
			//getName method to get string name.
			i++;
		}
	}
	
}
