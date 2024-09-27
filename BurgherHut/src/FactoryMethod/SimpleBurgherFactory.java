package FactoryMethod;

public class SimpleBurgherFactory {
	public Burgher createBurgher(String request) {
		
		Burgher burgher = null;
		
		if ("BEEF".equals(request)) {
			burgher = new BeefBurgher();
		} else if ("VEGGIE".equals(request)) {
			burgher = new VeggieBurgher();
		}
		
		return burgher;
	}
}
