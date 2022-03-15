 package com.te.resumebuilder.service;

import javax.validation.Valid;

import com.te.resumebuilder.beans.PersonalDetails;

public interface PersonalDetailsService {

	public PersonalDetails registerPersonalDetails(PersonalDetails personalDetails);

	public Object getData(@Valid Integer id);
}
