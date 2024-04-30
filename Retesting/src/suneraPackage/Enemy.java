package suneraPackage;

public class Enemy {
	
	private int health;
	
	public void Talk() {
		System.out.println("I am an enemy. You better run!");
	}
	
	public void getHealth() {
		System.out.println("Your health is " + health);
	}
	
	public void setHealth(int x) {
		health = x;
	}

}
