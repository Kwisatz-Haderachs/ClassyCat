package classyCat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankAccount extends Account {
    private float balance;

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationDate = LocalDateTime.now();
        this.balance = 0.00f;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public float withdrawl(float amount) {
        boolean status = checkBalance(amount);
        if (status == true) {
            balance -= amount;
            return balance;
        } else {
            // msg
            return balance;
        }
    }

    public float getBalance() {
        return balance;
    }

    private void interest(){
        // check date, add monthly interest
    }

    public boolean checkBalance(float amount) {
        float temp = balance - amount;
        if (temp < 0) {
            return false;
        }
        return true;
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
