package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mbesplug on 9/14/15.
 */
public class Sad extends Mood {

    protected Date moodDate = getDate();

    public Sad(Date moodDate) {
        this.moodDate = moodDate;
    }

    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }


    public Boolean isHappy() {
        return Boolean.FALSE;
    }

    public String getMoodString() {
        return ":-|";
    }

}
