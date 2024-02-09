package com.pruthvi.dto;

import java.math.BigInteger;

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
	private BigInteger phone;
	
	@JsonProperty("phone2")
	private BigInteger phone2;
	
	@JsonProperty("aadharNo")
	private BigInteger aadharNo;

	@JsonProperty("admissionDate")
	private BigInteger admissionDate;
	
	@JsonProperty("departmentID")
	private BigInteger departmentID;
}
