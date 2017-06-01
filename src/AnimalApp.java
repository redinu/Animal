
public class AnimalApp {

	public static void main(String[] args) {

		
		Dog d = new Dog();
		print(d.eat());
		print(d.sleep());
		print(d.barks());
		
		System.out.println();
		Fish f = new Fish();
		print(f.eat());
		print(f.sleep());
		print(f.swim());
		
		System.out.println();
		Monkey m = new Monkey();
		print(m.eat());
		print(m.sleep());
		print(m.climb());
		
		System.out.println();
		Unicorn u = new Unicorn();
		print(u.eat());
		print(u.sleep());
		
		System.out.println();
		SaberToothTiger t = new SaberToothTiger();
		print(t.eat());
		print(t.sleep());

	}
	private static void print(String s){
		System.out.println(s);
	}
}

 

