package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mbesplug on 9/14/15.
 */
public abstract class Mood {
    Tweet tweet;
    int moodRating;
    protected Date date;

    public Mood(Tweet tweet, int moodRating) {
        this.tweet = tweet;
    }

    public void assignMood(int moodRating) {
        if (moodRating > 5) {
            // happy code here
        } else {
            // sad code here
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isHappy();
    public abstract String getMoodString();

}
