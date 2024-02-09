package com.pruthvi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.pruthvi.dto.DepartmentInfo;
import com.pruthvi.dto.DepartmentInfoResponse;
import com.pruthvi.dto.StudentInfo;
import com.pruthvi.dto.StudentInfoResponse;
import com.pruthvi.exception.InvalidInputException;
import com.pruthvi.service.DepartmentApiService;
import com.pruthvi.service.StudentDetailsApiService;

@RestController
public class StudentAccountsAPIControllerImpl implements StudentAccountsAPIController{
	
	@Autowired
	StudentDetailsApiService studentService;
	
	@Autowired
	DepartmentApiService departmentService;

	@Override
	public ResponseEntity<StudentInfo> getStudentDetails(Integer studentId) throws InvalidInputException {
		return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentDetails(studentId));
	}

	@Override
	public ResponseEntity<StudentInfoResponse> putStudentDetails(Integer studentId, StudentInfo requestPayload) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(studentService.putStudentDetails(studentId,requestPayload));
	}

	@Override
	public ResponseEntity<List<DepartmentInfo>> getDepartmentDetails(Integer departmentId) {
		return ResponseEntity.status(HttpStatus.OK).body(departmentService.getDepartmentDetails(departmentId));
	}

	@Override
	public ResponseEntity<DepartmentInfoResponse> putDepartmentDetails(Integer departmentId,
			DepartmentInfo departmentInfo) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(departmentService.putDepartmentDetails(departmentId,departmentInfo));
	}

	@Override
	public ResponseEntity<DepartmentInfoResponse> deleteDepartmentDetail(Integer departmentId) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(departmentService.deleteDepartmentDetail(departmentId));
	}

	@Override
	public ResponseEntity<StudentInfoResponse> deleteStudentDetail(Integer studentId) throws Exception{
		return ResponseEntity.status(HttpStatus.OK).body(studentService.deleteStudentDetail(studentId));
	}
	

}
