package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.beans.ExtraDetails;

@Repository
public interface ExtraDetailsDao extends JpaRepository<ExtraDetails, Integer>{

}
