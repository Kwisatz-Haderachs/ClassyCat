package classyCat;

import java.time.LocalDateTime;

public class CreditAccount extends Account{
    private double credit;
    private int paybackMonths;
    private String firstName;
    private String lastName;
    private LocalDateTime creationDate;
    private double interestRate;

    public CreditAccount(String firstName, String lastName, double credit, int months, double interestRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationDate = LocalDateTime.now();
        this.credit = credit;
        this.paybackMonths = months;
        this.interestRate = interestRate;
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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateMonthlyPayment(){
        double totalPayment = credit*(interestRate/100.0) + credit;
        return totalPayment/paybackMonths;
    }

}
