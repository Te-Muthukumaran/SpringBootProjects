package com.te.resumebuilder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.beans.ProjectDetails;
import com.te.resumebuilder.dao.ProjectDetailsDao;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService{

	@Autowired
	private ProjectDetailsDao dao;
	
	@Override
	public ProjectDetails registerProjectDetails(ProjectDetails projectDetails) {
		return dao.save(projectDetails);
	}

}
