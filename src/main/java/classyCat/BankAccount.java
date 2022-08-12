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

    private float withdrawl(float amount) {
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

    public boolean checkBalance(float amount) {
        float temp = balance - amount;
        if (temp < 0) {
            return false;
        }
        return true;
    }

}
