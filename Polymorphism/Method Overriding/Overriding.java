class Animal {
	void sound() {
	System.out.println("Animal Makes Sounds");
	}
	}
class Dog extends Animal {
	void sound() {
	System.out.println("Dog Barks");
	}
	}
class Cat extends Animal {
	void sound() {
	System.out.println("Cat Meow");
	}
	}
	public class Overriding {
	public static void main(String[] args) {
	Animal d = new Dog();
	Animal c = new Cat();
	d.sound();
	c.sound();
	}
	}