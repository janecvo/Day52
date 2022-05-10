public class App {
    public static void main(String[] args) {
       //#1 - bank account
        // BankAccount account1 = new BankAccount("Jane", 500);

        // account1.deposit(100);
        // account1.accountInfo();

        //#2 - bank transfer
        BankAccount account2 = new BankAccount("Bob", 5000);
        BankAccount account3 = new BankAccount("Dave", 300);

        account2.transfer(account3, 100);
        // account3.transfer(account2, 100);
        account2.accountInfo();
        account3.accountInfo();
    
        Product product1 =  new Product (3.56, 10, "socks"); 
        product1.totalCost();
        product1.printProduct();
        }
}
