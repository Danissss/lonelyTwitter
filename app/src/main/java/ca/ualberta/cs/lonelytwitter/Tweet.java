package ca.ualberta.cs.lonelytwitter;

/**
 * Created by xcao2 on 9/13/17.
 */

import java.util.Date;
import java.util.StringTokenizer;

public abstract class Tweet implements TweetTable {
    private String message;
    private Date date;

    public Tweet (String message){
        this.message = message;
    }

    public Tweet (String messsage, Date date){
        this.date = date;
        this.message = messsage;
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.date;

    }
    public void setMessage(String message ) throws TweetTooLongException{
        if(message.length() < 140 ){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();

        }
    }

    public abstract Boolean isImportant();

}
