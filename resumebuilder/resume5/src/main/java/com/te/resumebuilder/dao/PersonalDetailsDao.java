package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.beans.PersonalDetails;

@Repository
public interface PersonalDetailsDao extends JpaRepository<PersonalDetails, Integer>{

}
