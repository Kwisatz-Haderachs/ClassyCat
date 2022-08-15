package classyCat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankAccount extends Account {
    private double balance;
    private boolean overdrawn;
    private int accountDurationMonths;
    private String firstName;
    private String lastName;

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
        double interest = this.balance*0.1;
        balance += interest;
        return balance;
    }



    public boolean isOverdrawn(double amount) {
        if ((this.balance - amount) < 0){
            this.overdrawn = true;
            return true;
        }
        return false;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public int getAccountDurationMonths(){
        return this.accountDurationMonths;
    }
    public void setAccountDurationMonths(int months){
        this.accountDurationMonths = months;
    }

    public void setLastName(String name){
        this.lastName = name;
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



