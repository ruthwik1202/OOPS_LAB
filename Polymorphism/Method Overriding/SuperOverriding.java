class Animal {
	void sound() {
	System.out.println("Animal Makes Sounds");
	}
	}
class Dog extends Animal {
	void sound() {
	super.sound();
	System.out.println("Dog Barks");
	}
	}
	public class SuperOverriding {
	public static void main(String[] args) {
	Animal d = new Dog();
	d.sound();
	}
	}