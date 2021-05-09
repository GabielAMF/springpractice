package com.gabriel.cursojava.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String mensagem) {
		super(mensagem);
	}
	
	public ObjectNotFoundException(String message,Throwable cause) {
		super(message,cause);
	}
}
