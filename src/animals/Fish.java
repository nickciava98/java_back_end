package animals;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish() {
		super(0);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println("Just keep swimming.");
	}
	
	public void eat() {
		System.out.println("Fishes eat pond scum.");
	}
	
	@Override
	public void walk() {
		super.walk();
		
		System.out.println("Fish, of course, can't walk; they swim.");
	}
}
