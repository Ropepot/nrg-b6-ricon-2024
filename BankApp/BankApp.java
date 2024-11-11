package BankApp;

import java.util.HashMap;
import java.util.Scanner;

class User {
    private int id;
    private int pin;
    private String name;
    private double balance;

    public User(int id, int pin, String name, double balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }

    public void transfer(User recipient, double amount) {
        if (this.withdraw(amount)) {
            recipient.deposit(amount);
            System.out.println("Transferred $" + amount + " to " + recipient.getName());
        } else {
            System.out.println("Transfer failed.");
        }
    }
}

class BankApp {
    private HashMap<Integer, User> users;
    private User currentUser;

    public BankApp() {
        users = new HashMap<>();
        users.put(412435, new User(412435, 7452, "Vic Sotto", 32000));
        users.put(264863, new User(264863, 1349, "Wally Bayola", 1000));
    }

    public boolean login(int id, int pin) {
        User user = users.get(id);
        if (user != null && user.getPin() == pin) {
            currentUser = user;
            System.out.println("Welcome, " + user.getName() + "!");
            return true;
        } else {
            System.out.println("Invalid user ID or PIN.");
            return false;
        }
    }

    public void logout() {
        currentUser = null;
        System.out.println("You have been logged out.");
    }

    public void checkBalance() {
        if (currentUser != null) {
            System.out.println("Current balance: $" + currentUser.getBalance());
        }
    }

    public void deposit(double amount) {
        if (currentUser != null) {
            currentUser.deposit(amount);
        }
    }

    public void transfer(int recipientId, double amount) {
        if (currentUser != null) {
            User recipient = users.get(recipientId);
            if (recipient != null && recipient != currentUser) {
                currentUser.transfer(recipient, amount);
            } else {
                System.out.println("Invalid recipient ID or you cannot transfer to yourself.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankApp app = new BankApp();

        while (true) {
            System.out.println("\n=== Banking App ===");
            System.out.println("1. Login");
            System.out.println("2. Check Balance");
            System.out.println("3. Cash-in");
            System.out.println("4. Money Transfer");
            System.out.println("5. Logout");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter PIN: ");
                    int pin = scanner.nextInt();
                    app.login(id, pin);
                    break;
                case 2:
                    app.checkBalance();
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    app.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter recipient User ID: ");
                    int recipientId = scanner.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    app.transfer(recipientId, transferAmount);
                    break;
                case 5:
                    app.logout();
                    break;
                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
