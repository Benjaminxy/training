public class BankAccount {

  public String firstName;
  public String lastName;
  public final int accountNumber;
  public double balance;


  public BankAccount(String firstName, String lastName, int accountNumber,
                     double balance)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }




  public void draw(double amount){

    if (amount < balance) {

      balance = balance - amount;
    } else {
      System.out.println("there is no enough money here");
    }

  }


  public void charge(double amount) {

    balance = balance + amount;
  }
}