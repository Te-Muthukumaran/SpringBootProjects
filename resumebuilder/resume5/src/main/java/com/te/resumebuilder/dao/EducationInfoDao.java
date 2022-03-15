package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.beans.EducationInfo;

@Repository
public interface EducationInfoDao extends JpaRepository<EducationInfo, Integer>{

	
}
