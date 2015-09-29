package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by mbesplug on 9/28/15.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
        ArrayList<String> tweetTexts = new ArrayList<String>(tweets.size());

        for (int i=0; i < tweetTexts.size(); i++) {
            Tweet t = tweets.get(i);
            tweetTexts.add(i, t.getText());
            System.out.print(t.getText());
        }

        if (tweetTexts.contains(tweet.getText())) {
            tweets.remove(tweet);
            throw new IllegalArgumentException("Duplicate Tweet!");
        }
    }

    public void removeTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Boolean contains(Tweet tweet) {
        return tweets.contains(tweet);
    }
}
