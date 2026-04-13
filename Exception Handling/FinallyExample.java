class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 5 / 1;
            System.out.println("Result: " + a);
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("This always executes");
        }
    }
}