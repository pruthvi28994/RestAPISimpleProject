package com.pruthvi.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="STUDENTDTL")
public class StudentDetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_ID",nullable = false,precision = 5)
	private Integer studentID;
	
	@Column(name = "FIRST_NAME",nullable = false,length = 10)
	private String firstName;
	
	@Column(name = "MIDDLE_NAME",nullable = false,length = 10)
	private String middleName;
	
	@Column(name = "LAST_NAME",nullable = false,length = 10)
	private String lastName;
	
	@Column(name = "DOB",nullable = false,precision = 10)
	private Integer dob;
	
	@Column(name = "PHONE_NUMBER",nullable = false,precision = 10)
	private Integer phone;
	
	@Column(name = "ALTER_PHONE_NUMBER",nullable = true,precision = 10)
	private Integer phone2;
	
	@Column(name = "AADHAR_NO",nullable = false,precision = 10)
	private Integer aadharNo;

	@Column(name = "ADMISSION_DATE",nullable = false,precision = 10)
	private Integer admissionDate;
	
	@Column(name = "DEAPARTMENT_ID",nullable = false,precision = 5)
	private Integer departmentID;

}
