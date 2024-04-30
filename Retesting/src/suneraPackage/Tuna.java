package suneraPackage;

public class Tuna {
	
	String girlName;
	
	public Tuna(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() {
		return girlName;
	}
	
	public void Talk() {
		System.out.printf("Her name is %s\n", getName());
	}
	
}
