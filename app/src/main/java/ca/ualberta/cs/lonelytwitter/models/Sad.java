package ca.ualberta.cs.lonelytwitter.models;

import java.util.Date;

public class Sad extends CurrentMood {

    private Date date;

    Sad() {
        this.date = 0;
    }

    @Override
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = new Date();
    }

    public static void display() {
        System.out.println("Sad");
    }

}
