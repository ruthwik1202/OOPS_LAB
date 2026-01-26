class Test {
	private int x = 5;
	private void show() {
	 System.out.println("x = " + x);
}

public void accessPrivate() {
	show();
}
}
public class Private {
	public static void main(String[] args) {
	Test obj = new Test();
	obj.accessPrivate();
}
}