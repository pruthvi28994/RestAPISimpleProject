package com.pruthvi.validation;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pruthvi.dto.StudentInfo;
import com.pruthvi.exception.ConstrainValidationResult;
import com.pruthvi.exceptionDto.Error;
import com.pruthvi.exceptionDto.ErrorResponseDataItems;

@Component
public class StudentRuleProcessor {

	public ConstrainValidationResult executeStudentFormRules(Integer studentId, StudentInfo requestPayload) {
		var constrainValidationResult = new ConstrainValidationResult();
		constrainValidationResult.setOverallStatus("Success");
		List<ErrorResponseDataItems> dataItems = new ArrayList<>();
		var currentDate = Integer.valueOf(new SimpleDateFormat("yyyymmdd").format(new Date())); 
		//if Student Name is left Blank
		if(requestPayload.getFirstName()==null || requestPayload.getFirstName().isBlank()) {
			dataItems.add(new ErrorResponseDataItems("", "", new ArrayList<Error>(List.of(new Error("ERROR_1", "This is a Required Field", "firstName")))));
			constrainValidationResult.setOverallStatus("Failure");
		}
		
		//Validate DOB
		if(requestPayload.getDob()==null || requestPayload.getDob()==0) {
			dataItems.add(new ErrorResponseDataItems("", "", new ArrayList<Error>(List.of(new Error("ERROR_1", "This is a Required Field", "dob")))));
			constrainValidationResult.setOverallStatus("Failure");
		} else if(currentDate.compareTo(requestPayload.getDob()) < 0 ) {
			dataItems.add(new ErrorResponseDataItems("", "", new ArrayList<Error>(List.of(new Error("ERROR_2", "Dob cannot be future Date", "dob")))));
			constrainValidationResult.setOverallStatus("Failure");
		}
		
		//Validate Phone Number
		if(requestPayload.getPhone()==null || requestPayload.getPhone().compareTo(BigInteger.ZERO) ==0) {
			dataItems.add(new ErrorResponseDataItems("", "", new ArrayList<Error>(List.of(new Error("ERROR_1", "This is a Required Field", "phone")))));
			constrainValidationResult.setOverallStatus("Failure");
		} else if(requestPayload.getPhone().toString().length() != 10) {
			dataItems.add(new ErrorResponseDataItems("", "", new ArrayList<Error>(List.of(new Error("ERROR_3", "Enter Valid Phone Number", "phone")))));
			constrainValidationResult.setOverallStatus("Failure");
		}
		constrainValidationResult.setDataItems(dataItems);
		return constrainValidationResult;
	}
	
}
