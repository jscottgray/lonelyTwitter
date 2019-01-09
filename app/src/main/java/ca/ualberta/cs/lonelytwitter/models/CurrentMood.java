package ca.ualberta.cs.lonelytwitter.models;

public class CurrentMood {

    private int mood;

    private int date;

    CurrentMood() {
        this.mood = 0;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
