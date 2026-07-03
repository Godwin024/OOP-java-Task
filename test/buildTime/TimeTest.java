package buildTime;

public class TimeTest {
    private  int hour;
    private int minute;
    private int seconds;

    public void setHour(int hour){
        if (hour < 0 || hour >= 24){
            throw new IllegalArgumentException("The hour was out of range");
        }
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("The minuet was out of range");
        }
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60){
            throw new IllegalArgumentException("The second was out of range");
        }
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}