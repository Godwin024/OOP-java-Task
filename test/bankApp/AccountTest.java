package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account myAccount;

    @BeforeEach
    public void setUp(){
        myAccount = new Account("firstName", "lastName", "28569", "1234" );
    }

    @Test
    public void IHaveAnAccountBalanceIs0IDeposit200AndBalanceIs200(){
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(200);

        assertEquals(200 , myAccount.getBalance());

    }

    @Test
    public void IHaveAnAccountAndBalance0IDepositNegativeAmountBalanceIs0(){

        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(-50);

        assertEquals(0, myAccount.getBalance());

    }

    @Test
    public void IHaveAnAccountAndBalanceIs0IDepositMultipleTimeAndGetSumBalance(){

        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(200);
        myAccount.deposit(500);

        assertEquals(700, myAccount.getBalance());

    }

    @Test
    public void cannotWithdrawMoreThanBalance(){

        myAccount.deposit(200);

        assertThrows(IllegalArgumentException.class, () -> {
            myAccount.withdrawal(300, "1234");
        });

        assertEquals(200, myAccount.getBalance());

    }

    @Test
    public void IDeposit500ThenWithdraw200LeavesBalance300(){

        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(500);

        assertEquals(500, myAccount.getBalance());

        myAccount.withdrawal(200, "1234");

        assertEquals(300, myAccount.getBalance());
    }


    @Test
    public void IWithdrawAllMyMoneyAndBalanceIs0(){

        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(500);

        assertEquals(500, myAccount.getBalance());

        myAccount.withdrawal(500, "1234");

        assertEquals(0, myAccount.getBalance());
    }

    @Test
    public void IWithdrawZeroAndBalanceIsStillThere(){

        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(500);

        assertEquals(500, myAccount.getBalance());

        myAccount.withdrawal(0, "1234");

        assertEquals(500, myAccount.getBalance());
    }

    @Test
    public void IDeposit0AndBalanceIs0(){

        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(0);

        assertEquals(0, myAccount.getBalance());


    }

    @Test
    public void IWithDrawWithCorrectPinAndItIsSuccessful(){

        myAccount.deposit(500);

        myAccount.withdrawal(300, "1234");

        assertEquals(200, myAccount.getBalance());
    }


    @Test
    public void IWithDrawWithWrongPin_ReturnsSameBalance(){

        myAccount.deposit(500);

        assertThrows(IllegalArgumentException.class, ()->{
           myAccount.withdrawal(300, "2367");
        });

        assertEquals(500, myAccount.getBalance());
    }

    @Test
    public void multipleWithdrawals(){


        myAccount.deposit(2000);

        myAccount.withdrawal(500, "1234");
        myAccount.withdrawal(300, "1234");
        myAccount.withdrawal(200, "1234");

        assertEquals(1000, myAccount.getBalance());

    }

    @Test
    public void testThatValidPinCanBeSet(){

        assertEquals("1234", myAccount.getPin());

    }
    @Test
    public void testThatPinLessThanFourDigitsThrowsException(){

        assertThrows(IllegalArgumentException.class, ()-> {
           myAccount.setPin("123");
        });
    }

    @Test
    public void testThatPinContainingLettersThrowsException(){

        assertThrows(IllegalArgumentException.class, ()->{
           myAccount.setPin("12a4");
        });
    }


}
