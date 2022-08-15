package classyCat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankAccount extends Account {
    private double balance;
    private boolean overdrawn;
    private int accountDurationMonths;

    public BankAccount(String firstName, String lastName) {
        this(firstName, lastName, 0.00);
    }
    public BankAccount(String firstName, String lastName, double startingBalance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = startingBalance;
        this.accountDurationMonths = 0;
        this.creationDate = LocalDateTime.now();
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdrawl(double amount) {
        boolean status = isOverdrawn(amount);
        return (this.balance -= amount);
    }

    public double getBalance() {
        return this.balance;
    }

    public double monthlyInterest(){
        return ((this.balance*0.1) + this.balance);
    }



    public boolean isOverdrawn(double amount) {
        if ((this.balance - amount) < 0){
            this.overdrawn = true;
            return true;
        }
        return false;
    }

    public boolean getOverdrawn(){
        return this.overdrawn;
    }

    @Override
    public String toString(){
        return String.format(
                """
                        Account Holder: %s %s
                        Account Balance: %f
                        """, this.firstName, this.lastName, this.balance);
    }

}

/*
@Test
public void bankAccountExist(){
    //instantiate a new bankAccount()
    //assert myObject is a bankAccount
    //assert that the balance is zero
}
 */