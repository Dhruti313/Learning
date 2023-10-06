package OOPS;


    // BankAccount superclass
    class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit: $" + amount);
            System.out.println("New balance: $" + balance);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal: $" + amount);
                System.out.println("New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds");
            }
        }
    }

    // CheckingAccount subclass
    class CheckingAccount extends BankAccount {
        private double monthlyFee;

        public CheckingAccount(String accountNumber, double balance, double monthlyFee) {
            super(accountNumber, balance);
            this.monthlyFee = monthlyFee;
        }

        public void deductMonthlyFee() {
            withdraw(monthlyFee);
            System.out.println("Monthly fee deducted");
        }
    }

    // SavingsAccount subclass
    class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        public void applyInterest() {
            double interestAmount = getBalance() * interestRate / 100;
            deposit(interestAmount);
            System.out.println("Interest applied: $" + interestAmount);
        }
    }

    // Main program
    public class BankAccountExample {
        public static void main(String[] args) {
            CheckingAccount checking = new CheckingAccount("C123456", 1000.0, 5.0);
            checking.deposit(500.0);
            checking.withdraw(200.0);
            checking.deductMonthlyFee();

            SavingsAccount savings = new SavingsAccount("S987654", 2000.0, 2.5);
            savings.deposit(1000.0);
            savings.withdraw(500.0);
            savings.applyInterest();
        }
    }


