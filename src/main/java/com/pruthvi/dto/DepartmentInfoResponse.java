package com.pruthvi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
public class DepartmentInfoResponse {
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("message")
	private String message;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("departmentInfoDtl")
	private DepartmentInfo departmentInfoDtl;
}
