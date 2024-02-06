package com.pruthvi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class StudentInfo {

	@JsonProperty("studentID")
	private Integer studentID;
	
	@JsonProperty("firstName")
	private String firstName;
	
	@JsonProperty("middleName")
	private String middleName;
	
	@JsonProperty("lastName")
	private String lastName;
	
	@JsonProperty("dob")
	private Integer dob;
	
	@JsonProperty("phone")
	private Integer phone;
	
	@JsonProperty("phone2")
	private Integer phone2;
	
	@JsonProperty("aadharNo")
	private Integer aadharNo;

	@JsonProperty("admissionDate")
	private Integer admissionDate;
	
	@JsonProperty("departmentID")
	private Integer departmentID;
}
