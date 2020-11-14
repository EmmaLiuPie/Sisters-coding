package com.alibaba.javase.day16;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    MyTime(int hour,int minute,int second){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }
    MyTime(){}

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

    public void addSecond(){
        this.second++;
        if(this.second==60){
            this.second=0;
            this.addMinute();
            if(this.minute==60){
                this.minute=0;
                this.hour++;
                {
                    if(this.hour==24){
                        this.hour=0;
                    }
                }
            }
        }
    }
    public void addHout(){
        this.hour++;
        if(this.hour==24){
            this.hour=0;
        }
    }
    public void addMinute(){
        this.minute++;
        if(this.minute==60){
            this.minute=0;
            this.hour++;
            {
                if(this.hour==24){
                    this.hour=0;
                }
            }
        }
    }
    public void display(){
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }
}
