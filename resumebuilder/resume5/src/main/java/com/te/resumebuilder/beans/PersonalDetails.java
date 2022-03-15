 package com.te.resumebuilder.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Entity
@Table(name = "personal_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonalDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer user_id;
	
	@Column
	@NotNull(message = "First Name should not be null")
	@NotEmpty(message = "First Name should not be empty")
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	@NotNull(message = "Email should not be null")
	@NotEmpty(message = "Email should not be empty")
	private String email;
	
	@Column
	@NotNull(message = "Phone Number should not be null")
	private Long phone_number;
	
	@Column
	private String website;
	
	@Column
	private String git_hub;
	
	@Column
	private String linkedin;
	
	@Column
	private String twitter;
	
	@Column
	private String facebook;
	
	@Column
	private String instagram;
	
	@OneToMany(mappedBy = "educational", fetch = FetchType.LAZY)
	private List<EducationInfo> education;
	
	@OneToMany(mappedBy = "experiance", fetch =FetchType.LAZY)
	private List<ExperienceDetails> experienceDetails;

	@OneToMany(mappedBy = "extra", fetch = FetchType.LAZY)
	private List<ExtraDetails> extraDetails;
	
	@OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
	private List<ProjectDetails> projectDetails;
	
}
