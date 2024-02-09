package com.pruthvi.mapper;

import com.pruthvi.dto.DepartmentInfo;
import com.pruthvi.dto.StudentInfo;
import com.pruthvi.entity.DepartmentEntity;
import com.pruthvi.entity.StudentDetailEntity;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-09T16:23:44+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public StudentInfo mapStudentDetailEntityToStudentInfo(StudentDetailEntity studentDtlEntity) {

        StudentInfo studentInfo = new StudentInfo();

        if ( studentDtlEntity != null ) {
            if ( studentDtlEntity.getAadharNo() != null ) {
                studentInfo.setAadharNo( BigInteger.valueOf( studentDtlEntity.getAadharNo() ) );
            }
            if ( studentDtlEntity.getAdmissionDate() != null ) {
                studentInfo.setAdmissionDate( BigInteger.valueOf( studentDtlEntity.getAdmissionDate() ) );
            }
            if ( studentDtlEntity.getDepartmentID() != null ) {
                studentInfo.setDepartmentID( BigInteger.valueOf( studentDtlEntity.getDepartmentID() ) );
            }
            studentInfo.setDob( studentDtlEntity.getDob() );
            studentInfo.setFirstName( studentDtlEntity.getFirstName() );
            studentInfo.setLastName( studentDtlEntity.getLastName() );
            studentInfo.setMiddleName( studentDtlEntity.getMiddleName() );
            if ( studentDtlEntity.getPhone() != null ) {
                studentInfo.setPhone( BigInteger.valueOf( studentDtlEntity.getPhone() ) );
            }
            if ( studentDtlEntity.getPhone2() != null ) {
                studentInfo.setPhone2( BigInteger.valueOf( studentDtlEntity.getPhone2() ) );
            }
            studentInfo.setStudentID( studentDtlEntity.getStudentID() );
        }

        return studentInfo;
    }

    @Override
    public StudentDetailEntity mapStudentInfoToStudentDetailEntity(StudentInfo studentInfo) {

        StudentDetailEntity studentDetailEntity = new StudentDetailEntity();

        if ( studentInfo != null ) {
            if ( studentInfo.getAadharNo() != null ) {
                studentDetailEntity.setAadharNo( studentInfo.getAadharNo().intValue() );
            }
            if ( studentInfo.getAdmissionDate() != null ) {
                studentDetailEntity.setAdmissionDate( studentInfo.getAdmissionDate().intValue() );
            }
            if ( studentInfo.getDepartmentID() != null ) {
                studentDetailEntity.setDepartmentID( studentInfo.getDepartmentID().intValue() );
            }
            studentDetailEntity.setDob( studentInfo.getDob() );
            studentDetailEntity.setFirstName( studentInfo.getFirstName() );
            studentDetailEntity.setLastName( studentInfo.getLastName() );
            studentDetailEntity.setMiddleName( studentInfo.getMiddleName() );
            if ( studentInfo.getPhone() != null ) {
                studentDetailEntity.setPhone( studentInfo.getPhone().intValue() );
            }
            if ( studentInfo.getPhone2() != null ) {
                studentDetailEntity.setPhone2( studentInfo.getPhone2().intValue() );
            }
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
