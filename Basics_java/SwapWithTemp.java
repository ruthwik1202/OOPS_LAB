class SwapWithTemp {
    public static void main(String[] args) {
        int a = 6, b = 100, temp;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
