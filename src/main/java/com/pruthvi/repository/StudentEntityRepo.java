package com.pruthvi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruthvi.entity.StudentDetailEntity;

@Repository
public interface StudentEntityRepo extends JpaRepository<StudentDetailEntity, Integer>{

}
