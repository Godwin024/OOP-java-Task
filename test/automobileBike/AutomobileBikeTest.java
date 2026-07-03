package automobileBike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomobileBikeTest {

    @Test
    public void testThatIHaveABikeAnd_ItsOff_ITurnItOn_ItsComesOn(){

        AutomobileBike myBike = new AutomobileBike();

        assertFalse(myBike.checkThePowerStatus());

        myBike.turnOn();
        assertTrue(myBike.checkThePowerStatus());
    }


    @Test
    public void testThatIHaveABikeAnd_ItsOff_ITurnItOn_ItsComesOn_ITurnItOff_ItGoesOff(){
        AutomobileBike myBike = new AutomobileBike();

        assertFalse(myBike.checkThePowerStatus());

        myBike.turnOn();
        assertTrue(myBike.checkThePowerStatus());

        myBike.turnOff();
        assertFalse(myBike.checkThePowerStatus());

    }

    @Test
    public void testThatIHaveABikeAnd_ItsOff_ITurnItOn_ItsComesOn_AtFirstSpeedIs0_ThenIIncreseSpeedToOne_ItIncreasesByPlusOne(){
        AutomobileBike myBike = new AutomobileBike();

        assertFalse(myBike.checkThePowerStatus());

        myBike.turnOn();
        assertTrue(myBike.checkThePowerStatus());

        myBike.accelerate();
        assertEquals(1, myBike.getSpeed());
    }


    @Test
    public void testThatIHaveABikeAnd_ItsOff_ITurnItOn_ItsComesOn_NowGearIsInRange0to20AndSpeedIs0_ThenIIncreseSpeedBy1_ItIncreasesby1(){
        AutomobileBike myBike = new AutomobileBike();

        myBike.turnOn();
        assertTrue(myBike.checkThePowerStatus());

        for(int count = 0; count < 15; count++){
            myBike.accelerate();
        }

        assertEquals(15, myBike.getSpeed());

        myBike.accelerate();
        assertEquals(16, myBike.getSpeed());

    }


    @Test
    public void testThatIHaveABikeAnd_ItsOn_NowGearIsInRange21to30AndSpeedIs22_ThenIAccelerateBy2_ITIncreasesBy2(){
        AutomobileBike myBike = new AutomobileBike();

        myBike.turnOn();
        assertTrue(myBike.checkThePowerStatus());

        for(int count = 0; count < 22; count++){
            myBike.accelerate();
        }

        assertEquals(23, myBike.getSpeed());

        myBike.accelerate();
        assertEquals(25, myBike.getSpeed());

    }




    @Test
    public void IHaveABikeAnd_ItsOn_GearIsInRange31to40AndSpeedIs32_ThenIAccelerateBy3(){
        AutomobileBike myBike = new AutomobileBike();

        myBike.turnOn();
        assertTrue(myBike.checkThePowerStatus());

        for(int count = 0; count < 26; count++){
            myBike.accelerate();
        }

        assertEquals(31, myBike.getSpeed());

        myBike.accelerate();
        assertEquals(34, myBike.getSpeed());

    }

    @Test
    public void IHaveABikeAnd_ItsOn_GearIsInRange41AndAboveAndSpeedIs40_ThenIAccelerateBy4(){
        AutomobileBike myBike = new AutomobileBike();

        myBike.turnOn();
        assertTrue(myBike.checkThePowerStatus());

        for(int count = 0; count < 30; count++){
            myBike.accelerate();
        }

        assertEquals(43, myBike.getSpeed());

        myBike.accelerate();
        assertEquals(47, myBike.getSpeed());

    }

}
