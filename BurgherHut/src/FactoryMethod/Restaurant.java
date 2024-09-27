package FactoryMethod;

public class Restaurant {
	public Burgher orderBurgher (String request) {
		SimpleBurgherFactory factory = new SimpleBurgherFactory();
		Burgher burgher = factory.createBurgher(request);
		
		burgher.prepare();
		return burgher;
	}
}
