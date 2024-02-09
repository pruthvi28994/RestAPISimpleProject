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
import com.pruthvi.exceptionDto.ErrorResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Validated
public interface StudentAccountsAPIController {

	/** Ignore @Operation as its only used for API swagger documentation , Not Important as of now  **/
	
	/**
	 * @author pruth
	 * @apiNote To Get Student Information Details
	 * @param studentId
	 * @return
	 */
	@Operation(summary = "Retrieve Student Detail", description = "Get Student Details", operationId = "getStudentDetails", responses = {
			@ApiResponse(responseCode = "200", description = "Student Details Retrieved successfully", content = @Content(schema = @Schema(implementation = StudentInfo.class))),
			@ApiResponse(responseCode = "400", description = "Unexcepted Error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
	@GetMapping("/student-service/{studentId}/student-details")
	public ResponseEntity<StudentInfo> getStudentDetails(
			@Parameter(description = "Enter the Student ID", required = true) @PathVariable Integer studentId)
			throws Exception;

	/**
	 * @author pruth
	 * @param studentId
	 * @apiNote To ADD / Modify of Student Records , if StudentId is 0 then Add ,
	 *          else Update
	 * @param requestPayload
	 * @return SuccessResponse
	 * @throws InvalidInputException
	 */
	@Operation(summary = "Put Student Detail", description = "Save Student Details", operationId = "putStudentDetails", responses = {
			@ApiResponse(responseCode = "200", description = "Student Details ADD/UPDATED successfully", content = @Content(schema = @Schema(implementation = StudentInfoResponse.class))),
			@ApiResponse(responseCode = "400", description = "Unexcepted Error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
	@PutMapping("/student-service/{studentId}/student-details")
	public ResponseEntity<StudentInfoResponse> putStudentDetails(
			@Parameter(description = "Enter the Student ID", required = true) @PathVariable Integer studentId,
			@RequestBody StudentInfo requestPayload) throws Exception;;

	/**
	 * @author pruth
	 * @apiNote To Retrieve Department Info , if Department Id is 0 , then retrieves
	 *          all Departments , else specific Department
	 * @param departmentId
	 * @return
	 */
	@Operation(summary = "Retrieve Department Detail", description = "Get Department Detail", operationId = "getDepartmentDetails", responses = {
			@ApiResponse(responseCode = "200", description = "Department Details Retrieved successfully", content = @Content(array = @ArraySchema(schema = @Schema(implementation = DepartmentInfo.class)))),
			@ApiResponse(responseCode = "400", description = "Unexcepted Error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
	@GetMapping("/department-service/{departmentId}/department-details")
	public ResponseEntity<List<DepartmentInfo>> getDepartmentDetails(
			@Parameter(description = "Enter the Department Id", required = true) @PathVariable Integer departmentId);

	/**
	 * @implNote If DepartmentId is 0 , Then Operation Carried is Add , else Update
	 * @param departmentId
	 * @param departmentInfo
	 * @return SuccessResponse
	 * @throws InvalidInputException
	 */
	@Operation(summary = "Put Department Detail", description = "Save Department Detail", operationId = "putDepartmentDetails", responses = {
			@ApiResponse(responseCode = "200", description = "Department Details ADD/UPDATED successfully", content = @Content(schema = @Schema(implementation = DepartmentInfoResponse.class))),
			@ApiResponse(responseCode = "400", description = "Unexcepted Error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
	@PutMapping("/department-service/{departmentId}/department-details")
	public ResponseEntity<DepartmentInfoResponse> putDepartmentDetails(
			@Parameter(description = "Enter the Department Id", required = true) @PathVariable Integer departmentId,
			@RequestBody DepartmentInfo departmentInfo) throws Exception;

	/**
	 * @implNote To Delete Department Entry
	 * @param departmentId
	 * @return
	 */
	@Operation(summary = "Remove Department Detail", description = "Delete Department Detail", operationId = "deleteDepartmentDetail", responses = {
			@ApiResponse(responseCode = "200", description = "Department Details Deleted successfully", content = @Content(schema = @Schema(implementation = DepartmentInfoResponse.class))),
			@ApiResponse(responseCode = "400", description = "Unexcepted Error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
	@DeleteMapping("/department-service/{departmentId}/department-details")
	public ResponseEntity<DepartmentInfoResponse> deleteDepartmentDetail(
			@Parameter(description = "Enter the Department Id", required = true) @PathVariable Integer departmentId)
			throws Exception;

	/**
	 * @implNote To delete student Detail
	 * @param studentId
	 * @return
	 */
	@Operation(summary = "Remove Student Detail", description = "Delete Student Details", operationId = "deleteStudentDetail", responses = {
			@ApiResponse(responseCode = "200", description = "Student Details Deleted successfully", content = @Content(schema = @Schema(implementation = StudentInfoResponse.class))),
			@ApiResponse(responseCode = "400", description = "Unexcepted Error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
	@DeleteMapping("/student-service/{studentId}/student-details")
	public ResponseEntity<StudentInfoResponse> deleteStudentDetail(
			@Parameter(description = "Enter the Student Id", required = true) @PathVariable Integer studentId)
			throws Exception;
}
