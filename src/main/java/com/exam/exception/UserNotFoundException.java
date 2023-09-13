package com.exam.exception;

public class UserNotFoundException extends Exception{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 6709263451770465084L;

	public UserNotFoundException() {
	        super("User with this username not found in database !!");
	    }

	    public UserNotFoundException(String msg) {
	        super(msg);
	    }

}
