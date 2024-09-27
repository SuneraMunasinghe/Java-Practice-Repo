package FactoryMethod;

public class Driver {

	public static void main(String[] args) {
		
		//Code to make a request
		Restaurant order = new Restaurant();
		order.orderBurgher("BEEF");
	}

}
