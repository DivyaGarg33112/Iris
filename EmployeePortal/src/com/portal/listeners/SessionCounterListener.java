package com.portal.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionCounterListener implements HttpSessionListener {
 
    private static int activeSessions = 0;
 
    public void sessionCreated(HttpSessionEvent se) {
    	System.out.println("Session Created");
        activeSessions++;
    }
 
    public void sessionDestroyed(HttpSessionEvent se) {
    	System.out.println("Session Destroyed");
        if(activeSessions > 0)
            activeSessions--;
    }
 
    public static int getActiveSessions() {
        return activeSessions;
    }
}