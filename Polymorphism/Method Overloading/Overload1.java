public class Overload1 {
	public static void main(String[] args) {
	System.out.println("Original main method");
	main(10);
	main("Java");
	}
	public static void main(int a) {
	System.out.println("Overloaded main with int: " + a);
	}
	public static void main(String str) {
	System.out.println("Overloaded main with str: " + str);
	}
	}