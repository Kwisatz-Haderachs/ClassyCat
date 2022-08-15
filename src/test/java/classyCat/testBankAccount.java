package classyCat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBankAccount {
    public BankAccount b;

    @BeforeEach
    public void init(){
        b = new BankAccount("John", "Smith");
    }

    @Test
    public void testConstructor(){
        assertEquals(0.0, b.getBalance(), 0.1);
        assertEquals("John", b.getFirstName());
        assertEquals("Smith", b.getLastName());
        assertEquals(0, b.getAccountDurationMonths());
    }
    @Test
    public void testWithdraw(){
        b.withdrawl(10.0);
        assertEquals(-10.0, b.getBalance());
        b.deposit(90.0);
        assertEquals(80.0, b.getBalance());
    }

    @Test
    public void testDeposit(){
        b.deposit(10.0);
        assertEquals(10.0, b.getBalance());
        b.deposit(100.0);
        assertEquals(110.0, b.getBalance());
    }

    @Test
    public void testInterest(){
        b.deposit(10000000);
        assertEquals(11000000, b.monthlyInterest());
        b.withdrawl(10000000);
        assertEquals(1100000, b.monthlyInterest());
    }

    @Test
    public void testIsOverdrawn(){
        b.deposit(5);
        assertEquals(false, b.getOverdrawn());
        b.withdrawl(10.0);
        assertEquals(true, b.getOverdrawn());
    }

    @Test
    public void testGettersSetters(){
        assertEquals(0, b.getBalance());
        b.setLastName("Wick");
        assertEquals("Wick", b.getLastName());
        b.setFirstName("Jon");
        assertEquals("Jon", b.getFirstName());
        b.setAccountDurationMonths(10);
        assertEquals(10, b.getAccountDurationMonths());
    }
}
