package ru.sivoronova;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws TwitterException {
        // The factory instance is re-useable and thread safe.
        Twitter twitter = TwitterFactory.getSingleton();

        List<Status> statuses = twitter.getUserTimeline("vishwananda");
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getCreatedAt() + "," +
                    status.getText());
        }

    }
}
