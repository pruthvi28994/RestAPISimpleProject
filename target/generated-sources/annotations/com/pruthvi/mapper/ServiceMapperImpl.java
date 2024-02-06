package com.pruthvi.mapper;

import com.pruthvi.dto.DepartmentInfo;
import com.pruthvi.dto.StudentInfo;
import com.pruthvi.entity.DepartmentEntity;
import com.pruthvi.entity.StudentDetailEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-05T17:57:48+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public StudentInfo mapStudentDetailEntityToStudentInfo(StudentDetailEntity studentDtlEntity) {

        StudentInfo studentInfo = new StudentInfo();

        if ( studentDtlEntity != null ) {
            studentInfo.setAadharNo( studentDtlEntity.getAadharNo() );
            studentInfo.setAdmissionDate( studentDtlEntity.getAdmissionDate() );
            studentInfo.setDepartmentID( studentDtlEntity.getDepartmentID() );
            studentInfo.setDob( studentDtlEntity.getDob() );
            studentInfo.setFirstName( studentDtlEntity.getFirstName() );
            studentInfo.setLastName( studentDtlEntity.getLastName() );
            studentInfo.setMiddleName( studentDtlEntity.getMiddleName() );
            studentInfo.setPhone( studentDtlEntity.getPhone() );
            studentInfo.setPhone2( studentDtlEntity.getPhone2() );
            studentInfo.setStudentID( studentDtlEntity.getStudentID() );
        }

        return studentInfo;
    }

    @Override
    public StudentDetailEntity mapStudentInfoToStudentDetailEntity(StudentInfo studentInfo) {

        StudentDetailEntity studentDetailEntity = new StudentDetailEntity();

        if ( studentInfo != null ) {
            studentDetailEntity.setAadharNo( studentInfo.getAadharNo() );
            studentDetailEntity.setAdmissionDate( studentInfo.getAdmissionDate() );
            studentDetailEntity.setDepartmentID( studentInfo.getDepartmentID() );
            studentDetailEntity.setDob( studentInfo.getDob() );
            studentDetailEntity.setFirstName( studentInfo.getFirstName() );
            studentDetailEntity.setLastName( studentInfo.getLastName() );
            studentDetailEntity.setMiddleName( studentInfo.getMiddleName() );
            studentDetailEntity.setPhone( studentInfo.getPhone() );
            studentDetailEntity.setPhone2( studentInfo.getPhone2() );
            studentDetailEntity.setStudentID( studentInfo.getStudentID() );
        }

        return studentDetailEntity;
    }

    @Override
    public ArrayList<DepartmentInfo> mapDepartmentDetailsEntitiesToDepartmentInfos(List<DepartmentEntity> departmentEntites) {
        if ( departmentEntites == null ) {
            return new ArrayList<DepartmentInfo>();
        }

        ArrayList<DepartmentInfo> arrayList = new ArrayList<DepartmentInfo>();
        for ( DepartmentEntity departmentEntity : departmentEntites ) {
            arrayList.add( mapDepartmentDetailsEntityToDepartmentInfo( departmentEntity ) );
        }

        return arrayList;
    }

    @Override
    public DepartmentInfo mapDepartmentDetailsEntityToDepartmentInfo(DepartmentEntity departmentEntity) {

        DepartmentInfo departmentInfo = new DepartmentInfo();

        if ( departmentEntity != null ) {
            departmentInfo.setDepartmentCode( departmentEntity.getDepartmentCode() );
            departmentInfo.setDepartmentID( departmentEntity.getDepartmentID() );
            departmentInfo.setDepartmentName( departmentEntity.getDepartmentName() );
        }

        return departmentInfo;
    }

    @Override
    public DepartmentEntity mapDepartmentDetailsInfoToEntity(DepartmentInfo departmentDtl) {

        DepartmentEntity departmentEntity = new DepartmentEntity();

        if ( departmentDtl != null ) {
            departmentEntity.setDepartmentCode( departmentDtl.getDepartmentCode() );
            departmentEntity.setDepartmentID( departmentDtl.getDepartmentID() );
            departmentEntity.setDepartmentName( departmentDtl.getDepartmentName() );
        }

        return departmentEntity;
    }
}
