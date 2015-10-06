/* Spoke with TA Ian for quite a while regarding why the test for addTweet() wouldn't fail; we both couldn't solve the problem and I was told to commit what I have to Github */

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by mbesplug on 9/28/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 implements MyObserver {
    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }
        private Boolean wasNotified = Boolean.FALSE; // controller

    public void myNotify(MyObservable observable) {
        wasNotified = Boolean.TRUE; // controller
    }


    public void testAddObserver() {
        TweetList list = new TweetList(); // controller
        list.addObserver(this); // controller
        wasNotified = Boolean.FALSE; // controller
        list.addTweet(new NormalTweet("test")); // controller
        // at this point we expect to be notified!
        assertTrue(wasNotified);

    }

    public void testTweetObserver() {
        TweetList list = new TweetList(); // controller
        list.addObserver(this); // controller
        Tweet tweet = new NormalTweet("test"); // controller
        list.addTweet(tweet); // controller
        wasNotified = Boolean.FALSE; 
        tweet.setText("different");
        assertTrue(wasNotified);
    }

    // TODO
    public void testAddTweet() {
        TweetList list = new TweetList();
        list.addTweet(new NormalTweet("test"));
        list.addTweet(new NormalTweet("test")); // duplicate Tweet; should throw IAE
    }

    public void testRemoveTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        list.removeTweet(tweet);
        assertFalse(list.contains(tweet));
    }

    public void testContains() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.contains(tweet));
    }

    public void testGetTweets() {

    }

    public void testHasTweet() {

    }

    public void testGetCount() {

    }
}