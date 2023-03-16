package com.unicorns.hareAndTortoise;

public class RaceCourse {
    private int[] raceTrack = new int[100];
    public RaceCourse() {
        this.raceTrack = raceTrack;
    }
    public RaceCourse(int[] raceTrack) {
        this.raceTrack = raceTrack;
        if (raceTrack.length > 70) {
            this.setRaceTrack(new int[100]);
        }else{
            this.raceTrack = raceTrack;
        }
    }

    private void setRaceTrack(int[] raceTrack) {
        this.raceTrack= raceTrack;
    }


    public int[] getRaceTrack(){
        return raceTrack;
    }
}
