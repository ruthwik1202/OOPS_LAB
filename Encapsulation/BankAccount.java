class BankAccount {
    private int balance;

    public void setBalance(int b) {
        balance = b;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount();

        a.setBalance(5000);

        System.out.println("Account Balance = " + a.getBalance());
    }
}