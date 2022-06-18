package animals;

public class Cat extends Animal implements Pet {
	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	public Cat() {
		this("Fluffy");		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println(name + " likes to play with string.");
	}
	
	public void eat() {
		System.out.println("Cats like to eat spiders and fish.");
	}
	
	public void walk() {
		System.out.println(name + " is walking.");
	}
}
