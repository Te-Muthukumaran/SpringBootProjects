package com.te.resumebuilder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.beans.ExtraDetails;
import com.te.resumebuilder.dao.ExtraDetailsDao;

@Service
public class ExtraDetailsServiceImpl implements ExtraDetailsService{

	@Autowired
	private ExtraDetailsDao dao;
	
	@Override
	public ExtraDetails registerExtraDetails(ExtraDetails extraDetails) {
		return dao.save(extraDetails);
	}

}
