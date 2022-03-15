package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.beans.ExperienceDetails;

@Repository
public interface ExperienceDetailsDao extends JpaRepository<ExperienceDetails, Integer>{

}
