package com.coobby.session;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@WebListener
public class SessionUserCounter implements HttpSessionListener{
	
	private static Logger logger = LoggerFactory.getLogger(SessionUserCounter.class);
	
	public static int count = 0;
	
	public static int getCount() {
		return count;
	}
	
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		count++;
		logger.error("\n\tSESSION CREATED : {}, TOTAL ACCESSER : {}", session.getId(), count);
	}
	
	public void sessionDestroyed(HttpSessionEvent event) {
		count--;
		if(count<0) count=0;
		
		HttpSession session = event.getSession();
		logger.error("\n\tSESSION CREATED : {}, TOTAL ACCESSER : {}", session.getId(), count);
	}
}
