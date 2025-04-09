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
    public void testAccountCanDeposit() {
        BankApp account = new BankApp("Eric","Balogun",1234);
        account.deposit(4536,5000);
        assertEquals(5000,account.getBalance());
    }
    @Test
    public void testAccountThrowsErrorWhenDepositBalanceIsNegative() {
        BankApp account = new BankApp("Eric","Balogun",1234);
        IllegalArgumentException negative = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(4536,-600);
        });
        assertEquals("Deposit amount must be grater than 50.00", negative.getMessage());
    }
    @Test
    public void testAccountCanWithdraw() {
        BankApp account = new BankApp("Eric","Balogun",1234);
        account.deposit(1234,3000);
        account.withdraw(1234,1000);
        assertEquals(2000,account.getBalance());
    }
    @Test
    public void testAccountThrowsErrorWhenWithdrawBalanceIsNegative() {
        BankApp account = new BankApp("Eric","Balogun",1234);
        account.deposit(2000,3000);
        IllegalArgumentException negative = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000,-3000);
        });
        assertEquals("Withdrawal amount must be 50.00 @ minimum", negative.getMessage());
    }

}
