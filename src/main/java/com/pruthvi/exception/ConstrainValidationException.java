package com.pruthvi.exception;

import java.util.List;

import com.pruthvi.exceptionDto.ErrorResponseDataItems;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ConstrainValidationException extends Exception{/**
	 * 
	 */
	private static final long serialVersionUID = -1845126928922181026L;
	
	final transient List<ErrorResponseDataItems> errors;

	public ConstrainValidationException(List<ErrorResponseDataItems> errors) {
		this.errors = errors;
	}
	
}
