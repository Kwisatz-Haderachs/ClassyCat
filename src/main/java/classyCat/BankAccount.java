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
        balance += amount;
    }

    public double withdrawl(double amount) {
        isOverdrawn(amount);
        return (balance -= amount);
    }

    public double getBalance() {
        return balance;
    }

    public double monthlyInterest(){
        double interest = balance*0.1;
        balance += interest;
        return balance;
    }



    public boolean isOverdrawn(double amount) {
        if ((balance - amount) < 0){
            overdrawn = true;
            return true;
        }
        return false;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public int getAccountDurationMonths(){
        return accountDurationMonths;
    }
    public void setAccountDurationMonths(int months){
        this.accountDurationMonths = months;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public boolean getOverdrawn(){
        return overdrawn;
    }

    @Override
    public String toString(){
        return String.format(
                """
                        Account Holder: %s %s
                        Account Balance: %f
                        """, firstName, lastName, balance);
    }

}



