package com.te.resumebuilder.beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Entity
@Table(name = "education_info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EducationInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	@NotNull(message = "id should not be null")
	private Integer user_id;
	
	
	
	@Column
	@NotNull(message = "College/University should not be null")
	@NotEmpty(message = "College/University should not be empty")
	private String college_university;
	
	@Column
	@NotNull(message = "College Qualification should not be null")
	@NotEmpty(message = "College Qualification should not be empty")
	private String qualification_college;
	
	@Column
	@NotNull(message = "College Date of Join should not be null")
	private Date date_of_Join_college;
	
	@Column
	@NotNull(message = "College Date of Compeletion should not be null")
	private Date date_of_Compeletion_college;
	
	@Column
	private String description_college;
	
	@Column
	@NotNull(message = "School Name should not be null")
	@NotEmpty(message = "School Name should not be empty")
	private String school_name;
	
	@Column
	@NotNull(message = "School Qualification should not be null")
	@NotEmpty(message = "School Qualification should not be empty")
	private String qualification_school;
	
	@Column
	@NotNull(message = "School Date of Join should not be null")
	private Date date_of_join_School;
	
	@Column
	@NotNull(message = "School Date of Compeletion should not be null")
	private Date date_of_compeletion_school;
	
	@Column
	private String description_school;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	private PersonalDetails educational;
}
