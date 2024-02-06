package com.pruthvi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruthvi.dto.StudentInfo;
import com.pruthvi.dto.StudentInfoResponse;
import com.pruthvi.exception.ConstrainValidationException;
import com.pruthvi.exception.InvalidInputException;
import com.pruthvi.mapper.ServiceMapper;
import com.pruthvi.repository.StudentEntityRepo;
import com.pruthvi.validation.StudentRuleProcessor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentDetailsApiService {
	
	@Autowired
	StudentEntityRepo studentRepo;
	
	@Autowired
	ServiceMapper mapper;
	
	@Autowired
	StudentRuleProcessor validator;

	public StudentInfo getStudentDetails(Integer studentId) throws InvalidInputException {
		StudentDetailsApiService.log.debug("Retreive Student Details Method");
		var studentInfo = new StudentInfo();
		var studentDetails = studentRepo.findById(studentId);
		if(studentDetails.isEmpty()) {
			throw new InvalidInputException("Invalid Request ,No Record Found");
		}
		studentInfo = mapper.mapStudentDetailEntityToStudentInfo(studentDetails.get());
		return studentInfo;
	}

	public StudentInfoResponse putStudentDetails(Integer studentId, StudentInfo requestPayload) throws ConstrainValidationException {
		StudentDetailsApiService.log.debug("Entered Put Student Details Method");
		var studentResponse = new StudentInfoResponse();
		var validation = validator.executeStudentFormRules(studentId,requestPayload);
		if(validation.getOverallStatus().equals("Failure")) {
			throw new ConstrainValidationException(validation.getDataItems());
		}
		var studentEntity = mapper.mapStudentInfoToStudentDetailEntity(requestPayload);
		studentRepo.save(studentEntity);
		studentResponse.setStudentDtlInfo(requestPayload);
		return studentResponse;
	}

	public StudentInfoResponse deleteStudentDetail(Integer studentId) {
		StudentDetailsApiService.log.debug("Entered Delete Student Details Method");
		var studentResponse = new StudentInfoResponse();
		studentRepo.deleteById(studentId);
		return studentResponse;
	}
	
}
