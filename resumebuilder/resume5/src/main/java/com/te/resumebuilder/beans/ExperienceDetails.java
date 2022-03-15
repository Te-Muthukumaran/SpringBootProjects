package com.te.resumebuilder.beans;

import java.io.Serializable;

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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Entity
@Table(name = "experience_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExperienceDetails implements Serializable{

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
	@NotNull(message = "Institution/Organisation should not be null")
	@NotEmpty(message = "Institution/Organisation should not be empty")
	private String institution_organisation;
	
	@Column
	@NotNull(message = "Position should not be null")
	@NotEmpty(message = "Position should not be empty")
	private String position;
	
	@Column
	@NotNull(message = "Duration should not be null")
	@NotEmpty(message = "Duration should not be empty")
	private String duration;
	
	@Column
	@NotNull(message = "Description should not be null")
	@NotEmpty(message = "Description should not be empty")
	private String description;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	private PersonalDetails experiance;

}
