package DesignPatterns.Behavioural.Mediator;

import java.util.Date;

/**
 * Created by timmanas on 2017-04-15.
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

}


/**

 This is the Mediator class

 */