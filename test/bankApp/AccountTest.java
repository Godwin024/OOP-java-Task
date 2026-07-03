package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    private Account myAccount;

    @BeforeEach
    public void setUp(){
        myAccount = new Account();
    }

    @Test
    public void testThatIHaveAnAccountBalanceIs0_IDeposit200AndBalanceIs200(){
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(200);

        assertEquals(200 , myAccount.getBalance());

    }

    @Test
    public void testThatIHaveAnAccountAndBalance0_IDeposit_NegativeAmount_BalanceIs0(){

        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(-50);

        assertEquals(0, myAccount.getBalance());

    }

    @Test
    public void testThatIHaveAnAccountAndBalanceIs0_IDepositMultipleTime_AndGetSumBalance(){

        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(200);
        myAccount.deposit(500);

        assertEquals(700, myAccount.getBalance());

    }

    @Test
    public void testThatWithdrawalGreaterThan_BalanceDoesNothing(){

        myAccount.setPin("1234");
        myAccount.deposit(200);

        myAccount.withdrawal(300, "1234");

        assertEquals(200, myAccount.getBalance());

    }

    @Test
    public void testDeposit500ThenWithdraw200LeavesBalance300(){

        assertEquals(0, myAccount.getBalance());
        myAccount.setPin("1234");

        myAccount.deposit(500);

        assertEquals(500, myAccount.getBalance());

        myAccount.withdrawal(200, "1234");

        assertEquals(300, myAccount.getBalance());
    }


    @Test
    public void testThatIWithdrawAllMyMoneyAndBalanceIs0(){

        assertEquals(0, myAccount.getBalance());
        myAccount.setPin("1234");

        myAccount.deposit(500);

        assertEquals(500, myAccount.getBalance());

        myAccount.withdrawal(500, "1234");

        assertEquals(0, myAccount.getBalance());
    }

    @Test
    public void testThatIWithdrawAllZeroAndBalanceIsStillThere(){

        assertEquals(0, myAccount.getBalance());
        myAccount.setPin("1234");

        myAccount.deposit(500);

        assertEquals(500, myAccount.getBalance());

        myAccount.withdrawal(0, "1234");

        assertEquals(500, myAccount.getBalance());
    }

    @Test
    public void testThatIDeposit0AndBalanceIs0(){
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(0);

        assertEquals(0, myAccount.getBalance());


    }

    @Test
    public void testThatIWithDrawWithCorrectPin(){

        myAccount.setPin("1234");
        myAccount.deposit(500);

        myAccount.withdrawal(300, "1234");

        assertEquals(200, myAccount.getBalance());
    }


    @Test
    public void testThatIWithDrawWithWringPin_ReturnsSameBalance(){

        myAccount.setPin("1234");
        myAccount.deposit(500);

        myAccount.withdrawal(300, "4444");

        assertEquals(500, myAccount.getBalance());
    }

}
