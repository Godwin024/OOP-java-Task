package airCondition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    private AirConditioner myAirConditioner;

    @BeforeEach
    public void  setUp(){
        myAirConditioner = new AirConditioner();
        assertTrue(myAirConditioner.checkThePowerStatus());
    }



    @Test
    public void testThatIHaveAnAirConditioner_AndItIsOff_ITurnItOn_ItIsOn(){


        assertFalse(myAirConditioner.checkThePowerStatus());

        myAirConditioner.turnOn();

        assertTrue(myAirConditioner.checkThePowerStatus());



    }

    @Test
    public void testThatIHaveAnAirConditioner_AndItIsOff_ITurnItOn_ItIsOn_AndITurnItOf_ItIsOff(){

        assertFalse(myAirConditioner.checkThePowerStatus());

        myAirConditioner.turnOn();

        assertTrue(myAirConditioner.checkThePowerStatus());

        myAirConditioner.turnOff();

        assertFalse(myAirConditioner.checkThePowerStatus());

    }

    @Test
    public void testThatIHaveAnAirConditioner_ITurnItOn_ItIsOn_AndIIncreaseTemperature_ItIncreases(){


        assertFalse(myAirConditioner.checkThePowerStatus());

        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkThePowerStatus());

        myAirConditioner.increaseTemperature(6);
        assertEquals(22, myAirConditioner.checkTemperature());

    }


    @Test
    public void testThatIHaveAnAirConditioner_ITurnItOn_ItIsOn_AndIIncreaseTemperature_ItIncreases_IDecreasesTemperature_ItDecrease(){

        assertFalse(myAirConditioner.checkThePowerStatus());

        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkThePowerStatus());

        myAirConditioner.increaseTemperature(12);
        assertEquals(28, myAirConditioner.checkTemperature());

        myAirConditioner.decreaseTemperature(4);
        assertEquals(24, myAirConditioner.checkTemperature());

    }

    @Test
    public void testThatIHaveAnAirConditioner_ITurnItOn_ItIsOn_AndIIncreaseTemperatureBeyond30_ItGoesBackTo30(){


        assertFalse(myAirConditioner.checkThePowerStatus());

        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkThePowerStatus());

        myAirConditioner.increaseTemperature(36);
        assertEquals(30, myAirConditioner.checkTemperature());

    }


    @Test
    public void testThatIHaveAnAirConditioner_ITurnItOn_ItIsOn_AndIDecreaseTemperature_ItIncreases_IDecreaseTemperature_ItComesBackTo16(){

        assertFalse(myAirConditioner.checkThePowerStatus());

        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkThePowerStatus());

        myAirConditioner.increaseTemperature(12);
        assertEquals(28, myAirConditioner.checkTemperature());

        myAirConditioner.decreaseTemperature(13);
        assertEquals(16, myAirConditioner.checkTemperature());

    }
}




