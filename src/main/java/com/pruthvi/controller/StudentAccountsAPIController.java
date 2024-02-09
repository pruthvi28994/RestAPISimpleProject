package com.pruthvi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pruthvi.dto.DepartmentInfo;
import com.pruthvi.dto.DepartmentInfoResponse;
import com.pruthvi.dto.StudentInfo;
import com.pruthvi.dto.StudentInfoResponse;

@Validated
public interface StudentAccountsAPIController {
	
	/**
	 * @author pruth
	 * @apiNote To Get Student Information Details
	 * @param studentId
	 * @return
	 */
	@GetMapping("/student-service/{studentId}/student-details")
	public ResponseEntity<StudentInfo> getStudentDetails(
			@PathVariable Integer studentId) throws Exception;
	
	/**
	 * @author pruth
	 * @param studentId
	 * @apiNote To ADD / Modify of Student Records , if StudentId is 0 then Add , else Update
	 * @param requestPayload
	 * @return
	 */
	@PutMapping("/student-service/{studentId}/student-details")
	public ResponseEntity<StudentInfoResponse> putStudentDetails(@PathVariable Integer studentId,@RequestBody StudentInfo requestPayload) throws Exception;;

	
	/**
	 * @author pruth
	 * @apiNote To Retrieve Department Info , if Department Id is 0 , then retrieves all Departments , else specific Department
	 * @param departmentId
	 * @return
	 */
	@GetMapping("/department-service/{departmentId}/department-details")
	public ResponseEntity<List<DepartmentInfo>> getDepartmentDetails(@PathVariable Integer departmentId);
	
	
	/**
	 * @implNote If DepartmentId is 0 , Then Operation Carried is Add , else Update
	 * @param departmentId
	 * @param departmentInfo
	 * @return
	 */
	@PutMapping("/department-service/{departmentId}/department-details")
	public ResponseEntity<DepartmentInfoResponse> putDepartmentDetails(@PathVariable Integer departmentId,@RequestBody DepartmentInfo departmentInfo) throws Exception;
	
	
	/**
	 * @implNote To Delete Department Entry
	 * @param departmentId
	 * @return
	 */
	@DeleteMapping("/department-service/{departmentId}/department-details")
	public ResponseEntity<DepartmentInfoResponse> deleteDepartmentDetail(@PathVariable Integer departmentId) throws Exception;
	
	/**
	 * @implNote To delete student Detail
	 * @param studentId
	 * @return
	 */
	@DeleteMapping("/student-service/{studentId}/student-details")
	public ResponseEntity<StudentInfoResponse> deleteStudentDetail(@PathVariable Integer studentId) throws Exception;
}
