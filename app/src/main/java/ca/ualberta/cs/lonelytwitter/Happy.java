package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mbesplug on 9/14/15.
 */
public class Happy extends Mood {

    protected Date moodDate = getDate();

    public Happy(Date moodDate) {
        this.moodDate = moodDate;
    }

    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }


    public Boolean isHappy() {
        return Boolean.TRUE;
    }

    public String getMoodString() {
        return ":-)";
    }

}
