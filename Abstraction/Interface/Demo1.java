interface TestInterface {
	default void show () {
	System.out.println("Default method in interface");
}
}
class Demo1 implements TestInterface {
	public static void main(String[] args) {
	Demo1 d = new Demo1();
	d.show();
}
} 