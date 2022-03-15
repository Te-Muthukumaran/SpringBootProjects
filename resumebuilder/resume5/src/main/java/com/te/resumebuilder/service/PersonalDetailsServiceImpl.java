package com.te.resumebuilder.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.beans.PersonalDetails;
import com.te.resumebuilder.dao.PersonalDetailsDao;
import com.te.resumebuilder.exception.RegisterException;

@Service
public class PersonalDetailsServiceImpl implements PersonalDetailsService {

	@Autowired
	private PersonalDetailsDao dao;

	@Override
	public PersonalDetails registerPersonalDetails(PersonalDetails personalDetails) {
		return dao.save(personalDetails);
	}

	@Override
	public Object getData(@Valid Integer id) {
		if (id > 0) {
			return dao.findById(id);
		} else {
			throw new RegisterException("Data Not Found");
		}

	}

}
