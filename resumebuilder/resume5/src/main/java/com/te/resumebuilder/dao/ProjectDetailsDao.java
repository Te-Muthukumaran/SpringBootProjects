package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.beans.ProjectDetails;

@Repository
public interface ProjectDetailsDao extends JpaRepository<ProjectDetails, Integer>{

}
