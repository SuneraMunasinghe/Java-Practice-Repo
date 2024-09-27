package com.sunerajavaprograms;

public abstract class Example {
	
	public int variable;
	
	//Constructor
	public Example(int variable) {
		this.variable = variable;
	}
	
	//Setter
	public void setVariable(int variable) {
		this.variable = variable;
	}
	
	//Getter
	public int getVariable() {
		return variable;
	}
	
	public abstract void printHello();
	
	public abstract void printFilth();
}
