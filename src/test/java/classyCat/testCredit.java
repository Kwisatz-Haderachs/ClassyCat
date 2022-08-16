package classyCat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class testCredit {

    @Test
    public void testConstructor(){
        CreditAccount c = new CreditAccount("John", "Smith", 50000, 60, 3.95);
        assertEquals(60, c.getPaybackMonths());
        assertEquals(50000, c.getCredit());
        assertEquals("John", c.getFirstName());
        assertEquals("Smith", c.getLastName());
        assertEquals(3.95, c.getInterestRate());
    }
    @Test
    public void testCalculateMonthlyPayment(){
        CreditAccount c = new CreditAccount("John", "Smith", 50000, 60, 3.95);
        assertEquals(866.25, c.calculateMonthlyPayment(), 0.5);
    }

    @Test
    public void testGettersSetters(){
        CreditAccount c = new CreditAccount("John", "Smith", 50000, 60, 3.95);
        c.setInterestRate(5.00);
        assertEquals(5.00, c.getInterestRate());
    }

}
