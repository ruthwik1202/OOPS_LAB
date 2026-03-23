class Calculator {
		int add(int a, int b) {
			return a+b;
			}
		int add(int a, int b, int c) {
			return a+b+c;
			}
		int add(int a, int b, int c, int d) {
			return a+b+c+d;
			}
	public static void main(String [] args) {
	Calculator cal = new Calculator();
	System.out.println("Sum of 2 Numbers = " + cal.add(10,20));
	System.out.println("Sum of 3 Numbers = " + cal.add(10,20,30));
	System.out.println("Sum of 4 Numbers = " + cal.add(10,20,30,40));
	}
}