/*2. Write a Java Program to demonstrate the working of a banking-system  
Instance variables: name, account_no, amount  
Instance methods:  deposit(), withdraw(), checkBalance(), insert() and display().
Here we can deposit and withdraw amount from our account using deposit() and withdraw() methods respectively.
The insert() method is to initialize state and display() method is to display state values.*/

public class P2_Bank {
    private String name;
    private int account_no, amount;

    void deposit(int amt) {
        amount += amt;
    }

    void withdraw(int amt) {
        if (amount <= 0) {
            System.out.println("Insufficient Funds, Cannot Withdraw: " + amt);
        }
        amount -= amt;
    }

    void checkBalance() {
        System.out.println("Current Balance: " + amount);
    }

    void insert(String name, int account_no, int amount) {
        this.name = name;
        this.account_no = account_no;
        this.amount = amount;
    }

    void display() {
        System.out.println("Account Holder's name: " + name);
        System.out.println("Account Number: " + account_no);
        System.out.println("Total Balance: " + amount);
    }

    public static void main(String[] args) {
        P2_Bank b = new P2_Bank();
        b.insert("Joy khulbe", 2018401, 9099000 );
        b.checkBalance();
        b.deposit(9000);
        b.checkBalance();
        b.withdraw(19005);
        b.display();
    }
}