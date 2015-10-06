package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by mbesplug on 9/28/15.
 */
public class TweetList implements MyObservable {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>(); // model
    private volatile ArrayList<MyObserver> observers; // model

    private void notifyAllObservers() { // controller
        for (MyObserver observer : observers) {
            observer.myNotify(this);
        }
    }

    public void addTweet(Tweet tweet) { // controller
        tweets.add(tweet);

        notifyAllObservers();
        /*ArrayList<String> tweetTexts = new ArrayList<String>(tweets.size());

        for (int i=0; i < tweetTexts.size(); i++) {
            Tweet t = tweets.get(i);
            tweetTexts.add(i, t.getText());
            System.out.print(t.getText());
        }

        if (tweetTexts.contains(tweet.getText())) {
            tweets.remove(tweet);
            throw new IllegalArgumentException("Duplicate Tweet!");
        } */
    }

    public void removeTweet(Tweet tweet) { // controller
        tweets.remove(tweet);
    }

    public Boolean contains(Tweet tweet) { // controller
        return tweets.contains(tweet);
    }

    public void addObserver(MyObserver observer) { // controller
        observers.add(observer);
    }

    public void myNotify(MyObservable observable) { // controller
        notifyAllObservers();
    }
}
