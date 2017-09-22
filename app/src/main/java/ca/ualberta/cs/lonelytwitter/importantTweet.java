package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xcao2 on 9/13/17.
 */

public class importantTweet extends Tweet implements TweetTable{
    public importantTweet (String message ){
        super(message);
    }
    public importantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant (){
        return Boolean.TRUE;
    }
}
