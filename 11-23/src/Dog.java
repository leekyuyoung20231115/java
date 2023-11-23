
public class Dog extends Animal implements Fly,Walk{
	public Dog(String name, int age) {
		super(name, age);
	}
	@Override
	public void walk() {
	}

	@Override
	public void fly() {
	}
	
}
