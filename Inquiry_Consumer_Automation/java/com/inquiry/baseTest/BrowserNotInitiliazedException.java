package com.inquiry.baseTest;
/*
 * It is runtime exception class. BrowserNotInitializeException exception is
 * thrown when browser name is wrong in BaseTest class.
 */

@SuppressWarnings("serial")
public class BrowserNotInitiliazedException  extends RuntimeException  {
	
public BrowserNotInitiliazedException(String message) {
			super(message);
		}
	}

