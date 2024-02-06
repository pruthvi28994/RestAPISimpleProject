package com.pruthvi.exception;

import java.util.List;

import com.pruthvi.exceptionDto.ErrorResponseDataItems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConstrainValidationResult {

	private List<ErrorResponseDataItems> dataItems;
	
	private String overallStatus;
}
