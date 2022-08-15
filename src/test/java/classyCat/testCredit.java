package classyCat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class testCredit {
    @Test
    public void testConstructor(){
        CreditAccount c = new CreditAccount("John", "Smith", 50000, 60);
        assertEquals(60, c.getPaybackMonths());
        assertEquals(50000, c.getCredit());
        assertEquals("John", c.getFirstName());
        assertEquals("Smith", c.getLastName());
    }
}
