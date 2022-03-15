package com.te.resumebuilder.contoller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.resumebuilder.beans.EducationInfo;
import com.te.resumebuilder.beans.ExperienceDetails;
import com.te.resumebuilder.beans.ExtraDetails;
import com.te.resumebuilder.beans.PersonalDetails;
import com.te.resumebuilder.beans.ProjectDetails;
import com.te.resumebuilder.beans.ResumeResponse;
import com.te.resumebuilder.beans.UserRegister;
import com.te.resumebuilder.service.EducationInfoService;
import com.te.resumebuilder.service.ExperienceDetailsService;
import com.te.resumebuilder.service.ExtraDetailsService;
import com.te.resumebuilder.service.PersonalDetailsService;
import com.te.resumebuilder.service.ProjectDetailsService;
import com.te.resumebuilder.service.RegisterService;



@RestController
public class ResumeController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Init");
		CustomDateEditor dateEditor = 
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@Autowired
	private RegisterService service;
	
	@Autowired
	private PersonalDetailsService personalService;
	
	@Autowired
	private EducationInfoService educationService;
	
	@Autowired
	private ExperienceDetailsService experienceService;
	
	@Autowired
	private ProjectDetailsService projectService;
	
	@Autowired
	private ExtraDetailsService extraService;
	
	@PostMapping(path = "/register")
	public ResponseEntity<ResumeResponse> storeData(@Valid @RequestBody UserRegister info) {
		ResumeResponse response = new ResumeResponse(false, service.register(info));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<ResumeResponse> login(@Valid @RequestBody UserRegister login) {
		ResumeResponse response = new ResumeResponse(false, service.login(login.getEmail(), login.getPassword()));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerpersonal")
	public ResponseEntity<ResumeResponse> storeDataPersonal(@Valid @RequestBody PersonalDetails personalDetails) {
		ResumeResponse response = new ResumeResponse(false, personalService.registerPersonalDetails(personalDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registereducation")
	public ResponseEntity<ResumeResponse> storeDataEducation(@Valid @RequestBody EducationInfo educationinfo) {
		ResumeResponse response = new ResumeResponse(false, educationService.registerEducationInfo(educationinfo));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerexperience")
	public ResponseEntity<ResumeResponse> storeDataExperience(@Valid @RequestBody ExperienceDetails experienceDetails) {
		ResumeResponse response = new ResumeResponse(false, experienceService.registerExperienceDetails(experienceDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerproject")
	public ResponseEntity<ResumeResponse> storeDataProject(@Valid @RequestBody ProjectDetails projectDetails) {
		ResumeResponse response = new ResumeResponse(false, projectService.registerProjectDetails(projectDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerextra")
	public ResponseEntity<ResumeResponse> storeDataExtra(@Valid @RequestBody ExtraDetails extraDetails) {
		ResumeResponse response = new ResumeResponse(false, extraService.registerExtraDetails(extraDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@GetMapping(path ="/getdata/{id}")
	public ResponseEntity<ResumeResponse> getData(@Valid @PathVariable Integer id){
		ResumeResponse response = new ResumeResponse(false, personalService.getData(id));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
}
