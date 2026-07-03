package buildTime;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setHour(){
        if(hour > 0 || hour < 24){
            throw new IllegalArgumentException("The time is not within the range");
        }
        this.hour = hour;

    }

    public void setMinute(){
        if (minute > 0 || minute < 60){
            throw new IllegalArgumentException("The time is not within the range");
        }
       this.minute = second;

    }

    public void setSecond(int second){
        if (second > 0 || second < 60){
            throw new IllegalArgumentException("The time is not within the range");
        }
        this.second = second;
    }

    public  int getHour(){
        return hour;
    }

    public  int getMinute(){
        return minute;
    }

    public  int getSecond(){
        return second;
    }



}
