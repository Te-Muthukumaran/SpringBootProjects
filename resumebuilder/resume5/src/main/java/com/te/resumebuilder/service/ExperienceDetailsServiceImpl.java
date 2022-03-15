package com.te.resumebuilder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.beans.ExperienceDetails;
import com.te.resumebuilder.dao.ExperienceDetailsDao;

@Service
public class ExperienceDetailsServiceImpl implements ExperienceDetailsService{

	@Autowired
	private ExperienceDetailsDao dao;

	
	@Override
	public ExperienceDetails registerExperienceDetails(ExperienceDetails experienceDetails) {
		return dao.save(experienceDetails);
	}

}
