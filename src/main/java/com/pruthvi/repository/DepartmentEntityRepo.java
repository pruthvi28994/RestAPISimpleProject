package com.pruthvi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruthvi.entity.DepartmentEntity;

@Repository
public interface DepartmentEntityRepo extends JpaRepository<DepartmentEntity, Integer>{

}
