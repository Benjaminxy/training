public class BankAccount {

  private String firstName;
  private String lastName;
  private final int accountNumber;
  private double balance;


  public BankAccount(String firstName, String lastName, int accountNumber,
                     double balance)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }


  public int getAccountNumber() {
    return accountNumber;
  }

  public void withdraw(double amount) {

    if (amount <= balance) {

      balance = balance - amount;
    } else {
      System.out.println("There is not enough money here");
    }

  }


  public void deposit(double amount) {

    balance = balance + amount;
  }


  public String getFirstName() {
    return firstName;
  }


  public String getLastName() {
    return lastName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public void setBalance(double balance) {
    this.balance = balance;
  }


  public double getBalance() {
    return balance;
  }

}