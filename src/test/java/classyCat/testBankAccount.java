package classyCat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBankAccount {

    @Test
    public void testConstructor(){
        BankAccount b = new BankAccount("John", "Smith");
        assertEquals(0.0, b.getBalance());
    }
    @Test
    public void testWithdrawl(){
        BankAccount b = new BankAccount("John", "Smith");
        b.withdrawl(10.0);
        assertEquals(-10.0, b.getBalance());
    }

    @Test
    public void testDeposit(){
        BankAccount b = new BankAccount("John", "Smith");
        b.deposit(10.0);
        assertEquals(10.0, b.getBalance());
    }

    @Test
    public void testInterest(){
        BankAccount b = new BankAccount("John", "Smith", 10000000);
        assertEquals(11000000, b.monthlyInterest());
    }

    @Test void testIsOverdrawn(){
        BankAccount b = new BankAccount("John", "Smith");
        b.withdrawl(10.0);
        assertEquals(true, b.getOverdrawn());
    }
}
