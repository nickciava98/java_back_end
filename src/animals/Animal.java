package animals;

public abstract class Animal {
	protected int legs;
	
	protected Animal (int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("Walking.");
	}
	
	public void play() {
		System.out.println("Playing.");
	}
	
	public abstract void eat();
}
