package com.pruthvi.exception;

import lombok.Data;

@Data
public class ConcurrencyModificationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7679160375167556615L;
	
	private String errorMsg = "";

	public ConcurrencyModificationException(String errorMsg) {
		super(errorMsg);
	}
	
	

}
