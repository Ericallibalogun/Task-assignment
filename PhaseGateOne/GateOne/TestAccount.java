package GateOne;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {
    @Test
    public void testAccountFirstNameIsCreated() {
        BankApp account = new BankApp("Eric","Balogun",1234);
        assertEquals("Eric",account.getFirstName());
    }
    @Test
    public void testAccountLastNameIsCreated() {
        BankApp account = new BankApp("Eric","Balogun",1234);
        assertEquals("Balogun",account.getLastName());
    }
    @Test
    public void testAccountPinIsCreated() {
        BankApp account = new BankApp("Eric","Balogun",1234);
        assertEquals(1234,account.getPin());
    }
    @Test
    public void testAccountCanWithdraw() {
        BankApp account = new BankApp("Eric","Balogun",1234);
        account.deposit(4536,5000);
        assertEquals(5000,account.getBalance());
    }
    @Test
    public void testAccountThrowsErrorWhenBalanceIsNegative() {
        BankApp account = new BankApp("Eric","Balogun",1234);

    }


}
