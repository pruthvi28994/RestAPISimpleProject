package com.pruthvi.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import com.pruthvi.dto.DepartmentInfo;
import com.pruthvi.dto.StudentInfo;
import com.pruthvi.entity.DepartmentEntity;
import com.pruthvi.entity.StudentDetailEntity;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
@Component
public interface ServiceMapper {
	
	/**
	 * @author pruth
	 * @param studentDtlEntity
	 * @return {@link StudentInfo}
	 */
	public StudentInfo mapStudentDetailEntityToStudentInfo(StudentDetailEntity studentDtlEntity);
	
	/**
	 * @implNote Maps Student Information to Student Details
	 * @param studentInfo
	 * @return
	 */
	public StudentDetailEntity mapStudentInfoToStudentDetailEntity(StudentInfo studentInfo);
	
	/**
	 * @implNote Maps List of Department Entities to Department Info
	 * @param departmentEntites
	 * @return
	 */
	public ArrayList<DepartmentInfo> mapDepartmentDetailsEntitiesToDepartmentInfos(List<DepartmentEntity> departmentEntites);
	
	/**
	 * 
	 * @param departmentEntity
	 * @return
	 */
	public DepartmentInfo mapDepartmentDetailsEntityToDepartmentInfo(DepartmentEntity departmentEntity);

	
	public DepartmentEntity mapDepartmentDetailsInfoToEntity(DepartmentInfo departmentDtl);
}
