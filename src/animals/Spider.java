package animals;

public class Spider extends Animal {
	private String name;
	
	public Spider() {
		super(8);
	}
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Spiders like to eat insects.");
	}
	
	public void play() {
		System.out.println(name + " is playing.");
	}
	
	@Override
	public void walk() {
		super.walk();
		
		System.out.println(name + " is walking.");
	}	
}
