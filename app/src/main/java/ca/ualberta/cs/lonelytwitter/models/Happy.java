package ca.ualberta.cs.lonelytwitter.models;

public class Happy extends CurrentMood {

    private int date;

    Happy() {
        this.date = 0;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public static void display() {
        System.out.println("Happy");
    }

}
