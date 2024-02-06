package com.pruthvi.exception;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.pruthvi.exceptionDto.ErrorResponse;
import com.pruthvi.exceptionDto.ErrorResponseDataItems;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(InvalidInputException.class)
	public ResponseEntity<ErrorResponse> handleInvalidInputException(Exception expObj) {

		/** add structure to error to look good , you can directly throw your Exception msg line 29 **/
		var error = new com.pruthvi.exceptionDto.Error("ERROR_INVALID", expObj.getMessage(),"");
		var errorDataItem = new ErrorResponseDataItems();
		errorDataItem.setErrors(new ArrayList<>(List.of(error)));
		ArrayList<ErrorResponseDataItems> dataItems = new ArrayList<>();
		dataItems.add(errorDataItem);
		var errorReponse = new ErrorResponse("Error", OffsetDateTime.now(), "Invalid Input Exception", dataItems);
		return new ResponseEntity<ErrorResponse>(errorReponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ConcurrencyModificationException.class)
	public ResponseEntity<ErrorResponse> handleConcurrencyException(Exception expObj,WebRequest webRequest){
		var msg = expObj.getMessage() + " :: " + webRequest.getDescription(false);
		var errorReponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.name(), OffsetDateTime.now(), msg, null);
		return new ResponseEntity<ErrorResponse>(errorReponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ConstrainValidationException.class)
	public ResponseEntity<ErrorResponse> handleConstraintValidationException(ConstrainValidationException expObj){		
		var errorReponse = new ErrorResponse("Error", OffsetDateTime.now(), "Validation errors exist , Please Check again", expObj.getErrors());
		return new ResponseEntity<ErrorResponse>(errorReponse, HttpStatus.BAD_REQUEST);
	}
}
