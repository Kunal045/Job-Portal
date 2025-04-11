package com.project.dao;

import com.project.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDao extends JpaRepository<Application, Integer> {
}
