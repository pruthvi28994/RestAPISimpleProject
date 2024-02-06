package com.pruthvi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DepartmentInfoResponse {
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("departmentInfoDtl")
	private DepartmentInfo departmentInfoDtl;
}
