import BankAccount.BankAccount;

public class Main
{

    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount("Benjamin" , "Kahkeshan" ,11111 ,2000);
       bank1.deposit(50.4);
        System.out.println(bank1.getBalance());
        bank1.withdraw(280);
        System.out.println(bank1.getBalance());
        BankAccount bankAccount2 = new BankAccount("Ali" , "hamidi" ,122111 ,200);
        bank1.deposit(50.4);

        System.out.println(bank1.getFirstName());
        System.out.println (bankAccount2.getFirstName());

    }
}
