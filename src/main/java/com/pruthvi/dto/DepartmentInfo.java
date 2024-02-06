package com.pruthvi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DepartmentInfo {

	@JsonProperty("departmentID")
	private Integer departmentID;
	
	@JsonProperty("departmentCode")
	private String departmentCode;
	
	@JsonProperty("departmentName")
	private String departmentName;
}
