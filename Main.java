public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount("Isaac Smith", "20434", 500.0);

        account1.printAccountDetails();



        account1.deposit(200.0);

        account1.printAccountDetails();



        account1.withdraw(100.0);

        account1.printAccountDetails();



        account1.withdraw(700.0); 



        for (int i = 1; i <= 3; i++) {

            account1.deposit(50 * i); 

            account1.withdraw(20 * i); 

            account1.printAccountDetails();

        }

        System.out.println("Final Balance: $" + account1.getBalance());

    }
   
   
}
