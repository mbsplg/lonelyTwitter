package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by mbesplug on 9/14/15.
 */
public abstract class Tweet extends Object {
    protected String text;
    private Date date;

    public Tweet(String tweet, Date date) {
        super();
        text = tweet;
        this.date = date;
    }

    public Tweet(String text) {
        this.text = text;
        date = new Date();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws IOException {
        if (text.length() <= 140) {
            this.text = text;
        } else {
            throw new IOException("Tweet was too long!");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();
}
