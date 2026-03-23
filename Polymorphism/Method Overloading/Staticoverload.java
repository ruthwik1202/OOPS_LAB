class Staticoverload {
	static void display() {
	System.out.println("Display methods with no parameters");
	}
	static void display(int a) {
	System.out.println("Display method with int: " + a);
	}
	public static void main(String[] args) {
	display();
	display(111);
	}
	}