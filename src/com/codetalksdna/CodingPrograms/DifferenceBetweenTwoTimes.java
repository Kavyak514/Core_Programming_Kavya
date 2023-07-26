package com.codetalksdna.CodingPrograms;

public class DifferenceBetweenTwoTimes {
    int seconds;
    int minutes;
    int hours;

    public DifferenceBetweenTwoTimes(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {

        // create objects of Time class
        DifferenceBetweenTwoTimes start = new DifferenceBetweenTwoTimes(6, 26, 54);
        DifferenceBetweenTwoTimes stop = new DifferenceBetweenTwoTimes(9, 12, 2);
        DifferenceBetweenTwoTimes diff;

        // call difference method
        diff = getTimeDifference(start, stop);

        System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    public static DifferenceBetweenTwoTimes getTimeDifference(DifferenceBetweenTwoTimes start, DifferenceBetweenTwoTimes stop)
    {
        DifferenceBetweenTwoTimes diff = new DifferenceBetweenTwoTimes(0, 0, 0);

//        Time start = new Time(6, 26, 54);
//        Time stop = new Time(9, 12, 02);

        // if start second is greater
        // convert minute of stop into seconds
        // and add seconds to stop second
        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }

        diff.seconds = stop.seconds - start.seconds;

        // if start minute is greater
        // convert stop hour into minutes
        // and add minutes to stop minutes
        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }

        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;

        // return the difference time
        return(diff);
    }
}
