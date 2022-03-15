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
@Table(name = "project_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectDetails implements Serializable{

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
	@NotNull(message = "Title should not be null")
	@NotEmpty(message = "Title should not be empty")
	private String title;
	
	@Column
	@NotNull(message = "Link should not be null")
	@NotEmpty(message = "Link should not be empty")
	private String link;
	
	@Column
	@NotNull(message = "Description should not be null")
	@NotEmpty(message = "Description should not be empty")
	private String description;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	private PersonalDetails project;
}
