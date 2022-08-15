package classyCat;

import java.time.LocalDateTime;

public class CreditAccount extends Account{
    private double credit;
    private int paybackMonths;
    private String firstName;
    private String lastName;
    private LocalDateTime creationDate;

    public CreditAccount(String firstName, String lastName, double credit, int months) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationDate = LocalDateTime.now();
        this.credit = credit;
        this.paybackMonths = months;
    }

    public int getPaybackMonths() {
        return paybackMonths;
    }

    public double getCredit() {
        return credit;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
