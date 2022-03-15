package com.te.resumebuilder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.beans.EducationInfo;
import com.te.resumebuilder.dao.EducationInfoDao;

@Service
public class EducationInfoServiceImpl implements EducationInfoService{

	@Autowired
	private EducationInfoDao dao;
	
	@Override
	public EducationInfo registerEducationInfo(EducationInfo educationInfo) {
		return dao.save(educationInfo);
	}

}
