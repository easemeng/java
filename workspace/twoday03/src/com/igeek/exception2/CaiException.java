package com.igeek.exception2;

@SuppressWarnings("serial")
public class CaiException extends Exception {//RuntimeException
	
	public CaiException(){
		
	}
	
	public CaiException(String message){
		super(message);
	}

}
