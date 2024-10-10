class Bank {
    private int totalBalance = 100;

    synchronized void withdraw(String name, int amount) {
        if (totalBalance >= amount) {
            System.out.println(name + " withdrawn " + amount);
            totalBalance -= amount;
            System.out.println("Balance after withdrawal: " + totalBalance);
        } else {
            System.out.println(name + " cannot withdraw " + amount);
            System.out.println("Current balance: " + totalBalance);
        }
    }

    synchronized void deposit(String name, int amount) {
        System.out.println(name + " deposited " + amount);
        totalBalance += amount;
        System.out.println("Balance after deposit: " + totalBalance);
    }
}

public class BankTransactionDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create threads for transactions
        Thread arnabThread = new Thread(() -> bank.withdraw("Arnab", 20));
        Thread monodwipThread = new Thread(() -> bank.withdraw("Monodwip", 40));
        Thread muktaThread = new Thread(() -> bank.deposit("Mukta", 35));
        Thread rinkelThread = new Thread(() -> bank.withdraw("Rinkel", 80));
        Thread shubhamThread = new Thread(() -> bank.withdraw("Shubham", 40));

        // Start the threads
        arnabThread.start();
        monodwipThread.start();
        muktaThread.start();
        rinkelThread.start();
        shubhamThread.start();
    }
}
