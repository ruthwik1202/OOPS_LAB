interface A {
	void show();
}
interface B {
	void display();
}
class Demo implements A,B {
	public void show() {
	System.out.println("Method from Interface A");
}
	public void display() {
	System.out.println("Method from Interface B");
}
public static void main(String[] args) {
Demo d = new Demo();
d.show();
d.display();
}
}
	