package BankAccount;


public class SavingsAccount extends BankAccount{
    protected double overdraftLimit ;
    public SavingsAccount(String firstName, String lastName, int accountNumber, double balance , double overdraftLimit) {
        super(firstName, lastName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit ;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
