package com.sunbeam.exception;

@SuppressWarnings("serial")
public class ExceptionLineTooLong extends Exception
{
    
	public ExceptionLineTooLong(String message) {
		super(message);
	}

	@Override
	public String getMessage() 
	{
		return super.getMessage();
	}
	
	

}