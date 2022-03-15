package com.te.resumebuilder.service;

import javax.validation.Valid;

import com.te.resumebuilder.beans.UserRegister;

public interface RegisterService {

	public UserRegister register(UserRegister info);

	public UserRegister login(String email, String password);

}
