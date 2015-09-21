package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by mbesplug on 9/14/15.
 */
public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet(String tweet, Date date) {
        super(tweet, date); // calls constructor of Tweet
    }

    public ImportantTweet(String text) throws IOException {
        super(text);
        this.setText(text);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
