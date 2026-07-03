package airCondition;

public class AirConditioner {

        private boolean power;
        private int temperature = 16;

    public boolean checkThePowerStatus() {

        return power;
    }

    public void turnOn() {

        power = true;

    }

    public void turnOff() {

        power = false;

    }

    public void increaseTemperature(int number) {
        if(number <= 30){
            temperature = temperature + number;
        }else {
            temperature = 30;
        }


    }


    public int checkTemperature() {
        return  temperature;
    }

    public void decreaseTemperature(int number) {
        int decreasingNumber = temperature -16;

        if(number <= decreasingNumber){
            temperature = temperature - number;
        }else {
            temperature = 16;
        }
    }
}
