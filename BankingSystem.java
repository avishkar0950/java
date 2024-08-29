interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

class SavingAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    public double viewBalance() {
        return balance;
    }

    public void applyInterest() {
        balance += calculateInterest();
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded or invalid withdraw amount.");
        }
    }

    public double calculateInterest() {
        // Current account doesn't have interest calculations
        return 0;
    }


    public double viewBalance() {
        return balance;
    }

    public void setOverdraftLimit(double limit) {
        this.overdraftLimit = limit;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
   
        SavingAccount savingAccount = new SavingAccount(1000, 5);
        savingAccount.deposit(500);
        savingAccount.withdraw(200);
        savingAccount.applyInterest();
        System.out.println("Saving Account Balance: $" + savingAccount.viewBalance());

        CurrentAccount currentAccount = new CurrentAccount(500, 100);
        currentAccount.deposit(200);
        currentAccount.withdraw(700);
        System.out.println("Current Account Balance: $" + currentAccount.viewBalance());
    }
}
