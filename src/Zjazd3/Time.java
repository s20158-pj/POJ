/*
Author: Patryk Klimek
Summary: Creating class "Date" from UML chart in exercise 14
 */
package Zjazd3;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d", hour) + "/" + String.format("%02d", minute) + "/" + String.format("%02d", second);
    }

    public Time nextSecond() {
        this.second += 1;
        if (this.second > 59) {
            this.second = 0;
            this.minute += 1;
            if (this.minute > 59) {
                this.minute = 0;
                this.hour += 1;
                if (this.hour > 23) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        this.second -= 1;
        if (this.second < 0) {
            this.second = 59;
            this.minute -= 1;
            if (this.minute < 0) {
                this.minute = 59;
                this.hour -= 1;
                if (this.hour < 0) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }

}
