import java.util.Scanner;

class UserBankAccount {
    private double balance;

    public UserBankAccount(double balance) {
        this.balance = balance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private UserBankAccount account;

    public ATM(UserBankAccount bankAccount) {
        account = bankAccount;
    }

    public void displayMenu() {
        
        System.out.println("ATM Menu:");
        System.out.println("Press A for Check Balance");
        System.out.println("Press B for Deposit");
        System.out.println("Press C for Withdraw");
        System.out.println("Press D for Exit");
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Select an option: ");
            String input = scanner.nextLine();

            if (!input.isEmpty()) {
                char choice = input.toUpperCase().charAt(0);

                switch (choice) {
                    case 'A':
                        System.out.println("----------Your balance: Rs." + account.checkBalance() + "----------");
                        break;
                    case 'B':
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful."); 
                        System.out.println("----------Your balance: Rs. " + account.checkBalance() + "----------");
                        break;
                    case 'C':
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        if (account.withdraw(withdrawAmount)) {
                            System.out.println("Withdrawal successful."); 
                            System.out.println("----------Your balance: Rs. " + account.checkBalance() + "----------");
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;
                    case 'D':
                        System.out.println("Thank you for using the ATM. Have a nice day!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please select a valid option.");
                }
            }
        }
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        UserBankAccount userAccount = new UserBankAccount(2000); // Main Balance
        ATM atm = new ATM(userAccount);
        atm.show();
    }
}
