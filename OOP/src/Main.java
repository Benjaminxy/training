public class Main
{

    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount("Benjamin" , "Kahkeshan" ,11111 ,2000);
       bank1.charge(50.4);
        System.out.println(bank1.balance);
        bank1.draw(280);
        System.out.println(bank1.balance);
        BankAccount bankAccount2 = new BankAccount("Ali" , "hamidi" ,122111 ,200);
        bank1.charge(50.4);

        System.out.println(bank1.firstName);
        System.out.println (bankAccount2.firstName);

    }
}
