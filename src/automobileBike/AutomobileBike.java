package automobileBike;

public class AutomobileBike {

    private boolean bikePowerStatus;
    private int speedStatus;


    public boolean checkThePowerStatus() {
        return bikePowerStatus;
    }

    public void turnOn() {
        bikePowerStatus = true;
    }

    public void turnOff() {
        bikePowerStatus = false;
    }


    public int getSpeed() {
        return speedStatus;
    }

    public void accelerate() {

            if(speedStatus >= 0 && speedStatus <= 20){
                speedStatus = speedStatus +1;
            }else
                if(speedStatus >= 21 && speedStatus <= 30){
                speedStatus = speedStatus +2;
            }else
                if (speedStatus >= 31 && speedStatus <= 40){
                speedStatus = speedStatus +3;
            } else if (speedStatus >= 41 ) {
                    speedStatus = speedStatus +4;

                }

    }
}
