interface Shape {
	void draw();
}

class Circle implements Shape {
	public void draw() {
	System.out.println("Drawing a Circle");
}
}
class Rectangle implements Shape {
	public void draw() {
	System.out.println("Drawing a Rectangle");
}
}
class Test {
public static void main(String[] args) {
Circle c = new Circle();
Rectangle r = new Rectangle();
c.draw();
r.draw();
}
}
	 