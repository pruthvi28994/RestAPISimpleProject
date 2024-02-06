package com.pruthvi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruthvi.dto.DepartmentInfo;
import com.pruthvi.dto.DepartmentInfoResponse;
import com.pruthvi.exception.ConcurrencyModificationException;
import com.pruthvi.mapper.ServiceMapper;
import com.pruthvi.repository.DepartmentEntityRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentApiService {
	
	@Autowired
	DepartmentEntityRepo departEntityRepo;
	
	@Autowired
	ServiceMapper mapper;

	public List<DepartmentInfo> getDepartmentDetails(Integer departmentId) {
		DepartmentApiService.log.info("Retreive Department Details Service");
		var responseDepartmentInfo = new ArrayList<DepartmentInfo>();
		if(departmentId.equals(0)) {
			var departmentInfoList = departEntityRepo.findAll();
			responseDepartmentInfo = mapper.mapDepartmentDetailsEntitiesToDepartmentInfos(departmentInfoList);
		} else {
			var departmentEntity = departEntityRepo.findById(departmentId).get();
			responseDepartmentInfo.add(mapper.mapDepartmentDetailsEntityToDepartmentInfo(departmentEntity));
		}
		return responseDepartmentInfo;
	}

	public DepartmentInfoResponse putDepartmentDetails(Integer departmentId, DepartmentInfo departmentInfo) {
		DepartmentApiService.log.info("Entered Put Department Details Service");
		var departmentEntity = mapper.mapDepartmentDetailsInfoToEntity(departmentInfo);
		departEntityRepo.save(departmentEntity);
		var response = new DepartmentInfoResponse();
		response.setStatus("Success");
		response.setDepartmentInfoDtl(departmentInfo);
		return response;
	}

	public DepartmentInfoResponse deleteDepartmentDetail(Integer departmentId) throws ConcurrencyModificationException {
		DepartmentApiService.log.info("Entered Delete Department Details Service");
		if(Boolean.FALSE.equals(departEntityRepo.findById(departmentId).isPresent())) {
			throw new ConcurrencyModificationException("Data Lost due to Concurrent update , please Referesh the page");
		}
		departEntityRepo.deleteById(departmentId);
		var response = new DepartmentInfoResponse();
		response.setStatus("Success");
		return response;
	}

}
