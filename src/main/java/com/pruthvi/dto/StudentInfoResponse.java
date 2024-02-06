package com.pruthvi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class StudentInfoResponse {
	
	@JsonProperty("status")
	public String status;
	
	@JsonProperty("studentDtlInfo")
	public StudentInfo studentDtlInfo;
}
