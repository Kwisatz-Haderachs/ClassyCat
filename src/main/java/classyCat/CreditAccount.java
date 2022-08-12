package classyCat;

import java.time.LocalDateTime;

public class CreditAccount extends Account{
    private float credit;

    public CreditAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationDate = LocalDateTime.now();
        this.credit = 0.0f;
    }
}
