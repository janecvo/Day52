public class BankAccount {
        private double bankAccountBalance;
        private String accountHolderName;

        //Bank account constructor for parameters
        public BankAccount(String customerName, double customerBalance){
            this.bankAccountBalance = customerBalance;
            this.accountHolderName = customerName;
    }

    public double transfer(BankAccount account, double amount){
        return account.deposit(this.withdrawal(amount));
    }

    public double deposit(double customerDeposit){
        bankAccountBalance += customerDeposit;
        return customerDeposit;
    }

    public double withdrawal(double customerWithdrawal){
        bankAccountBalance -= customerWithdrawal;
        return customerWithdrawal;
    }
    
    public void accountInfo() {
        System.out.println("Account Name: " + accountHolderName + '\n' + "Account Balance: $" + bankAccountBalance );
    }
}

        //Bank Account constructor for input
        // public BankAccount(String customerName1, double customerBalance1){
        //     System.out.println("What is the account holder's name?");
        //     String customerName = scanner.nextLine();
        //     this.accountHolderName = customerName;
        //     System.out.println("What is your starting balance?");
        //     double customerBalance = Double.valueOf(scanner.nextLine());
        //     this.bankAccountBalance = customerBalance;
        // }


// public static Scanner scanner = new Scanner(System.in);

        // public void depositInput() {
        //     System.out.println("How much would you like to deposit?");
        //     double customerDeposit = Double.valueOf(scanner.nextLine());
        //     bankAccountBalance = customerDeposit + bankAccountBalance;
        //     System.out.println("Your new balance is " + bankAccountBalance);
        // }

        // public void withdrawalInput() {
        //     System.out.println("How much would you like to withdraw?");
        //     double customerWithdrawal = Double.valueOf(scanner.nextLine());
        //     bankAccountBalance = bankAccountBalance - customerWithdrawal;
        //     System.out.println("Your new balance is " +  bankAccountBalance);
        // }



