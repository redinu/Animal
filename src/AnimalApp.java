
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());

		Dog d = new Dog();
		print(d.eat());
		print(d.sleep());
		print(d.barks());
		

		Fish f = new Fish();
		print(f.eat());
		print(f.sleep());
		print(f.swim());
		
		Monkey m = new Monkey();
		print(m.eat());
		print(m.sleep());
		print(m.climb());

	}
	private static void print(String s){
		System.out.println(s);
	}
}

 

