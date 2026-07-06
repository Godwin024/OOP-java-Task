package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank myBank;

    @BeforeEach
    public void setUp(){
        myBank = new Bank("GD Bank");
    }

    @Test
    public void BankHas_0AccountAtFirst(){
        assertEquals(0, myBank.getNumberOfAccounts());

    }
}
