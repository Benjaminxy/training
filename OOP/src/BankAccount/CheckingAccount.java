package BankAccount;

public class CheckingAccount extends BankAccount{
    protected double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public CheckingAccount(String firstName, String lastName, int accountNumber, double balance , double interestRate) {
        super(firstName, lastName, accountNumber, balance);

        this.interestRate = interestRate;

    }
}
