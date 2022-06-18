package animals;

public class PetMain {
	public static void main(String[] args) {
		Animal a;
		Spider s = new Spider();
		Pet fish = new Fish();
		Pet cat = new Cat();
		Pet cat2 = new Cat("Johnny");
		
		s.setName("Spider01");
		s.eat();
		s.walk();
		
		System.out.println();
		
		a = new Spider();
		a.eat();
		a.walk();
		
		System.out.println();
		
		((Animal) fish).eat();
		((Animal) fish).walk();
		
		System.out.println();
		
		((Animal) cat).eat();
		cat.play();
		((Animal) cat).walk();
		
		System.out.println();
		
		((Animal) cat2).eat();
		cat2.play();
		((Animal) cat2).walk();
		
		System.out.println();
		
		playWithAnimal(s);
		playWithAnimal((Animal) fish);
		playWithAnimal((Animal) cat);
		
		System.out.println();
	}
	
	public static void playWithAnimal(Animal a) {
		if (!(a instanceof Pet))
			System.err.println("Danger! Wild Animal.");
		
		else 
			((Pet) a).play();
	}
}
