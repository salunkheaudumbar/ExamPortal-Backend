package com.exam.exception;

public class UserFoundException extends Exception{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -2071439548275344892L;

	public UserFoundException() {
	        super("User with this Username is already there in DB !! try with another one");
	    }

	    public UserFoundException(String msg)
	    {
	        super(msg);
	    }
}
