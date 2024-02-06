package com.pruthvi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="DEPARTMENTDTL")
public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "DEPARTMENT_SEQUENCE",sequenceName = "DEPARTMENT_KEYS",allocationSize = 1)
	@Column(name = "DEAPARTMENT_ID",nullable = false,precision = 5)
	private Integer departmentID;
	
	@Column(name = "DEPARTMENT_CODE",nullable = false,length = 5)
	private String departmentCode;
	
	@Column(name = "DEPARTMENT_NAME",nullable = false,length = 50)
	private String departmentName;
}
