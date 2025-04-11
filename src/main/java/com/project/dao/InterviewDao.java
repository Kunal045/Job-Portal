package com.project.dao;

import com.project.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface InterviewDao extends JpaRepository<Interview, Integer> {
}
