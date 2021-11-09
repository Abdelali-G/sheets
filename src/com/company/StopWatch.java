package com.company;
public class StopWatch {
    public long startTime;
    public long endTime;



    public long getStartTime() {
        return startTime;

    }
    public long getEndTime(){
        return endTime;
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public void stop(){
        this.endTime =System.currentTimeMillis();
    }
    public StopWatch(){
        startTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return (endTime-startTime);
    }

}


